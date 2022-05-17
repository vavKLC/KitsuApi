package com.example.kitsuapi.presentation.ui.fragments.anime.detail

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.common.extensions.setImage
import com.example.kitsuapi.databinding.FragmentAnimeDetailBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AnimeDetailFragment : BaseFragment<AnimeDetailViewModel, FragmentAnimeDetailBinding>(
    R.layout.fragment_anime_detail
) {
    override val viewModel: AnimeDetailViewModel by viewModels()
    override val binding by viewBinding(FragmentAnimeDetailBinding::bind)
    private val args: AnimeDetailFragmentArgs by navArgs()

    override fun setupRequests() {
        viewModel.fetchSingleAnime(args.animeId)
    }

    override fun setupListeners() {
        openYouTubeAnime()
    }

    override fun setupSubscribe() {
        viewModel.singleAnimeState.collectUIState(
            success = {
                binding.apply {
                    it.apply {
                        coverImg.setImage(data.attributes.coverImage?.original)
                        posterImg.setImage(data.attributes.posterImage?.original)
                        subtypeTv.text = data.attributes.subtype?.uppercase()
                        yearTv.text = data.attributes.createdAt
                        titleTv.text = data.attributes.titles?.en
                        synopsisTv.text = data.attributes.synopsis
                        avgRatingTv.text = data.attributes.averageRating
                        ratingTv.text = "Rank #${data.attributes.ratingRank}"
                        popularityTv.text = "Rank #${data.attributes.popularityRank}"
                        data.attributes.youtubeVideoId?.let {
                            binding.videoBtn.isVisible = true
                        }
                    }
                }
            }, error = {
                Log.e("error", it)
            }
        )
    }

    private fun openYouTubeAnime() {
        binding.videoBtn.setOnClickListener {
            this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:${args.videoId}")))
        }
    }
}