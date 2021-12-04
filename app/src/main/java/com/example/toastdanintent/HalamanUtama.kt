package com.example.toastdanintent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.content.Intent
import kotlinx.android.synthetic.main.activity_halaman_utama.*

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)
    }

    fun klik_gambar(view: View)
    {
        var gambar = view.id
        when(gambar){
            fries.id ->{
                Toast.makeText(this,"Menu ini telah habis",Toast.LENGTH_LONG).show()
            }
            burger.id ->{
                var inten = Intent(this,DetilBurger::class.java)
                inten.putExtra("sisa","15")
                inten.putExtra("imgId",R.drawable.burger)
                startActivity(inten)
            }
            kopi.id -> {
                var inten = Intent(this,detil_kopi::class.java)
                inten.putExtra("sisa","10")
                startActivity(inten)
            }
            orangejuice.id -> {
                var inten = Intent(this,detil_orangejuice::class.java)
                inten.putExtra("sisa","5")
                startActivity(inten)
            }
        }
    }
}