package com.loboda.james.recyclerviewdatabindingexample.adapters
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
import android.graphics.Color
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.BindingAdapter

/**
 * Use bindings in Layout XML of list_item.xml
 */


/**
 * Example use
 *
 *      <variable
 *      name="person"
 *      type="com.loboda.james.recyclerviewdatabindingexample.model.Person" />
 *
 *     <TextView
 *     ...
 *     personName="@{person.name}"
 */
@BindingAdapter("personName")
fun bindTextViewName(textView: TextView, name: String) {

    textView.text = name

    if (textView.text.contains("o")) {
        increaseTextSize(textView, 3)
    }
}

@BindingAdapter("isItemSelected")
fun bindRootItemSelected(layout: LinearLayout, isSelected: Boolean) {

    if (isSelected) {
        layout.setBackgroundColor(Color.YELLOW)
    }

}

@BindingAdapter("personAge")
fun bindTextViewAge(textView: TextView, age: Int) {

    textView.text = "age $age"

    if ((age % 2) == 0) {
        increaseTextSize(textView)
    }
}

private fun increaseTextSize(textView: TextView, increaseBy: Int = 1) {
    val currentSize = textView.textSize
    textView.textSize = currentSize + increaseBy
}