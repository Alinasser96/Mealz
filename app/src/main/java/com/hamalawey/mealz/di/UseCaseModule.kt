package com.hamalawey.mealz.di

import com.hamalawey.domain.repo.MealsRepo
import com.hamalawey.domain.usecase.GetMealz
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMealz{
        return GetMealz(mealsRepo)
    }
}