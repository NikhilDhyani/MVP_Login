package com.devdnik.coder.mvp_login.Model;

/**
 * Created by NIKHIL on 14-10-2018.
 */

public interface UserInterface {

    String getEmail();
    String getPassword();
    boolean isValid();
}
