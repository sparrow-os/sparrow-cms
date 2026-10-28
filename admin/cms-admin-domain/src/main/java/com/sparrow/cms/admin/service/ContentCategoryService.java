package com.sparrow.cms.admin.service;

import com.sparrow.exception.Asserts;
import com.sparrow.protocol.BusinessException;
import com.sparrow.protocol.ListRecordTotalBO;
import com.sparrow.cms.admin.bo.ContentCategoryBO;
import com.sparrow.cms.admin.repository.ContentCategoryRepository;
import com.sparrow.cms.admin.protocol.param.ContentCategoryParam;
import com.sparrow.cms.admin.protocol.query.ContentCategoryQuery;
import com.sparrow.utility.StringUtility;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ContentCategoryService {
    @Inject
    private ContentCategoryRepository contentCategoryRepository;

    private void validateSaveContentCategory(ContentCategoryParam contentCategoryParam) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentCategoryParam.getName()), SecurityAdminError.NAME_IS_EMPTY, ContentCategorySuffix.name);
    }

    public Long saveContentCategory(ContentCategoryParam contentCategoryParam) throws BusinessException {
        this.validateSaveContentCategory(contentCategoryParam);
        return this.contentCategoryRepository.save(contentCategoryParam);
    }

    public Integer deleteContentCategory(String contentCategoryIds) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentCategoryIds), SecurityAdminError.ContentCategory_ID_IS_EMPTY);
        return this.contentCategoryRepository.delete(contentCategoryIds);
    }

    public Integer enableContentCategory(String contentCategoryIds) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentCategoryIds), SecurityAdminError.ContentCategory_ID_IS_EMPTY);
        return this.contentCategoryRepository.enable(contentCategoryIds);
    }

    public Integer disableContentCategory(String contentCategoryIds) throws BusinessException {
        //Asserts.isTrue(StringUtility.isNullOrEmpty(contentCategoryIds), SecurityAdminError.ContentCategory_ID_IS_EMPTY);
        return this.contentCategoryRepository.disable(contentCategoryIds);
    }

    public ListRecordTotalBO<ContentCategoryBO> queryAllContentCategory() {
        return queryContentCategory(null);
    }

    public ListRecordTotalBO<ContentCategoryBO> queryContentCategory(ContentCategoryQuery contentCategoryQuery) {
        Long totalRecord = this.contentCategoryRepository.getContentCategoryCount(contentCategoryQuery);
        List<ContentCategoryBO> contentCategoryBoList = null;
        if (totalRecord > 0) {
            contentCategoryBoList = this.contentCategoryRepository.queryContentCategorys(contentCategoryQuery);
        }
        return new ListRecordTotalBO<>(contentCategoryBoList, totalRecord);
    }

    public ContentCategoryBO getContentCategory(Long contentCategoryId) throws BusinessException {
        //Asserts.isTrue(contentCategoryId == null, SecurityAdminError.contentCategory_IS_EMPTY);
        return this.contentCategoryRepository.getContentCategory(contentCategoryId);
    }
}