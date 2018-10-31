package com.devdnik.coder.mvp_login.Presenter;

import android.util.Log;

import com.devdnik.coder.mvp_login.Model.User;
import com.devdnik.coder.mvp_login.View.LoginInterface;

/**
 * Created by NIKHIL on 14-10-2018.
 */

public class Presenter implements PresenterInterface{

    LoginInterface loginInterface;

    public Presenter(LoginInterface loginInterface) {
        this.loginInterface = loginInterface;
    }

    @Override
    public void onLogin(String email, String password) {


        User user = new User(email,password);

        boolean isLoginSuccess = user.isValid();


        if (isLoginSuccess)
        {
            Log.d("ThirdX","Within_Real_Presenter");


            loginInterface.onLoginResult("Login Sucess");

            Log.d("FourthX","Within_Real_Presenter");

        }
        else
            {
                loginInterface.onLoginResult("Login Failed");
            }

    }
}
