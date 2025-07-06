package com.siddapps.moviehub.media_details.domain.repository

import com.siddapps.moviehub.main.domain.models.Media
import com.siddapps.moviehub.util.Resource
import kotlinx.coroutines.flow.Flow

interface DetailsRepository {

    suspend fun getDetails(
        type: String,
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Media>>

}










