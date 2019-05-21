package com.example.kdxfdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.iflytek.voicedemo.KdxfActivity;

public class MainActivity extends AppCompatActivity {

    TextView tv_kdxf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tv_kdxf = findViewById(R.id.tv_kdxf);
        tv_kdxf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goKdxf();
            }
        });
    }

    private void goKdxf() {
        startActivity(new Intent(this, KdxfActivity.class));
    }
}
