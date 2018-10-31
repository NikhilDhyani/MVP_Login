package com.devdnik.coder.mvp_login.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

/**
 * Created by NIKHIL on 14-10-2018.
 */

//Note: Model is where we write our business logic

public class User implements UserInterface{

    private String email,password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValid() {

        //1. Check email field empty
        //2. Check email pattern
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches();

    }
}
