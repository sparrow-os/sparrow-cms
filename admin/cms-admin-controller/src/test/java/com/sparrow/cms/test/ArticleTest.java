package com.sparrow.cms.test;

import com.sparrow.cms.po.Article;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArticleTest {
    @Before
    public void setUp() {
        System.out.println("before");
    }

    @Test
    public void test() {
        Article article = new Article();
        article.setArticleId(0L);
        article.setForumCode("");
        article.setEditor("");
        article.setTitle("");
        article.setBrief("");
        article.setContent("");
        article.setClickTimes(0L);
        article.setCreateTime(0L);
        article.setUpdateTime(0L);
        article.setCreateUserId(0L);
        article.setCreateUserName("");
        article.setStatus(0);
        article.setUrl("");
        article.setSort(0);
        article.setPageSize(0);
        article.setType("");
        article.setCover("");
        article.setAlbumId(0L);
        article.setKeywords("");
        article.setRemark("");
        article.setOnlyShowInSelfForum(false);
        System.out.println(article.getArticleId());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("end");
    }
}
