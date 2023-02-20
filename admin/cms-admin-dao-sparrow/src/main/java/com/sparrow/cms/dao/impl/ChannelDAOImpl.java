package com.sparrow.cms.dao.impl;

import com.sparrow.cms.dao.ChannelDAO;
import com.sparrow.cms.po.ContentMainType;
import com.sparrow.orm.template.impl.ORMStrategy;
import com.sparrow.protocol.dao.StatusCriteria;
import com.sparrow.protocol.enums.StatusRecord;
import javax.inject.Named;

@Named
public class ChannelDAOImpl extends ORMStrategy<ContentMainType, Long> implements ChannelDAO {
    private Integer changeStatus(String ids, StatusRecord statusRecord) {
        StatusCriteria statusCriteria = new StatusCriteria(ids, statusRecord);
        return this.changeStatus(statusCriteria);
    }

    @Override public Integer enableChannel(String ids) {
        return this.changeStatus(ids, StatusRecord.ENABLE);
    }

    @Override public Integer disableChannel(String ids) {
        return this.changeStatus(ids, StatusRecord.DISABLE);
    }
}
