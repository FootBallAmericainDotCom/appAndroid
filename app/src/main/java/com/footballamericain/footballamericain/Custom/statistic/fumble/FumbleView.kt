package com.footballamericain.footballamericain.Custom.statistic.fumble

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomFumbleViewBinding

/**
 * Created by Jc on 14/02/2018.
 */
class FumbleView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomFumbleViewBinding = CustomFumbleViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: FumbleViewModel? = null
        set(value) {
            binding.viewModel = value
        }
}