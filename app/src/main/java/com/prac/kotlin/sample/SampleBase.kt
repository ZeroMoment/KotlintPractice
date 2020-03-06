package com.prac.kotlin.sample

class SampleBase {

    var myName : String? = "lizhiming"

    fun coook(name: String) : Food{
        return Food()
    }

    fun test() {
        myName?.let { coook(it) }
    }
}

class Food {

    var name = "Mike"

    get() {
        return "$field nb"
    }

    set(value) {
        field = "Cute $value"
    }

    fun run() {
        name = "Mary"

        println(name)
    }

}
