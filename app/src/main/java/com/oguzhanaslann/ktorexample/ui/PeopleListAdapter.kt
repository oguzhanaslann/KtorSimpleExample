package com.oguzhanaslann.ktorexample.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.oguzhanaslann.ktorexample.databinding.ItemPersonLayoutBinding

class PeopleListAdapter : ListAdapter<Person,PeopleListAdapter.Holder>(DiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemPersonLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val currentItem = getItem(position)
        holder.onBind(currentItem)
    }

    inner class Holder(val binding: ItemPersonLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(currentItem: Person) {
            binding.run {
                personImage.load(currentItem.profilePhotoUrl)
                personName.text = currentItem.fullName
                personPhoneNumber.text = currentItem.phoneNumber
            }
        }
    }


    class DiffCallback : DiffUtil.ItemCallback<Person>(){
        override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
            return oldItem == newItem
        }

    }



}

data class Person(
    val id : String,
    val fullName : String,
    val profilePhotoUrl : String,
    val phoneNumber : String
)