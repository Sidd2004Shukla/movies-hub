package com.siddapps.moviehub.main.domain.repository

import com.siddapps.moviehub.util.Resource
import com.siddapps.moviehub.main.domain.models.Genre
import kotlinx.coroutines.flow.Flow

interface GenreRepository {
    suspend fun getGenres(
        fetchFromRemote: Boolean,
        type: String,
        apiKey: String
    ): Flow<Resource<List<Genre>>>
}










