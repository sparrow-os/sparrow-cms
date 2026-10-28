package com.sparrow.cms.admin.dao.query.content;

import com.sparrow.protocol.dao.PagerQuery;

public class PagerContentQuery extends CountContentQuery {

    public PagerContentQuery() {
    }

    private PagerQuery pager;

    public PagerQuery getPager() {
        return pager;
    }

    public void setPager(PagerQuery pager) {
        this.pager = pager;
    }
}