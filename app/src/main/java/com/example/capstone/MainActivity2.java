package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    TextView t_q;
    TextView t_number;
    ImageView image1;
    Button b_aa;
    Button b_ab;
    ProgressBar progress_bar;
    int num=1;
    int score_a;
    int score_b;
    List<String> number;
    List<String> question;
    List<String> asa;
    List<String> asb;

    /*  ArrayList<Drawable> drawableList = new ArrayList<Drawable>(); // drawable 배열   */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t_q = findViewById(R.id.t_q); //질문이 나오는 텍스트뷰
        image1 = findViewById(R.id.image);
        b_aa = findViewById(R.id.b_aa); //a 경우가 나오는 버튼
        b_ab = findViewById(R.id.b_ab); //b 경우가 나오는 버튼
        progress_bar = findViewById(R.id.progress_bar);
        t_number = findViewById(R.id.t_number);



        number = new ArrayList<>();
        number.add("1번");
        number.add("2번");
        number.add("3번");
        number.add("4번");
        number.add("5번");
        number.add("6번");
        number.add("7번");
        number.add("8번");
        number.add("9번");
        number.add("10번");
        t_number.setText(number.get(0));


        question = new ArrayList<>();
        question.add("바쁜 일상에 지친 당신,\n 자유가 주어진다면 무엇을 하고 싶나요?");
        question.add("당신은 말 많은 사람과 있으면 어떤가요?");
        question.add("카페에 가서 자주 시키는 음료는?");
        question.add("공원에 예쁜 꽃들이 피어 있습니다.\n 무슨 꽃이 피어있을까?");
        question.add("지나가는 사람에게서 좋은 향수 향이 납니다.\n 어떤 향일까요?");
        question.add("오늘 하루를 평가하자면?");
        question.add("현재 기분 날씨로 평가하자면?");
        question.add("일기예보에 비가 온다고 했지만 날이 맑습니다.\n 우산을 챙길까요?");
        question.add("오랜만에 카페에 가서 책을 읽으려고 합니다.\n 어떤 책을 읽을까요?");
        question.add("내일은 어떤 하루가 되기를 바라시나요?");
        t_q.setText(question.get(0));



        asa = new ArrayList<>();
        asa.add("매일매일 바쁘게 살았으니\n 오늘은 좀 집에서 쉬어야겠다.");
        asa.add("주로 들어주는 편이다.");
        asa.add("아메리카노");
        asa.add("수국");
        asa.add("시원한 향");
        asa.add("힘들지만 만족스러운 하루");
        asa.add("비올 것 같은 날씨");
        asa.add("챙긴다.");
        asa.add("교양서적");
        asa.add("좋아하는 사람들을 만나는 하루");
        b_aa.setText(asa.get(0));

        asb = new ArrayList<>();
        asb.add("오랜만에 쉬는 날이니\n 밖에 나가서 신나게 놀아야지!");
        asb.add("대화는 티키타카!");
        asb.add("카페라테");
        asb.add("라일락");
        asb.add("상큼한 과일 향");
        asb.add("만족스럽지는 않지만 즐거운 하루");
        asb.add("맑은 날씨");
        asb.add("안 챙긴다.");
        asb.add("소설");
        asb.add("일을 완벽하게 끝내는 하루");
        b_ab.setText(asb.get(0));
    }

    public void onClick(View v){
        Intent i1 = null;
        switch (v.getId()) {
            case R.id.b_aa:
                if(num<10){
                    score_a=score_a+1;
                    t_number.setText(number.get(num));
                    t_q.setText(question.get(num));
                    b_aa.setText(asa.get(num));
                    b_ab.setText(asb.get(num));

                    /*  image1.setImageDrawable(drawableList.get(num)); // 이미지뷰 추가 */

                    num=num+1;
                    progress_bar.setProgress(num); // 프로그레스바 추가 구문
                    break;
                }else if(num==10) {
                    score_a=score_a+1;
                    i1 = new Intent(this, MainActivity3.class);
                    i1.putExtra("score_a",score_a);
                    i1.putExtra("score_b",score_b);
                    startActivityForResult(i1, 1);
                    num=1;
                    score_a=0;
                    score_b=0;
                    break;
                }

            case R.id.b_ab:
                if(num<10){
                    score_b=score_b+1;
                    t_number.setText(number.get(num));
                    t_q.setText(question.get(num));
                    b_aa.setText(asa.get(num));
                    b_ab.setText(asb.get(num));

                    /* image1.setImageDrawable(drawableList.get(num)); // 이미지뷰 추  */

                    num=num+1;
                    progress_bar.setProgress(num); // 프로그레스바 추가 구문
                    break;
                }else if(num==10) {
                    score_b=score_b+1;
                    i1 = new Intent(this, MainActivity3.class);
                    i1.putExtra("score_a",score_a);
                    i1.putExtra("score_b",score_b);
                    startActivityForResult(i1, 1);
                    num=1;
                    score_a=0;
                    score_b=0;
                    break;
                }
        }
    }
}