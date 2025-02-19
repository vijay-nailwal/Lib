package com.example.lib2.codetutor.oops_kotlin.collection16


fun main(array: Array<String>) {
    //construction of immuatble list
    var nameList = listOf<String>("a", "b")
    var nameBuildList = buildList<String> {
        add("a")
        add("b")
    }
    //construction of muatble list
    var namesMutableList = mutableListOf<String>("a", "b")
    namesMutableList.add("c")
    namesMutableList.add(3, "d")

//    ways of display data
//    println(nameList)//1

    for (name in nameList) {//2
//        println(name)
    }

    nameList.forEach {//3
//        println(it)
    }

    val nameIterator = nameList.listIterator()//4
    while (nameIterator.hasNext()) {
//        println(nameIterator.next())
    }

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //construction of immuatble set
    var nameSet = setOf<String>("a", "b")
    var nameBuildSet = buildSet<String> {
        add("a")
        add("b")
        add("b")
    }

    //construction of muatble list
    var nameMutableSet = mutableSetOf<String>("a", "b")
    nameMutableSet.add("c")
    nameMutableSet.add("d")

//+++++++++++++++++++++immutable MAP OF++++++++++++++++++++++++++++++++++
    var nameMapOf = mapOf<String, String>("Bangaluru" to "Karnataka", "Chennai" to "Tamilnadu")
    var nameBuildMap = buildMap<String, String> {
        put("Bangaluru", "Karnataka")
        put("Chennai", "Tamilnadu")
    }
//+++++++++++++++++++++mutable MAP OF++++++++++++++++++++++++++++++++++
    var nameMutableMap =
        mutableMapOf<String, String>("Bangaluru" to "Karnataka", "Chennai" to "Tamilnadu")
    nameMutableMap.put("Goa", "Panjim")

    for (item in nameMutableMap) {//1
//        println("${item.key} => ${item.value}")
    }

    for ((key, value) in nameMutableMap) {//2
//        println("${key} => ${value}")

    }

//    nameMutableMap.forEach { key, value -> println("$key => $value") }//3

//    nameMutableMap.forEach { item -> println("${item.key} => ${item.value}") }//4

    var iteratorCity=nameMutableMap.iterator()
    while(iteratorCity.hasNext()){
        val item=iteratorCity.next()
        println("${item.key} => ${item.value}" )
    }

}