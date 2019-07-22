package com.bob

import java.util.*

fun main(args: Array<String>) {
    val kBox3 = KotlinBox3()
    val kBox5 = KotlinBox5()
    val scanner = Scanner(System.`in`)
    print("Please enter object's length: ")
    val length = scanner.nextFloat()
    print("Please enter object's width: ")
    val width = scanner.nextFloat()
    print("Please enter object's height: ")
    val height = scanner.nextFloat()

    when {
        kBox3.validate(length, width, height) -> print("Box3")
        kBox5.validate(length, width, height) -> print("Box5")
        else -> print("This box isn't suitable.")
    }
}

open class KotlinBox(var length: Float, var width: Float, var height: Float){
    fun validate(len: Float, wid: Float, hei: Float):Boolean{
        return len < length && wid < width && hei < height
    }

}

class KotlinBox3 : KotlinBox(23.toFloat(), 14.toFloat(), 13.toFloat())
class KotlinBox5 : KotlinBox(39.5.toFloat(), 27.5.toFloat(), 23.toFloat())
