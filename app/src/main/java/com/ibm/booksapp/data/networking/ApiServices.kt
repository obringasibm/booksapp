package com.ibm.booksapp.data.networking

import com.ibm.booksapp.data.model.BooksResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    @GET("//books/v1/volumes?maxResults=40")
    suspend fun getAll(@Query("startIndex") startIndex: Int,
                    @Query("q") searchString: String,
                    @Query("key") apiKey: String
    ): BooksResponse

    @GET("volumes/{id}")
    suspend fun getBook(
        @Path("id") id: String
    ): BooksResponse

    @GET("volumes/{id}")
    suspend fun setFavorite (
        @Path("id") id: String
    ): BooksResponse
}