package com.dicoding.myherbapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.android.gms.fido.fido2.api.common.RequestOptions

class DetailTanaman : AppCompatActivity() {

    private var title : String = "My Herb"
    private lateinit var tvPhoto : ImageView
    private lateinit var namaTanaman: TextView
    private lateinit var latinTanaman: TextView
    private lateinit var warnaTanaman: TextView
    private lateinit var akarTanaman: TextView
    private lateinit var daunTanaman: TextView
    private lateinit var manfaatTanaman : TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tanaman)

        setActionBarTitle(title)

        tvPhoto = findViewById(R.id.img_tanaman)
        namaTanaman = findViewById(R.id.tv_nama)
        latinTanaman = findViewById(R.id.tv_latin_received)
        warnaTanaman = findViewById(R.id.tv_warna_received)
        akarTanaman = findViewById(R.id.tv_akar_received)
        daunTanaman = findViewById(R.id.tv_daun_received)
        manfaatTanaman = findViewById(R.id.tv_manfaat)

        val foto = intent.getIntExtra(EXTRA_FOTO,0)
        val nama = intent.getStringExtra(EXTRA_NAMA)
        val latin = intent.getStringExtra(EXTRA_LATIN)
        val warna = intent.getStringExtra(EXTRA_WARNA)
        val akar = intent.getStringExtra(EXTRA_AKAR)
        val daun = intent.getStringExtra(EXTRA_DAUN)
        val manfaat = intent.getStringExtra(EXTRA_MANFAAT)

        namaTanaman.text = nama
        latinTanaman.text = latin
        warnaTanaman.text = warna
        akarTanaman.text = akar
        daunTanaman.text = daun
        manfaatTanaman.text = manfaat

        Glide.with(this)
            .load(foto)
            .into(tvPhoto)

    }

    companion object {
        const val EXTRA_NAMA = "nama"
        const val EXTRA_LATIN = "latin"
        const val EXTRA_WARNA = "warna"
        const val EXTRA_AKAR = "akar"
        const val EXTRA_DAUN = "daun"
        const val EXTRA_MANFAAT = "manfaat"
        const val EXTRA_FOTO = "foto"
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(share: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_profile,share)
        return super.onCreateOptionsMenu(share)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_share){
            val nama = intent.getStringExtra(EXTRA_NAMA)
            val manfaat = intent.getStringExtra(EXTRA_MANFAAT)
            val latin = intent.getStringExtra(EXTRA_LATIN)
            val warna = intent.getStringExtra(EXTRA_WARNA)
            val akar = intent.getStringExtra(EXTRA_AKAR)
            val daun = intent.getStringExtra(EXTRA_DAUN)

            val sendIntent : Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Tanaman : $nama $latin\n\nWarna : $warna\nAkar : $akar\nDaun : $daun\n\nManfaat : \n$manfaat")
                type = "text/plain"

            }
            val shareIntent = Intent.createChooser(sendIntent,null)
            startActivity(shareIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}