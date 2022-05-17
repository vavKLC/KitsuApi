package com.example.kitsuapi.presentation.ui.fragments.anime

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.common.extensions.directionsSafeNavigation
import com.example.kitsuapi.databinding.FragmentAnimeBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.AnimeAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(
    R.layout.fragment_anime
) {
    override val viewModel: AnimeViewModel by viewModels()
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    private val animeAdapter = AnimeAdapter(this::onItemClick)

    override fun setupViews() {
        setupAdapter()
    }

    override fun setupSubscribe() {
        viewModel.fetchAnime().collectPaging(
            error = {
                Log.e("error", it)
            },
            success = {
                animeAdapter.submitData(it)
            }
        )
    }

    private fun setupAdapter() {
        binding.recyclerView.apply {
            adapter = animeAdapter
        }
    }

    private fun onItemClick(id: String,videoId: String?) {
        findNavController().directionsSafeNavigation(
            AnimeFragmentDirections.actionAnimeFragmentToAnimeDetailFragment(
                id, videoId
            )
        )
    }
}