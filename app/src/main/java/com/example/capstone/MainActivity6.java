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

public class MainActivity6 extends AppCompatActivity {
    ScrollView scrollView;
    TextView text1;
    TextView text2;
    ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        text1=findViewById(R.id.text1);
        image= findViewById(R.id.image);
        scrollView= findViewById(R.id.scrollView);
        button= findViewById(R.id.button);

        text2= findViewById(R.id.text2);
        String t2 = "리스트의 '위안'\n" +
                "지금 당신의 기분은 불안하고 초조한 상태시군요…\n" +
                "당신의 하루는 어떤 하루였나요?\n" +
                "지금 당신의 불안한 마음을 달래줄 수 있는 곡은 바로\n" +
                "리스트의 '위안’입니다.\n" +
                "현재가 행복하지 않았던 리스트는 러시아에서의\n" +
                "가족들과 행복했던 나날들을 생각하며\n 피아노 솔로를 연주했습니다.\n" +
                "보통 리스트의 까다로운 연주와 달리\n 섬세하고 부드러운 감수성으로 연주해\n 듣는 사람의 마음도 편안하게 해준다고 하네요.\n" +
                "리스트가 당신의 손을 잡고\n 숲속으로 안내해줄 것만 같은 피아노 선율을 느껴보세요.\n";
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