package com.prac.kotlin.sample

import android.util.Log

/**
 * 1.创建一个 Kotlin 类，这个类需要禁止外部通过构造器创建实例，并提供至少一种实例化方式
 * 2.分别用 Array、IntArray、List 实现 「保存 1-100_000 的数字，并求出这些数字的平均值」，打印出这三种数据结构的执行时间
 */
class SampleInstance private constructor(){

    companion object{
        fun newInstace() : SampleInstance {
            return SampleInstance()
        }

        const val TAG = "lzm"
    }

    fun calculateWithArray() {
        val startTime = System.currentTimeMillis()
        val list: Array<Int> = Array(100000, init = { i ->
//            Log.d(TAG, "$i")
            i + 1
        })
        var sum = 0L
        for (i in list) {
//            Log.d(TAG, "$i")
            sum += i
        }
        val av = sum / list.size
        Log.d(Companion.TAG, "Array平均值 = $av, 用时：${System.currentTimeMillis() - startTime}")
    }

    fun calculateWithIntArray() {
        val startTime = System.currentTimeMillis()
        val list: IntArray = IntArray(100000, init = { i ->
//            Log.d(TAG, "$i")
            i + 1
        })
        var sum = 0L
        for (i in list) {
            sum += i
        }
        val av = sum / list.size
        Log.d(Companion.TAG, "IntArray平均值 = $av, 用时：${System.currentTimeMillis() - startTime}")
    }

    fun calculateWithList() {
        val startTime = System.currentTimeMillis()
        val list: List<Int> = List(100000, init = { i ->
//            Log.d(TAG, "$i")
            i + 1
        })

        var sum = 0L
        for (i in list) {
            sum += i
        }
        val av = sum / list.size
        Log.d(Companion.TAG, "List平均值 = $av")

        Log.d(Companion.TAG, "用时：${System.currentTimeMillis() - startTime}")
    }

    fun calculateWithListAPI() {
        val startTime = System.currentTimeMillis()
        val list: List<Int> = List(100000, init = { i ->
//            Log.d(TAG, "$i")
            i + 1
        })

        Log.d(Companion.TAG, "list-Api得到平均值 = ${list.average()}")
        Log.d(Companion.TAG, "用时：${System.currentTimeMillis() - startTime}")
    }

}