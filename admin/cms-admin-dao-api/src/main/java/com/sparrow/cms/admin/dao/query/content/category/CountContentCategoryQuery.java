package com.sparrow.cms.admin.dao.query.content.category;

import com.sparrow.protocol.enums.StatusRecord;
import java.util.Date;

public class CountContentCategoryQuery {
    public CountContentCategoryQuery() {
    }

    public CountContentCategoryQuery(CountContentCategoryQuery countContentCategoryQuery) {
        this.name = countContentCategoryQuery.name;
        this.beginDate = countContentCategoryQuery.beginDate;
        this.endDate = countContentCategoryQuery.endDate;
        this.status = countContentCategoryQuery.status;
    }

    private String name;
    private StatusRecord status;
    private Date beginDate;
    private Date endDate;

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusRecord getStatus() {
        return status;
    }

    public void setStatus(StatusRecord status) {
        this.status = status;
    }
}