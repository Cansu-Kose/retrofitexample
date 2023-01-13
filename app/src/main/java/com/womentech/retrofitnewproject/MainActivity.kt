package com.womentech.retrofitnewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.womentech.retrofitnewproject.data.repository.CharacterRepository

class MainActivity : AppCompatActivity() {

    private val repository = CharacterRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repository.characters()

    }
}