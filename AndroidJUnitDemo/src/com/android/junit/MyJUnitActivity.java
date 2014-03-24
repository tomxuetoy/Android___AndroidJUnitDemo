package com.android.junit;

import com.android.junit.R;

import android.app.Activity;
import android.os.Bundle;

public class MyJUnitActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}