package com.assissoft.canif

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashScreenCanif : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val i = Intent(this@SplashScreenCanif, ActivityCanif::class.java)
        startActivity(i)
        finish()

    }
}
