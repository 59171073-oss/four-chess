package com.kids.connect4

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

/**
 * 应用唯一 Activity，使用 WebView 加载 assets/game/index.html
 * 该 HTML 已实现完整的重力四子棋对弈功能（含本地 AI 与可选的大模型 API）。
 */
class MainActivity : ComponentActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this).apply {
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.allowFileAccess = true
            webViewClient = WebViewClient()
            loadUrl("file:///android_asset/game/index.html")
        }
        setContentView(webView)
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        // 让 WebView 优先处理后退键
    }
}
