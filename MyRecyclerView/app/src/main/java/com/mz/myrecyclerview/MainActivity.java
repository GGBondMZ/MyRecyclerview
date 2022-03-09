package com.mz.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MYRECYCLERVIEWDEMO";

    private List<Fruit> fruitList = new ArrayList<>();

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.my_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        initFruits();
    }

    private void initFruits() {
        for (int i = 0; i < 10; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana", R.drawable.caomei);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange", R.drawable.daboluo);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon", R.drawable.huangpingguo);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear", R.drawable.huangxiangjiao);
            fruitList.add(pear);
            Fruit grape = new Fruit("Grape", R.drawable.liulian);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("Pineapple", R.drawable.putao);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry", R.drawable.liaputao);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("Cherry", R.drawable.xiangjiao);
            fruitList.add(cherry);
            Fruit mango = new Fruit("Mango", R.drawable.huangxiangjiao);
            fruitList.add(mango);
        }
    }

}