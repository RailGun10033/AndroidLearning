package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class UIListView extends AppCompatActivity {
    private String[] data = {
            "黑龙江省","吉林省","辽宁省","内蒙古自治区",
            "河北省","山东省","北京市","天津市","河南省","山西省",
            "陕西省","宁夏回族自治区","甘肃省","青海省","新疆维吾尔族自治区",
            "江苏省","安徽省","上海市","江西省","重庆市",
            "湖北省","湖南省","四川省","云南省","贵州省","广西壮族自治区","西藏自治区",
            "广东省","浙江省","福建省","台湾省","海南省","香港特别行政区","澳门特别行政区"
    };

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uilist_view);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                UIListView.this, android.R.layout.simple_list_item_1, data
//        );
//        ListView listView = (ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);

        initFruits();
        FruitAdapter fruitAdapter = new FruitAdapter(UIListView.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(fruitAdapter);
    }

    private void  initFruits(){
        for (int i = 0; i < 2; i++){
            Fruit apple = new Fruit("苹果", R.drawable.apple_pic);
            fruitList.add(apple);

            Fruit bannna = new Fruit("香蕉", R.drawable.banana_pic);
            fruitList.add(bannna);

            Fruit orange = new Fruit("橙子", R.drawable.orange_pic);
            fruitList.add(orange);

            Fruit watermelon = new Fruit("西瓜", R.drawable.watermelon_pic);
            fruitList.add(watermelon);

            Fruit pear = new Fruit("梨子", R.drawable.pear_pic);
            fruitList.add(pear);

            Fruit grape = new Fruit("葡萄", R.drawable.grape_pic);
            fruitList.add(grape);

            Fruit pineapple = new Fruit("菠萝", R.drawable.pineapple_pic);
            fruitList.add(pineapple);

            Fruit strawberry = new Fruit("草莓", R.drawable.strawberry_pic);
            fruitList.add(strawberry);

            Fruit cherry = new Fruit("樱桃", R.drawable.cherry_pic);
            fruitList.add(cherry);

            Fruit mango = new Fruit("芒果", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }
}
