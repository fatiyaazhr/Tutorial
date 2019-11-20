package com.example.latihan2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityImageButton extends MainActivity{
    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_imagebutton);
        imgbutton =(ImageButton)findViewById(R.id.imageButton);
        imgbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You Klick The Image", Toast.LENGTH_LONG).show();
            }
        });
    }
}
