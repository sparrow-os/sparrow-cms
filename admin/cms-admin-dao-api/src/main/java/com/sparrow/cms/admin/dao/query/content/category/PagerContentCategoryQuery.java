package com.sparrow.cms.admin.dao.query.content.category;

import com.sparrow.protocol.dao.PagerQuery;

public class PagerContentCategoryQuery extends CountContentCategoryQuery {

    public PagerContentCategoryQuery() {
    }

    private PagerQuery pager;

    public PagerQuery getPager() {
        return pager;
    }

    public void setPager(PagerQuery pager) {
        this.pager = pager;
    }
}