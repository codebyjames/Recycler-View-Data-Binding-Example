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

import android.R
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.loboda.james.recyclerviewdatabindingexample.data.Data
import com.loboda.james.recyclerviewdatabindingexample.databinding.ListItemBinding
import com.loboda.james.recyclerviewdatabindingexample.model.Person


class CustomAdapter: RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    class CustomViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        // Bind layout variable "person" to current person based on position
        fun bind(person: Person) {
            binding.person = person
            binding.executePendingBindings()
        }

        // Test onClick
        fun onClickItem() {

            // set binding for layout variable "itemSelected"
            binding.itemRoot.setOnClickListener {
                binding.itemSelected = true
                binding.executePendingBindings()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CustomViewHolder(ListItemBinding.inflate(layoutInflater))
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        // set & bind person
        val person = Data.people[position]
        holder.bind(person)

        // on click
        holder.onClickItem()

    }

    override fun getItemCount(): Int {
        return Data.people.size
    }

}