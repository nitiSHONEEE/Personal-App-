package com.example.makecall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView2,imageView4;
    Button button,button2;
    Button btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView2 = findViewById(R.id.imageView2);
        imageView4 = findViewById(R.id.imageView4);
        button = findViewById(R.id.button);
        btn4= findViewById(R.id.btn4);
        button2=findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    imageView4.setImageResource(R.drawable.first);
                }



        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView4.setImageResource(R.drawable.fourth);
            }
        });
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity2.this,com.example.makecall.MainActivity.class);
                }
            });
    }
}