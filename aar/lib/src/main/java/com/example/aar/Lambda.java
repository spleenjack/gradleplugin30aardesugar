package com.example.aar;

import android.util.Log;

public class Lambda {
    public Lambda() {
        Runnable runnable = () -> Log.d("aar", "runnable");
    }
}
