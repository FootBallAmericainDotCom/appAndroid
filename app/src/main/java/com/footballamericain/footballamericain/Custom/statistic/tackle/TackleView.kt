package com.footballamericain.footballamericain.Custom.statistic.tackle

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomTackleViewBinding

/**
 * Created by Jc on 14/02/2018.
 */
class TackleView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomTackleViewBinding = CustomTackleViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: TackleViewModel? = null
        set(value) {
            binding.viewModel = value
        }
}