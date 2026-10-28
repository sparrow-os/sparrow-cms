package com.sparrow.cms.admin.controller;

import com.sparrow.protocol.BusinessException;
import com.sparrow.protocol.ListRecordTotalBO;
import com.sparrow.protocol.TreeItem;
import com.sparrow.protocol.pager.SimplePager;
import com.sparrow.cms.admin.assemble.ContentCategoryAssemble;
import com.sparrow.cms.admin.bo.ContentCategoryBO;
import com.sparrow.cms.admin.protocol.param.ContentCategoryParam;
import com.sparrow.cms.admin.protocol.param.batch.ContentCategoryBatchOperateParam;
import com.sparrow.cms.admin.protocol.query.ContentCategoryQuery;
import com.sparrow.cms.admin.protocol.vo.ContentCategoryVO;
import com.sparrow.cms.admin.service.ContentCategoryService;
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
@RequestMapping("content/category")
public class ContentCategoryController {

    @Inject
    private ContentCategoryService contentCategoryService;

    @Inject
    private ContentCategoryAssemble contentCategoryAssemble;

    @GetMapping("manage")
    public ModelAndView loadAllContentCategorys() {
        ContentCategoryBatchOperateParam batchOperationQuery = ModelAndViewUtils.query();
        if (batchOperationQuery != null) {
            return this.queryContentCategorys(batchOperationQuery);
        }
        SimplePager simplePager = new SimplePager();
        ListRecordTotalBO<ContentCategoryBO> contentCategoryListTotalRecord = this.contentCategoryService.queryAllContentCategory();
        HtmlPagerResult<ContentCategoryVO> pager = this.contentCategoryAssemble.assembleHtmlPager(contentCategoryListTotalRecord, simplePager);
        ModelAndView mv = new ModelAndView("/content/category/manage");
        mv.addObject("pager", pager);
        return mv;
    }

    private ModelAndView queryContentCategorys(ContentCategoryQuery contentCategoryQuery) {
        ListRecordTotalBO<ContentCategoryBO> contentCategoryListTotalRecord = this.contentCategoryService.queryContentCategory(contentCategoryQuery);
        HtmlPagerResult<ContentCategoryVO> pager = this.contentCategoryAssemble.assembleHtmlPager(contentCategoryListTotalRecord, contentCategoryQuery);
        ModelAndView mv = new ModelAndView("/content/category/manage");
        mv.addObject("pager", pager);
        return mv;
    }

    @PostMapping("search.do")
    public ModelAndView search(ContentCategoryQuery contentCategoryQuery) {
        return this.queryContentCategorys(contentCategoryQuery);
    }

    @PostMapping("save")
    public ModelAndView saveContentCategory(ContentCategoryParam contentCategoryParam) throws BusinessException {
        this.contentCategoryService.saveContentCategory(contentCategoryParam);
        return ModelAndViewUtils.redirect("/content/category/manage");
    }

    @GetMapping("edit")
    public ModelAndView getContentCategory(Long contentCategoryId) throws BusinessException {
        ModelAndView mv = new ModelAndView("/content/category/new");
        if (contentCategoryId == null) {
            return mv;
        }

        ContentCategoryBO contentCategoryBo = contentCategoryService.getContentCategory(contentCategoryId);
        ContentCategoryVO contentCategoryVo = this.contentCategoryAssemble.boAssembleVO(contentCategoryBo);
        mv.addObject("contentCategory", contentCategoryVo);
        return mv;
    }

    @PostMapping("delete")
    public ModelAndView deleteContentCategory(
        ContentCategoryBatchOperateParam batchOperationQuery) throws BusinessException {
        this.contentCategoryService.deleteContentCategory(batchOperationQuery.getIds());
        return ModelAndViewUtils.redirect("/content/category/manage");
    }

    @PostMapping("enable")
    public ModelAndView enableContentCategory(
        ContentCategoryBatchOperateParam batchOperationQuery) throws BusinessException {
        this.contentCategoryService.enableContentCategory(batchOperationQuery.getIds());
        return ModelAndViewUtils.redirect("/content/category/manage");
    }

    @PostMapping("disable")
    public ModelAndView disableContentCategory(
        ContentCategoryBatchOperateParam batchOperationQuery) throws BusinessException {
        this.contentCategoryService.disableContentCategory(batchOperationQuery.getIds());
        return ModelAndViewUtils.redirect("/content/category/manage");
    }
}