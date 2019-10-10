package com.piyushmaheswari.mvvmdesignpattern.Interface;

public interface LoginResultCallback {
    void onSuccess(String message);
    void onFailure(String message);

}
