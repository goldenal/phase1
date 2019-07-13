package com.example.adeosunadewale.alcchallenge;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class AboutAlc extends AppCompatActivity {
    WebView webView;
    ImageButton imageButton;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        webView = findViewById(R.id.webview);
        imageButton = findViewById(R.id.backpress);
        progressDialog = new ProgressDialog(AboutAlc.this);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                if(progressDialog.isShowing()){
                    progressDialog.dismiss();
                }
            }
        });
        progressDialog.setMessage("Loading... Please wait.");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
        webView.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
