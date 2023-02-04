package com.hamalawey.mealz.di

import com.hamalawey.data.remote.ApiService
import com.hamalawey.data.repo.MealsRepoImpl
import com.hamalawey.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo{
        return MealsRepoImpl(apiService)
    }
}