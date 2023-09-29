package com.example.tiktokgame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView find; // find number
    TextView pause; // pause button + Resume
    TextView result; // result
    TextView goal; //goal
    TextView timer; //time
    TextView reset; //Restart
    TextView settings; //setting
    Vibrator vibrator;


    // time
    public static final long START_TIME_IN_MILLIS = 60000;
    public CountDownTimer mCountDownTimer;
    public boolean mTimerRunning;
    public long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    public int counter;

    // rest of the buttons
    TextView t1;     // 1st row
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;
    TextView t13;
    TextView t14;
    TextView t15;
    TextView t16;
    TextView t17;
    TextView t19;
    TextView t20;
    TextView t21;
    TextView t22;
    TextView t23;
    TextView t25;
    TextView t26;
    TextView t27;
    TextView t28;
    TextView t29;
    TextView t31;
    TextView t32;
    TextView t33;
    TextView t34;
    TextView t35;
    TextView t36;
    TextView t37;
    TextView t38;
    TextView t39;
    TextView t40;
    TextView t41;
    TextView t43;
    TextView t44;
    TextView t45;
    TextView t46;
    TextView t47;


    Boolean B = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // function
        find = findViewById(R.id.findnumber);
        pause = findViewById(R.id.text_pause);
        result = findViewById(R.id.text_view_result);
        goal = findViewById(R.id.text_view_goal);
        timer = findViewById(R.id.time);
        reset = findViewById(R.id.restart);
        settings = findViewById(R.id.setting);
        vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);


        // normal key
        t1 = findViewById(R.id.one);
        t2 = findViewById(R.id.two);
        t3 = findViewById(R.id.three);
        t4 = findViewById(R.id.four);
        t5 = findViewById(R.id.five);
        t7 = findViewById(R.id.seven);
        t8 = findViewById(R.id.eight);
        t9 = findViewById(R.id.nine);
        t10 = findViewById(R.id.ten);
        t11 = findViewById(R.id.eleven);
        t13 = findViewById(R.id.thirteen);
        t14 = findViewById(R.id.fourteen);
        t15 = findViewById(R.id.fifteen);
        t16 = findViewById(R.id.sixteen);
        t17 = findViewById(R.id.seventeen);
        t19 = findViewById(R.id.nineteen);
        t20 = findViewById(R.id.twenty);
        t21 = findViewById(R.id.twenty_one);
        t22 = findViewById(R.id.twenty_two);
        t23 = findViewById(R.id.twenty_three);
        t25 = findViewById(R.id.twenty_five);
        t26 = findViewById(R.id.twenty_six);
        t27 = findViewById(R.id.twenty_seven);
        t28 = findViewById(R.id.twenty_eight);
        t29 = findViewById(R.id.twenty_nine);
        t31 = findViewById(R.id.thirty_one);
        t32 = findViewById(R.id.thirty_two);
        t33 = findViewById(R.id.thirty_three);
        t34 = findViewById(R.id.thirty_four);
        t35 = findViewById(R.id.thirty_five);
        t37 = findViewById(R.id.thirty_seven);
        t38 = findViewById(R.id.thirty_eight);
        t39 = findViewById(R.id.thirty_nine);
        t40 = findViewById(R.id.forty);
        t41 = findViewById(R.id.forty_one);
        t43 = findViewById(R.id.forty_three);
        t44 = findViewById(R.id.forty_four);
        t45 = findViewById(R.id.forty_five);
        t46 = findViewById(R.id.forty_six);
        t47 = findViewById(R.id.forty_seven);

//        change number
        B = true;
        changenumber();


        //time
        startTimer();
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
//                    Disable();
                } else {
                    startTimer();
//                    Enable();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
                startTimer();
            }
        });
        updateCountDownText();

        //setting
        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),popupActivity.class);
                startActivity(i);
            }
        });





        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t1.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();

                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t1.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t1.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t1.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t1.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t2.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t2.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t2.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t2.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t2.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t3.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t3.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t3.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t3.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t3.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t4.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t4.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t4.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t4.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t4.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t5.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t5.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t5.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t5.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t5.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t7.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();

                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t7.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t7.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t7.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t7.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t8.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();

                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t8.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t8.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t8.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t8.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
