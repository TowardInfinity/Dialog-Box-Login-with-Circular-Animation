package com.activity.to_in.dialoglogin;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * The Button on which animation will end.
     */
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);

        /**
         * show login form is called with help of an Instance of class.
         * @param context:  THe Context on which the Dialog box Appears,
         * @param fab:      THe Butoon on which i using as placeholder to show animation
         */
        (new HelpClass(this, fab)).showLoginForm();

    }
}
