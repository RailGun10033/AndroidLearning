package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        R.string.app_name
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("HelloWorldActivity", "onCreate execute");
        Log.i("luder","*****************************************************");
        Log.d("axiba", "onCreate: shenmegui?");
        Log.i(TAG, "onCreate: hahahahahhahaahh");
    }
}
