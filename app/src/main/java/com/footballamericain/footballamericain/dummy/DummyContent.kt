package com.footballamericain.footballamericain.dummy

import java.util.*

/**
 * Helper class for providing sample title for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<Article> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, Article> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: Article) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
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

    /**
     * A dummy item representing a piece of title.
     */
    class Article(val id: String, val title: String, val description: String, val url: String) {

        override fun toString(): String {
            return title
        }
    }
}
