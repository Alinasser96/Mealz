package com.hamalawey.data.remote

import com.hamalawey.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    fun getMeals(): CategoryResponse
}