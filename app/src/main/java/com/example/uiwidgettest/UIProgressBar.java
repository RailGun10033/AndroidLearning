package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class UIProgressBar extends AppCompatActivity implements View.OnClickListener{
    private ProgressBar progressBar;
    private ProgressBar progress_bar_horizontal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiprogress_bar);

        progressBar = (ProgressBar)findViewById(R.id.progress_bar);
        progress_bar_horizontal = (ProgressBar)findViewById(R.id.progress_bar_horizontal);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button_add = (Button)findViewById(R.id.button_add);
        button_add.setOnClickListener(this);

        Button button_sub = (Button)findViewById(R.id.button_sub);
        button_sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:{
                if (progressBar.getVisibility() == View.VISIBLE){
                    progressBar.setVisibility(View.GONE);
                }else {
                    progressBar.setVisibility(View.VISIBLE);
                }
                break;
            }

            case R.id.button_add:{
                int progress = progress_bar_horizontal.getProgress();
                progress = progress + 10;
                progress_bar_horizontal.setProgress(progress);
                break;
            }

            case R.id.button_sub:{
                int progress = progress_bar_horizontal.getProgress();
                progress = progress - 10;
                progress_bar_horizontal.setProgress(progress);
                break;
            }

            default:{
                break;
            }
        }
    }
}
