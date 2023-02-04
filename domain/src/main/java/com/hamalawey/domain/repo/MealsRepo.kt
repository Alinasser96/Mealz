package com.hamalawey.domain.repo

import com.hamalawey.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote(): CategoryResponse
}