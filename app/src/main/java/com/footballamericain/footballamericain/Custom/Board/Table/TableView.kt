package com.footballamericain.footballamericain.Custom.Board.Table

import android.content.Context
import android.content.res.TypedArray
import android.support.v7.widget.CardView
import android.util.AttributeSet
import android.view.LayoutInflater
import com.footballamericain.footballamericain.Custom.Board.Row.RowView
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.CustomTableBinding

/**
 * Created by Jc on 06/01/2018.
 */
class TableView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {
    val binding: CustomTableBinding = CustomTableBinding.inflate(
            LayoutInflater.from(context), this, true
    )

    val viewModel: TableViewModel = TableViewModel()

    init {
        if (!isInEditMode) {
            binding.viewModel = viewModel
            val a: TypedArray = context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.TableView, 0, 0)

            try {
                viewModel.zone.set(a.getString(R.styleable.TableView_zoneName))
            } finally {
                a.recycle()
            }
        }
    }

    fun addRow(view: RowView) {
        binding.table.addView(view)
    }
}