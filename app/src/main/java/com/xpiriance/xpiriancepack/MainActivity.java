package com.xpiriance.xpiriancepack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtLaunchActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtLaunchActivity = (Button) findViewById(R.id.btn2);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });

    }
    private void launchActivity() {

        Intent intent = new Intent(MainActivity.this, homepage.class);
        startActivity(intent);
    }

}
