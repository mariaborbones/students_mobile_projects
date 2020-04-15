package com.ie.maria.checkboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private Button submitButton;
    private CheckBox c1;
    private CheckBox c2;
    private CheckBox c3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        submitButton = (Button) findViewById(R.id.button);
        c1 = (CheckBox) findViewById(R.id.study);
        c2 = (CheckBox) findViewById(R.id.party);
        c3 = (CheckBox) findViewById(R.id.shopping);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setVisibility(View.VISIBLE);

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(c1.getText().toString() + " status is: "+c1.isChecked() + "\n");
                stringBuilder.append(c2.getText().toString() + " status is: "+c2.isChecked() + "\n");
                stringBuilder.append(c3.getText().toString() + " status is: "+c3.isChecked() + "\n");

                result.setText(stringBuilder);


            }});

    }
}
