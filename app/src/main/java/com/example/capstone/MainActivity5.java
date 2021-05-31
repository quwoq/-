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

public class MainActivity5 extends AppCompatActivity {
    ScrollView scrollView;
    TextView text1;
    TextView text2;
    ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        text1=findViewById(R.id.text1);
        image= findViewById(R.id.image);
        scrollView= findViewById(R.id.scrollView);
        button= findViewById(R.id.button);

        text2= findViewById(R.id.text2);
        String t2 =
                                "모차르트의 '노투르나'\n" +
                                "지금 누구보다 기분이 좋은 당신!\n" +
                                "항상 긍정적인 마인드로 사시는 분이시군요!\n" +
                                "오늘은 또 어떤 좋은 일이 있으셨나요?\n" +
                                "당신에게 어울리는 곡은 세레나데 6번 '노투르나’입니다.\n" +
                                "이 행복한 기분을 더 만끽하고 싶다면\n" +
                                "오늘의 즐거움을 더 지속하고 싶다면\n" +
                                "바이올린이 기뻐서 춤을 추는 듯한\n " +
                                "모차르트의 '노투루나’를 들어보는 것은 어떨까요?\n";
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