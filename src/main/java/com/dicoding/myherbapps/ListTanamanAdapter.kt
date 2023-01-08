package com.dicoding.myherbapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ListTanamanAdapter(private val listTanaman : ArrayList<Herbal>) : RecyclerView.Adapter<ListTanamanAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Herbal)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama : TextView = itemView.findViewById(R.id.tv_nama)
        var tvLatin : TextView = itemView.findViewById(R.id.tv_latin)
        var tvWarna : TextView = itemView.findViewById(R.id.tv_warna)
        var tvAkar : TextView = itemView.findViewById(R.id.tv_akar)
        var tvDaun : TextView = itemView.findViewById(R.id.tv_daun)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_tanaman)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_tanaman, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tanaman = listTanaman[position]

       Glide.with(holder.itemView.context)
            .load(tanaman.foto)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvNama.text = tanaman.nama
        holder.tvLatin.text = tanaman.latin
        holder.tvWarna.text = tanaman.warna
        holder.tvAkar.text = tanaman.akar
        holder.tvDaun.text = tanaman.daun

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listTanaman[holder.adapterPosition]) }
    }


    override fun getItemCount(): Int {
        return listTanaman.size
    }

}