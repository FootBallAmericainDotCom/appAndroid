package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.ViewHolder.depthChart.DepthChartViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderDepthChartBinding
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 25/01/2018.
 */
class DepthChartExpandableAdapter(private val roasterList: ArrayList<ArrayList<PlayerDummyContent.Player>>)
    : RecyclerView.Adapter<DepthChartViewHolder>() {

    private var inflater: LayoutInflater? = null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DepthChartViewHolder {
        if (inflater == null) {
            inflater = LayoutInflater.from(parent?.context)
        }

        return DepthChartViewHolder(ViewHolderDepthChartBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int {
        return roasterList.size
    }

    override fun onBindViewHolder(holder: DepthChartViewHolder?, position: Int) {
        holder?.bind("Titre ${position}", roasterList[position], inflater)
    }
}