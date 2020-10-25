package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public RadioGroup rdgroup1,rdgroup2;
    public RadioButton rdbutton1,rdbutton2;
    public CheckBox chbox1,chbox2,chbox3,chbox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgroup1=(RadioGroup)findViewById(R.id.radio1);
        rdgroup2=(RadioGroup)findViewById(R.id.radio2);

        chbox1=(CheckBox) findViewById(R.id.ch1);
        chbox2=(CheckBox) findViewById(R.id.ch2);
        chbox3=(CheckBox) findViewById(R.id.ch3);
        chbox4=(CheckBox) findViewById(R.id.ch4);

        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });

    }
    public void openActivity2()
    {
        int i,j;
        boolean b1,b2,b3,b4;
        String s1,s2,s3,s4,s5,s6;
        i=rdgroup1.getCheckedRadioButtonId();
        j=rdgroup2.getCheckedRadioButtonId();
        rdbutton1=(RadioButton)findViewById(i);
        rdbutton2=(RadioButton)findViewById(j);
        s1=rdbutton1.getText().toString();
        s2=rdbutton2.getText().toString();
        b1=chbox1.isChecked();
        b2=chbox2.isChecked();
        b3=chbox3.isChecked();
        b4=chbox4.isChecked();
        s3=checker(b1);
        s4=checker(b2);
        s5=checker(b3);
        s6=checker(b4);
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("a",s1);
        intent.putExtra("b",s2);
        intent.putExtra("c",s3);
        intent.putExtra("d",s4);
        intent.putExtra("e",s5);
        intent.putExtra("f",s6);
        startActivity(intent);
    }

    public String checker(boolean b)
    {
        if(b==false)
        {return "not Checked";}
        else{
            return  "checked";
        }
    }


}
