package com.example.lib2.codetutor.oops_kotlin.extention8

import javax.swing.text.html.ImageView


class Radio(val frequency: String) {
    fun play() {
        println("Playing audio from fm: ${frequency}")
    }
}

class Car(val radio: Radio, val carName: String) {
    fun printName() {
        print(carName)
    }

    fun Radio.audioDetails() {
        printName()
        print(" : ")
        radio.play()
    }

    fun showCarAudioDetails() {
        radio.audioDetails()
    }
}

fun main(array: Array<String>){
    val car = Car(Radio("97.4"), "Tata Nexon")
    car.showCarAudioDetails()
}
