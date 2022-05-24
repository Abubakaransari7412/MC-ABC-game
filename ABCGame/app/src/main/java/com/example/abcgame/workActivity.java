package com.example.abcgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class workActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        Intent intent = getIntent();
        ImageView img = findViewById(R.id.word);
        int resource = intent.getIntExtra("wordImage",700002);
        img.setImageResource(resource);
    }
    public  void  backToMain(View v)
    {
        Intent intent = new Intent(Words.this, LearningModule.class);
        startActivity(intent);
    }

    private void startActivity(Intent intent) {
    }

}
