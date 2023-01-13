package com.womentech.retrofitnewproject.data.repository

import android.util.Log
import com.womentech.retrofitnewproject.common.util.ApiUtils
import com.womentech.retrofitnewproject.data.model.CharacterResponse
import com.womentech.retrofitnewproject.data.retrofit.CharacterService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterRepository() {

    private val characterService: CharacterService = ApiUtils.getCharactersDAOInterface()

    fun characters(){
        val call = characterService.allCharacters()
        call.enqueue(object : Callback<CharacterResponse> {
            override fun onResponse(call: Call<CharacterResponse>, response: Response<CharacterResponse>) {
                if (response.isSuccessful) {
                    val characterResponse = response.body()
                    val info = characterResponse?.info
                    Log.i("Info", "count: ${info?.count}")
                    Log.i("Info", "pages: ${info?.pages}")
                    Log.i("Info", "next: ${info?.next}")
                    Log.i("Info", "prev: ${info?.prev}")
                } else {
                    Log.e("Error", "Failed to retrieve characters: ${response.code()} ${response.message()}")
                }
            }
            override fun onFailure(call: Call<CharacterResponse>, t: Throwable) {
                Log.e("Error", "Failed to retrieve characters", t)
            }
        })

    }

}