package com.footballamericain.footballamericain.Custom.statistic.reception

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomReceptionViewBinding
import com.footballamericain.footballamericain.databinding.CustomRunViewBinding

/**
 * Created by Jc on 14/02/2018.
 */
class ReceptionView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomReceptionViewBinding = CustomReceptionViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: ReceptionViewModel? = null
        set(value) {
            binding.viewModel = value
        }
}