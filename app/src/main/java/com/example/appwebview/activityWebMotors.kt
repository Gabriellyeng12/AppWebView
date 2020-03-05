package com.example.appwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_motors.*

class activityWebMotors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_motors)

        mainWebViewWebmotors.webViewClient = WebViewClient()
        mainWebViewWebmotors.settings.javaScriptEnabled = true
        mainWebViewWebmotors.settings.displayZoomControls = true

        mainWebViewWebmotors.loadUrl("https://www.webmotors.com.br/")
    }
}
