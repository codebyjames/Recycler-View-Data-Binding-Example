package com.loboda.james.recyclerviewdatabindingexample.data
/*
 * Copyright (C) 2022 James Loboda.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.loboda.james.recyclerviewdatabindingexample.model.Person

/**
 * Create a random list of people to use in our recycler view adapter
 */

object Data {

    private val names = listOf("Bill", "Mike", "Molly", "Emma", "Sarah", "James", "Karen",
        "Sophie", "Missy", "Dan")

    /**
     * Create a list of people using a random number for name & age
     */
    val people = List(10) {
        createPerson()
    }

    private fun createPerson() : Person = Person(names.random(), getRandomNum())
    private fun getRandomNum() : Int = (18..65).random()
}