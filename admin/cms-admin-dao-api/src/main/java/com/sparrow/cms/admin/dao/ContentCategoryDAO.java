package com.sparrow.cms.admin.dao;

import com.sparrow.protocol.dao.DaoSupport;
import com.sparrow.cms.po.ContentCategory;
import com.sparrow.cms.admin.dao.query.content.category.CountContentCategoryQuery;
import com.sparrow.cms.admin.dao.query.content.category.PagerContentCategoryQuery;
import java.util.List;

public interface ContentCategoryDAO extends DaoSupport<ContentCategory, Long> {
    List<ContentCategory> queryContentCategorys(PagerContentCategoryQuery contentCategoryPagerQuery);

    Long countContentCategory(CountContentCategoryQuery countContentCategoryQuery);
}