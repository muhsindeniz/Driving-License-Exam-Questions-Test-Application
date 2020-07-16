package com.example.ehliyetsnavsorular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TrafikAdabiKonulari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trafik_adabi_konulari);


    }

    public void TrafikAdabiKonu1(View view){
        Intent trafikadabi = new Intent(TrafikAdabiKonulari.this,SubjectTA.class);
        startActivity(trafikadabi);
    }

    public void TrafikAdabiKonu2(View view){
        Intent trafikadabii = new Intent(TrafikAdabiKonulari.this,SubjectTrafikteTemelDegerler.class);
        startActivity(trafikadabii);
    }

    public void TrafikAdabiKonu3(View view){
        Intent trafikadabii = new Intent(TrafikAdabiKonulari.this,SubjectTrafikteEmpati.class);
        startActivity(trafikadabii);
    }

    public void TrafikAdabiKonu4(View view){
        Intent trafikadabii = new Intent(TrafikAdabiKonulari.this,TrafikteHak.class);
        startActivity(trafikadabii);

    }

    public void TrafikAdabiKonu5(View view){
        Intent trafikadabii = new Intent(TrafikAdabiKonulari.this,SubjectTrafikteDavranis.class);
        startActivity(trafikadabii);
    }

}
