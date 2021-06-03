package com.example.hw2a1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    RecyclerView recyclerView;
    ImageButton imageButton;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.tv_2);
        recyclerView=findViewById(R.id.recycler);
        imageButton=findViewById(R.id.imageButton);


        mainAdapter = new MainAdapter();
        recyclerView.setAdapter(mainAdapter);



        RecyclerView.LayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
            }
        });


        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(0, new ItemModel("Рамазан"));
        list.add(1, new ItemModel("Нурбек"));
        list.add(2, new ItemModel("Нуракбар"));
        list.add(3, new ItemModel("Мурас"));
        list.add(4, new ItemModel("Илим"));
        list.add(5, new ItemModel("Бекмурат"));
        list.add(6, new ItemModel("Эрмек"));
        list.add(7, new ItemModel("Нуркыз"));
        list.add(8, new ItemModel("Анарбек"));
        list.add(9, new ItemModel("Айдана"));
        list.add(10, new ItemModel("Кайрат"));
        list.add(11, new ItemModel("Нурболот"));
        list.add(12, new ItemModel("Али"));
        list.add(13, new ItemModel("Эламан"));
        list.add(14, new ItemModel("Нурел"));
        mainAdapter.addText(list);

    }
}