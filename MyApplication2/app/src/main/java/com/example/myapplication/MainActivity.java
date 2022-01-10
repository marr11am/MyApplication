package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView output;
    EditText input;
    Button change_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.output);
        input = findViewById(R.id.input);
        change_text = findViewById(R.id.change_text);

        change_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = input.getText().toString();
                output.setText(str);

               }
        });


    }
}