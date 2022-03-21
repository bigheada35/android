package edu.kosmo.ssj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import edu.kosmo.ssj.retrofit.BoardService;
import edu.kosmo.ssj.retrofit.RetrofitClient;
import edu.kosmo.ssj.retrofit.response.BoardResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    private TextView tv_join;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_intro);

        //startActivity(new Intent(MainActivity.this, IntroActivity.class));
        //finish();

        getBoard(9601);


        setContentView(R.layout.activity_intro);

        // 타이틀바 숨기기
        getSupportActionBar().hide();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_intro);

        tv_join = (TextView) findViewById(R.id.tv_join);

        tv_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IntroActivity.class);
                startActivity(intent);
            }
        });



    }



    private void getBoard(int bid){


        Call<BoardResponse> call = RetrofitClient.getClient().create(BoardService.class).getBoard(bid);

        call.enqueue(new Callback<BoardResponse>() {
            @Override
            public void onResponse(Call<BoardResponse> call, Response<BoardResponse> response) {

                if(response.isSuccessful()) {
                    try {
                        BoardResponse boardResponse = response.body();
                        Log.i("리트로픽", boardResponse.toString());

                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this, getString(R.string.join_error), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, getString(R.string.join_error), Toast.LENGTH_SHORT).show();
                }
            }
            //시스템,인터넷끊김 등의 통신실패
            @Override
            public void onFailure(Call<BoardResponse> call, Throwable t) {
                Log.i("리트로픽", t.toString());
                Toast.makeText(MainActivity.this, getString(R.string.network_error), Toast.LENGTH_SHORT).show();
            }
        });





    }




}




