package com.siddapps.moviehub.di

import com.siddapps.moviehub.media_details.data.repository.DetailsRepositoryImpl
import com.siddapps.moviehub.media_details.data.repository.ExtraDetailsRepositoryImpl
import com.siddapps.moviehub.media_details.domain.repository.DetailsRepository
import com.siddapps.moviehub.media_details.domain.repository.ExtraDetailsRepository
import com.siddapps.moviehub.main.data.repository.GenreRepositoryImpl
import com.siddapps.moviehub.main.data.repository.MediaRepositoryImpl
import com.siddapps.moviehub.search.data.repository.SearchRepositoryImpl
import com.siddapps.moviehub.main.domain.repository.GenreRepository
import com.siddapps.moviehub.main.domain.repository.MediaRepository
import com.siddapps.moviehub.search.domain.repository.SearchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMediaRepository(
        mediaRepositoryImpl: MediaRepositoryImpl
    ): MediaRepository

    @Binds
    @Singleton
    abstract fun bindSearchRepository(
        searchRepositoryImpl: SearchRepositoryImpl
    ): SearchRepository

    @Binds
    @Singleton
    abstract fun bindGenreRepository(
        genreRepositoryImpl: GenreRepositoryImpl
    ): GenreRepository

    @Binds
    @Singleton
    abstract fun bindDetailsRepository(
        detailsRepositoryImpl: DetailsRepositoryImpl
    ): DetailsRepository

    @Binds
    @Singleton
    abstract fun bindExtraDetailsRepository(
       extraDetailsRepositoryImpl: ExtraDetailsRepositoryImpl
    ): ExtraDetailsRepository

}
