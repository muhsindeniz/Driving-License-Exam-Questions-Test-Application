package com.example.ehliyetsnavsorular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Subject extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

    }

    public void trafikadabi_git(View view){
        Intent trafikadabi = new Intent(Subject.this,TrafikAdabiKonulari.class);
        startActivity(trafikadabi);

        overridePendingTransition(R.anim.left_anim, R.anim.top_anim);
    }

    public void TrafikCevre_git(View view){
        Intent trafikadabi = new Intent(Subject.this,TrafikveCevreKonulari.class);
        startActivity(trafikadabi);
        overridePendingTransition(R.anim.left_anim, R.anim.top_anim);
    }

    public void AracTeknik_git(View view){
        Intent trafikadabi = new Intent(Subject.this,AracTeknikKonulari.class);
        startActivity(trafikadabi);
        overridePendingTransition(R.anim.left_anim, R.anim.top_anim);
    }

    public void IlkYardimBilgisi_git(View view){
        Intent trafikadabi = new Intent(Subject.this,IlkYardimBilgisi.class);
        startActivity(trafikadabi);
        overridePendingTransition(R.anim.left_anim, R.anim.top_anim);
    }

    public void yas(View view){
        Intent trafikadabi = new Intent(Subject.this,AracGostergePaneli.class);
        startActivity(trafikadabi);
    }

}
