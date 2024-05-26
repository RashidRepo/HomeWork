package com.example.homework

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homework.databinding.ActivityMainBinding
import com.example.homework.databinding.ActivityWebviewBinding

class WebviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWebviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val myBrowser: WebView = binding.webview
        myBrowser.webViewClient = WebViewClient()
//Shows the URL
        myBrowser.loadUrl("https://www.youtube.com")
//Set the Web View to have a transparent border
        myBrowser.setBackgroundColor(Color.TRANSPARENT)
//To enable JavaScript for the web browser
        myBrowser.settings.javaScriptEnabled =true
//to load images automatically
        myBrowser.settings.loadsImagesAutomatically = true
//Enable Scrolling
        myBrowser.scrollBarStyle= View.SCROLLBARS_INSIDE_OVERLAY

//        enableEdgeToEdge()
//        setContentView(R.layout.activity_webview)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}