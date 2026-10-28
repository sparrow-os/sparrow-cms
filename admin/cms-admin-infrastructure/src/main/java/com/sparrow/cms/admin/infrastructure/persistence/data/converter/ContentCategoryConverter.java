package com.sparrow.cms.admin.infrastructure.persistence.data.converter;

import com.sparrow.protocol.enums.StatusRecord;
import com.sparrow.cms.admin.bo.ContentCategoryBO;
import com.sparrow.cms.po.ContentCategory;
import com.sparrow.cms.admin.protocol.param.ContentCategoryParam;
import com.sparrow.cms.admin.protocol.query.ContentCategoryQuery;
import com.sparrow.protocol.dao.PagerQuery;
import com.sparrow.cms.admin.dao.query.content.category.CountContentCategoryQuery;
import com.sparrow.cms.admin.dao.query.content.category.PagerContentCategoryQuery;
import com.sparrow.support.converter.PO2BOConverter;
import com.sparrow.support.converter.Param2POConverter;
import com.sparrow.utility.BeanUtility;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

@Named
public class ContentCategoryConverter implements Param2POConverter<ContentCategoryParam, ContentCategory>, PO2BOConverter<ContentCategoryBO, ContentCategory> {

    public PagerContentCategoryQuery toDbPagerQuery(ContentCategoryQuery contentCategoryQuery) {
        if (contentCategoryQuery == null) {
            PagerContentCategoryQuery pagerContentCategoryQuery = new PagerContentCategoryQuery();
            pagerContentCategoryQuery.setPager(new PagerQuery());
            return pagerContentCategoryQuery;
        }
        PagerQuery pagerQuery = new PagerQuery(contentCategoryQuery.getPageSize(), contentCategoryQuery.getCurrentPageIndex());
        PagerContentCategoryQuery pagerContentCategoryQuery = new PagerContentCategoryQuery();
        this.fullProperties(contentCategoryQuery, pagerContentCategoryQuery);
        pagerContentCategoryQuery.setPager(pagerQuery);
        return pagerContentCategoryQuery;
    }

    private void fullProperties(ContentCategoryQuery contentCategoryQuery,
        CountContentCategoryQuery countContentCategoryQuery) {
        if (contentCategoryQuery == null) {
            return;
        }
        countContentCategoryQuery.setName(contentCategoryQuery.getName());
        countContentCategoryQuery.setBeginDate(contentCategoryQuery.getBeginDate());
        countContentCategoryQuery.setEndDate(contentCategoryQuery.getEndDate());
    }

    public CountContentCategoryQuery toDbCountQuery(ContentCategoryQuery contentCategoryQuery) {
        CountContentCategoryQuery countContentCategoryQuery = new CountContentCategoryQuery();
        if (contentCategoryQuery == null) {
            return countContentCategoryQuery;
        }
        this.fullProperties(contentCategoryQuery, countContentCategoryQuery);
        return countContentCategoryQuery;
    }

    @Override public ContentCategory param2po(ContentCategoryParam param) {
        ContentCategory contentCategory = new ContentCategory();
        BeanUtility.copyProperties(param, contentCategory);

        contentCategory.setDepth(0);
        contentCategory.setIsLeaf(0);

        contentCategory.setGmtCreate(System.currentTimeMillis());
        contentCategory.setGmtModified(contentCategory.getGmtCreate());
        contentCategory.setCreateUserId(0L);
        contentCategory.setModifiedUserId(0L);
        contentCategory.setStatus(StatusRecord.ENABLE);

        contentCategory.setCreateUserName("");
        contentCategory.setModifiedUserName("");
        return contentCategory;
    }

    @Override public ContentCategoryBO po2bo(ContentCategory contentCategory) {
        ContentCategoryBO contentCategoryBO = new ContentCategoryBO();
        BeanUtility.copyProperties(contentCategory, contentCategoryBO);
        return contentCategoryBO;
    }

    @Override public List<ContentCategoryBO> poList2BoList(List<ContentCategory> list) {
        List<ContentCategoryBO> contentCategoryBos = new ArrayList<>(list.size());
        for (ContentCategory contentCategory : list) {
            contentCategoryBos.add(this.po2bo(contentCategory));
        }
        return contentCategoryBos;
    }
}