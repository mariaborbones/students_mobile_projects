package com.ie.maria.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private RadioGroup group;
    private RadioButton rbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group = (RadioGroup) findViewById(R.id.radiogroup);
        result = (TextView) findViewById(R.id.result);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                rbutton = (RadioButton) findViewById(i);
                result.setVisibility(View.VISIBLE);

                switch (rbutton.getId()){
                    case R.id.androidButton:{
                        result.setText("Android");
                        break;
                    }
                    case R.id.iOSButton:{
                        result.setText("iOS");
                        break;
                    }
                    case R.id.microsoftButton:{
                        result.setText("Windows");
                        break;
                    }}





            }
        });


    }
}
