package com.example.alladsproject;

import android.app.Application;

import com.example.alladsproject.helper.AudienceNetworkInitializeHelper;

/**
 * Created by Rafaqat Mehmood
 * Whatsapp No:+923101025532
 * 29/06/2022
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkInitializeHelper.initialize(getApplicationContext());
    }
}
