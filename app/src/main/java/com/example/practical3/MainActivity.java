package com.example.practical3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString() != null){
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("name",editText.getText().toString());
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"please enter your name",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}