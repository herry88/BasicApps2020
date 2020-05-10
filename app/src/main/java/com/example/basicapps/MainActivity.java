package com.example.basicapps;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.bToast);
        b2 = (Button)findViewById(R.id.bListView);
        b3 = (Button)findViewById(R.id.bSpinner);
        b4 = (Button)findViewById(R.id.bForm);
        b5 = (Button)findViewById(R.id.bExit);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bToast:
                Intent b = new Intent(MainActivity.this, ListView.class);
                startActivity(b);
                break;
            case R.id.bSpinner:
                Intent c = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(c);
                break;
            case R.id.bForm:
                Intent d = new Intent(MainActivity.this, FormActivity.class);
                startActivity(d);
                break;
            case R.id.bExit:
                ShowExitDialog();
                break;
        }
    }

    private void ShowExitDialog() {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("Warning");
        ad.setMessage("Are you sure to Exit ?");
        ad.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.finish();
            }
        });
        ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        ad.show();
    }
}
