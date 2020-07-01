package com.xxxxx.netspy;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class LinkActivity extends AppCompatActivity {

    WebView webV;
    String pickAdress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        webV = findViewById(R.id.webview);
        webV.getSettings().setJavaScriptEnabled(true);
        webV.setWebViewClient(new WebViewClient());
        webV.setWebChromeClient(new WebChromeClient());

        Intent intent = getIntent();
        pickAdress = intent.getStringExtra("adress");

        webV.loadUrl(pickAdress);

    }
}
