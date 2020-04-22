package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class PlayBoardActivity extends AppCompatActivity {

    Button btn_random;
    Button buttons[] = new Button[27];



    //Button buttons[] = new Button[15];

//    Button btn_random1;
//    Button btn_random2;
//    Button btn_random3;
//    Button btn_random4;
//    Button btn_random5;
//    Button btn_random6;
//    Button btn_random7;
//    Button btn_random8;
//    Button btn_random9;
//    Button btn_random10;
//    Button btn_random11;
//    Button btn_random12;
//    Button btn_random13;
//    Button btn_random14;
//    Button btn_random15;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_play_board);
        setRequestedOrientation (SCREEN_ORIENTATION_LANDSCAPE);



        btn_random = (Button) findViewById(R.id.random_btn_id);
        buttons[0] = (Button) findViewById(R.id.btn_one);
        buttons[1] = (Button) findViewById(R.id.btn_two);
        buttons[2] = (Button) findViewById(R.id.btn_three);
        buttons[3] = (Button) findViewById(R.id.btn_four);
        buttons[4] = (Button) findViewById(R.id.btn_five);
        buttons[5] = (Button) findViewById(R.id.btn_six);
        buttons[6] = (Button) findViewById(R.id.btn_seven);
        buttons[7] = (Button) findViewById(R.id.btn_eight);
        buttons[8] = (Button) findViewById(R.id.btn_nine);
        buttons[9] = (Button) findViewById(R.id.btn2_one);
        buttons[10] = (Button) findViewById(R.id.btn2_two);
        buttons[11] = (Button) findViewById(R.id.btn2_three);
        buttons[12] = (Button) findViewById(R.id.btn2_four);
        buttons[13] = (Button) findViewById(R.id.btn2_five);
        buttons[14] = (Button) findViewById(R.id.btn2_six);
        buttons[15] = (Button) findViewById(R.id.btn2_seven);
        buttons[16] = (Button) findViewById(R.id.btn2_eight);
        buttons[17] = (Button) findViewById(R.id.btn2_nine);
        buttons[18] = (Button) findViewById(R.id.btn3_one);
        buttons[19] = (Button) findViewById(R.id.btn3_two);
        buttons[20] = (Button) findViewById(R.id.btn3_three);
        buttons[21] = (Button) findViewById(R.id.btn3_four);
        buttons[22] = (Button) findViewById(R.id.btn3_five);
        buttons[23] = (Button) findViewById(R.id.btn3_six);
        buttons[24] = (Button) findViewById(R.id.btn3_seven);
        buttons[25] = (Button) findViewById(R.id.btn3_eight);
        buttons[26] = (Button) findViewById(R.id.btn3_nine);

//        btn_random = (Button) findViewById(R.id.random_btn_id);
//        btn_random1 = (Button) findViewById(R.id.btn_one);
//         btn_random2 = (Button) findViewById(R.id.btn_two);
//         btn_random3 = (Button) findViewById(R.id.btn_three);
//         btn_random4 = (Button) findViewById(R.id.btn_four);
//         btn_random5 = (Button) findViewById(R.id.btn_five);
//         btn_random6 = (Button) findViewById(R.id.btn2_one);
//         btn_random7 = (Button) findViewById(R.id.btn2_two);
//         btn_random8 = (Button) findViewById(R.id.btn2_three);
//         btn_random9 = (Button) findViewById(R.id.btn2_four);
//         btn_random10 = (Button) findViewById(R.id.btn2_five);
//        btn_random11 = (Button) findViewById(R.id.btn3_one);
//        btn_random12 = (Button) findViewById(R.id.btn3_two);
//        btn_random13 = (Button) findViewById(R.id.btn3_three);
//        btn_random14 = (Button) findViewById(R.id.btn3_four);
//        btn_random15 = (Button) findViewById(R.id.btn3_five);

        randomNumberCreation();

        btn_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                randomNumberCreation();

                Intent intent= new Intent(getApplicationContext(), PlayBoardActivity.class);
                startActivity(intent);
            }
        });


        buttons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[0].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[1].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[2].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[3].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[4].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[5].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[6].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[7].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[8].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[9].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[10].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[11].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[12].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[13].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[14].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[15].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[16].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[17].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[18].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[19].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[20].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[21].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[22].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[23].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[24].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[25].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });
        buttons[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                buttons[26].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
            }
        });


//        btn_random1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random1.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random2.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random3.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random4.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random5.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random6.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random7.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random8.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random9.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random10.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random11.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random12.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random12.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random13.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random14.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn_random15.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn_random15.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });




    }
    public void randomNumberCreation() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<=100; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);

        Random val = new Random();
        int m = 0,random;
        for (int k = 0; k < 19; k += 9) {
            int a[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};

            for (int i = 1; i <= 5; i++) {
                do {
                    random= val.nextInt(9) + k; // [0, 8] + k => [k,k+[9]]
                } while (a[random - k] == 0);
                Log.i("Message", String.valueOf(random));
                buttons[random].setText(String.valueOf(list.get(m++)));
                a[random - k] = 0;
            }
        }

//        btn_random1.setText(String.valueOf(list.get(0)));
//        btn_random2.setText(String.valueOf(list.get(1)));
//        btn_random3.setText(String.valueOf(list.get(2)));
//        btn_random4.setText(String.valueOf(list.get(3)));
//        btn_random5.setText(String.valueOf(list.get(4)));
//        btn_random6.setText(String.valueOf(list.get(5)));
//        btn_random7.setText(String.valueOf(list.get(6)));
//        btn_random8.setText(String.valueOf(list.get(7)));
//        btn_random9.setText(String.valueOf(list.get(8)));
//        btn_random10.setText(String.valueOf(list.get(9)));
//
//        btn_random11.setText(String.valueOf(list.get(10)));
//        btn_random12.setText(String.valueOf(list.get(11)));
//        btn_random13.setText(String.valueOf(list.get(12)));
//        btn_random14.setText(String.valueOf(list.get(13)));
//        btn_random15.setText(String.valueOf(list.get(14)));
//        btn_random1.setText(String.valueOf(list.get(0)));


        for (int i=0; i<10; i++) {
            System.out.println(list.get(i));

        }
    }
}
