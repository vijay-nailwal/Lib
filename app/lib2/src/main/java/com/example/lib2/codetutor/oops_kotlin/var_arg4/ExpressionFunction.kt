package com.example.lib2.codetutor.oops_kotlin.var_arg4


/**
 * Created by Vijay on 07 Feb 2025.
 */
class ExpressionFunction {

    //expression function
    fun isEven(number: Int): Boolean = number % 2 == 0

    //    variable argument function,
    //    only one vararg allowed
    fun sum(vararg numbers: Int): Int {
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return sum
    }

    //second parameter
    fun sum2(vararg numbers: Int, name: String): Int {
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return sum
    }

    fun sum3(name: String, vararg numbers: Int): Int {
        var sum = 0
        for (num in numbers) {
            sum += num
        }
        return sum
    }
}

fun main(args: Array<String>) {
    var exp = ExpressionFunction()
    println(exp.isEven(30))
    println(exp.isEven(3))
    println(exp.sum(1, 2, 3, 4, 5))
    println(exp.sum2(1, 2, 3, 4, 5, name = "vijay"))
    println(exp.sum3("vijay",1, 2, 3, 4, 5))
    println(exp.sum3(name = "vijay",1, 2, 3, 4, 5))

}