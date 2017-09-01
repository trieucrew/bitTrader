package com.android.bittrader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Character investor;
    private Button exercise;
    private Button research;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        investor = new Investor();
        exercise = (Button) findViewById(R.id.exercise);
        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                investor.exercise();
                TextView health= (TextView)findViewById(R.id.health);
                health.setText("Health: " + investor.getHealth());
            }
        });

        research = (Button) findViewById(R.id.research);
        research.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                investor.research();
                TextView knowledge = (TextView) findViewById(R.id.knowledge);
                knowledge.setText("Knowledge" + investor.getKnowledge());
            }
        });
    }
}
