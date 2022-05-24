package com.example.abcgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton learn;
    ImageButton quiz;
    Button repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learn=findViewById(R.id.learn);
        quiz = findViewById(R.id.quiz);
        repo = findViewById(R.id.repo);
        repo.setOnClickListener(this);
        learn.setOnClickListener(this);
        quiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.learn:
                Intent intent = new Intent(MainActivity.this, LearningModule.class);
                startActivity(intent);
                break;
            case R.id.quiz:
                Intent intent2 = new Intent(MainActivity.this, QuizModule.class );
                startActivity(intent2);
                break;
            case R.id.repo:
                Uri webpage = Uri.parse("https://github.com/Abubakaransari7412/MC-ABC-game.git");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent3);
        }
    }
    }
}