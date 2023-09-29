package com.example.tiktokgame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class gameover extends AppCompatActivity {
    TextView A1;
    TextView A2;
    TextView A3;
    Button B1;
    Button B2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .6), (int) (height * .5));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;
        getWindow().setAttributes(params);


        A1 = findViewById(R.id.wish);
        A2 = findViewById(R.id.resultinfo);
        A3 = findViewById(R.id.resultinfo1);
        B1 = findViewById(R.id.restart);
        B2 = findViewById(R.id.exit);


        Bundle bundle = getIntent().getExtras();
        String temp = bundle.getString("MASSSEGE"); // previous high score
        String temp_1 = bundle.getString("MASSSEGEone"); // now socre



        if (Integer.parseInt(temp) > Integer.parseInt(temp_1)) {

            A1.setText("GOOD TRY !!!");
            A2.setText("You tired hard." + "\nHigh score was " + temp + " \n&\n Your Score " + temp_1 + ".");
            A3.setText("Your score is " + temp_1 + ".");

        } else {

            A1.setText("CONGRATULATIONS!!!");
            A2.setText(" High Score " + temp + "\n Your Score " + temp_1 + "\nKeep It Up !!!");
            A3.setVisibility(View.GONE);
        }
        B1.setOnClickListener(new View.OnClickListener() { // restart
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            // exit whole app
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}

