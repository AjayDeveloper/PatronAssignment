package com.patron.patronassignment.adapter

import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.patron.patronassignment.R
import com.patron.patronassignment.model.User
import java.lang.Math.*
import java.util.*


class CustomAdapter(val userList: ArrayList<User>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

   
    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.textViewFirstName.text = userList.get(position).firstName
        holder.textViewLastName.text = userList.get(position).lastName
        holder.textViewCounter.text = userList.get(position).counter.toString()
        holder.imagePerson.setImageBitmap(userList.get(position).imagePerson)

    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            var textViewFirstName = itemView.findViewById(R.id.txtFirstName) as TextView
            var textViewLastName  = itemView.findViewById(R.id.txtLastName) as TextView
            var textViewCounter = itemView.findViewById(R.id.txtCounter) as TextView
            var imagePerson = itemView.findViewById(R.id.imagePerson) as ImageView


    }
}