package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    ScrollView scrollView;
    TextView text1;
    TextView text2;
    ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        text1=findViewById(R.id.text1);
        image= findViewById(R.id.image);
        scrollView= findViewById(R.id.scrollView);
        button= findViewById(R.id.button);

        text2= findViewById(R.id.text2);
        String t2 = "차이코프스키의 '가을의 노래'\n" +
                "지금 당신은 무엇때문에 슬프신가요?\n" +
                "누군가 당신을 힘들게 하진 않았나요?\n" +
                "차이코프스키의 '가을의 노래’는 가을의 쓸쓸함과 적적함,\n" +
                " 아련함의 분위기를 가지고 있는 곡이랍니다.\n" +
                "누군가 그리울 때 마음을 위로해 주는 것 같다고 하네요.\n" +
                "당신의 기분과 어울리고 위로가 될 수 있는\n" +
                "차이코프스키의 'Autumn Song’은 어떨까요?\n" +
                "빗소리와 어울리는 이 곡이 당신을 위로해줄 거에요.";
        text2.append(t2);
    }
    public void onClick(View v){
        Intent i1 = null;
        switch (v.getId()){
            case R.id.button:
                i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/iNvo7Iz6zpI"));
                startActivity(i1);
                break;
            case R.id.b_home:
                i1=new Intent(this, MainActivity.class);
        }
        startActivity(i1);
    }
}