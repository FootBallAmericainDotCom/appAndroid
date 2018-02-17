package com.footballamericain.footballamericain.Custom.match

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import com.footballamericain.footballamericain.databinding.CustomMatchViewBinding

/**
 * Created by Jc on 17/02/2018.
 */
class MatchView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    val binding: CustomMatchViewBinding = CustomMatchViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: MatchViewModel? = null
        set(value) {
            field = value
            binding.model = value
        }
}