package com.example.ehliyetsnavsorular;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CikmisSorularTarih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cikmis_sorular_tarih);

    }

    public void ImageBtn0000(View view){
        Intent sorular = new Intent(CikmisSorularTarih.this,Agustos_Sekiz.class);
        startActivity(sorular);
    }


    public void ImageBtn0001(View view){
        Intent sorular = new Intent(CikmisSorularTarih.this,Nisan_Sekiz.class);
        startActivity(sorular);
    }

    public void ImageBtn0002(View view){
        Intent sorular = new Intent(CikmisSorularTarih.this,Subat_Sekiz.class);
        startActivity(sorular);
    }


}
