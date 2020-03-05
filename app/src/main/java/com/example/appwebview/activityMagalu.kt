package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_magalu.*

class activityMagalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        mainWebViewMagalu.webViewClient = WebViewClient()
        mainWebViewMagalu.settings.javaScriptEnabled = true
        mainWebViewMagalu.settings.displayZoomControls = true

        mainWebViewMagalu.loadUrl("https://www.magazinevoce.com.br/")
    }
}
