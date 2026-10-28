package com.sparrow.cms.admin.infrastructure.persistence;

import com.sparrow.protocol.dao.StatusCriteria;
import com.sparrow.protocol.enums.StatusRecord;
import com.sparrow.cms.admin.dao.ContentDAO;
import com.sparrow.cms.admin.infrastructure.persistence.data.converter.ContentConverter;
import com.sparrow.cms.po.Content;
import com.sparrow.cms.admin.bo.ContentBO;
import com.sparrow.cms.admin.protocol.param.ContentParam;
import com.sparrow.cms.admin.repository.ContentRepository;
import com.sparrow.cms.admin.protocol.query.ContentQuery;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ContentRepositoryImpl implements ContentRepository {
    @Inject
    private ContentConverter contentConverter;

    @Inject
    private ContentDAO contentDao;

    @Override public Long save(ContentParam contentParam) {
        Content content = this.contentConverter.param2po(contentParam);
        if (content.getId() != null) {
            this.contentDao.update(content);
            return content.getId();
        }
        return this.contentDao.insert(content);
    }

    @Override public int delete(String contentIds) {
        return this.contentDao.batchDelete(contentIds);
    }

    @Override public int disable(String contentIds) {
        StatusCriteria statusCriteria = new StatusCriteria(contentIds, StatusRecord.DISABLE);
        return this.contentDao.changeStatus(statusCriteria);
    }

    @Override public int enable(String contentIds) {
        StatusCriteria statusCriteria = new StatusCriteria(contentIds, StatusRecord.ENABLE);
        return this.contentDao.changeStatus(statusCriteria);
    }

    @Override public ContentBO getContent(Long contentId) {
        Content content = this.contentDao.getEntity(contentId);
        return this.contentConverter.po2bo(content);
    }

    @Override public List<ContentBO> queryContents(ContentQuery contentQuery) {
        List<Content> contentList = this.contentDao.queryContents(this.contentConverter.toDbPagerQuery(contentQuery));
        return this.contentConverter.poList2BoList(contentList);
    }

    @Override public Long getContentCount(ContentQuery contentQuery) {
        return this.contentDao.countContent(this.contentConverter.toDbCountQuery(contentQuery));
    }
}