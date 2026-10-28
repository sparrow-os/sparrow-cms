package com.sparrow.cms.admin.dao.sparrow;

import com.sparrow.orm.query.BooleanCriteria;
import com.sparrow.orm.query.Criteria;
import com.sparrow.orm.query.SearchCriteria;
import com.sparrow.orm.template.impl.ORMStrategy;
import com.sparrow.cms.admin.dao.ContentDAO;
import com.sparrow.cms.admin.dao.query.content.CountContentQuery;
import com.sparrow.cms.admin.dao.query.content.PagerContentQuery;
import com.sparrow.cms.po.Content;
import java.util.List;
import javax.inject.Named;

@Named
public class ContentDaoImpl extends ORMStrategy<Content, Long> implements ContentDAO {
    @Override public List<Content> queryContents(PagerContentQuery pagerContentQuery) {
        SearchCriteria searchCriteria = new SearchCriteria(pagerContentQuery.getPager());
        searchCriteria.setWhere(this.generateCriteria(pagerContentQuery));
        return this.getList(searchCriteria);
    }

    private BooleanCriteria generateCriteria(CountContentQuery countContentQuery) {
        Long startTime=null;
        if(countContentQuery.getBeginDate()!=null){
            startTime=countContentQuery.getBeginDate().getTime();
        }

        Long endTime=null;
        if(countContentQuery.getEndDate()!=null){
            endTime=countContentQuery.getEndDate().getTime();
        }

        return BooleanCriteria.criteria(
            Criteria.field("content.name").equal(countContentQuery.getName()))
            .and(Criteria.field("content.createTime").greaterThan(startTime))
            .and(Criteria.field("content.createTime").lessThan(endTime));
    }

    @Override public Long countContent(CountContentQuery contentPagerQuery) {
        SearchCriteria searchCriteria = new SearchCriteria();
        searchCriteria.setWhere(this.generateCriteria(contentPagerQuery));
        return this.getCount(searchCriteria);
    }
}