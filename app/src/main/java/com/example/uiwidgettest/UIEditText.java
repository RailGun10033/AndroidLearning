package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UIEditText extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uiedit_text);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        textView = (TextView)findViewById(R.id.text_view);
        editText = (EditText)findViewById(R.id.edit_text);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
            {
                String string = editText.getText().toString();
                if (string.length() > 0){
                    textView.setText(string);
                }else{
                    Toast.makeText(this,"string is null", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            default:{
                break;
            }
        }
    }
}
