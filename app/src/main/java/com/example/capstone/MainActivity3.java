package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class MainActivity3 extends AppCompatActivity {

    Button result_1;
    Button result_2;
    Button result_3;
    Button result_4;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        result_1 = findViewById(R.id.result_1);
        result_2 = findViewById(R.id.result_2);
        result_3 = findViewById(R.id.result_3);
        result_4 = findViewById(R.id.result_4);
        imageView=findViewById(R.id.imageView);

        Intent i1 = getIntent();

        int score_a = getIntent().getExtras().getInt("score_a");
        int score_b = getIntent().getExtras().getInt("score_b");



        Glide.with(this).load(R.drawable.change).into(imageView);


        if(score_a==0){
            result_1.setVisibility(View.VISIBLE);
        }else if(score_a>0 && score_a<4){
            result_2.setVisibility(View.VISIBLE);
        }else if(score_a>3 && score_a<7){
            result_3.setVisibility(View.VISIBLE);
        } else if(score_a>7 && score_a<11){
            result_4.setVisibility(View.VISIBLE);
        }

    }

    public void onClick(View v){
        Intent i1 = null;
        switch (v.getId()){
            case R.id.result_1:
                i1=new Intent(this, MainActivity4.class);
                startActivity(i1);
                break;
            case R.id.result_2:
                i1=new Intent(this, MainActivity5.class);
                startActivity(i1);
                break;
            case R.id.result_3:
                i1=new Intent(this, MainActivity6.class);
                startActivity(i1);
                break;
            case R.id.result_4:
                i1=new Intent(this, MainActivity7.class);
                startActivity(i1);
                break;
        }
        startActivity(i1);
    }
}

