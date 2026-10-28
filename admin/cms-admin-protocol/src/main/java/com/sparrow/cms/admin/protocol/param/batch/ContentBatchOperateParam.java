package com.sparrow.cms.admin.protocol.param.batch;

import com.sparrow.cms.admin.protocol.query.ContentQuery;

public class ContentBatchOperateParam extends ContentQuery {
    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}