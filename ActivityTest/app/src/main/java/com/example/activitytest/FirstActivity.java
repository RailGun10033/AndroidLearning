package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static String TAG = "FirstActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        Log.d(TAG, this.toString());
//        给当前活动加载一个布局
        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "退出程序", Toast.LENGTH_SHORT).show();
//                销毁活动
//                finish();

                Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        Button button_next = (Button) findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                显示Intent
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

//                隐式Intent
                Intent intent = new Intent("com.example.activitytest.ACTION_START");

//                category
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent);
            }

        });

        Button button_open_url = (Button)findViewById(R.id.button_openurl);
        button_open_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.baidu.com"));
                startActivity(intent);
                Toast.makeText(FirstActivity.this,"打开浏览器",Toast.LENGTH_SHORT).show();
            }
        });

        Button button_tel10086 = (Button)findViewById(R.id.button_tel);
        button_tel10086.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });

        Button buttonsenddata = (Button)findViewById(R.id.button_senddata);
        buttonsenddata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "你好，第二个活动  --来自主活动的问候";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("extra_data", data);
//                startActivity(intent); //只发送信息
                startActivityForResult(intent, 1);
            }
        });
    }

    /**
     * Initialize the contents of the Activity's standard options menu.  You
     * should place your menu items in to <var>menu</var>.
     *
     * <p>This is only called once, the first time the options menu is
     * displayed.  To update the menu every time it is displayed, see
     * {@link #onPrepareOptionsMenu}.
     *
     * <p>The default implementation populates the menu with standard system
     * menu items.  These are placed in the {@link Menu#CATEGORY_SYSTEM} group so that
     * they will be correctly ordered with application-defined menu items.
     * Deriving classes should always call through to the base implementation.
     *
     * <p>You can safely hold on to <var>menu</var> (and any items created
     * from it), making modifications to it as desired, until the next
     * time onCreateOptionsMenu() is called.
     *
     * <p>When you add items to the menu, you can implement the Activity's
     * {@link #onOptionsItemSelected} method to handle them there.
     *
     * @param menu The options menu in which you place your items.
     * @return You must return true for the menu to be displayed;
     * if you return false it will not be shown.
     * @see #onPrepareOptionsMenu
     * @see #onOptionsItemSelected
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        return super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "你点击了增加",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"你点击了减少",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returnData = data.getStringExtra("data_return");
                    Toast.makeText(FirstActivity.this,returnData,Toast.LENGTH_SHORT).show();
                    Log.i("FirstActivity ", returnData);
                }
                break;
            default:
        }
    }
}
