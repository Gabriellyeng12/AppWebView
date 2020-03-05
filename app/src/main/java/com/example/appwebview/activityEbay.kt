package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ebay.*

class activityEbay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)

        mainWebViewEbay.webViewClient = WebViewClient()
        mainWebViewEbay.settings.javaScriptEnabled = true
        mainWebViewEbay.settings.displayZoomControls = true

        mainWebViewEbay.loadUrl("https://www.ebay.com/")
    }
}
