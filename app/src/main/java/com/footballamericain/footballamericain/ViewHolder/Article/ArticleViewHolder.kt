package com.footballamericain.footballamericain.ViewHolder.Article

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import com.footballamericain.footballamericain.Activities.ArticleActivity
import com.footballamericain.footballamericain.databinding.ViewHolderArticleBinding
import com.footballamericain.footballamericain.databinding.ViewHolderHeadlineBinding

/**
 * Created by Jc on 11/11/2017.
 */
class ArticleViewHolder(binding: Any, val view: View)
    : RecyclerView.ViewHolder(view) {

    constructor(binding: ViewHolderArticleBinding) : this(binding, binding.root)
    constructor(binding: ViewHolderHeadlineBinding) : this(binding, binding.root)

    private val model = ArticleVHModel()

    init {
        when (binding) {
            is ViewHolderArticleBinding -> binding.model = model
            is ViewHolderHeadlineBinding -> binding.model = model
        }
    }

    fun bind(url: String, title: String, description: String) {
        model.url = url
        model.title = title
        model.description = description
        model.notifyChange()

        view.setOnClickListener {
            view.context.startActivity(Intent(view.context, ArticleActivity::class.java))
        }

    }
}