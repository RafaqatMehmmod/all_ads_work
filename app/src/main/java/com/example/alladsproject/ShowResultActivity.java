package com.example.alladsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.alladsproject.databinding.ActivityShowResultBinding;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class ShowResultActivity extends AppCompatActivity {

    ActivityShowResultBinding binding;
    String key;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityShowResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        key=getIntent().getStringExtra("key");

        if (key.equals("bannerAd"))
        {
            bannerAdWork("bannerAd");
        }
        else if (key.equals("rectangleAd"))
        {
            bannerAdWork("rectangleAd");
        }


    }

    private void bannerAdWork(String option)
    {
        if (option.equals("bannerAd"))
        {
            // Instantiate an AdView object.
            // NOTE: The placement ID from the Facebook Monetization Manager identifies your App.
            // To get test ads, add IMG_16_9_APP_INSTALL# to your placement id. Remove this when your app is ready to serve real ads.

            adView = new AdView(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.BANNER_HEIGHT_50);

            // Add the ad view to your activity layout
            binding.bannerContainer.addView(adView);


            // Request an ad
            adView.loadAd();

            AdListener adListener = new AdListener() {
                @Override
                public void onError(Ad ad, AdError adError) {
                    // Ad error callback
                    Log.i("rafaqat", "onError: "+adError.getErrorMessage());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    // Ad loaded callback
                    Log.i("rafaqat", "Ad Loaded: ");
                }

                @Override
                public void onAdClicked(Ad ad) {
                    // Ad clicked callback
                    Log.i("rafaqat", "Add Click: ");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    // Ad impression logged callback
                    Log.i("rafaqat", "LoggingImpression: ");
                }
            };

            // Request an ad
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(adListener).build());
        }
        else
        {
            // Instantiate an AdView object.
            // NOTE: The placement ID from the Facebook Monetization Manager identifies your App.
            // To get test ads, add IMG_16_9_APP_INSTALL# to your placement id. Remove this when your app is ready to serve real ads.

            adView = new AdView(this, "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID", AdSize.RECTANGLE_HEIGHT_250);

            // Add the ad view to your activity layout
            binding.bannerContainer.addView(adView);


            // Request an ad
            adView.loadAd();

            AdListener adListener = new AdListener() {
                @Override
                public void onError(Ad ad, AdError adError) {
                    // Ad error callback
                    Log.i("rafaqat", "onError: "+adError.getErrorMessage());
                }

                @Override
                public void onAdLoaded(Ad ad) {
                    // Ad loaded callback
                    Log.i("rafaqat", "Ad Loaded: ");
                }

                @Override
                public void onAdClicked(Ad ad) {
                    // Ad clicked callback
                    Log.i("rafaqat", "Add Click: ");
                }

                @Override
                public void onLoggingImpression(Ad ad) {
                    // Ad impression logged callback
                    Log.i("rafaqat", "LoggingImpression: ");
                }
            };

            // Request an ad
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(adListener).build());
        }


    }
    @Override
    protected void onDestroy() {
        if (adView != null) {
            adView.destroy();
            Log.i("rafaqat", "onDestroy: ");
        }
        super.onDestroy();
    }
}