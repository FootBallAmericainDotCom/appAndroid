package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.Fragments.ArticlesFragment.OnArticlesFragmentInteractionListener
import com.footballamericain.footballamericain.ViewHolder.Article.ArticleViewHolder
import com.footballamericain.footballamericain.ViewHolder.HorizontalRecyclerView.HorizontalRVViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderArticleBinding
import com.footballamericain.footballamericain.databinding.ViewHolderHeadlineBinding
import com.footballamericain.footballamericain.databinding.ViewHolderHorizontalRecyclerViewBinding
import com.footballamericain.footballamericain.dummy.ArticlesDummyContent.Article
import com.footballamericain.footballamericain.dummy.MatchDummyContent.Match

/**
 * [RecyclerView.Adapter] that can display a [Article] and makes a call to the
 * specified [OnArticlesFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class ArticlesRecyclerViewAdapter(private val mArticleList: List<Article>,
                                  private val mMatchList: List<Match>,
                                  private val mListener: OnArticlesFragmentInteractionListener?)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private enum class TYPE {
        MATCH, HEADLINE, ARTICLE
    }

    private var mLayoutInflater: LayoutInflater? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.context)
        }


        return when (viewType) {
            TYPE.MATCH.ordinal -> HorizontalRVViewHolder(ViewHolderHorizontalRecyclerViewBinding.inflate(
                    mLayoutInflater, parent, false)
            )
            TYPE.HEADLINE.ordinal -> ArticleViewHolder(ViewHolderHeadlineBinding.inflate(
                    mLayoutInflater, parent, false)
            )
            else -> ArticleViewHolder(ViewHolderArticleBinding.inflate(
                    mLayoutInflater, parent, false)
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is HorizontalRVViewHolder) {
            holder.bind(mMatchList)
        } else if (holder is ArticleViewHolder) {
            val article = mArticleList[position - 1]

            holder.view.setOnClickListener {
                mListener?.onArticleInteraction(article)
            }
            holder.bind(article.url, article.title, article.description)
        }
    }

    override fun getItemCount(): Int {
        return mArticleList.size + 1
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> TYPE.MATCH.ordinal
            1 -> TYPE.HEADLINE.ordinal
            else -> TYPE.ARTICLE.ordinal
        }
    }
}
