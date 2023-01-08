package com.dicoding.myherbapps

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class Profile : AppCompatActivity() {

    private var title : String = "My Herb"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setActionBarTitle(title)

    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}