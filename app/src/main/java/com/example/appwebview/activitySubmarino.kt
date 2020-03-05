package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_submarino.*

class activitySubmarino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submarino)

        mainWebViewSubmarino.webViewClient = WebViewClient()
        mainWebViewSubmarino.settings.javaScriptEnabled = true
        mainWebViewSubmarino.settings.displayZoomControls = true

        mainWebViewSubmarino.loadUrl("https://www.ebay.com/")
    }
}
