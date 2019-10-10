package com.piyushmaheswari.mvvmdesignpattern.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.piyushmaheswari.mvvmdesignpattern.Interface.LoginResultCallback;
import com.piyushmaheswari.mvvmdesignpattern.Model.User;

public class LoginViewModel extends ViewModel {

    private User user;
    private LoginResultCallback loginResultCallback;

    public LoginViewModel(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
        this.user=new User();
    }

    public TextWatcher getEmailTextWatcher()
    {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setEmail(editable.toString());
            }
        };
    }

    public TextWatcher getPassTextWatcher()
    {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                user.setPassword(editable.toString());
            }
        };
    }

    public void onLoginClicked(View view)
    {
        if(user.isValidData())
        {
            loginResultCallback.onSuccess("Login Success");
        }
        else
        {
            loginResultCallback.onFailure("Login Failure");
        }
    }


}