//        t8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String i = t8.getText().toString();
//                if(i.equals(find.getText().toString())){
//                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
//                    B = true;
//                    changenumber();
//
//                }
//                else {
//                    Toast.makeText(getApplicationContext(),"Not Successfully ", Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t9.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();

                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t9.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t9.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t9.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t9.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t10.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t10.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t10.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t10.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t10.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t11.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t11.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t11.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t11.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t11.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t13.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t13.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t13.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t13.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t13.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t14.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t14.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t14.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t14.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t14.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t15.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();

                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t15.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t15.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t15.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t15.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t16.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t16.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t16.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t16.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t16.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t17.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t17.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t17.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t17.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t17.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t19.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t19.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t19.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t19.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t19.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t20.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t20.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t20.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t20.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t20.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t21.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t21.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t21.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t21.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t21.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t22.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t22.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t22.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t22.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t22.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t23.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t23.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t23.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t23.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t23.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t25.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t25.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t25.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t25.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t25.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t26.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t26.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t26.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t26.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t26.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t27.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t27.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t27.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t27.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t27.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t28.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t28.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t28.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t28.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t28.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t29.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t29.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t29.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t29.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t29.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t31.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t31.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t31.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t31.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t31.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t32.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t32.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t32.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t32.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t32.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t33.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t33.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t33.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t33.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t33.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
//        t33.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String i = t33.getText().toString();
//                if(i.equals(find.getText().toString())){
//                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
//                    B = true;
//                    changenumber();
//
//                }
//                else {
//                    Toast.makeText(getApplicationContext(),"Not Successfully ", Toast.LENGTH_SHORT).show();
//
//                }
//            }
//        });
        t34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t34.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t34.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t34.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t34.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t34.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t35.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t35.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t35.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t35.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t35.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t37.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t37.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t37.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t37.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t37.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t38.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t38.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t38.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t38.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t38.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t39.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t39.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t39.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t39.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t39.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t40.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t40.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t40.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t40.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t40.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t41.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t41.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t41.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t41.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t41.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });

        t43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t43.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t43.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t43.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t43.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t43.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t44.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t44.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t44.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t44.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t44.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t45.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t45.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t45.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t45.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t45.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });

        t46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t46.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t46.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t46.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t46.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t46.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });
        t47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i = t47.getText().toString();
                if(i.equals(find.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Successfully ", Toast.LENGTH_SHORT).show();
                    B = true;
                    score();
                    changenumber();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t47.setBackgroundResource(R.drawable.right);
                        }
                        @Override
                        public void onFinish(){
                            t47.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();

                }
                else {
                    vibration();
                    new CountDownTimer(1000,50){
                        @Override

                        public void onTick(long arg0){
                            t47.setBackgroundResource(R.drawable.wrong);
                        }
                        @Override
                        public void onFinish(){
                            t47.setBackgroundResource(R.drawable.round_shape);
                        }
                    }.start();
                }
            }
        });



    }

    public void changenumber(){
//        TextView r = findViewById(R.id.text_view_result);
        int random;
        int max;
        int min;
        max = 39;
        min = 01;
        if(B==true){
            random = (int)(Math.random() * ((max - min) + 1));
            if (random<10){
                find.setText("0"+String.valueOf(random));

            }
            else{
                String S = String.valueOf(random);

                find.setText(S);
            }

//            goal
//            String d = goal.getText().toString();
//            if(goal.getText().toString().equals(d)){
//                Toast.makeText(getApplicationContext(),"Finally tmi parso ", Toast.LENGTH_SHORT).show();
//                score();
//            }
        }
        B = false;
    }


    public void score(){

    //          UPDATE SCORE
    TextView r = findViewById(R.id.text_view_result);
    String s = r.getText().toString();
    int a = Integer.parseInt(s);
    a = a+1;
    String d = String.valueOf(a);
    r.setText(d);
      String s2 =  goal.getText().toString();
    if(s.equals(s2)){
        goal.setText(d);


        SharedPreferences highscore = getSharedPreferences("GAME DATA", Context.MODE_PRIVATE);
        int H = highscore.getInt("GOAL", 0);
        int H1 = Integer.parseInt(result.getText().toString());
        if (H1 > H) {
            SharedPreferences.Editor editor = highscore.edit();
            editor.putInt("GOAL", H1);
            editor.commit();
        }
//            goal.setText("" + H1);


    }


}
//vibrator
    public void vibration(){
        if(Build.VERSION.SDK_INT >= 26){
            vibrator.vibrate(VibrationEffect.createOneShot(200,VibrationEffect.DEFAULT_AMPLITUDE));
        }
        else {
            vibrator.vibrate(200);
        }
    }





    //Timer
    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                mTimerRunning = false;
                SharedPreferences highscore = getSharedPreferences("GAME DATA", Context.MODE_PRIVATE);
                int H = highscore.getInt("GOAL", 0);
                int H1 = Integer.parseInt(result.getText().toString());
                if (H1 > H) {
                    SharedPreferences.Editor editor = highscore.edit();
                    editor.putInt("GOAL", H1);
                    editor.commit();
                }
