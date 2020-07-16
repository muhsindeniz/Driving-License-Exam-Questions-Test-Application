package com.example.ehliyetsnavsorular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TrafikveCevreKonulari extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trafikve_cevre_konulari);

    }

    public void TrafikCevreKonu1(View view){
        Intent trafikcevre = new Intent(TrafikveCevreKonulari.this,SistemCercevesindeTrafikOrtami.class);
        startActivity(trafikcevre);
    }

    public void TrafikCevreKonu2(View view){
        Intent trafikcevre = new Intent(TrafikveCevreKonulari.this,SurucuDavranislarininEtkilenmesi.class);
        startActivity(trafikcevre);
    }

    public void TrafikCevreKonu3(View view){
        Intent trafikcevre = new Intent(TrafikveCevreKonulari.this,SurucuDavranislariniEtkileyenFaktorler.class);
        startActivity(trafikcevre);
    }

    public void TrafikCevreKonu4(View view){
        Intent trafikcevre = new Intent(TrafikveCevreKonulari.this,AlkolveSuruculuk.class);
        startActivity(trafikcevre);
    }

    public void TrafikCevreKonu5(View view){
        Intent trafikcevre = new Intent(TrafikveCevreKonulari.this,YorgunUykusuzAracKullanma.class);
        startActivity(trafikcevre);
    }

    public void TrafikCevreKonu6(View view){
        Intent trafikcevre = new Intent(TrafikveCevreKonulari.this,GuvenliSuruculukteYetenek.class);
        startActivity(trafikcevre);
    }

    public void TrafikCevreKonu7(View view){
        Intent trafikcevre = new Intent(TrafikveCevreKonulari.this,KuralihlaliAnalizi.class);
        startActivity(trafikcevre);
    }

}
