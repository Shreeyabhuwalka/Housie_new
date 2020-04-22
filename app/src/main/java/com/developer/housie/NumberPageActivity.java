package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class NumberPageActivity extends AppCompatActivity implements View.OnClickListener {


    Button mButton[] = new Button[100];
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_page);
//        setRequestedOrientation (SCREEN_ORIENTATION_LANDSCAPE);

        mButton[0] = (Button) findViewById(R.id.one);
        mButton[1] = (Button) findViewById(R.id.two);
        mButton[2] = (Button) findViewById(R.id.three);
        mButton[3] = (Button) findViewById(R.id.four);
        mButton[4] = (Button) findViewById(R.id.five);
        mButton[5] = (Button) findViewById(R.id.six);
        mButton[6] = (Button) findViewById(R.id.seven);
        mButton[7] = (Button) findViewById(R.id.eight);
        mButton[8] = (Button) findViewById(R.id.nine);
        mButton[9] = (Button) findViewById(R.id.ten);
        mButton[10] = (Button) findViewById(R.id.no11);
        mButton[11] = (Button) findViewById(R.id.no12);
        mButton[12] = (Button) findViewById(R.id.no13);
        mButton[13] = (Button) findViewById(R.id.no14);
        mButton[14] = (Button) findViewById(R.id.no15);
        mButton[15] = (Button) findViewById(R.id.no16);
        mButton[16] = (Button) findViewById(R.id.no17);
        mButton[17] = (Button) findViewById(R.id.no18);
        mButton[18] = (Button) findViewById(R.id.no19);
        mButton[19] = (Button) findViewById(R.id.no20);

        mButton[20] = (Button) findViewById(R.id.no21);
        mButton[21] = (Button) findViewById(R.id.no22);
        mButton[22] = (Button) findViewById(R.id.no23);
        mButton[23] = (Button) findViewById(R.id.no24);
        mButton[24] = (Button) findViewById(R.id.no25);
        mButton[25] = (Button) findViewById(R.id.no26);
        mButton[26] = (Button) findViewById(R.id.no27);
        mButton[27] = (Button) findViewById(R.id.no28);
        mButton[28] = (Button) findViewById(R.id.no29);
        mButton[29] = (Button) findViewById(R.id.no30);

        mButton[30] = (Button) findViewById(R.id.no31);
        mButton[31] = (Button) findViewById(R.id.no32);
        mButton[32] = (Button) findViewById(R.id.no33);
        mButton[33] = (Button) findViewById(R.id.no34);
        mButton[34] = (Button) findViewById(R.id.no35);
        mButton[35] = (Button) findViewById(R.id.no36);
        mButton[36] = (Button) findViewById(R.id.no37);
        mButton[37] = (Button) findViewById(R.id.no38);
        mButton[38] = (Button) findViewById(R.id.no39);
        mButton[39] = (Button) findViewById(R.id.no40);

        mButton[40] = (Button) findViewById(R.id.no41);
        mButton[41] = (Button) findViewById(R.id.no42);
        mButton[42] = (Button) findViewById(R.id.no43);
        mButton[43] = (Button) findViewById(R.id.no44);
        mButton[44] = (Button) findViewById(R.id.no45);
        mButton[45] = (Button) findViewById(R.id.no46);
        mButton[46] = (Button) findViewById(R.id.no47);
        mButton[47] = (Button) findViewById(R.id.no48);
        mButton[48] = (Button) findViewById(R.id.no49);
        mButton[49] = (Button) findViewById(R.id.no50);

        mButton[50] = (Button) findViewById(R.id.no51);
        mButton[51] = (Button) findViewById(R.id.no52);
        mButton[52] = (Button) findViewById(R.id.no53);
        mButton[53] = (Button) findViewById(R.id.no54);
        mButton[54] = (Button) findViewById(R.id.no55);
        mButton[55] = (Button) findViewById(R.id.no56);
        mButton[56] = (Button) findViewById(R.id.no57);
        mButton[57] = (Button) findViewById(R.id.no58);
        mButton[58] = (Button) findViewById(R.id.no59);
        mButton[59] = (Button) findViewById(R.id.no60);

        mButton[60] = (Button) findViewById(R.id.no61);
        mButton[61] = (Button) findViewById(R.id.no62);
        mButton[62] = (Button) findViewById(R.id.no63);
        mButton[63] = (Button) findViewById(R.id.no64);
        mButton[64] = (Button) findViewById(R.id.no65);
        mButton[65] = (Button) findViewById(R.id.no66);
        mButton[66] = (Button) findViewById(R.id.no67);
        mButton[67] = (Button) findViewById(R.id.no68);
        mButton[68] = (Button) findViewById(R.id.no69);
        mButton[69] = (Button) findViewById(R.id.no70);


        mButton[0].setOnClickListener(this);
        mButton[1].setOnClickListener(this);
        mButton[2].setOnClickListener(this);
        mButton[3].setOnClickListener(this);
        mButton[4].setOnClickListener(this);
        mButton[5].setOnClickListener(this);
        mButton[6].setOnClickListener(this);
        mButton[7].setOnClickListener(this);
        mButton[8].setOnClickListener(this);
        mButton[9].setOnClickListener(this);

        mButton[10].setOnClickListener(this);
        mButton[11].setOnClickListener(this);
        mButton[12].setOnClickListener(this);
        mButton[13].setOnClickListener(this);
        mButton[14].setOnClickListener(this);
        mButton[15].setOnClickListener(this);
        mButton[16].setOnClickListener(this);
        mButton[17].setOnClickListener(this);
        mButton[18].setOnClickListener(this);
        mButton[19].setOnClickListener(this);

        mButton[20].setOnClickListener(this);
        mButton[21].setOnClickListener(this);
        mButton[22].setOnClickListener(this);
        mButton[23].setOnClickListener(this);
        mButton[24].setOnClickListener(this);
        mButton[25].setOnClickListener(this);
        mButton[26].setOnClickListener(this);
        mButton[27].setOnClickListener(this);
        mButton[28].setOnClickListener(this);
        mButton[29].setOnClickListener(this);

        mButton[30].setOnClickListener(this);
        mButton[31].setOnClickListener(this);
        mButton[32].setOnClickListener(this);
        mButton[33].setOnClickListener(this);
        mButton[34].setOnClickListener(this);
        mButton[35].setOnClickListener(this);
        mButton[36].setOnClickListener(this);
        mButton[37].setOnClickListener(this);
        mButton[38].setOnClickListener(this);
        mButton[39].setOnClickListener(this);

        mButton[40].setOnClickListener(this);
        mButton[41].setOnClickListener(this);
        mButton[42].setOnClickListener(this);
        mButton[43].setOnClickListener(this);
        mButton[44].setOnClickListener(this);
        mButton[45].setOnClickListener(this);
        mButton[46].setOnClickListener(this);
        mButton[47].setOnClickListener(this);
        mButton[48].setOnClickListener(this);
        mButton[49].setOnClickListener(this);
        mButton[50].setOnClickListener(this);
        mButton[51].setOnClickListener(this);
        mButton[52].setOnClickListener(this);
        mButton[53].setOnClickListener(this);
        mButton[54].setOnClickListener(this);
        mButton[55].setOnClickListener(this);
        mButton[56].setOnClickListener(this);
        mButton[57].setOnClickListener(this);
        mButton[58].setOnClickListener(this);
        mButton[59].setOnClickListener(this);
        mButton[60].setOnClickListener(this);
        mButton[61].setOnClickListener(this);
        mButton[62].setOnClickListener(this);
        mButton[63].setOnClickListener(this);
        mButton[64].setOnClickListener(this);
        mButton[65].setOnClickListener(this);
        mButton[66].setOnClickListener(this);
        mButton[67].setOnClickListener(this);
        mButton[68].setOnClickListener(this);
        mButton[69].setOnClickListener(this);


//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn1.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn2.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn3.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn4.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn5.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn6.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn7.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn8.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn9.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });
//        btn10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                btn10.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));
//            }
//        });

    }

    @Override
    public void onClick(View view) {


        view.setBackgroundColor(getResources().getColor(R.color.colorFalseButton));

    }
}
