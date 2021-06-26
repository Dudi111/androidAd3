package com.example.first_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d("ThirdActivity", "onCreate");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ThirdActivity", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ThirdActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ThirdActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ThirdActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ThirdActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ThirdActivity", "onDestroy");
    }

}