package com.example.ehliyetsnavsorular;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void konular(View view)
        {
            Intent konular = new Intent(MainActivity.this,Subject.class);
            startActivity(konular);
        }

        public void sorular(View view){
            Intent konular = new Intent(MainActivity.this,CikmisSorularTarih.class);
            startActivity(konular);
        }

        public void paylas(View view){
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Ehliyet Çıkmış Sorular 2020 -> Müfredata uyumlu ve resimlerle zenginleştirlmiş konu anlatımları ile en yeterli konuları öğrenebilir, çıkmış sorular ile öğrendiklerinizi pekiştirebilir ve sınavda başrının doruk noktasına ulaşabilirsiniz.  ");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        }

        public void iletisim(View view){
            AlertDialog.Builder ilet = new AlertDialog.Builder(this);
            ilet.setTitle(".::İletişim Bilgileri::.");
            ilet.setMessage("Instagram: muhsiindeniiz\nTwitter: muhsinndeniiz\nE-mail: mnknsro413@gmail.com");
            ilet.setIcon(R.drawable.contact);
            ilet.create().show();
        }

        public void plakalar(View view){
            Intent konular = new Intent(MainActivity.this,SehirPlakaKodlari.class);
            startActivity(konular);
        }

        public void belgeler(View view){
            Intent konular = new Intent(MainActivity.this,SurucuBelgeleri.class);
            startActivity(konular);
        }

        public void yas(View view){
            Intent konular = new Intent(MainActivity.this,AracGostergePaneli.class);
            startActivity(konular);
        }


}





















