package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.Fragments.ArticlesFragment.OnArticlesFragmentInteractionListener
import com.footballamericain.footballamericain.ViewHolder.Article.ArticleViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderArticleBinding
import com.footballamericain.footballamericain.databinding.ViewHolderHeadlineBinding
import com.footballamericain.footballamericain.dummy.DummyContent.Article

/**
 * [RecyclerView.Adapter] that can display a [Article] and makes a call to the
 * specified [OnArticlesFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class ArticlesRecyclerViewAdapter(private val mArticleList: List<Article>,
                                  private val mListener: OnArticlesFragmentInteractionListener?)
    : RecyclerView.Adapter<ArticleViewHolder>() {

    private enum class TYPE{
        HEADLINE, ARTICLE
    }

    private var mLayoutInflater: LayoutInflater? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.context)
        }


        return when (viewType) {
            TYPE.HEADLINE.ordinal -> ArticleViewHolder(ViewHolderHeadlineBinding.inflate(
                    mLayoutInflater, parent, false)
            )
            else -> ArticleViewHolder(ViewHolderArticleBinding.inflate(
                    mLayoutInflater, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = mArticleList[position]

        holder.view.setOnClickListener {
            mListener?.onArticleInteraction(article)
        }
        holder.binding(article.url, article.title, article.description)
    }

    override fun getItemCount(): Int {
        return mArticleList.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(position) {
            0 -> TYPE.HEADLINE.ordinal
            else -> TYPE.ARTICLE.ordinal
        }
    }
}
