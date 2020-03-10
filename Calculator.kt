package oop

import functions.sum

class Calculator(num1:Int,num2:Int) {
//Creating empty variables for this class
    var num1:Int
    var num2:Int

    init {
        this.num1 = num1
        this.num2 = num2
    }

//    Methods
    fun sumoftwo(){
        println("Sum = ${num1 + num2}")
    }
    fun suboftwo(){
        println("Subtraction =  ${num1 - num2}")
    }
    fun multioftwo(){
        println("Multiplication = ${num1 * num2}")
    }
    fun divoftwo(){
        println("Division = ${num1 / num2}")
    }
    fun modoftwo(){
        println("Modulus = ${num1 % num2}")
    }
}

fun main(args: Array<String>) {
    println("CALCULATOR 101-KT5")
    println("Enter num1:")
    val num1: String = readLine()!!
    num1 ==("")
    var newNum1 :Int = num1.toInt()


    println("Enter num2:")
    val num2: String = readLine()!!
    num2 == ("")
    var newNum2 :Int = num2.toInt()

    val calc = Calculator(newNum1,newNum2)


//    CALLING the methods
    calc.sumoftwo()
    calc.suboftwo()
    calc.multioftwo()
    calc.divoftwo()
    calc.modoftwo()



}

