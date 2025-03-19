package com.example.lib2.codetutor.oops_kotlin.companion19

class Mentor {
    companion object Config{
        const val MAX_SLOTS = 10
        fun guide() {
        }
    }

    fun main(){
        val maxSlots = Mentor.MAX_SLOTS
//    Note: The default name of a companion object is Companion.
//        val maxSlots = Mentor.Companion.MAX_SLOTS
//        val maxSlots = Mentor.Config.MAX_SLOTS
    }
}