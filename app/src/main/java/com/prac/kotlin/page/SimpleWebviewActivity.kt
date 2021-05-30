package com.prac.kotlin.page

import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.prac.kotlin.R

class SimpleWebviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val url = intent.getStringExtra("process_key")

        Log.e("lzm", "process 跨进程 url：$url")

        var webView = findViewById<WebView>(R.id.test_webview)
        webView.settings.javaScriptEnabled = true

        webView.loadUrl(url)
    }

}