package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button button;
    public RadioGroup rdgroup;
    public RadioButton rdbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void check()
    {
        int radioid = rdgroup.getCheckedRadioButtonId();
        rdbutton=findViewById(radioid);
        Toast.makeText(c)
    }

}
