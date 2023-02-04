package com.hamalawey.data.repo

import com.hamalawey.data.remote.ApiService
import com.hamalawey.domain.entity.CategoryResponse
import com.hamalawey.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService): MealsRepo {
    override fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}