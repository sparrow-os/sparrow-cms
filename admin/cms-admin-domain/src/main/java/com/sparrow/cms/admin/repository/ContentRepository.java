package com.sparrow.cms.admin.repository;
import com.sparrow.cms.admin.bo.ContentBO;
import com.sparrow.cms.admin.protocol.param.ContentParam;
import com.sparrow.cms.admin.protocol.query.ContentQuery;
import java.util.List;



public interface ContentRepository {
    Long save(ContentParam contentParam);

    int delete(String contentIds);

    int disable(String contentIds);

    int enable(String contentIds);

    ContentBO getContent(Long contentId);

    List<ContentBO> queryContents(ContentQuery contentQuery);

    Long getContentCount(ContentQuery contentQuery);

}