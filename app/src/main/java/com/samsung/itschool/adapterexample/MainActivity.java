package com.samsung.itschool.adapterexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listBook);

        //подготовка данных
        final LinkedList<String>  booksList = new LinkedList<>();
        booksList.add("Война и мир");
        booksList.add("Отцы и дети");
        booksList.add("Идиот");
        booksList.add("Гарри Поттер");
        booksList.add("Основание");
        booksList.add("Капитанская дочка");
        //Определить адаптер
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.list_item, booksList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), i + ") " + booksList.get(i), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
