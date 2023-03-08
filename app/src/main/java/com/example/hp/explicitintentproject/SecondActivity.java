package com.example.hp.explicitintentproject;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView textView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.txt);
        button=findViewById(R.id.btn);

        //retrieve data from intents

        String name =getIntent().getStringExtra("name");
        textView.append(name+"!");

        //starting activity for result
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
                startActivityForResult(i,1);
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1&&resultCode==RESULT_OK){
            String profession=data.getStringExtra("profession");
            textView.append("\nYou are "+profession+"!");
        }
    }
}
