package com.example.makecall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnContactme,btnWeb,btnMap,btnProj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContactme=findViewById(R.id.btnContactme);
        btnMap=findViewById(R.id.btnMap);
        btnWeb=findViewById(R.id.btnWeb);
        btnProj=findViewById(R.id.btnProj);

        btnContactme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8106300755"));
                startActivity(intent);
            }
        });
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=H.NO, 8-51/D, Gayatri Nagar, Dwaraka Nagar, Bhagya Nagar Colony, Boduppal, Hyderabad, Telangana 500092"));
                    startActivity(intent);
            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nitiSHONEEE"));
                startActivity(intent);
            }
        });
        btnProj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,com.example.makecall.MainActivity2.class);
                startActivity(intent);
            }
        });


    }
}