package com.sparrow.cms.admin.service;

import com.sparrow.exception.Asserts;
import com.sparrow.protocol.BusinessException;
import com.sparrow.protocol.ListRecordTotalBO;
import com.sparrow.cms.admin.bo.ContentBO;
import com.sparrow.cms.admin.repository.ContentRepository;
import com.sparrow.cms.admin.protocol.param.ContentParam;
import com.sparrow.cms.admin.protocol.query.ContentQuery;
import com.sparrow.utility.StringUtility;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ContentService {
    @Inject
    private ContentRepository contentRepository;

    private void validateSaveContent(ContentParam contentParam) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentParam.getName()), SecurityAdminError.NAME_IS_EMPTY, ContentSuffix.name);
    }

    public Long saveContent(ContentParam contentParam) throws BusinessException {
        this.validateSaveContent(contentParam);
        return this.contentRepository.save(contentParam);
    }

    public Integer deleteContent(String contentIds) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentIds), SecurityAdminError.Content_ID_IS_EMPTY);
        return this.contentRepository.delete(contentIds);
    }

    public Integer enableContent(String contentIds) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentIds), SecurityAdminError.Content_ID_IS_EMPTY);
        return this.contentRepository.enable(contentIds);
    }

    public Integer disableContent(String contentIds) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentIds), SecurityAdminError.Content_ID_IS_EMPTY);
        return this.contentRepository.disable(contentIds);
    }

    public ListRecordTotalBO<ContentBO> queryAllContent() {
        return queryContent(null);
    }

    public ListRecordTotalBO<ContentBO> queryContent(ContentQuery contentQuery) {
        Long totalRecord = this.contentRepository.getContentCount(contentQuery);
        List<ContentBO> contentBoList = null;
        if (totalRecord > 0) {
            contentBoList = this.contentRepository.queryContents(contentQuery);
        }
        return new ListRecordTotalBO<>(contentBoList, totalRecord);
    }

    public ContentBO getContent(Long contentId) throws BusinessException {
        //Asserts.isTrue(contentId == null, SecurityAdminError.content_IS_EMPTY);
        return this.contentRepository.getContent(contentId);
    }
}