package com.prac.kotlin.sample

class PracticeThree(var name: String) {

    var age: Int = 0
    lateinit var grade: String

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, grade: String) : this(name, age) {
        this.grade = grade
    }


    fun show() {
        println("$name -- $age -- $grade")
    }

    fun pringList() {
        var result = listOf<Int>(21, 40, 11, 33, 78).filter {
            it % 3 == 0
        }

        println(result)

    }

}