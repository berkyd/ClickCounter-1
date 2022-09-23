package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int sz;
    private RelativeLayout layout;
    private Button Button1;
    private Button Button2;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sz++;
                textview.setText(String.valueOf(sz));
                if (sz<0){
                    textview.setTextColor(Color.RED);
                }else if (sz>0){
                    textview.setTextColor(Color.GREEN);
                }else{
                    textview.setTextColor(Color.BLUE);
                }
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sz--;
                textview.setText(String.valueOf(sz));
                if (sz<0){
                    textview.setTextColor(Color.RED);
                }else if (sz>0){
                    textview.setTextColor(Color.GREEN);
                }else{
                    textview.setTextColor(Color.BLUE);
                }
            }
        });

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("0");
                sz=0;
                textview.setTextColor(Color.BLUE);
            }
        });

    }
        private void init(){
            layout=findViewById(R.id.layout);
            Button1=findViewById(R.id.Button1);
            Button2=findViewById(R.id.Button2);
            textview=findViewById(R.id.textview);
        }
}
