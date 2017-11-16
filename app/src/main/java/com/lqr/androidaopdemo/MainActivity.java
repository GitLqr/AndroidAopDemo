package com.lqr.androidaopdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @TestAnnoTrace(value = "lqr_test", type = 1)
    public void test(View view) {
        System.out.println("Hello, I am CSDN_LQR");
        int a = 1 / 0;
    }
}
