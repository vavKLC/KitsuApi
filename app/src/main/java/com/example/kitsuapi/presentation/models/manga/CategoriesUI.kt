package  com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Categories


data class CategoriesUI(
    val links: LinksXXUI?
)

fun Categories.toUI() =
    CategoriesUI(links?.toUI())