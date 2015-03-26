package com.example.olivechao.learningapp.utilities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.example.olivechao.learningapp.activities.Verification;

import java.util.HashMap;

/**
 * Created by olivechao on 3/26/15.
 */
public class SessionManager {

    //Declaration of variables
    SharedPreferences mySharedPreferences;
    SharedPreferences.Editor editor;
    Context _context;

    //Constructor
    public SessionManager(Context context){
        this._context = context;
        mySharedPreferences = _context.getSharedPreferences(Constants.PREFS_NAME,0);
        editor = mySharedPreferences.edit();
        editor.apply();
    }

    /**
     * Store the users details in shared preferences
     * @param fullName
     * @param email
     * @param password
     * @param phoneNumber
     */
    public void createUser(String fullName, String email, String password, String phoneNumber){
        editor.putString(Constants.KEY_FULLNAME,fullName);
        editor.putString(Constants.KEY_EMAIL,email);
        editor.putString(Constants.KEY_PASSWORD,password);
        editor.putString(Constants.KEY_PHONENUMBER,phoneNumber);

        editor.commit();
    }

    /**
     * Getting user details
     * @return users details i.e stored in shared preferences
     */
    public HashMap<String, String>getUserDetails(){
        HashMap<String, String>user = new HashMap<String,String>();

        user.put(Constants.KEY_HM_FULLNAME,mySharedPreferences.getString(Constants.KEY_HM_FULLNAME,null));
        user.put(Constants.KEY_HM_EMAIL,mySharedPreferences.getString(Constants.KEY_HM_EMAIL,null));
        user.put(Constants.KEY_HM_PASSWORD,mySharedPreferences.getString(Constants.KEY_HM_PASSWORD,null));
        user.put(Constants.KEY_HM_PHONENUMBER,mySharedPreferences.getString(Constants.KEY_HM_PHONENUMBER,null));

        return user;
    }

    /**
     * Clear session in register screen and redirect user to verification activity
     */
    public void logOutUser(){
        editor.clear();
        editor.commit();

        //Start the verification activity
        _context.startActivity(new Intent(_context, Verification.class));
    }

    public boolean UserIsLogedin(){
        return mySharedPreferences.getBoolean(Constants.KEY_STATE,false);
    }
}
