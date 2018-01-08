package com.example.framgia.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.framgia.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainPresenter mainPresenter = new MainPresenter();
        User user = new User("Fist", "Last");
        binding.setUser(user);
        binding.setPresenter(mainPresenter);
    }
}
