package com.example.kitsuapi.presentation.ui.fragments.manga

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.common.extensions.directionsSafeNavigation
import com.example.kitsuapi.databinding.FragmentMangaBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import com.example.kitsuapi.presentation.ui.adapters.MangaAdapter


class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(
    R.layout.fragment_manga
) {
    override val viewModel: MangaViewModel by viewModels()
    override val binding by viewBinding(FragmentMangaBinding::bind)
    private val mangaAdapter = MangaAdapter(this::onItemClick)
    override fun setupViews() {
        setupAdapter()
    }

    override fun setupSubscribe() {
        viewModel.fetchManga().collectPaging(
            error = {
                Log.e("error", it)
            },
            success = {
                mangaAdapter.submitData(it)
            }
        )
    }

    private fun setupAdapter() {
        binding.recyclerView.apply {
            adapter = mangaAdapter
        }
    }

    private fun onItemClick(id: String) {
        findNavController().directionsSafeNavigation(
            MangaFragmentDirections.actionMangaFragmentToMangaDetailFragment(
                id
            )
        )
    }

}