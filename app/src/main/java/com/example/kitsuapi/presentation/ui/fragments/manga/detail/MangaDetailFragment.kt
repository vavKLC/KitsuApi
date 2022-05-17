package com.example.kitsuapi.presentation.ui.fragments.manga.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.common.extensions.setImage
import com.example.kitsuapi.databinding.FragmentMangaDetailBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaDetailFragment : BaseFragment<MangaDetailViewModel, FragmentMangaDetailBinding>(
    R.layout.fragment_manga_detail
) {
    override val viewModel: MangaDetailViewModel by viewModels()
    override val binding by viewBinding(FragmentMangaDetailBinding::bind)
    private val args: MangaDetailFragmentArgs by navArgs()

    override fun setupRequests() {
        viewModel.fetchDetailManga(args.mangaId)
    }

    override fun setupSubscribe() {
        viewModel.detailMangaState.collectUIState(
            success = {
                binding.apply {
                    it.apply {
                        coverImg.setImage(data.attributesUI?.coverImageUI?.original)
                        posterImg.setImage(data.attributesUI?.posterImageUI?.original)
                        subtypeTv.text = data.attributesUI?.subtype?.uppercase()
                        yearTv.text = data.attributesUI?.createdAt
                        titleTv.text = data.attributesUI?.titlesUI?.en
                        synopsisTv.text = data.attributesUI?.synopsis
                        avgRatingTv.text = data.attributesUI?.averageRating
                        ratingTv.text = "Rank #${data.attributesUI?.ratingRank}"
                        popularityTv.text = "Rank #${data.attributesUI?.popularityRank}"
                    }
                }
            }
        )
    }
}