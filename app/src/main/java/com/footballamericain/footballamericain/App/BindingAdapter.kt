package com.footballamericain.footballamericain.App

import android.databinding.BindingAdapter
import android.databinding.ObservableField
import android.graphics.Color
import android.support.design.widget.CollapsingToolbarLayout
import android.support.design.widget.TabLayout
import android.support.v4.content.ContextCompat
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import com.footballamericain.footballamericain.Custom.Board.Table.TableView
import com.footballamericain.footballamericain.R
import com.squareup.picasso.Picasso
import android.graphics.drawable.Drawable
import android.util.Log
import com.footballamericain.footballamericain.Custom.match.MatchView
import com.footballamericain.footballamericain.Custom.match.MatchViewModel


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
        @BindingAdapter(value = ["app:circlePictureURL", "app:circleColor"], requireAll = false)
        fun setCirclePictureURL(imageView: ImageView, url: String?, color: String?) {
            if (color.isNullOrEmpty()) {
            Picasso.with(imageView.context)
                    .load(url)
                    .resize(700, 700)
                    .centerCrop()
                    .transform(CircleTransform(Color.parseColor("#ffffff")))
                    .placeholder(R.drawable.background_splash)
                    .error(R.drawable.background_splash)
                    .into(imageView)

            } else {
                Picasso.with(imageView.context)
                        .load(url)
                        .resize(700, 700)
                        .centerCrop()
                        .transform(CircleTransform(Color.parseColor(color)))
                        .placeholder(R.drawable.background_splash)
                        .error(R.drawable.background_splash)
                        .into(imageView)
            }
        }

        @JvmStatic
        @BindingAdapter("zoneName")
        fun setZoneName(tableView: TableView, name: String) {
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
        @BindingAdapter("android:visibility")
        fun setVisibility(view: View, visibility: Boolean?) {
            visibility?.let {
                view.visibility =   if (it == true)  VISIBLE else GONE
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

        @JvmStatic
        @BindingAdapter("viewModel")
        fun setBindViewModel(matchView : MatchView, viewModel : MatchViewModel) {
            matchView.viewModel = viewModel
        }
    }
}

