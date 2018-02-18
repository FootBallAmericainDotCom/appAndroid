package com.footballamericain.footballamericain.Custom.statistic.pat

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomPatViewBinding
import com.footballamericain.footballamericain.databinding.CustomRunViewBinding

/**
 * Created by Jc on 14/02/2018.
 */
class PatView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomPatViewBinding = CustomPatViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: PatViewModel? = null
        set(value) {
            binding.viewModel = value
        }
}