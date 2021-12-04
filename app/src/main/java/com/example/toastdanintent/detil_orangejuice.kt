package com.example.toastdanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detil_kopi.*
import kotlinx.android.synthetic.main.activity_detil_orangejuice.*

class detil_orangejuice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detil_orangejuice)
        var sisa = intent.getStringExtra("sisa").toString()
        sisaOrangeJus.text = "Menu Tersisa : " + sisa
    }

}