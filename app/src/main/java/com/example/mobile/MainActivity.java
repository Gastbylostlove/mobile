package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button restarunt = findViewById(R.id.restarunt);

        restarunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),restarunt.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });


        Button cafe = findViewById(R.id.cafe);

        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),cafe.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });

        Button cvs = findViewById(R.id.cvs);

        cvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),cvs.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });

        Button medicine = findViewById(R.id.medicine);

        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),medicine.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });

        Button education = findViewById(R.id.education);

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),education.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });

        Button beauty = findViewById(R.id.beauty);

        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),beauty.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });

        Button culture = findViewById(R.id.culture);

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),culture.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });

        Button circulation = findViewById(R.id.circulation);

        circulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),circulation.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });

        Button etc = findViewById(R.id.etc);

        etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),etc.class);//music으로 이동
                startActivity(intent);//액티비티 이동
            }
        });





    }
}