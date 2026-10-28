package com.sparrow.cms.admin.infrastructure.persistence;

import com.sparrow.protocol.dao.StatusCriteria;
import com.sparrow.protocol.enums.StatusRecord;
import com.sparrow.cms.admin.dao.ContentCategoryDAO;
import com.sparrow.cms.admin.infrastructure.persistence.data.converter.ContentCategoryConverter;
import com.sparrow.cms.po.ContentCategory;
import com.sparrow.cms.admin.bo.ContentCategoryBO;
import com.sparrow.cms.admin.protocol.param.ContentCategoryParam;
import com.sparrow.cms.admin.repository.ContentCategoryRepository;
import com.sparrow.cms.admin.protocol.query.ContentCategoryQuery;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ContentCategoryRepositoryImpl implements ContentCategoryRepository {
    @Inject
    private ContentCategoryConverter contentCategoryConverter;

    @Inject
    private ContentCategoryDAO contentCategoryDao;

    @Override public Long save(ContentCategoryParam contentCategoryParam) {
        ContentCategory contentCategory = this.contentCategoryConverter.param2po(contentCategoryParam);
        if (contentCategory.getId() != null) {
            this.contentCategoryDao.update(contentCategory);
            return contentCategory.getId();
        }
        return this.contentCategoryDao.insert(contentCategory);
    }

    @Override public int delete(String contentCategoryIds) {
        return this.contentCategoryDao.batchDelete(contentCategoryIds);
    }

    @Override public int disable(String contentCategoryIds) {
        StatusCriteria statusCriteria = new StatusCriteria(contentCategoryIds, StatusRecord.DISABLE);
        return this.contentCategoryDao.changeStatus(statusCriteria);
    }

    @Override public int enable(String contentCategoryIds) {
        StatusCriteria statusCriteria = new StatusCriteria(contentCategoryIds, StatusRecord.ENABLE);
        return this.contentCategoryDao.changeStatus(statusCriteria);
    }

    @Override public ContentCategoryBO getContentCategory(Long contentCategoryId) {
        ContentCategory contentCategory = this.contentCategoryDao.getEntity(contentCategoryId);
        return this.contentCategoryConverter.po2bo(contentCategory);
    }

    @Override public List<ContentCategoryBO> queryContentCategorys(ContentCategoryQuery contentCategoryQuery) {
        List<ContentCategory> contentCategoryList = this.contentCategoryDao.queryContentCategorys(this.contentCategoryConverter.toDbPagerQuery(contentCategoryQuery));
        return this.contentCategoryConverter.poList2BoList(contentCategoryList);
    }

    @Override public Long getContentCategoryCount(ContentCategoryQuery contentCategoryQuery) {
        return this.contentCategoryDao.countContentCategory(this.contentCategoryConverter.toDbCountQuery(contentCategoryQuery));
    }
}