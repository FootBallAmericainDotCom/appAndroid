package com.footballamericain.footballamericain.Custom.statistic.passe

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomPassViewBinding

/**
 * Created by Jc on 14/02/2018.
 */
class PasseView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomPassViewBinding = CustomPassViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: PasseViewModel? = null
        set(value) {
            binding.viewModel = value
        }
}