//                int H = 0;
//                int H1 = Integer.parseInt (goal.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putString("MASSSEGE", String.valueOf(H));
                bundle.putString("MASSSEGEone", String.valueOf(H1));
                Intent i = new Intent(getApplicationContext(), gameover.class);
                i.putExtras(bundle);
                startActivity(i);

                pause.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow_24, 0, 0, 0);
                pause.setVisibility(View.INVISIBLE);
                reset.setVisibility(View.VISIBLE);
            }
        }.start();
        mTimerRunning = true;
        pause.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_pause_24, 0, 0, 0);
        reset.setVisibility(View.INVISIBLE);
    }
    public void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        pause.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_play_arrow_24, 0, 0, 0);
        reset.setVisibility(View.VISIBLE);
    }
    public void resetTimer() {
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();
        reset.setVisibility(View.INVISIBLE);
        pause.setVisibility(View.VISIBLE);
        TextView r = findViewById(R.id.text_view_result);
        r.setText("0");
        //result();

    }
    public void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timer.setText(timeLeftFormatted);
    }


    public void result (){
        if (mTimerRunning ==  true){
        }
        else {
//            SharedPreferences highscore = getSharedPreferences("GAME DATA", Context.MODE_PRIVATE);
//            int H = highscore.getInt("GOAL", 0);
//            int H1 = Integer.parseInt(result.getText().toString());
//            if (H1 > H) {
//                SharedPreferences.Editor editor = highscore.edit();
//                editor.putInt("GOAL", H1);
//                editor.commit();
//            }
////            goal.setText("" + H1);
//
//            Bundle bundle = new Bundle();
//            bundle.putString("MASSSEGE", String.valueOf(H));
//            bundle.putString("MASSSEGEone", String.valueOf(H1));
//            Intent i = new Intent(getApplicationContext(), gameover.class);
//            i.putExtras(bundle);
//            startActivity(i);

        }

    }

    public void Disable(){
        t1.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        t7.setEnabled(false);
        t8.setEnabled(false);
        t9.setEnabled(false);
        t10.setEnabled(false);
        t11.setEnabled(false);
        t13.setEnabled(false);
        t14.setEnabled(false);
        t15.setEnabled(false);
        t16.setEnabled(false);
        t17.setEnabled(false);
        t19.setEnabled(false);
        t20.setEnabled(false);
        t21.setEnabled(false);
        t22.setEnabled(false);
        t23.setEnabled(false);
        t25.setEnabled(false);
        t26.setEnabled(false);
        t27.setEnabled(false);
        t28.setEnabled(false);
        t29.setEnabled(false);
        t31.setEnabled(false);
        t32.setEnabled(false);
        t33.setEnabled(false);
        t34.setEnabled(false);
        t35.setEnabled(false);
        t36.setEnabled(false);
        t37.setEnabled(false);
        t38.setEnabled(false);
        t39.setEnabled(false);
        t40.setEnabled(false);
        t41.setEnabled(false);
        t43.setEnabled(false);
        t44.setEnabled(false);
        t45.setEnabled(false);
        t46.setEnabled(false);
        t47.setEnabled(false);





    }
    public void Enable(){
        t1.setEnabled(true);
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
        t5.setEnabled(true);
        t7.setEnabled(true);
        t8.setEnabled(true);
        t9.setEnabled(true);
        t10.setEnabled(true);
        t11.setEnabled(true);
        t13.setEnabled(true);
        t14.setEnabled(true);
        t15.setEnabled(true);
        t16.setEnabled(true);
        t17.setEnabled(true);
        t19.setEnabled(true);
        t20.setEnabled(true);
        t21.setEnabled(true);
        t22.setEnabled(true);
        t23.setEnabled(true);
        t25.setEnabled(true);
        t26.setEnabled(true);
        t27.setEnabled(true);
        t28.setEnabled(true);
        t29.setEnabled(true);
        t31.setEnabled(true);
        t32.setEnabled(true);
        t33.setEnabled(true);
        t34.setEnabled(true);
        t35.setEnabled(true);
        t36.setEnabled(true);
        t37.setEnabled(true);
        t38.setEnabled(true);
        t39.setEnabled(true);
        t40.setEnabled(true);
        t41.setEnabled(true);
        t43.setEnabled(true);
        t44.setEnabled(true);
        t45.setEnabled(true);
        t46.setEnabled(true);
        t47.setEnabled(true);


    }

}
