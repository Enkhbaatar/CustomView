package com.enkhee.javacustomview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.enkhee.javacustomview.views.CustomView;

public class MainActivity extends AppCompatActivity {
    CustomView mCustomView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomView = findViewById(R.id.CustomView);
    }

    public void changeColor(View view) {
        mCustomView.swapColor();
    }
}
