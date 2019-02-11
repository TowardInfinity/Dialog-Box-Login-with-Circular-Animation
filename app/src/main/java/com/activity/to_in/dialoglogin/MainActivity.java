package com.activity.to_in.dialoglogin;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.fab);
        (new HelpClass(this, fab)).showLoginForm();

    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
