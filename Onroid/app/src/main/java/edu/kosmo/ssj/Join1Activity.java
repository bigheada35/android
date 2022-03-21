package edu.kosmo.ssj;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Join1Activity extends BaseActivity {


    private boolean termsAgree = false;
    private boolean privateInfoAgree = false;

    private TextView termsTextView;
    private TextView policyTextView;
    private ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_join_1);



        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_join_1);

        termsTextView = (TextView)findViewById(R.id.terms);
        termsTextView.setMovementMethod(new ScrollingMovementMethod());

        policyTextView = (TextView) findViewById(R.id.user_info_policy);
        policyTextView.setMovementMethod(new ScrollingMovementMethod());
        scrollView = (ScrollView)findViewById(R.id.join_scroll);


        termsTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                scrollView.requestDisallowInterceptTouchEvent(true);
                //스크롤뷰가 텍스트뷰의 터치이벤트를 가져가지 못하게 함
                return false;
            }
        });

        policyTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                scrollView.requestDisallowInterceptTouchEvent(true);
                //스크롤뷰가 텍스트뷰의 터치이벤트를 가져가지 못하게 함
                return false;
            }
        });

        findViewById(R.id.bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(termsAgree == true && privateInfoAgree == true) {

                    Intent intent = new Intent(Join1Activity.this, Join2Activity.class);
                   startActivity(intent);
                }else{
                    Toast.makeText(Join1Activity.this, getString(R.string.join_agree_guide), Toast.LENGTH_SHORT ).show();
                }


            }
        });

        //토글 시키기
        findViewById(R.id.user_info_agree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((CheckedTextView)v).toggle();
                privateInfoAgree = ((CheckedTextView)v).isChecked();
            }
        });

        //토글 시키기
        findViewById(R.id.user_terms_agree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((CheckedTextView)v).toggle();
                termsAgree = ((CheckedTextView)v).isChecked();
            }
        });





    }



}