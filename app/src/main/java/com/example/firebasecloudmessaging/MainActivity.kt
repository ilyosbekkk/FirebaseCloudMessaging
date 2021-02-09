package com.example.firebasecloudmessaging

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreate: ", )
        print("Hello")

        startService(
            Intent(
                applicationContext,
                FirebaseMessaging::class.java
            )
        )

    }


}

