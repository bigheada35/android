package edu.kosmo.ssj;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import edu.kosmo.ssj.retrofit.RetrofitClient;
import edu.kosmo.ssj.retrofit.response.BoardResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseActivity extends AppCompatActivity {

 //   ImageView imageViewPrev;
  //  ImageView imageViewXIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setActionBar();

    }


    protected void setActionBar(){

        // Check ActionBar type
        boolean isTypeValid = true;

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View viewToolbar  = layoutInflater.inflate(R.layout.toolbar_type_prev_titie, null);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {

            //actionBar.setDisplayHomeAsUpEnabled는 자동으로 뒤로가기 버튼 생김
            //뒤로가기 버튼, 디폴트로 true만 해도 백버튼이 생김
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setDisplayShowCustomEnabled(true);

            //ActionBar 좌우에 여백 생기는 오류
            ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
            actionBar.setCustomView(viewToolbar, layoutParams);
            ((Toolbar) viewToolbar.getParent()).setContentInsetsAbsolute(0, 0);

     /*
            imageViewPrev = (ImageView) viewToolbar.findViewById(R.id.iv_prev);
            imageViewXIcon = (ImageView) viewToolbar.findViewById(R.id.iv_xicon);


            imageViewPrev.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            imageViewXIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
    */


        }
    }





}




