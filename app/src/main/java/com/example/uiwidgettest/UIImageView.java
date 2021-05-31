package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UIImageView extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiimage_view);

        Button button_dog1 = (Button)findViewById(R.id.button_dog1);
        button_dog1.setOnClickListener(this);
        Button button_dog2 = (Button)findViewById(R.id.button_dog2);
        button_dog2.setOnClickListener(this);

        imageView = (ImageView)findViewById(R.id.image_view);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_dog1: {
                imageView.setImageResource(R.drawable.dog1);
                break;
            }
            case R.id.button_dog2:{
                imageView.setImageResource(R.drawable.dog2);
                break;
            }
            default:{
                break;
            }
        }

    }
}
