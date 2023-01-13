package com.womentech.retrofitnewproject.common.util

import com.womentech.retrofitnewproject.common.util.Constants.BASE_URL
import com.womentech.retrofitnewproject.data.retrofit.CharacterService
import com.womentech.retrofitnewproject.data.retrofit.RetrofitClient


object ApiUtils {
    fun getCharactersDAOInterface(): CharacterService =
        RetrofitClient.getClient(BASE_URL).create(CharacterService::class.java)
}