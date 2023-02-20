package com.sparrow.cms.dao;

import com.sparrow.cms.po.ContentMainType;
import com.sparrow.protocol.dao.DaoSupport;

public interface ChannelDAO extends DaoSupport<ContentMainType, Long> {
    Integer enableChannel(String ids);

    Integer disableChannel(String ids);
}
