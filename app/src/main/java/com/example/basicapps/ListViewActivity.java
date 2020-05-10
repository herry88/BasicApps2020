package com.example.basicapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class ListViewActivity extends Activity {
    ListView lv;
    String[] item = {"Nasi Goreng","Mie Ayam","Mie Goreng","Mie Rebus"
            ,"Magelangan","Soto Ayam","AyamGoreng"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        lv = (ListView) findViewById(R.id.idListView);

        ArrayAdapter<String> array_item = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, item);
        lv.setAdapter(array_item);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(ListViewActivity.this,
                        "Kamu Memilih" + item[arg2],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
