package com.works.days_9.adaptors

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.works.days_9.R
import com.works.days_9.models.Product

class ProductAdaptors(private val context: Activity, private var arr: List<Product>) :
    ArrayAdapter<Product>(context, R.layout.product_row, arr)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.product_row, null, true)
        val dt = arr.get(position)

        val r_image = rootView.findViewById<ImageView>(R.id.r_image)
        val r_title = rootView.findViewById<TextView>(R.id.r_title)
        val r_price = rootView.findViewById<TextView>(R.id.r_price)

        r_title.setText(dt.title)
        r_price.setText("${dt.price}₺")

        return rootView
    }

}