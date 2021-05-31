package com.example.activitylifecycletest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "*******************************onCreate: ");
        setContentView(R.layout.activity_main);
        
        if (savedInstanceState != null){
            String tempData = savedInstanceState.getString("data_key");
            Log.d(TAG, "onCreate: 这里收到了savedInstanceState保存的变量");
            Log.d(TAG, tempData);
        }
        
        Button btn_start_dialog = (Button)findViewById(R.id.start_dialog_activity);
        Button btn_start_normal = (Button)findViewById(R.id.start_normal_activity);

        btn_start_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });

        btn_start_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "*******************************onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "*******************************onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "*******************************onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "*******************************onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "*******************************onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "*******************************onRestart: ");
    }

    
//    在Activity被回收时保存信息
//    好像不起作用？？？？？？
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG, "*******************************onSaveInstanceState: ");
        String tempData = "Some thing you just typed";
        outState.putString("data_key", tempData);
    }
}
