package com.womentech.retrofitnewproject.data.model


import com.google.gson.annotations.SerializedName

data class Character(
    @SerializedName("info")
    val info: Info?,
    @SerializedName("results")
    val results: List<Result>?
)