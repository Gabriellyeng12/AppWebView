package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*

class ActivityBuscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)

        mainWebViewBuscape.webViewClient = WebViewClient()
        mainWebViewBuscape.settings.javaScriptEnabled = true
        mainWebViewBuscape.settings.displayZoomControls = true

        mainWebViewBuscape.loadUrl("https://www.buscape.com.br")
    }
}
