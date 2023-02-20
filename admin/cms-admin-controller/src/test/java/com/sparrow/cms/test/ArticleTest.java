package com.sparrow.cms.test;

import com.sparrow.cms.po.Content;
import com.sparrow.protocol.enums.StatusRecord;
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
        Content article = new Content();
        article.setId(0L);
        article.setChannel(1L);
        article.setEditor("");
        article.setTitle("");
        article.setBrief("");
        article.setContent("");
        article.setClickTimes(0L);
        article.setCreateTime(0L);
        article.setUpdateTime(0L);
        article.setCreateUserId(0L);
        article.setCreateUserName("");
        article.setStatus(StatusRecord.ENABLE);
        article.setUrl("");
        article.setSort(0);
        article.setCover("");
        article.setAlbumId(0L);
        article.setKeywords("");
        article.setRemark("");
        System.out.println(article.getId());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("end");
    }
}
