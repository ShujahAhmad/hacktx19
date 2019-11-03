package com.example.jpmorganapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pop extends Activity {
    String name1;
    String name2;
    String name3;
    int phone;
    int phone2;
    int phone3;

    EditText nameInput;
    EditText phoneInput;
    EditText nameInput2;
    EditText phoneInput2;
    EditText nameInput3;
    EditText phoneInput3;

    Button doneButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8),(int)(height*0.8));
        nameInput = (EditText) findViewById(R.id.nameInput);
        phoneInput = (EditText) findViewById(R.id.phoneInput);
        nameInput2 = (EditText) findViewById(R.id.nameInput2);
        phoneInput2 = (EditText) findViewById(R.id.phoneInput2);
        nameInput3 = (EditText) findViewById(R.id.nameInput3);
        phoneInput3 = (EditText) findViewById(R.id.phoneInput3);

        doneButton = (Button) findViewById(R.id.doneButton);
        doneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                name1 = nameInput.getText().toString();
                phone = Integer.valueOf(phoneInput.getText().toString());
                name2= nameInput2.getText().toString();
                phone2 = Integer.valueOf(phoneInput2.getText().toString());
                name3 = nameInput3.getText().toString();
                phone3 = Integer.valueOf(phoneInput3.getText().toString());
            }
        });
    }
}
