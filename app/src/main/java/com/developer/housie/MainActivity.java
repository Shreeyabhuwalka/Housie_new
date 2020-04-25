package com.developer.housie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

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
        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE},PackageManager.PERMISSION_GRANTED);
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
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


