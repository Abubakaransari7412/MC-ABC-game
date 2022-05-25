package com.example.abcgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class learning_1 extends AppCompatActivity implements View.OnClickListener{

    Intent intent;
    ImageView img;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning1);
        ImageButton a = findViewById(R.id.letter_a);
        a.setOnClickListener(this);
        ImageButton b = findViewById(R.id.letter_b);
        b.setOnClickListener(this);
        ImageButton c = findViewById(R.id.letter_c);
        c.setOnClickListener(this);
        ImageButton d = findViewById(R.id.letter_d);
        d.setOnClickListener(this);
        ImageButton e = findViewById(R.id.letter_e);
        e.setOnClickListener(this);
        ImageButton f = findViewById(R.id.letter_f);
        f.setOnClickListener(this);
        ImageButton g = findViewById(R.id.letter_g);
        g.setOnClickListener(this);
        ImageButton h = findViewById(R.id.letter_h);
        h.setOnClickListener(this);
        ImageButton i = findViewById(R.id.letter_i);
        i.setOnClickListener(this);
        ImageButton j = findViewById(R.id.letter_j);
        j.setOnClickListener(this);
        ImageButton k = findViewById(R.id.letter_k);
        k.setOnClickListener(this);
        ImageButton l = findViewById(R.id.letter_l);
        l.setOnClickListener(this);
        ImageButton m = findViewById(R.id.letter_m);
        m.setOnClickListener(this);
        ImageButton n = findViewById(R.id.letter_n);
        n.setOnClickListener(this);
        ImageButton o = findViewById(R.id.letter_o);
        o.setOnClickListener(this);
        ImageButton p = findViewById(R.id.letter_p);
        p.setOnClickListener(this);
        ImageButton q = findViewById(R.id.letter_q);
        q.setOnClickListener(this);
        ImageButton r = findViewById(R.id.letter_r);
        r.setOnClickListener(this);
        ImageButton s = findViewById(R.id.letter_s);
        s.setOnClickListener(this);
        ImageButton t = findViewById(R.id.letter_t);
        t.setOnClickListener(this);
        ImageButton u = findViewById(R.id.letter_u);
        u.setOnClickListener(this);
        ImageButton v = findViewById(R.id.letter_v);
        v.setOnClickListener(this);
        ImageButton w = findViewById(R.id.letter_w);
        w.setOnClickListener(this);
        ImageButton x = findViewById(R.id.letter_x);
        x.setOnClickListener(this);
        ImageButton y = findViewById(R.id.letter_y);
        y.setOnClickListener(this);
        ImageButton z = findViewById(R.id.letter_z);
        z.setOnClickListener(this);

    //    img = findViewById(R.id.word);
        intent = new Intent(learning_1.this, workActivity.class);
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.letter_a:
                image = R.drawable.AAAA;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_b:
                image = R.drawable.BBBB;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_c:
                image = R.drawable.CCCC;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_d:
                image = R.drawable.DDDD;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_e:
                image = R.drawable.EEEE;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_f:
                image = R.drawable.FFFF;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_g:
                image = R.drawable.GGGG;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_h:
                image = R.drawable.HHHH;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_i:
                image = R.drawable.IIII;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_j:
                image = R.drawable.JJJJ;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_k:
                image = R.drawable.KKKK;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_l:
                image = R.drawable.LLLL;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_m:
                image = R.drawable.MMMM;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_n:
                image = R.drawable.NNNN;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_o:
                image = R.drawable.OOOO;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_p:
                image = R.drawable.PPPP;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_q:
                image = R.drawable.QQQQ;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_r:
                image = R.drawable.RRRR;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_s:
                image = R.drawable.SSSS;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_t:
                image = R.drawable.TTTT;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_u:
                image = R.drawable.UUUU;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_v:
                image = R.drawable.VVVV;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;
            case R.id.letter_w:
                image = R.drawable.WWWW;
                intent.putExtra("wordImage", image);
                startActivity(intent);
                break;

        }
    }

}