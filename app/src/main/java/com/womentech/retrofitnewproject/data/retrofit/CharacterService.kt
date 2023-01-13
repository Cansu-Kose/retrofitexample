package com.womentech.retrofitnewproject.data.retrofit

import com.womentech.retrofitnewproject.data.model.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET

interface CharacterService {

    @GET("character")
    fun allCharacters(): Call<CharacterResponse>

}