package com.ie.maria.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Definition of the objects

    private Button calculate;
    private TextView result;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creation and link of the logic objects with the UI
        calculate = (Button) findViewById(R.id.convert);
        result = (TextView) findViewById(R.id.result);
        input = (EditText) findViewById(R.id.money);

        //Methods/behaviors that we are calling from the Button class



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double converter = 1.13;
                double solution = 0.0;



                if(input.getText().toString().equals("")){

                    result.setText(R.string.error_emptyString);
                    result.setVisibility(view.VISIBLE);
                    result.setTextColor(Color.RED);


                }
                else{

                    double money = Double.parseDouble(input.getText().toString());

                    solution = money * converter;

                    result.setVisibility(view.VISIBLE);
                    result.setText(String.format("%.2f",solution)+" $");

                }




            }
        });
    }
}
