package com.prac.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.prac.kotlin.sample.Food
import com.prac.kotlin.sample.PracticeThree
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

        testSquence()

        //practice3
        var prcatce3 = PracticeThree(name = "lizhiming", age = 30, grade = "牛人")
        prcatce3.show()
        prcatce3.pringList()
    }

    fun initData() { //pricatci 2
        var samItem: SampleInstance = SampleInstance.newInstace()
        samItem.calculateWithArray()
        samItem.calculateWithIntArray()
        samItem.calculateWithList()
        samItem.calculateWithListAPI()
    }

    fun printId (printV : View?) { //practice 1
        Log.e("lzm", "lzm-printid:"+printV?.id)
    }

    fun testSquence() {
        val sequence = sequenceOf(1, 2, 3, 4)
        val result: Sequence<Int> = sequence
            .map { i ->
                println("Map $i")
                i * 2
            }
            .filter { i ->
                println("Filter $i")
                i % 3  == 0
            }
        println(result.first())
    }
}
