package com.sparrow.cms.dao.impl;

import com.sparrow.cms.dao.ChannelDAO;
import com.sparrow.cms.po.Channel;
import com.sparrow.orm.template.impl.ORMStrategy;
import javax.inject.Named;

//@Named
public class ChannelDAOImpl extends ORMStrategy<Channel, Long> implements ChannelDAO {
}
