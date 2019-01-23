package com.example.user.igr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;

public class about extends AppCompatActivity {

    ActionBar actionBar;
    Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#a612bc")));

        btnReturn = (Button) findViewById(R.id.Return);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(about.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
