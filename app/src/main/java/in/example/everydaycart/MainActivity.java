package in.example.everydaycart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.everydaycart.everydaycartapp.R;

public class MainActivity extends AppCompatActivity {

    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        mywebview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings= mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://everydaycart.in/");
        mywebview.setWebViewClient(new WebViewClient());

    }

    //Code for back button
    @Override
    public void onBackPressed() {
        if(mywebview.canGoBack())
        {
            mywebview.goBack();
        }

        else
        {
            super.onBackPressed();
        }
    }

}