package com.pavan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText ET_NAME, ET_USER_NAME, ET_USER_PASS;
    Button userReg;
    String name, user_name, user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ET_NAME = (EditText) findViewById(R.id.name);
        ET_USER_NAME = (EditText) findViewById(R.id.new_user_name);
        ET_USER_PASS = (EditText) findViewById(R.id.new_user_pass);
        userReg = (Button) findViewById(R.id.register);
        userReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = ET_NAME.getText().toString();
                user_name = ET_USER_NAME.getText().toString();
                user_pass = ET_USER_PASS.getText().toString();
                String method = "register";
                BackgroundTasks backgroundTasks = new BackgroundTasks(Register.this);
                backgroundTasks.execute(method, name, user_name, user_pass);
                finish();
            }
        });
    }
}
