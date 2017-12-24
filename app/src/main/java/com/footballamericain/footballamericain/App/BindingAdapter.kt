package com.footballamericain.footballamericain.App

import android.databinding.BindingAdapter
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.footballamericain.footballamericain.Custom.ScoreView.ScoreView
import com.footballamericain.footballamericain.R
import com.squareup.picasso.Picasso

/**
 * Created by Jc on 15/11/2017.
 */
class BindingAdapter {

    companion object {
        @JvmStatic
        @BindingAdapter("pictureURL")
        fun setPictureURL(imageView: ImageView, url: String?) {
            Picasso.with(imageView.context)
                    .load(url)
                    .resize(700, 700)
                    .centerCrop()
                    .placeholder(R.drawable.background_splash)
                    .error(R.drawable.background_splash)
                    .into(imageView)
        }

        @JvmStatic
        @BindingAdapter("quartTimeNumber")
        fun setQuartTimeNumber(view: View, qtnbr: String?) {
            Log.d("SCORE_VIEW", "SetQuartTimeNumber")
            if (view is ScoreView) {
                view.viewModel.title.set(
                        view.context.getString(
                                R.string.quart_time_nbr, qtnbr
                        )
                )
            }
        }

        @JvmStatic
        @BindingAdapter("scoreOne")
        fun setScoreOne(scoreView: ScoreView, score: String) {
            scoreView.viewModel.scoreOne.set(score)
        }

        @JvmStatic
        @BindingAdapter("scoreTwo")
        fun setScoreTwo(scoreView: ScoreView, score: String) {
            scoreView.viewModel.scoreTwo.set(score)
        }

    }
}