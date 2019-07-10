package com.example.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String [] values={"Ram","Shyam","Rajesh","ramiz"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autotext);
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,values);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

    }
}
