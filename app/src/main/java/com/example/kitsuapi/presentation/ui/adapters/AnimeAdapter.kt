package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuapi.common.extensions.setImage
import com.example.kitsuapi.databinding.ItemAnimeBinding
import com.example.kitsuapi.presentation.base.BaseDiffUtil
import com.example.kitsuapi.presentation.models.anime.DataUI

class AnimeAdapter(
    private val onItemClick: (id: String, videoId: String?) -> Unit
) : PagingDataAdapter<DataUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: AnimeViewHolder,
        position: Int,
    ) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: DataUI) {
            binding.animeImg.setImage(data.attributes.posterImage?.original)

            binding.root.setOnClickListener {
                if (data.attributes.youtubeVideoId == null)
                    onItemClick(data.id, null)
                else
                    onItemClick(data.id, data.attributes.youtubeVideoId)
            }


        }

    }

}
