package com.example.hp.explicitintentproject;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);
        username=findViewById(R.id.edit1);
        password=findViewById(R.id.edit2);

        //transfer data using intents

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().length()>0 && password.getText().toString().length()>0) {

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("name", username.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Please enter your name and password",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
