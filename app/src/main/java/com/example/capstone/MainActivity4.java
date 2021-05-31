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

public class MainActivity4 extends AppCompatActivity {
    ScrollView scrollView;
    TextView text1;
    TextView text2;
    ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        text1=findViewById(R.id.text1);

        image= findViewById(R.id.image);
        scrollView= findViewById(R.id.scrollView);
        button= findViewById(R.id.button);

        text2= findViewById(R.id.text2);
        String t2 = "베토벤의 '봄'\n" +
                "지금 당신의 기분은 봄처럼 따뜻하고 편안한 상태입니다.\n" +
                "베토벤의 '봄’은 봄과 너무나도 잘 어울리는 클래식 음악!\n" +
                "바이올린 곡 중 가장 인기가 많은 곡입니다.\n" +
                "신선하고 달콤하면서도 선율적인 느낌이\n" +
                " 너무나 매력적인 베토벤의 '봄’\n" +
                "'봄'은 원래 제목이 아니었다고 하는데요.\n" +
                "후대 사람들이 이 곡을 들으니 봄이 느껴져\n" +
                "봄이라는 멋진 별칭을 지어주었다고 하네요.\n" +
                "왜 봄이라는 별칭을 지어주었는지 한 번 들어볼까요?";
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