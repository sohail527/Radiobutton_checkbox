package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String a1,a2,a3,a4,a5,a6;
    TextView t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(TextView)findViewById(R.id.t1) ;
        t2=(TextView)findViewById(R.id.t2) ;
        t3=(TextView)findViewById(R.id.t3) ;
        t4=(TextView)findViewById(R.id.t4) ;
        t5=(TextView)findViewById(R.id.t5) ;
        t6=(TextView)findViewById(R.id.t6) ;

        a1=getIntent().getExtras().getString("a");
        a2=getIntent().getExtras().getString("b");
        a3=getIntent().getExtras().getString("c");
        a4=getIntent().getExtras().getString("d");
        a5=getIntent().getExtras().getString("e");
        a6=getIntent().getExtras().getString("f");

        t1.setText(a1);
        t2.setText(a2);
        t3.setText("Check1 "+a3);
        t4.setText("Check2 "+a4);
        t5.setText("Check3 "+a5);
        t6.setText("Check4 "+a6);
    }
}
