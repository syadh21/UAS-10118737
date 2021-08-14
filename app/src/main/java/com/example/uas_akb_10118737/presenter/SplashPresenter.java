package com.example.uas_akb_10118737.presenter;

import android.content.Context;
import android.content.Intent;

import com.example.uas_akb_10118737.activities.SlideActivity;
import com.example.uas_akb_10118737.activities.SplashActivity;

public class SplashPresenter {
    Context context;

    public SplashPresenter(SplashActivity splashActivity) {
    }

    Intent getSlide = new Intent();

    public Intent setSlide() {
        Intent intent = new Intent(context, SlideActivity.class);
        return intent;
    }
}
