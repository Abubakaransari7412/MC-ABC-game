package com.example.abcgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class quiz_module extends AppCompatActivity implements View.OnClickListener {
    ImageButton nextBtn;
    //5 buttons that serve as  options
    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    //resources of each button's image
    int btn1Resource;
    int btn2Resource;
    int btn3Resource;
    int btn4Resource;
    int btn5Resource;
    TextView alphabet;
    TextView result;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_module);
        //array of images corresponding to each alphabet
        int[] images = {R.drawable.AAAA, R.drawable.BBBB,R.drawable.CCCC,R.drawable.DDDD, R.drawable.EEEE,R.drawable.FFFF,R.drawable.GGGG,R.drawable.HHHH, R.drawable.IIII,R.drawable.JJJJ,R.drawable.KKKK,R.drawable.LLLL, R.drawable.MMMM,R.drawable.NNNN,R.drawable.OOOO,R.drawable.PPPP, R.drawable.QQQQ,R.drawable.RRRR, R.drawable.SSSS,R.drawable.TTTT,R.drawable.UUUU,R.drawable.VVVV, R.drawable.WWWW };
        alphabet=findViewById(R.id.alphabet);
        //get id of all options
        btn1=findViewById(R.id.option1);
        btn2=findViewById(R.id.option2);
        btn3=findViewById(R.id.option3);
        btn4=findViewById(R.id.option4);
        btn5=findViewById(R.id.option5);
        nextBtn = findViewById(R.id.next);
        result = findViewById(R.id.result);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        nextBtn.setOnClickListener(this);

        //generate random numbers in range of 26
        Random rand = new Random();
        btn1Resource = rand.nextInt(images.length);
        btn2Resource = rand.nextInt(images.length);
        btn3Resource = (alphabet.getText().toString()).charAt(0); //ascii of current alphabet
        btn3Resource = btn3Resource-65; //set one option corresponding to alphabet
        btn4Resource = rand.nextInt(images.length);
        btn5Resource = rand.nextInt(images.length);
        // put random images as option at all 5 buttons
        btn1.setImageResource(images[btn1Resource]);
        btn2.setImageResource(images[btn2Resource]);
        btn3.setImageResource(images[btn3Resource]);
        btn4.setImageResource(images[btn4Resource]);
        btn5.setImageResource(images[btn5Resource]);

        //TODO: add all landscape views
        //TODO: add 2 fnctns to avoid data loss

    }


    public void checkCorrectness(int imgNo, char letter) {
        int ascii = letter;
        int num = ascii - 65; //A=0, B=1 so on
        //if selected image's initial alphabet is same as quest alphabet, then its correct
        if (imgNo - num == 0)
            result.setText("Well Done!");
        else
            result.setText("Wrong! Keep Learning");
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.option1:
                checkCorrectness(btn1Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option2:
                checkCorrectness(btn2Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option3:
                checkCorrectness(btn3Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option4:
                checkCorrectness(btn4Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.option5:
                checkCorrectness(btn5Resource, (alphabet.getText().toString()).charAt(0));
                break;
            case R.id.next:
                break;
        }
        // whatever case was executed, always move to next activity when a button is clicked after waiting for 5 sec
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                intent = new Intent(quiz_module.this, Quiz.class);
                startActivity(intent);
            }
        }, 5000);   //5 seconds


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}