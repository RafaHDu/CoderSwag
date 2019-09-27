package com.rafaelduarte.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rafaelduarte.coderswag.Model.Category
import com.rafaelduarte.coderswag.R
import com.rafaelduarte.coderswag.Services.DataService
import com.rafaelduarte.coderswag.adapters.CategoryAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /*
    LISTVIEW
    //lateinit var adapter: ArrayAdapter<Category>
    lateinit var adapter: CategoryAdapter
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        LISTVIEW
        //adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, DataService.categories[position].title, Toast.LENGTH_SHORT).show()
        }*/



    }

}
