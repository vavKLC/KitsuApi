package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Data
import com.example.kitsuapi.presentation.base.BaseDiffUtilModel


data class DataUI(
    override val id: String,
    val type: String?,
    val linksUI: LinksUI?,
    val attributesUI: AttributesUI?,
    val relationshipsUI: RelationshipsUI?
) : BaseDiffUtilModel

fun Data.toUI() =
    DataUI(id, type, links?.toUI(), attributes?.toUI(), relationships?.toUI())