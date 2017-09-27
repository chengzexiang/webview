package com.bwei.czx.czx09272day;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dian = (Button) findViewById(R.id.dian);
        dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView web = (WebView) findViewById(R.id.web);
                web.getSettings().setJavaScriptEnabled(true);
                web.getSettings().setLoadWithOverviewMode(true);
                web.setWebViewClient(new WebViewClient(){
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        view.loadUrl(url);
                        return true;
                    }
                });
                web.loadUrl("https://www.baidu.com/");
            }
        });

    }
}
