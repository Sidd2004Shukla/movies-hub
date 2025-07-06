package com.siddapps.moviehub.search.domain.repository

import com.siddapps.moviehub.util.Resource
import com.siddapps.moviehub.main.domain.models.Media
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

}










