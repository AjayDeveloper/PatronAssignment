package com.patron.patronassignment

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.patron.patronassignment.adapter.CustomAdapter
import com.patron.patronassignment.model.User

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image = intArrayOf(R.drawable.person1, R.drawable.person2, R.drawable.person3, R.drawable.person4, R.drawable.person5)
        var fistName = arrayOf("Ajay","Vijay","Uday","Tejaswini","Urvi")
        var lastName = arrayOf("Patidar","Pande","Sonar","Pawar","Panchal")
        var counter = intArrayOf(100,50,60,90,200)
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()
         for( i in 0 until fistName.size){
             users.add(User(fistName[i],lastName[i],counter[i], BitmapFactory.decodeResource(resources, image[i])))

         }
        //adding some dummy data to the list
        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}