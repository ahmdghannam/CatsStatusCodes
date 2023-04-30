package com.example.catsstatuscodes.model.api

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface CatsApiService {
    @GET("/{code}.jpg")
    fun getCatWithCode(@Path("code") code:String): Single<String>
}