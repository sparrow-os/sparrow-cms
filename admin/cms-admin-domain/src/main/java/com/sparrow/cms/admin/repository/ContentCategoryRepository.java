package com.sparrow.cms.admin.repository;

import com.sparrow.cms.admin.bo.ContentCategoryBO;
import com.sparrow.cms.admin.protocol.param.ContentCategoryParam;
import com.sparrow.cms.admin.protocol.query.ContentCategoryQuery;
import java.util.List;

public interface ContentCategoryRepository {
    Long save(ContentCategoryParam contentCategoryParam);

    int delete(String contentCategoryIds);

    int disable(String contentCategoryIds);

    int enable(String contentCategoryIds);

    ContentCategoryBO getContentCategory(Long contentCategoryId);

    List<ContentCategoryBO> queryContentCategorys(ContentCategoryQuery contentCategoryQuery);

    Long getContentCategoryCount(ContentCategoryQuery contentCategoryQuery);

}