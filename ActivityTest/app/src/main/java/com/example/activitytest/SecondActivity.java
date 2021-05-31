package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
//    private String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data"); // 从Intent里取信息
//        getIntExtra(), getBooleanExtra()
        Toast.makeText(SecondActivity.this, "RX===> " +data , Toast.LENGTH_SHORT).show();

        Log.i("SecondActivity", "RX===>" + data);

        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
//                startActivity(intent);

                Intent intent1 = new Intent();
                intent.putExtra("data_return","我收到了你的问候 --来自活动二");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button button3 = (Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}
