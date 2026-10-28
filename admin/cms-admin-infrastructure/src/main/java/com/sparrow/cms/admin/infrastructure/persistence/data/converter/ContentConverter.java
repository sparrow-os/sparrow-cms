package com.sparrow.cms.admin.infrastructure.persistence.data.converter;

import com.sparrow.protocol.enums.StatusRecord;
import com.sparrow.cms.admin.bo.ContentBO;
import com.sparrow.cms.po.Content;
import com.sparrow.cms.admin.protocol.param.ContentParam;
import com.sparrow.cms.admin.protocol.query.ContentQuery;
import com.sparrow.protocol.dao.PagerQuery;
import com.sparrow.cms.admin.dao.query.content.CountContentQuery;
import com.sparrow.cms.admin.dao.query.content.PagerContentQuery;
import com.sparrow.support.converter.PO2BOConverter;
import com.sparrow.support.converter.Param2POConverter;
import com.sparrow.utility.BeanUtility;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

@Named
public class ContentConverter implements Param2POConverter<ContentParam, Content>, PO2BOConverter<ContentBO, Content> {
   
   
    public PagerContentQuery toDbPagerQuery(ContentQuery contentQuery) {
           if (contentQuery == null) {
               PagerContentQuery pagerContentQuery = new PagerContentQuery();
               pagerContentQuery.setPager(new PagerQuery());
               return pagerContentQuery;
           }
           PagerQuery pagerQuery = new PagerQuery(contentQuery.getPageSize(), contentQuery.getCurrentPageIndex());
           PagerContentQuery pagerContentQuery = new PagerContentQuery();
           this.fullProperties(contentQuery, pagerContentQuery);
           pagerContentQuery.setPager(pagerQuery);
           return pagerContentQuery;
       }
   
       private void fullProperties(ContentQuery contentQuery, CountContentQuery countContentQuery) {
           if (contentQuery == null) {
               return;
           }
           countContentQuery.setName(contentQuery.getName());
           countContentQuery.setBeginDate(contentQuery.getBeginDate());
           countContentQuery.setEndDate(contentQuery.getEndDate());
       }
   
       public CountContentQuery toDbCountQuery(ContentQuery contentQuery) {
           CountContentQuery countContentQuery = new CountContentQuery();
           if (contentQuery == null) {
               return countContentQuery;
           }
           this.fullProperties(contentQuery, countContentQuery);
           return countContentQuery;
       }


    @Override public Content param2po(ContentParam param) {
        Content content = new Content();
        BeanUtility.copyProperties(param, content);

        content.setGmtCreate(System.currentTimeMillis());
        content.setGmtModified(content.getGmtCreate());
        content.setCreateUserId(0L);
        content.setModifiedUserId(0L);
        content.setStatus(StatusRecord.ENABLE);

        content.setCreateUserName("");
        content.setModifiedUserName("");
        return content;
    }

    @Override public ContentBO po2bo(Content content) {
        ContentBO contentBO = new ContentBO();
        BeanUtility.copyProperties(content, contentBO);
        return contentBO;
    }

    @Override public List<ContentBO> poList2BoList(List<Content> list) {
        List<ContentBO> contentBos = new ArrayList<>(list.size());
        for (Content content : list) {
            contentBos.add(this.po2bo(content));
        }
        return contentBos;
    }
}