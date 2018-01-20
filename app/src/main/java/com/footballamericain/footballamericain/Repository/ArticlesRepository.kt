package com.footballamericain.footballamericain.Repository

import com.footballamericain.footballamericain.dummy.ArticlesDummyContent
import com.footballamericain.footballamericain.dummy.ArticlesDummyContent.Article

/**
 * Created by Jc on 06/01/2018.
 */
class ArticlesRepository {
    companion object {

        fun getArticles(): MutableList<Article> {
            return ArticlesDummyContent.ARTICLES
        }

        fun getArticlesByTeamID(id : String): MutableList<Article> {
            return ArticlesDummyContent.ARTICLES
        }
    }
}