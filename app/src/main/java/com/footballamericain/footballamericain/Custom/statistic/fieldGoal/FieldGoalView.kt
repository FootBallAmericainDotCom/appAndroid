package com.footballamericain.footballamericain.Custom.statistic.fieldGoal

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomFieldGoalViewBinding
import com.footballamericain.footballamericain.databinding.CustomPassViewBinding

/**
 * Created by Jc on 14/02/2018.
 */
class FieldGoalView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomFieldGoalViewBinding = CustomFieldGoalViewBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: FieldGoalViewModel? = null
        set(value) {
            binding.viewModel = value
        }
}