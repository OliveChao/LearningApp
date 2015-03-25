package com.example.olivechao.learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Olive Chao on 3/24/2015.
 */
public class RegisterActivity extends ActionBarActivity implements View.OnClickListener {

    //Declaration of variables
    EditText etFullName, etEmail, etPassword;
    Button btnRegister;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Initialization of variables
        etFullName = (EditText)findViewById(R.id.etFullNameRegister);
        etEmail = (EditText)findViewById(R.id.etEmailRegister);
        etPassword = (EditText)findViewById(R.id.etPasswordRegister);
        btnRegister = (Button)findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegister:
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                break;
            default:
                break;
        }
    }
}

