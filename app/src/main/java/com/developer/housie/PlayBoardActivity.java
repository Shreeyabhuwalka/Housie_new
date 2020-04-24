package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class PlayBoardActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttons[] = new Button[27];

    int fullHouse = 0;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_play_board);
//        setRequestedOrientation (SCREEN_ORIENTATION_LANDSCAPE);

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

        randomNumberCreation();

        buttons[0].setOnClickListener(this);
        buttons[1].setOnClickListener(this);
        buttons[2].setOnClickListener(this);
        buttons[3].setOnClickListener(this);
        buttons[4].setOnClickListener(this);
        buttons[5].setOnClickListener(this);
        buttons[6].setOnClickListener(this);
        buttons[7].setOnClickListener(this);
        buttons[8].setOnClickListener(this);
        buttons[9].setOnClickListener(this);
        buttons[10].setOnClickListener(this);
        buttons[11].setOnClickListener(this);
        buttons[12].setOnClickListener(this);
        buttons[13].setOnClickListener(this);
        buttons[14].setOnClickListener(this);
        buttons[15].setOnClickListener(this);
        buttons[16].setOnClickListener(this);
        buttons[17].setOnClickListener(this);
        buttons[18].setOnClickListener(this);
        buttons[19].setOnClickListener(this);
        buttons[20].setOnClickListener(this);
        buttons[21].setOnClickListener(this);
        buttons[22].setOnClickListener(this);
        buttons[23].setOnClickListener(this);
        buttons[24].setOnClickListener(this);
        buttons[25].setOnClickListener(this);
        buttons[26].setOnClickListener(this);
    }

    public void randomNumberCreation() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<=99; i++) {
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
        for (int i=0; i<10; i++) {
            System.out.println(list.get(i));
        }
    }

    @Override
        public void onClick(View view) {

            Button btn = (Button) view;
            btn.setTextColor(getResources().getColor(R.color.colorFalseButton));

            fullHouse++;
            if(fullHouse==15)
            {
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Full House");
                //cancelable help to remove alert box by clicking outside the alert box. By seting it to false we r nt allowing to disable alert
                alert.setMessage("You got full house");
                alert.setPositiveButton("End Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                alert.show();
            }

        }
}



//        btn_random.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                randomNumberCreation();
//
//                Intent intent= new Intent(getApplicationContext(), PlayBoardActivity.class);
//                startActivity(intent);
//            }
//        });

//
//        buttons[0].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[0].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[1].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[1].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[2].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[2].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[3].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[3].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[4].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[4].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[5].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[5].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[6].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[6].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[7].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[7].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[8].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[8].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[9].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[9].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[10].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[10].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[11].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[11].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[12].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[12].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[13].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[13].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[14].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[14].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[15].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[15].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[16].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[16].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[17].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[17].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[18].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[18].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[19].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[19].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[20].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[20].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[21].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[21].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[22].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[22].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[23].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[23].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[24].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[24].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[25].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[25].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        buttons[26].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                buttons[26].setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
