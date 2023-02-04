package com.sparrow.cms.dao;

import com.sparrow.cms.po.Article;
import com.sparrow.protocol.Neighbor;
import com.sparrow.protocol.dao.DaoSupport;
import java.util.List;

public interface ArticleDAO extends DaoSupport<Article, Long> {
    List<Article> getTopByForumCodeExceptId(String forumCode, Long exceptArticleId, Integer top);

    Integer addClickTimes(Long articleId);

    List<Article> getAlbumList(String forumCode);

    Neighbor<Article, Article> getNeighbor(Long articleId);

//    List<Article> query(CmsQueryDTO query);
//
//    Long count(CmsQueryDTO query);
//
//    List<Article> query(CmsOfForumQueryDTO query);
}
