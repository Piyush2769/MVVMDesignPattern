package com.piyushmaheswari.mvvmdesignpattern.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.piyushmaheswari.mvvmdesignpattern.Interface.LoginResultCallback;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private LoginResultCallback loginResultCallback;

    public LoginViewModelFactory(LoginResultCallback loginResultCallback) {
        this.loginResultCallback = loginResultCallback;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new LoginViewModel(loginResultCallback);
    }
}
