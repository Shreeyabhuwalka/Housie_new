package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class NumberPageActivity extends AppCompatActivity {


    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_page);
        setRequestedOrientation (SCREEN_ORIENTATION_LANDSCAPE);

        btn1 = (Button) findViewById(R.id.one);
        btn2 = (Button) findViewById(R.id.two);
        btn3 = (Button) findViewById(R.id.three);
        btn4 = (Button) findViewById(R.id.four);
        btn5 = (Button) findViewById(R.id.five);
        btn6 = (Button) findViewById(R.id.six);
        btn7 = (Button) findViewById(R.id.seven);
        btn8 = (Button) findViewById(R.id.eight);
        btn9 = (Button) findViewById(R.id.nine);
        btn10 = (Button) findViewById(R.id.ten);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn1.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn2.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn3.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn4.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn5.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn6.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn7.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn8.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn9.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn10.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });

    }
}
