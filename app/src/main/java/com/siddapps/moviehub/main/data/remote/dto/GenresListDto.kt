package com.siddapps.moviehub.main.data.remote.dto

import com.siddapps.moviehub.main.domain.models.Genre

data class GenresListDto(
    val genres: List<Genre>
)