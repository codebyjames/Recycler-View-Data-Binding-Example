package com.loboda.james.recyclerviewdatabindingexample.model

class Person(val name: String = "John", val age: Int = 1) {
    var description: String = "$name and $age"
        get() = "name: $name and age: $age"
}