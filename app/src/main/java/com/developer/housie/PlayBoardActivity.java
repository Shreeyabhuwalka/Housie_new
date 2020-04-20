package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class PlayBoardActivity extends AppCompatActivity {

    Button btn_random;

    Button btn_random1;
    Button btn_random2;
    Button btn_random3;
    Button btn_random4;
    Button btn_random5;
    Button btn_random6;
    Button btn_random7;
    Button btn_random8;
    Button btn_random9;
    Button btn_random10;
    Button btn_random11;
    Button btn_random12;
    Button btn_random13;
    Button btn_random14;
    Button btn_random15;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_play_board);
        setRequestedOrientation (SCREEN_ORIENTATION_LANDSCAPE);


        btn_random = (Button) findViewById(R.id.random_btn_id);
        btn_random1 = (Button) findViewById(R.id.btn_one);
         btn_random2 = (Button) findViewById(R.id.btn_two);
         btn_random3 = (Button) findViewById(R.id.btn_three);
         btn_random4 = (Button) findViewById(R.id.btn_four);
         btn_random5 = (Button) findViewById(R.id.btn_five);
         btn_random6 = (Button) findViewById(R.id.btn2_one);
         btn_random7 = (Button) findViewById(R.id.btn2_two);
         btn_random8 = (Button) findViewById(R.id.btn2_three);
         btn_random9 = (Button) findViewById(R.id.btn2_four);
         btn_random10 = (Button) findViewById(R.id.btn2_five);
        btn_random11 = (Button) findViewById(R.id.btn3_one);
        btn_random12 = (Button) findViewById(R.id.btn3_two);
        btn_random13 = (Button) findViewById(R.id.btn3_three);
        btn_random14 = (Button) findViewById(R.id.btn3_four);
        btn_random15 = (Button) findViewById(R.id.btn3_five);

        randomNumberCreation();

        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                randomNumberCreation();

                Intent intent= new Intent(getApplicationContext(), PlayBoardActivity.class);
                startActivity(intent);
            }
        });





        btn_random1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random1.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random2.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random3.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random4.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random5.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random6.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random7.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random8.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random9.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random10.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random11.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random12.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random13.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random14.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        btn_random15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btn_random15.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });

    }
    public void randomNumberCreation() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=100; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        btn_random1.setText(String.valueOf(list.get(0)));
        btn_random2.setText(String.valueOf(list.get(1)));
        btn_random3.setText(String.valueOf(list.get(2)));
        btn_random4.setText(String.valueOf(list.get(3)));
        btn_random5.setText(String.valueOf(list.get(4)));
        btn_random6.setText(String.valueOf(list.get(5)));
        btn_random7.setText(String.valueOf(list.get(6)));
        btn_random8.setText(String.valueOf(list.get(7)));
        btn_random9.setText(String.valueOf(list.get(8)));
        btn_random10.setText(String.valueOf(list.get(9)));

        btn_random11.setText(String.valueOf(list.get(10)));
        btn_random12.setText(String.valueOf(list.get(11)));
        btn_random13.setText(String.valueOf(list.get(12)));
        btn_random14.setText(String.valueOf(list.get(13)));
        btn_random15.setText(String.valueOf(list.get(14)));
//        btn_random1.setText(String.valueOf(list.get(0)));


        for (int i=0; i<10; i++) {
            System.out.println(list.get(i));

        }
    }
}
