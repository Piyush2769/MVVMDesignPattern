package com.piyushmaheswari.mvvmdesignpattern;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;
import android.widget.Toast;

import com.piyushmaheswari.mvvmdesignpattern.Interface.LoginResultCallback;
import com.piyushmaheswari.mvvmdesignpattern.databinding.ActivityMainBinding;
import com.piyushmaheswari.mvvmdesignpattern.viewmodel.LoginViewModel;
import com.piyushmaheswari.mvvmdesignpattern.viewmodel.LoginViewModelFactory;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements LoginResultCallback {

    TextureView t;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(this,new LoginViewModelFactory(this))
        .get(LoginViewModel.class));


    }

    @Override
    public void onSuccess(String message) {
        Toasty.success(this,"Login Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String message) {
        Toasty.error(this,"Login Failure", Toast.LENGTH_SHORT).show();
    }
}
