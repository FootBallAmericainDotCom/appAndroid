package com.footballamericain.footballamericain.Custom.ScoreView

import android.content.Context
import android.content.res.TypedArray
import android.support.v7.widget.CardView
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.CustomScoreViewBinding

/**
 * Created by Jc on 21/12/2017.
 */
class ScoreView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    val binding: CustomScoreViewBinding = CustomScoreViewBinding.inflate(LayoutInflater.from(context), this, true)
    val viewModel: ScoreViewViewModel = ScoreViewViewModel()

    init {

        binding.viewModel = viewModel
        val a: TypedArray = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.TableView, 0, 0)

        try {
            val qtnbr: String? = a.getString(R.styleable.ScoreView_quartTimeNumber)
            viewModel.title.set(context.getString(R.string.quart_time_nbr, qtnbr))
            viewModel.scoreOne.set(a.getString(R.styleable.ScoreView_scoreOne))
            viewModel.scoreTwo.set(a.getString(R.styleable.ScoreView_scoreTwo))
        } finally {
            a.recycle()
        }

    }

}