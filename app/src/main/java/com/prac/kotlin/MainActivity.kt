package com.prac.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.prac.kotlin.sample.Food
import com.prac.kotlin.sample.SampleInstance

class MainActivity : AppCompatActivity() {

    lateinit var tempView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tempView = findViewById(R.id.test_printid_v)
        tempView.text = "哈哈 hello world"

        printId(tempView)

        var food : Food = Food()
        println(food.name)

        food.run()

        initData()

    }

    fun initData() {
        var samItem: SampleInstance = SampleInstance.newInstace()
        samItem.calculateWithArray()
        samItem.calculateWithIntArray()
        samItem.calculateWithList()
        samItem.calculateWithListAPI()
    }

    fun printId (printV : View?) {
        Log.e("lzm", "lzm-printid:"+printV?.id)
    }
}
