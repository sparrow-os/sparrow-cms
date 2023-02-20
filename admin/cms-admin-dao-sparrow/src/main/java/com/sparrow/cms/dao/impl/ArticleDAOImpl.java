package com.sparrow.cms.dao.impl;

import com.sparrow.cms.dao.ArticleDAO;
import com.sparrow.cms.po.Content;
import com.sparrow.orm.template.impl.ORMStrategy;

public class ArticleDAOImpl extends ORMStrategy<Content, Long> implements ArticleDAO {
}
