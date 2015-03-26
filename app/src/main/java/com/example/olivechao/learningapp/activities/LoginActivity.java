package com.example.olivechao.learningapp.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.olivechao.learningapp.R;


public class LoginActivity extends ActionBarActivity implements View.OnClickListener {

    //Declaration of variables
    EditText etEmail, etPassword;
    Button btnLogin;
    TextView tvPassword, tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Initialization of variables
        etEmail = (EditText)findViewById(R.id.etEmailLogin);
        etEmail.setTextColor(Color.WHITE);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etPassword.setTextColor(Color.WHITE);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        tvPassword = (TextView)findViewById(R.id.tvPassword);
        tvRegister = (TextView)findViewById(R.id.tvRegister);

        //OnClickListener
        btnLogin.setOnClickListener(this);
        tvPassword.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                break;
            case R.id.tvPassword:
                startActivity(new Intent(getApplicationContext(),ResetPassword.class));
                break;
            case R.id.tvRegister:
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
            default:
                break;
        }
    }
}
