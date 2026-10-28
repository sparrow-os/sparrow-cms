package com.sparrow.cms.admin.assemble;

import com.sparrow.protocol.constant.Constant;
import com.sparrow.cms.admin.protocol.vo.ContentVO;
import com.sparrow.protocol.ListRecordTotalBO;
import com.sparrow.protocol.pager.PagerResult;
import com.sparrow.protocol.pager.SimplePager;
import com.sparrow.cms.admin.bo.ContentBO;
import com.sparrow.cms.admin.protocol.param.ContentParam;
import com.sparrow.support.assemble.BO2VOAssemble;
import com.sparrow.support.assemble.Param2VOAssemble;
import com.sparrow.support.pager.HtmlPagerResult;
import com.sparrow.utility.BeanUtility;
import com.sparrow.utility.CollectionsUtility;
import com.sparrow.utility.EnumUtility;
import com.sparrow.utility.StringUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Named;

@Named
public class ContentAssemble implements BO2VOAssemble<ContentVO, ContentBO>,
    Param2VOAssemble<ContentVO,ContentParam> {

    public ContentVO paramAssembleVO(ContentParam param){
        ContentVO content = new ContentVO();
        BeanUtility.copyProperties(param, content);
        return content;
    }

    @Override public ContentVO boAssembleVO(ContentBO bo) {
        ContentVO content = new ContentVO();
        BeanUtility.copyProperties(bo, content);
        content.setStatus(bo.getStatus().name());
        return content;
    }

    @Override public List<ContentVO> boListAssembleVOList(List<ContentBO> list) {
        if (CollectionsUtility.isNullOrEmpty(list)) {
            return Collections.emptyList();
        }
        List<ContentVO> contentVOList = new ArrayList<>(list.size());
        for (ContentBO contentBo : list) {
            ContentVO contentVo = new ContentVO();
            BeanUtility.copyProperties(contentBo, contentVo);
            String statusName = EnumUtility.getValue(contentBo.getStatus());
            contentVo.setStatus(statusName);
            contentVOList.add(contentVo);
        }
        return contentVOList;
    }

    public HtmlPagerResult<ContentVO> assembleHtmlPager(ListRecordTotalBO<ContentBO> contentListTotalRecord,
        SimplePager contentQuery) {
        List<ContentVO> contentVOList = this.boListAssembleVOList(contentListTotalRecord.getList());
        PagerResult<ContentVO> pagerResult = new PagerResult<>(contentQuery);
        pagerResult.setList(contentVOList);
        pagerResult.setRecordCount(contentListTotalRecord.getTotal());
        return new HtmlPagerResult<>(pagerResult);
    }
}