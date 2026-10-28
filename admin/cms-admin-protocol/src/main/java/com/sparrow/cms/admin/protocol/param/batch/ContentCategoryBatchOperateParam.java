package com.sparrow.cms.admin.protocol.param.batch;

import com.sparrow.cms.admin.protocol.query.ContentCategoryQuery;

public class ContentCategoryBatchOperateParam extends ContentCategoryQuery {
    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}