package com.footballamericain.footballamericain.Custom.Board.Row

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.footballamericain.footballamericain.databinding.CustomTableRowBinding

/**
 * Created by Jc on 02/01/2018.
 */
class RowView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding: CustomTableRowBinding = CustomTableRowBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    var viewModel: RowViewModel? = null
        set(value) {
            field = value
            binding.viewModel = value
        }
}
