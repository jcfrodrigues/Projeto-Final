package com.example.android.trabalhofinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class NoticiasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticias_activity);

        WebView wv = (WebView) findViewById(R.id.site);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("http://www.al.senac.br");


    }
}
