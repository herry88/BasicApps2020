package com.example.basicapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FormActivity extends Activity {
    EditText username, pass;
    Button blogin;
    String user_name = "user";
    String password = "123";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        username = (EditText) findViewById(R.id.inUser);
        pass = (EditText)findViewById(R.id.inPass);
        blogin = (Button)findViewById(R.id.bLogin);

        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u  = username.getText().toString();
                String p = pass.getText().toString();
                checkLogin(u, p);
            }
        });
    }

    private void checkLogin(String u, String p) {
        if(p.equals(password) && u.equals(user_name)){
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(FormActivity.this, MainActivity.class);
            startActivity(intent);
            this.finish();
        } else{
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
