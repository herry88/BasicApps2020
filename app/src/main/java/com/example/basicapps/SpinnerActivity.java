package com.example.basicapps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SpinnerActivity extends Activity {
    Spinner sp;
    String[] item = {"Nasi Goreng","Mie Ayam","Mie Goreng","Mie Rebus"
            ,"Magelangan","Soto Ayam","AyamGoreng"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        sp = (Spinner)findViewById(R.id.idSpinner);

        ArrayAdapter<String> array_item = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(SpinnerActivity.this, "Kamu Telah Pilih" + item[arg2],
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                Toast.makeText(SpinnerActivity.this, "Nothing Selected",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
