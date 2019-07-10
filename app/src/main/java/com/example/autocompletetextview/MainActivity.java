package com.example.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

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

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Working fine..", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
