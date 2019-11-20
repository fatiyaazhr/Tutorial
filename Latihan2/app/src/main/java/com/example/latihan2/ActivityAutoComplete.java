package com.example.latihan2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ActivityAutoComplete extends MainActivity {
    AutoCompleteTextView autocmplt;
    // pembuatan array
    String[] arr = {"Aditia Got Cha", "Kulsum", "Daffa Ahmad", "Edgard" +
            "Jeremiah", "Farid", "Felix", "Haidar", "Raihan", "Rakha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_autocomplete);
        autocmplt = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, arr);
        autocmplt.setThreshold(2);
        autocmplt.setAdapter(adapter);
    }
}
