package com.nh.stressdiary.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nh.stressdiary.R
import com.nh.stressdiary.data.local.entity.StressEntryEntity

class StressAdapter: RecyclerView.Adapter<StressAdapter.StressItemViewHolder>() {

    private val data: MutableList<StressEntryEntity> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StressItemViewHolder {
        var inflater: LayoutInflater = LayoutInflater.from(parent.context)
        var view: View = inflater.inflate(R.layout.listitem_stress, parent, false)
        return StressItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holderStressItem: StressAdapter.StressItemViewHolder, position: Int) {
        holderStressItem.bind(data[position])
    }

    inner class StressItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView? = null
        var content: TextView? = null
        init {
            title = itemView.findViewById(R.id.stressItemTitle)
            content = itemView.findViewById(R.id.stressItemContent)
        }

        fun bind(entity: StressEntryEntity) {
            title?.text = entity.title
            content?.text = entity.content
        }
    }
}