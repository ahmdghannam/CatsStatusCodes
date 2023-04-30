package com.example.catsstatuscodes.model.repository

import com.example.catsstatuscodes.model.api.API
import io.reactivex.rxjava3.core.Single

class Repository {
    private val api=API()
    fun getCatPhoto(code:String): Single<String> {
        return api.apiService.getCatWithCode(code)
    }
}