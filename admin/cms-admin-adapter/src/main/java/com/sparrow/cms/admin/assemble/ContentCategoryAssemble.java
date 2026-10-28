package com.sparrow.cms.admin.assemble;

import com.sparrow.protocol.constant.Constant;
import com.sparrow.cms.admin.protocol.vo.ContentCategoryVO;
import com.sparrow.protocol.ListRecordTotalBO;
import com.sparrow.protocol.pager.PagerResult;
import com.sparrow.protocol.pager.SimplePager;
import com.sparrow.cms.admin.bo.ContentCategoryBO;
import com.sparrow.cms.admin.protocol.param.ContentCategoryParam;
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
public class ContentCategoryAssemble implements BO2VOAssemble<ContentCategoryVO, ContentCategoryBO>,
    Param2VOAssemble<ContentCategoryVO,ContentCategoryParam> {

    public ContentCategoryVO paramAssembleVO(ContentCategoryParam param){
        ContentCategoryVO contentCategory = new ContentCategoryVO();
        BeanUtility.copyProperties(param, contentCategory);
        return contentCategory;
    }

    @Override public ContentCategoryVO boAssembleVO(ContentCategoryBO bo) {
        ContentCategoryVO contentCategory = new ContentCategoryVO();
        BeanUtility.copyProperties(bo, contentCategory);
        contentCategory.setStatus(bo.getStatus().name());
        return contentCategory;
    }

    @Override public List<ContentCategoryVO> boListAssembleVOList(List<ContentCategoryBO> list) {
        if (CollectionsUtility.isNullOrEmpty(list)) {
            return Collections.emptyList();
        }
        List<ContentCategoryVO> contentCategoryVOList = new ArrayList<>(list.size());
        for (ContentCategoryBO contentCategoryBo : list) {
            ContentCategoryVO contentCategoryVo = new ContentCategoryVO();
            BeanUtility.copyProperties(contentCategoryBo, contentCategoryVo);
            String statusName = EnumUtility.getValue(contentCategoryBo.getStatus());
            contentCategoryVo.setStatus(statusName);
            contentCategoryVOList.add(contentCategoryVo);
        }
        return contentCategoryVOList;
    }

    public HtmlPagerResult<ContentCategoryVO> assembleHtmlPager(ListRecordTotalBO<ContentCategoryBO> contentCategoryListTotalRecord,
        SimplePager contentCategoryQuery) {
        List<ContentCategoryVO> contentCategoryVOList = this.boListAssembleVOList(contentCategoryListTotalRecord.getList());
        PagerResult<ContentCategoryVO> pagerResult = new PagerResult<>(contentCategoryQuery);
        pagerResult.setList(contentCategoryVOList);
        pagerResult.setRecordCount(contentCategoryListTotalRecord.getTotal());
        return new HtmlPagerResult<>(pagerResult);
    }
}