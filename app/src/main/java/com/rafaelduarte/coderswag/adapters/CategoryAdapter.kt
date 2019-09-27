package com.rafaelduarte.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.rafaelduarte.coderswag.Model.Category
import com.rafaelduarte.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter(){

    //LISTVIEW

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImageView)
            holder.categoryName = categoryView.findViewById(R.id.categoryTextView)
            println("I exist for the first time!")
            categoryView.tag = holder
        } else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green, recycle!")
        }

        val category = categories[position]
        holder.categoryName?.text = category.title
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        return  categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder{
        var categoryName: TextView? = null
        var categoryImage: ImageView? = null
    }


}