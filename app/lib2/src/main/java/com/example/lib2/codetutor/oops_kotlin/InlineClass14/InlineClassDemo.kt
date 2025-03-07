package com.example.lib2.codetutor.oops_kotlin.InlineClass14

//wrapper to primary objects
inline class Width(val value: Long)
inline class Height(val value: Long)

class Rectangle (width: Width, height: Height){
    private val width: Width? = width
    private val height: Height? = height

    fun printSpec(){
        println("${this.width}, ${this.height} ${this.width.hashCode()}")
    }
}

fun main(array: Array<String>){
    val width = Width(100L)
    val height = Height(50L)
    var shape = Rectangle(width,height)
    shape.printSpec()
}