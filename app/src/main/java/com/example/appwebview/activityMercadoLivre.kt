package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_mercado_livre.*

class activityMercadoLivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercado_livre)

        mainWebViewMercado.webViewClient = WebViewClient()
        mainWebViewMercado.settings.javaScriptEnabled = true
        mainWebViewMercado.settings.displayZoomControls = true

        mainWebViewMercado.loadUrl("https://www.mercadolivre.com.br/")
    }
}
