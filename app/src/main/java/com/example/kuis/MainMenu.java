package com.example.kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {

    ImageView iv_mapel1, iv_mapel2, iv_mapel3, iv_mapel4, iv_mapel5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        OnClickListener();
        setInisialisasi();
    }

    private void OnClickListener(){
         iv_mapel1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent (MainMenu.this,mapel1.class);
             }
         });
         iv_mapel2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainMenu.this,mapel2.class);
             }
         });
        iv_mapel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,mapel3.class);
            }
        });
        iv_mapel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,mapel4.class);
            }
        });
        iv_mapel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this,mapel5.class);
            }
        });
    }




    private void setInisialisasi(){
        iv_mapel1=(ImageView) findViewById(R.id.mapel1);
        iv_mapel2=(ImageView) findViewById(R.id.mapel2);
        iv_mapel3=(ImageView) findViewById(R.id.mapel3);
        iv_mapel4=(ImageView) findViewById(R.id.mapel4);
        iv_mapel5=(ImageView) findViewById(R.id.mapel5);
    }
}