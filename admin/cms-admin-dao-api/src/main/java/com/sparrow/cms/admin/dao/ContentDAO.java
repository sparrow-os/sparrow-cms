package com.sparrow.cms.admin.dao;

import com.sparrow.protocol.dao.DaoSupport;
import com.sparrow.cms.po.Content;
import com.sparrow.cms.admin.dao.query.content.CountContentQuery;
import com.sparrow.cms.admin.dao.query.content.PagerContentQuery;
import java.util.List;

public interface ContentDAO extends DaoSupport<Content, Long> {
    List<Content> queryContents(PagerContentQuery contentPagerQuery);

    Long countContent(CountContentQuery countContentQuery);
}