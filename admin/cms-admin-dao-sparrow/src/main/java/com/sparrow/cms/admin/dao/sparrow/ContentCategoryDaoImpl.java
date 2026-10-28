package com.sparrow.cms.admin.dao.sparrow;

import com.sparrow.orm.query.BooleanCriteria;
import com.sparrow.orm.query.Criteria;
import com.sparrow.orm.query.SearchCriteria;
import com.sparrow.orm.template.impl.ORMStrategy;
import com.sparrow.cms.admin.dao.ContentCategoryDAO;
import com.sparrow.cms.admin.dao.query.content.category.CountContentCategoryQuery;
import com.sparrow.cms.admin.dao.query.content.category.PagerContentCategoryQuery;
import com.sparrow.cms.po.ContentCategory;
import java.util.List;
import javax.inject.Named;

@Named
public class ContentCategoryDaoImpl extends ORMStrategy<ContentCategory, Long> implements ContentCategoryDAO {
    @Override public List<ContentCategory> queryContentCategorys(PagerContentCategoryQuery pagerContentCategoryQuery) {
        SearchCriteria searchCriteria = new SearchCriteria(pagerContentCategoryQuery.getPager());
        searchCriteria.setWhere(this.generateCriteria(pagerContentCategoryQuery));
        return this.getList(searchCriteria);
    }

    private BooleanCriteria generateCriteria(CountContentCategoryQuery countContentCategoryQuery) {
        Long startTime = null;
        if (countContentCategoryQuery.getBeginDate() != null) {
            startTime = countContentCategoryQuery.getBeginDate().getTime();
        }

        Long endTime = null;
        if (countContentCategoryQuery.getEndDate() != null) {
            endTime = countContentCategoryQuery.getEndDate().getTime();
        }

        return BooleanCriteria.criteria(
            Criteria.field("contentCategory.name").equal(countContentCategoryQuery.getName()))
            .and(Criteria.field("contentCategory.createTime").greaterThan(startTime))
            .and(Criteria.field("contentCategory.createTime").lessThan(endTime));
    }

    @Override public Long countContentCategory(CountContentCategoryQuery contentCategoryPagerQuery) {
        SearchCriteria searchCriteria = new SearchCriteria();
        searchCriteria.setWhere(this.generateCriteria(contentCategoryPagerQuery));
        return this.getCount(searchCriteria);
    }
}