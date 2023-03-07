package com.example.hp.explicitintentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
Button button;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        button=findViewById(R.id.btn);
        editText=findViewById(R.id.edit1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent();
                String message=editText.getText().toString();
                i.putExtra("profession",message);
                setResult(RESULT_OK,i);
                finish();
            }
        });


    }
}
