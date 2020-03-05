package com.example.appwebview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mercado_livre.*
import kotlinx.android.synthetic.main.activity_netshoes.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)

        //btGravar.setOnClickListener { view: View? ->

       // sh.edit().putString("vl", txtValor.text.toString()).apply()


        idWebViewBuscape.setOnClickListener {
            var intent = Intent(this, ActivityBuscape::class.java)
            startActivity(intent)
        }
        idWebViewMercado.setOnClickListener {
            var intent = Intent(this, activityMercadoLivre::class.java)
            startActivity(intent)
        }
        idWebViewNetshoes.setOnClickListener {
            var intent = Intent(this, activityNetshoes::class.java)
            startActivity(intent)
        }

        idWebViewEbay.setOnClickListener {
            var intent = Intent(this, activityEbay::class.java)
            startActivity(intent)
        }

        idWebViewWebmotors.setOnClickListener {
            var intent = Intent(this, activityWebMotors::class.java)
            startActivity(intent)
        }

        idWebViewMagalu.setOnClickListener {
            var intent = Intent(this, activityMagalu::class.java)
            startActivity(intent)
        }

        idWebViewAmericanas.setOnClickListener {
            var intent = Intent(this, activityAmericanas::class.java)
            startActivity(intent)
        }

        idWebViewSubmarino.setOnClickListener {
            var intent = Intent(this, activitySubmarino::class.java)
            startActivity(intent)
        }
        //botao sobre
        btSobre.setOnClickListener {
            var intent = Intent(this, activitySobre::class.java)
            startActivity(intent)
        }
    }

    //btMostrar.setOnClickListener {view: View? ->

    //var texto = sh.getString("vl","limpou")

    //Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()



}
