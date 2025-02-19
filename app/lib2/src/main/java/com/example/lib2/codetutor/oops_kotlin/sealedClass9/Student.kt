package com.example.lib2.codetutor.oops_kotlin.sealedClass9
//1.sealed class must be in same file you are not able to inherit in different file
//2.Constructor of sealed class can be either protected(by default)
//or private
sealed class Student {
}

class UnderGraduateStudent: Student()

class PostGraduateStudent: Student()

class Doctorate: Student()

class PostDoctorateStudent: Student()


fun main(array: Array<String>){
    val student: Student = Doctorate()
    when(student){
        is Doctorate -> print("Doctorate")
        is PostDoctorateStudent -> print("PostDoctorateStudent")
        is UnderGraduateStudent -> print("UnderGraduateStudent")
        is PostGraduateStudent -> print("PostDoctorateStudent")
    }// no need to write else case because this is the only possibilities
}