package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*
import kotlinx.android.synthetic.main.activity_netshoes.*

class activityNetshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)

        mainWebViewNetshoes.webViewClient = WebViewClient()
        mainWebViewNetshoes.settings.javaScriptEnabled = true
        mainWebViewNetshoes.settings.displayZoomControls = true

        mainWebViewNetshoes.loadUrl("https://www.netshoes.com.br/")
    }
}
