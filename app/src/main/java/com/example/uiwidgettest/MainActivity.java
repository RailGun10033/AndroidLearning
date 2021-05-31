package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_EditText = (Button)findViewById(R.id.btn_EditText);
        btn_EditText.setOnClickListener(this);

        Button btn_ImageView = (Button)findViewById(R.id.btn_ImageView);
        btn_ImageView.setOnClickListener(this);

        Button btn_ProgressBar = (Button)findViewById(R.id.btn_ProgressBar);
        btn_ProgressBar.setOnClickListener(this);

        Button btn_Dialog = (Button)findViewById(R.id.btn_Dialog);
        btn_Dialog.setOnClickListener(this);

        Button btn_RelativeLayout = (Button)findViewById(R.id.btn_RelativeLayout);
        btn_RelativeLayout.setOnClickListener(this);

        Button btn_ListView = (Button)findViewById(R.id.btn_ListView);
        btn_ListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_EditText: {
                Intent intent = new Intent(MainActivity.this, UIEditText.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_ImageView: {
                Intent intent = new Intent(MainActivity.this, UIImageView.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_ProgressBar: {
                Intent intent = new Intent(MainActivity.this, UIProgressBar.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_Dialog: {
                Intent intent = new Intent(MainActivity.this, UIDialog.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_RelativeLayout: {
                Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(intent);
                break;
            }

            case R.id.btn_ListView: {
                Intent intent = new Intent(MainActivity.this, UIListView.class);
                startActivity(intent);
                break;
            }


            default:{
                break;
            }
        }
    }
}
