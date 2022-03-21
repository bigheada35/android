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

public class Join2Activity extends BaseActivity {

    private EditText editTextID;
    private EditText editTextPW;
    private EditText editTextPWC;
    private EditText editTextEMAIL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_2);

        editTextID = (EditText)findViewById(R.id.id);
        editTextPW = (EditText)findViewById(R.id.password);
        editTextPWC = (EditText)findViewById(R.id.password_confirm);
        editTextEMAIL = (EditText)findViewById(R.id.email);

        findViewById(R.id.bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //remove white space
                editTextID.setText(editTextID.getText().toString().replaceAll("\\s+",""));
                editTextPW.setText(editTextPW.getText().toString().replaceAll("\\s+",""));
                editTextPWC.setText(editTextPWC.getText().toString().replaceAll("\\s+",""));
                editTextEMAIL.setText(editTextEMAIL.getText().toString().replaceAll("\\s+",""));

                JoinApplication joinApp = (JoinApplication)getApplicationContext();
                joinApp.setPassword(editTextPW.getText().toString());
                joinApp.setUsername(editTextID.getText().toString());
                joinApp.setEmail(editTextEMAIL.getText().toString());

                Intent intent = new Intent(Join2Activity.this, Join3Activity.class);
                startActivity(intent);
            }
        });


    }
}