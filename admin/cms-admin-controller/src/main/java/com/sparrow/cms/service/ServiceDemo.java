package com.sparrow.cms.service;

import com.sparrow.cms.dao.ArticleDAO;

public class ServiceDemo {
    private ArticleDAO articleDao;

    public void test() {
        articleDao.addClickTimes(1L);
    }
}
