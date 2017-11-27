package com.footballamericain.footballamericain.App

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.footballamericain.footballamericain.R
import com.squareup.picasso.Picasso

/**
 * Created by Jc on 15/11/2017.
 */
class BindingAdapter {

    companion object {
        @JvmStatic
        @BindingAdapter("circlePictureURL")
        fun setPictureURL(imageView: ImageView, url: String?) {
            Picasso.with(imageView.context)
                    .load(url)
                    .resize(700, 700)
                    .centerCrop()
                    .placeholder(R.drawable.background_splash)
                    .error(R.drawable.background_splash)
                    .into(imageView)
        }

    }
}