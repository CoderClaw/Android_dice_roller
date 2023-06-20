package com.coderclaw.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    EditText NumPicker_min, NumPicker_max, Num_diceRoll;
    Button Btn_roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumPicker_min = (EditText) findViewById(R.id.IdNumb_min);
        NumPicker_max = (EditText) findViewById(R.id.IdNumb_max);
        Num_diceRoll = (EditText) findViewById(R.id.IdNum_dice);

        Btn_roll = (Button) findViewById(R.id.IdBtn_roll);

        Btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numMin = NumPicker_min.getText().toString();
                String numMax = NumPicker_max.getText().toString();
               Integer diceRoll = (int)(Math.random() * (Integer.parseInt(numMax) - Integer.parseInt(numMin))) + Integer.parseInt(numMin);
               Num_diceRoll.setText(diceRoll.toString());
            }
        });
    }
}