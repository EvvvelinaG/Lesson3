package ru.mirea.gilyazoivaer.mireaproject;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import ru.mirea.gilyazoivaer.mireaproject.databinding.ActivityMainBinding;


public class BrouserFragment extends Fragment {

    private WebView webView;
    private ActivityMainBinding binder;
    @SuppressLint("SetJavaScriptEnabled")
@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
    View fragmentView = inflater.inflate(R.layout.fragment_brouser2, group, false);
        // включаем поддержку JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        // указываем страницу загрузки
        webView.loadUrl("https://google.com");

    binder = ActivityMainBinding.bind(fragmentView);
    webView.setWebViewClient(new WebViewClient());
    return fragmentView;
    }
}