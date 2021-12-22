package com.example.j2_edittextsquare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText IN,RES;
    Button CLR;
    int I,S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IN = (EditText) findViewById(R.id.N);
        RES = (EditText) findViewById(R.id.SN);
        CLR = (Button) findViewById(R.id.CL);

        RES.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if (IN.getText().length()==0){
                    Toast toast = Toast.makeText(getApplicationContext(), "Enter a Number in First EditText Widget and Touch the Second EditText Widget", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
                else {
                    I=Integer.parseInt(IN.getText().toString());
                    S = I * I;
                    RES.setText(String.valueOf(S));
                }
            }
        });

        CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IN.setText("");
                RES.setText("");
                I = 0;
                S = 0;
            }
        });
    }
}