package com.ie.maria.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton tbutton;
    private ImageView lamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbutton = (ToggleButton) findViewById(R.id.toggleButton);
        lamp = (ImageView) findViewById(R.id.lamp);

        tbutton.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                        if(b){ //toggle is enabled
                            lamp.setBackgroundResource(R.drawable.encendida);
                        }else{ //toggle is not enabled
                            lamp.setBackgroundResource(R.drawable.apagada);
                        }



                        }});

    }
}
