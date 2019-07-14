package com.example.adeosunadewale.alcchallenge;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;


@SuppressWarnings("ALL")
public class AboutAlc extends AppCompatActivity {
    private WebView webView;
    private ImageButton imageButton;
    ProgressDialog progressDialog;
    @SuppressLint("SetJavaScriptEnabled")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        //conecting the variables
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
                //dismisses the dialog when webview is done loading
                if(progressDialog.isShowing()){
                    progressDialog.dismiss();
                }
            }
        });
        //set dialog message
        progressDialog.setMessage("Loading... Please wait.");

        //will not cancel if you touch the screen when loading
        progressDialog.setCanceledOnTouchOutside(false);

        progressDialog.show();
        //loads the url
        webView.loadUrl("https://andela.com/alc/");

        WebSettings webSettings = webView.getSettings();

        //enables javascript
        webSettings.setJavaScriptEnabled(true);
    }
}
