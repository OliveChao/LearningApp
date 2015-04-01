package com.example.olivechao.learningapp.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.olivechao.learningapp.R;

import java.net.URL;

/**
 * Created by Olive Chao on 3/24/2015.
 */
public class RegisterActivity extends ActionBarActivity implements View.OnClickListener {

    //Declaration of variables
    EditText etFullName, etEmail, etPassword;
    Button btnRegister;
    ProgressDialog progressDialog;

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

    private class RegisterTask extends AsyncTask<URL,Void,String>{
        @Override
        protected String doInBackground(URL... params) {
            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(getApplicationContext());
            progressDialog.setMessage("Login in...");
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegister:
                startActivity(new Intent(getApplicationContext(),Verification.class));
                break;
            default:
                break;
        }
    }
}

