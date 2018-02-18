package com.footballamericain.footballamericain.Custom.statistic.punt

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomPuntViewBinding

/**
 * Created by Jc on 14/02/2018.
 */
class PuntView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomPuntViewBinding = CustomPuntViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: PuntViewModel? = null
        set(value) {
            binding.viewModel = value
        }
}