package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Function> functionList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = (Button) findViewById(R.id.care_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "已为您添加到关注列表",
                        Toast.LENGTH_SHORT).show();
            }
        });
        setContentView(R.layout.activity_main);
        initFunctions();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FunctionAdapter adapter = new FunctionAdapter(functionList);
        recyclerView.setAdapter(adapter);
    }

    private void initFunctions() {
        Random r = new Random();
        for (int i = 0; i < r.nextInt(5); i++) {
            Function 搞笑段子 = new Function("搞笑段子", R.drawable.egdz);
            functionList.add(搞笑段子);
            Function 发现美食 = new Function("发现美食", R.drawable.delicious);
            functionList.add(发现美食);
            Function 社交世界 = new Function("社交世界", R.drawable.social);
            functionList.add(社交世界);
        }
    }
}