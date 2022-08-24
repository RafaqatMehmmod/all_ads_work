package com.example.alladsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.alladsproject.databinding.ActivityMainBinding;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;

public class MainActivity extends AppCompatActivity {



    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.banner.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,ShowResultActivity.class);
            intent.putExtra("key","bannerAd");
            startActivity(intent);
        });
        binding.rectangle.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,ShowResultActivity.class);
            intent.putExtra("key","rectangleAd");
            startActivity(intent);
        });

    }


}