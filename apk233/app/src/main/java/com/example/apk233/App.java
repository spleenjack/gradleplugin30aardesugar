package com.example.apk233;

import android.app.Application;

public class App extends Application {
    public void onCreate() {
        super.onCreate();
        new com.example.aar.Lambda();
    }
}
