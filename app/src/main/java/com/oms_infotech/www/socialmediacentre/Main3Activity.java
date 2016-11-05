package com.oms_infotech.www.socialmediacentre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main3Activity extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView=(WebView)findViewById(R.id.webView);
      String  s=getIntent().getExtras().getString("web");

        switch(s)
        {
            case "Facebook":
                webView.loadUrl("https://www.facebook.com");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "Whatsapp":
                webView.loadUrl("https://web.whatsapp.com");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "Twitter":
                webView.loadUrl("https://www.twitter.com");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "Gmail":
                webView.loadUrl("https://www.gmail.com");
                webView.setWebViewClient(new WebViewClient());
                break;
            case "LinkedIn":
                webView.loadUrl("www.linkedin.com");
                webView.setWebViewClient(new WebViewClient());
                break;
        }
    }
}
