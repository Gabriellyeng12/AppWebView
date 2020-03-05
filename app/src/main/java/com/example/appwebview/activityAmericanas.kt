package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_magalu.*

class activityAmericanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)

        mainWebViewMagalu.webViewClient = WebViewClient()
        mainWebViewMagalu.settings.javaScriptEnabled = true
        mainWebViewMagalu.settings.displayZoomControls = true

        mainWebViewMagalu.loadUrl("https://www.americanas.com.br/")
    }
}
