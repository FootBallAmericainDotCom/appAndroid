package com.footballamericain.footballamericain.App

import android.databinding.BindingAdapter
import android.graphics.Color
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.TabLayout
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.ImageView
import com.footballamericain.footballamericain.Custom.Board.Table.TableView
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
        @BindingAdapter("circlePictureURL")
        fun setCirclePictureURL(imageView: ImageView, url: String?) {
            Picasso.with(imageView.context)
                    .load(url)
                    .resize(700, 700)
                    .centerCrop()
                    .transform(CircleTransform(Color.parseColor("#ffffff")))
                    .placeholder(R.drawable.background_splash)
                    .error(R.drawable.background_splash)
                    .into(imageView)

        }

        @JvmStatic
        @BindingAdapter("zoneName")
        fun setzoneName(tableView: TableView, name: String) {
            tableView.viewModel.zone.set(name)
        }

        @JvmStatic
        @BindingAdapter("bindingBackground")
        fun setBindingBackground(view: View, int: Int) {
            view.setBackgroundResource(int)
        }

        @JvmStatic
        @BindingAdapter("android:background")
        fun setBackground(view: View, color: String?) {
            if (color != null) {
                view.setBackgroundColor(Color.parseColor(color))
            } else {
                view.setBackgroundColor(Color.WHITE)
            }
        }

        @JvmStatic
        @BindingAdapter("app:tabIndicatorColor")
        fun setIndicatorColor(tabLayout: TabLayout, color: String?) {
            if (color != null) {
                tabLayout.setSelectedTabIndicatorColor(Color.parseColor(color))
            } else {
                tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(
                        tabLayout.context, R.color.colorAccent
                ))
            }
        }

        @JvmStatic
        @BindingAdapter("app:tabSelectedTextColor")
        fun setTabSelectedTextColor(tabLayout: TabLayout, color: String?) {
            if (color != null) {
                tabLayout.setTabTextColors(Color.WHITE, Color.parseColor(color))
            } else {
                tabLayout.setTabTextColors(Color.WHITE, ContextCompat.getColor(
                        tabLayout.context, R.color.colorAccent
                ))
            }
        }

        @JvmStatic
        @BindingAdapter("app:contentScrim")
        fun setContentScrimColor(toolbar: CollapsingToolbarLayout, color: String?) {
            if (color != null) {
                toolbar.setContentScrimColor(Color.parseColor(color))
                toolbar.setStatusBarScrimColor(Color.parseColor(color))
            } else {
                toolbar.setContentScrimColor(ContextCompat.getColor(
                        toolbar.context, R.color.colorPrimary
                ))
                toolbar.setStatusBarScrimColor(ContextCompat.getColor(
                        toolbar.context, R.color.colorPrimary
                ))
            }
        }
    }
}

