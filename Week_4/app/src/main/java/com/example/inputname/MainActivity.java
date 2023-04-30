package com.example.inputname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputName;
    private TextView outputTextView;

    public void greetName (View view) {
        String yourName = inputName.getText().toString();
        outputTextView.setText(String.format("Hello %s", yourName));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputTextView = findViewById(R.id.outputTextView);
        inputName = findViewById(R.id.inputName);
        Button button = findViewById(R.id.submit);
        button.setOnClickListener(this::greetName);
    }
}