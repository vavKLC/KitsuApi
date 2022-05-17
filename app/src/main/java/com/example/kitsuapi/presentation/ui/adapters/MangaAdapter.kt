package com.example.kitsuapi.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kitsuapi.common.extensions.setImage
import com.example.kitsuapi.databinding.ItemAnimeBinding
import com.example.kitsuapi.databinding.ItemMangaBinding
import com.example.kitsuapi.presentation.base.BaseDiffUtil
import com.example.kitsuapi.presentation.models.manga.DataUI

class MangaAdapter(
    private val onItemClick: (id: String) -> Unit
) : PagingDataAdapter<DataUI, MangaAdapter.MangaViewHolder>(BaseDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        return MangaViewHolder(
            ItemMangaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: MangaViewHolder,
        position: Int,
    ) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class MangaViewHolder(private val binding: ItemMangaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(mangaDataDto: DataUI) {
            binding.mangaImg.setImage(mangaDataDto.attributesUI?.posterImageUI?.original)
            binding.root.setOnClickListener {
                onItemClick(mangaDataDto.id)
            }
        }
    }
}