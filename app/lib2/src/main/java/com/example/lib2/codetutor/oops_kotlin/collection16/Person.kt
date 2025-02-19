package com.example.lib2.codetutor.oops_kotlin.collection16

data class Person (var firstName: String, var lastName: String, var nationality: String?, var age: Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
//        return this.age.compareTo(other.age)
        return this.firstName.compareTo(other.firstName)
    }

    companion object {
        class FirstNameComparator: Comparator<Person>{
            override fun compare(o1: Person?, o2: Person?): Int {
                return o1!!.firstName.compareTo(o2!!.firstName)
            }
        }

        class LastNameComparator: Comparator<Person>{
            override fun compare(o1: Person?, o2: Person?): Int {
                return o1!!.lastName.compareTo(o2!!.lastName)
            }
        }

        class AgeComparator: Comparator<Person>{
            override fun compare(o1: Person?, o2: Person?): Int {
                return o1!!.age - o2!!.age
            }
        }
    }
}