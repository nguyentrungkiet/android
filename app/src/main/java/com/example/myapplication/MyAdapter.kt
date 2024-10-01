package com.example.myapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val itemList: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // Tạo ViewHolder cho từng mục
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textViewItem)
    }

    // Tạo View cho mỗi mục
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return ViewHolder(view)
    }

    // Gán dữ liệu cho mỗi mục
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = itemList[position]
    }

    // Trả về số lượng mục trong danh sách
    override fun getItemCount(): Int {
        return itemList.size
    }
}
