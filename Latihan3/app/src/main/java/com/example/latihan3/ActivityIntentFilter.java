package com.example.latihan3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityIntentFilter extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentfilter);
        Button btnSend = (Button) findViewById(R.id.sendMail);
        btnSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent si = new Intent(Intent.ACTION_SEND);
                si.setType("message/rfc822");
                si.putExtra(Intent.EXTRA_EMAIL, new String[]{"tirtasouja@gmail.com"});
                si.putExtra(Intent.EXTRA_SUBJECT, "Welcome to PNJ CBD Class");
                si.putExtra(Intent.EXTRA_TEXT, "Hi Students, Welcome to My Class");
                startActivity(Intent.createChooser(si, "Choose Mail App"));
            }
        });
    }
}
