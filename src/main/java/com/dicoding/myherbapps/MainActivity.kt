package com.dicoding.myherbapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recycleViewHerbal : RecyclerView
    private var list : ArrayList<Herbal> = arrayListOf()
    private var title : String = "My Herb"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBarTitle(title)

        recycleViewHerbal = findViewById(R.id.recycle_view_herb)
        recycleViewHerbal.setHasFixedSize(true)

        list.addAll(DataTanaman.listData)
        showRecycleList()

    }

    private fun showRecycleList() {
        recycleViewHerbal.layoutManager = LinearLayoutManager(this)
        val listHerbalAdapter = ListTanamanAdapter(list)
        recycleViewHerbal.adapter = listHerbalAdapter

        listHerbalAdapter.setOnItemClickCallback(object : ListTanamanAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Herbal) {

                val intent = Intent(this@MainActivity, DetailTanaman::class.java).apply {
                    putExtra(DetailTanaman.EXTRA_NAMA, data.nama)
                    putExtra(DetailTanaman.EXTRA_LATIN, data.latin)
                    putExtra(DetailTanaman.EXTRA_WARNA, data.warna)
                    putExtra(DetailTanaman.EXTRA_AKAR, data.akar)
                    putExtra(DetailTanaman.EXTRA_DAUN, data.daun)
                    putExtra(DetailTanaman.EXTRA_MANFAAT, data.manfaat)
                    putExtra(DetailTanaman.EXTRA_FOTO, data.foto)
                }
                startActivity(intent)

            }
        })
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(profil: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,profil)
        return super.onCreateOptionsMenu(profil)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_page){
            val btnProfile = Intent(this, Profile::class.java)
            startActivity(btnProfile)
        }
        return super.onOptionsItemSelected(item)
    }




}