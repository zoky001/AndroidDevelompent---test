package com.kizo.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Button bt;
    String myString ="this is my message";
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




       bt = (Button)findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //prikaz setksta u textViev-u
                myTextView = (TextView) findViewById(R.id.textView3);

                myTextView.setText(myString);

                /*
                otvaranje novog prozora

               Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntent);*/

            }
        });

    }
}
