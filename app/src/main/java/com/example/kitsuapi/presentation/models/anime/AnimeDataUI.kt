package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Data
import com.example.kitsuapi.presentation.base.BaseDiffUtilModel


data class DataUI(
    override val id: String,
    val type: String?,
    val links: LinksUI?,
    val attributes: AttributesUI,
    val relationshipsUI: RelationshipsUI?
) : BaseDiffUtilModel

fun Data.toUI() =
    DataUI(id, type, links?.toUI(), attributes.toUI(), relationships?.toUI())