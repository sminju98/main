package org.techtown.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.webView);//xml

        mWebView.setWebViewClient(new WebViewClient());//클릭시 새창 안뜨게
        mWebView.getSettings().setJavaScriptEnabled(true);//javascript 허용
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("https://m.naver.com");
    }




    public void onButton1Clicked(View v) {
        Toast.makeText(this, "버튼 좀 작작 눌러라.", Toast.LENGTH_LONG).show();
    }
    public void onButton2Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
    }
    public void onButton3Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-7522-3475"));
        startActivity(myIntent);
    }


}