package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class MainActivity extends AppCompatActivity {
    Button number_btn;
    Button play_button;
    Button rule_button;
    ImageView logo;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setRequestedOrientation (SCREEN_ORIENTATION_LANDSCAPE);
        logo=(ImageView)findViewById(R.id.logotambola);
        logo.animate().scaleX(1.0f).scaleY(1.0f).setDuration(1000);
        number_btn = (Button)findViewById(R.id.num_btn);
        play_button = (Button) findViewById(R.id.play_btn);
        rule_button = (Button) findViewById(R.id.rule_btn);

        number_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new  Intent(MainActivity.this,NumberPageActivity.class);
                startActivity(intent);
            }
        });
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new  Intent(MainActivity.this,PlayBoardActivity.class);
                startActivity(intent);
            }
        });
        rule_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new  Intent(MainActivity.this,Rules.class);
                startActivity(intent);
            }
        });
    }
}
