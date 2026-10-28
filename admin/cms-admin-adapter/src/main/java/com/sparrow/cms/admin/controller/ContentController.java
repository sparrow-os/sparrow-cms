package com.sparrow.cms.admin.controller;

import com.sparrow.protocol.BusinessException;
import com.sparrow.protocol.ListRecordTotalBO;
import com.sparrow.protocol.TreeItem;
import com.sparrow.protocol.pager.SimplePager;
import com.sparrow.cms.admin.assemble.ContentAssemble;
import com.sparrow.cms.admin.bo.ContentBO;
import com.sparrow.cms.admin.protocol.param.ContentParam;
import com.sparrow.cms.admin.protocol.param.batch.ContentBatchOperateParam;
import com.sparrow.cms.admin.protocol.query.ContentQuery;
import com.sparrow.cms.admin.protocol.vo.ContentVO;
import com.sparrow.cms.admin.service.ContentService;
import com.sparrow.servlet.ServletContainer;
import com.sparrow.spring.starter.ModelAndViewUtils;
import com.sparrow.support.pager.HtmlPagerResult;
import java.util.List;
import javax.inject.Inject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("content")
public class ContentController {

    @Inject
    private ContentService contentService;

    @Inject
    private ContentAssemble contentAssemble;

    @GetMapping("manage")
    public ModelAndView loadAllContents() {
        ContentBatchOperateParam batchOperationQuery = ModelAndViewUtils.query();
        if (batchOperationQuery != null) {
            return this.queryContents(batchOperationQuery);
        }
        SimplePager simplePager = new SimplePager();
        ListRecordTotalBO<ContentBO> contentListTotalRecord = this.contentService.queryAllContent();
        HtmlPagerResult<ContentVO> pager = this.contentAssemble.assembleHtmlPager(contentListTotalRecord, simplePager);
        ModelAndView mv = new ModelAndView("/content/manage");
        mv.addObject("pager", pager);
        return mv;
    }

    private ModelAndView queryContents(ContentQuery contentQuery) {
        ListRecordTotalBO<ContentBO> contentListTotalRecord = this.contentService.queryContent(contentQuery);
        HtmlPagerResult<ContentVO> pager = this.contentAssemble.assembleHtmlPager(contentListTotalRecord, contentQuery);
        ModelAndView mv = new ModelAndView("/content/manage");
        mv.addObject("pager", pager);
        return mv;
    }

    @PostMapping("search.do")
    public ModelAndView search(ContentQuery contentQuery) {
        return this.queryContents(contentQuery);
    }

    @PostMapping("save")
    public ModelAndView saveContent(ContentParam contentParam) throws BusinessException {
       this.contentService.saveContent(contentParam);
       return ModelAndViewUtils.redirect("/content/manage");
    }

    @GetMapping("edit")
    public ModelAndView getContent(Long contentId) throws BusinessException {
        ModelAndView mv = new ModelAndView("/content/new");
        if (contentId == null) {
            return mv;
        }

        ContentBO contentBo = contentService.getContent(contentId);
        ContentVO contentVo = this.contentAssemble.boAssembleVO(contentBo);
        mv.addObject("content", contentVo);
        return mv;
    }

    @PostMapping("delete")
    public ModelAndView deleteContent(ContentBatchOperateParam batchOperationQuery) throws BusinessException {
        this.contentService.deleteContent(batchOperationQuery.getIds());
        return ModelAndViewUtils.redirect("/content/manage");
    }

    @PostMapping("enable")
    public ModelAndView enableContent(ContentBatchOperateParam batchOperationQuery) throws BusinessException {
        this.contentService.enableContent(batchOperationQuery.getIds());
        return ModelAndViewUtils.redirect("/content/manage");
    }

    @PostMapping("disable")
    public ModelAndView disableContent(ContentBatchOperateParam batchOperationQuery) throws BusinessException {
        this.contentService.disableContent(batchOperationQuery.getIds());
        return ModelAndViewUtils.redirect("/content/manage");
    }
}