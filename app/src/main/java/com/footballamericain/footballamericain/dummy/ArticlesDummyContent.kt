package com.footballamericain.footballamericain.dummy

import java.util.*

/**
 * Helper class for providing sample title for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object ArticlesDummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ARTICLES: MutableList<Article> = ArrayList()


    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: Article) {
        ARTICLES.add(item)
    }

    private fun createDummyItem(position: Int): Article {
        return Article(position.toString(), "Title " + position, makeDetails(position),
                "http://www.footballamericain.com/images/images/matchs/matchup/WASvsMIN.jpg")
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: \n").append(position)
        for (i in 0 until position) {
            builder.append("More details information here.")
        }
        return builder.toString()
    }

    class Article(val id: String, val title: String, val description: String, val url: String) {

        override fun toString(): String {
            return title
        }
    }
}
