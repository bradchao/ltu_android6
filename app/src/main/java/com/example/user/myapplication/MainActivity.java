package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webVidew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webVidew = (WebView)findViewById(R.id.webView);
        initWebView();
    }

    private void initWebView(){
        webVidew.setWebViewClient(new WebViewClient());

        WebSettings settings = webVidew.getSettings();
        settings.setJavaScriptEnabled(true);

        webVidew.loadUrl("https://tw.yahoo.com/");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){

            finish();
        }
        return true; //super.onKeyDown(keyCode, event);
    }
}
