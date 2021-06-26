package com.example.first_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button mbtnLaunchThirdActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mbtnLaunchThirdActivity=findViewById(R.id.btnLaunchThirdActivity);
        mbtnLaunchThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity2.this,ThirdActivity.class);
                startActivity(intent1);
            }
        });
        Log.d("MainActivity2", "onCreate");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity2", "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity2", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity2", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity2", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity2", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity2", "onDestroy");
    }
}
