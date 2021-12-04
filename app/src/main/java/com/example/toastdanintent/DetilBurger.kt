package com.example.toastdanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detil_burger.*
import kotlinx.android.synthetic.main.activity_detil_kopi.*

class DetilBurger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detil_burger)
        var sisa = intent.getStringExtra("sisa").toString()
        sisaMenu.text = "Menu Tersisa : " + sisa
    }
}