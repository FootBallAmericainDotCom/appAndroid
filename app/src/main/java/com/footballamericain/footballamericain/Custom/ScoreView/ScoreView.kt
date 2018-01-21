package com.footballamericain.footballamericain.Custom.ScoreView

import android.content.Context
import android.support.v7.widget.CardView
import android.util.AttributeSet
import android.view.LayoutInflater
import com.footballamericain.footballamericain.databinding.CustomScoreViewBinding

/**
 * Created by Jc on 21/12/2017.
 */
class ScoreView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    val binding: CustomScoreViewBinding = CustomScoreViewBinding.inflate(LayoutInflater.from(context), this, true)
    var viewModel: ScoreViewViewModel? = null
        set(value) {
            field = value
            binding.viewModel = value
        }
}