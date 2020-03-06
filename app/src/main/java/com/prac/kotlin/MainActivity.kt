package com.prac.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tempView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tempView = findViewById(R.id.test_printid_v)
        tempView.text = "哈哈 hello world"

        printId(tempView)
    }

    fun printId (printV : View?) {
        Log.e("lzm", "lzm-printid:"+printV?.id)
    }
}
