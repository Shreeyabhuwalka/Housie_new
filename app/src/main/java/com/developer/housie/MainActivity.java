package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class MainActivity extends AppCompatActivity {
    Button number_btn;
    Button play_button;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (SCREEN_ORIENTATION_LANDSCAPE);

        number_btn = (Button)findViewById(R.id.num_btn);
        play_button = (Button) findViewById(R.id.play_btn);

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
    }
}
