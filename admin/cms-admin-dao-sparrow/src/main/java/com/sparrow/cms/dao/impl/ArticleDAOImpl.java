package com.sparrow.cms.dao.impl;

import com.sparrow.cms.dao.ArticleDAO;
import com.sparrow.cms.po.Article;
import com.sparrow.orm.template.impl.ORMStrategy;
import javax.inject.Named;

@Named
public class ArticleDAOImpl extends ORMStrategy<Article, Long> implements ArticleDAO {
}
