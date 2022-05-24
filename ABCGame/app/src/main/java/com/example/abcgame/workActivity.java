package com.example.abcgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.view.View;
import android.widget.ImageView;

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
        Intent intent = new Intent(UserDictionary.Words. Learningmodule.class);
        startActivity(intent);
    }

    public void startActivity(Intent intent) {
    }

}
