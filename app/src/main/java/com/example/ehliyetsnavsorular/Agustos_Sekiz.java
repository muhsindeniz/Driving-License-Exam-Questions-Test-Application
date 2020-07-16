package com.example.ehliyetsnavsorular;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Timer;

public class Agustos_Sekiz extends AppCompatActivity {

    private Timer timer = new Timer();
    TextView time;

    long mMilliseconds = 2700000;
    SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat("HH:mm:ss");
    TextView mTextView;

    CountDownTimer mCountDownTimer = new CountDownTimer(mMilliseconds, 1000) {
        @Override
        public void onFinish() {
            mTextView.setText(mSimpleDateFormat.format(0));

            if ((dogru * 2) > 70) {
                durum = "Tebrikler Sınavı Kazandınız";
            } else {
                durum = "Sınavı Geçemediniz!";
            }

            AlertDialog.Builder mesaj = new AlertDialog.Builder(Agustos_Sekiz.this);
            mesaj.setTitle("Sonuçlar");
            mesaj.setIcon(R.drawable.resulticon);
            mesaj.setMessage("Puanınız: " + dogru * 2 + "\n" + durum + "\nDoğru Sayısı: " + dogru + "\nYanlış Sayısı: " + yanlis);


            mesaj.setPositiveButton("TEKRAR ÇÖZ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent git = new Intent(Agustos_Sekiz.this, Agustos_Sekiz.class);
                    startActivity(git);
                }
            });


            mesaj.setNegativeButton("ANASAYFA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent git = new Intent(Agustos_Sekiz.this, MainActivity.class);
                    startActivity(git);
                }
            });

            mesaj.create().show();

        }

        public void onTick(long millisUntilFinished) {
            mTextView.setText(mSimpleDateFormat.format(millisUntilFinished));
        }
    };


    Button CevapA;
    Button CevapB;
    Button CevapC;
    Button CevapD;

    int soru = 1;
    int dogru = 0;
    int yanlis = 0;
    String durum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agustos__sekiz);

        CevapA = findViewById(R.id.button0001);
        CevapB = findViewById(R.id.button0002);
        CevapC = findViewById(R.id.button0003);
        CevapD = findViewById(R.id.button0004);
        CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
        CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
        CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
        CevapD.setBackgroundColor(Color.rgb(54, 78, 74));

        final AlertDialog.Builder mesaj = new AlertDialog.Builder(this);
        mesaj.setTitle("04.08.2018 Çıkmış Sorular");
        mesaj.setMessage("HAZIRSAN BAŞLA..");
        mesaj.setIcon(R.drawable.testicon);
        mesaj.setNegativeButton("ANASAYFA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent git = new Intent(Agustos_Sekiz.this, MainActivity.class);
                startActivity(git);
            }
        });

        mesaj.setPositiveButton("Başla", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(Agustos_Sekiz.this, "Sınav Başladı..", Toast.LENGTH_LONG).show();

                mSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                mTextView = findViewById(R.id.sure);
                mCountDownTimer.start();
            }
        });

        mesaj.create().show();
    }


    @Override
    protected void onStart() {
        super.onStart();

        CevapA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (soru == 1) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 2) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1) {
                        yanlis = yanlis + 1;
                    }

                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 3) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2) {
                        yanlis = yanlis + 1;
                    }

                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);

                }

                if (soru == 4) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 5) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis==4) {
                        yanlis = yanlis + 1;
                    }

                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 6) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 7) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 8) {

                    CevapA.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 9) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 10) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 11) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 12) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis==11) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 13) {

                    CevapA.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 14) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapA.setClickable(false);
                }

                if (soru == 15) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 16) {

                    CevapA.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 17) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 18) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 19) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 20) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 21) {

                    CevapA.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 22) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 23) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 24) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 25) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis==24) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapA.setClickable(false);
                }

                if (soru == 26) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 27) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapA.setClickable(false);
                }

                if (soru == 28) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 29) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 30) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru==29) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 31) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 32) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 33) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis==32) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapA.setClickable(false);
                }

                if (soru == 34) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 35) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 36) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 37) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);
                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis==36) {
                        yanlis = yanlis + 1;
                    }

                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 38) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 39) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 40) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 41) {
                    CevapA.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapA.setClickable(false);
                }

                if (soru == 42) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 43) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 44) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 45) {

                    CevapA.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42 || dogru == 43 || dogru == 44) {
                        dogru = dogru + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 46) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 47) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapA.setClickable(false);
                }

                if (soru == 48) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46 || yanlis == 47) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 49) {

                    CevapA.setBackgroundColor(Color.GREEN);

                    if (dogru == 48) {
                        yanlis = yanlis + 1;
                    }
                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 50) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46 || yanlis == 47 || yanlis == 48 || yanlis == 49) {
                        yanlis = yanlis + 1;
                    }

                    if ((dogru * 2) >= 70) {
                        durum = "Tebrikler Sınavı Kazandınız";
                    } else {
                        durum = "Sınavı Geçemediniz!";
                    }

                    AlertDialog.Builder mesaj = new AlertDialog.Builder(Agustos_Sekiz.this);
                    mesaj.setTitle("Sonuçlar");
                    mesaj.setIcon(R.drawable.resulticon);
                    mesaj.setMessage("Puanınız: " + dogru * 2 + "\n" + durum + "\nDoğru Sayısı: " + dogru + "\nYanlış Sayısı: " + yanlis);


                    mesaj.setPositiveButton("TEKRAR ÇÖZ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, Agustos_Sekiz.class);
                            startActivity(git);
                        }
                    });


                    mesaj.setNegativeButton("ANASAYFA", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, MainActivity.class);
                            startActivity(git);
                        }
                    });


                    Toast.makeText(Agustos_Sekiz.this, "SINAV BİTTİ..", Toast.LENGTH_LONG).show();

                    mSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    mTextView = findViewById(R.id.sure);
                    mCountDownTimer.cancel();

                    mesaj.create().show();

                    CevapB.setClickable(false);
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

            }
        });


        CevapB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (soru == 1) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);

                }

                if (soru == 2) {

                    CevapB.setBackgroundColor(Color.GREEN);
                    if (dogru == 0 || dogru == 1) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }


                if (soru == 3) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 4) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 5) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);

                }


                if (soru == 6) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 7) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 8) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 9) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 10) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 11) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }


                if (soru == 12) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 13) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }


                if (soru == 14) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 15) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis==14) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 16) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 17) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 18) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 19) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 20) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }


                if (soru == 21) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 22) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 23) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 24) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 25) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 26) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 27) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }

                if (soru == 28) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 29) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 30) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 31) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }

                if (soru == 32) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }

                if (soru == 33) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 34) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }

                if (soru == 35) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 36) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35) {
                        dogru = dogru + 1;

                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 37) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 38) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 39) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 40) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 41) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 42) {
                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 43) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                }

                if (soru == 44) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42 || dogru == 43) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 45) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 46) {

                    CevapB.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42 || dogru == 43 || dogru == 44 || dogru == 45) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 47) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 48) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46 || yanlis == 47) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 49) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46 || yanlis == 47 || yanlis == 48) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 50) {


                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42 || dogru == 43 || dogru == 44 || dogru == 45 || yanlis == 46 || yanlis == 47 || yanlis == 48 || yanlis == 49) {
                        dogru = dogru + 1;
                    }

                    if ((dogru * 2) > 70) {
                        durum = "Tebrikler Sınavı Kazandınız";
                    } else {
                        durum = "Sınavı Geçemediniz!";
                    }

                    AlertDialog.Builder mesaj = new AlertDialog.Builder(Agustos_Sekiz.this);
                    mesaj.setTitle("Sonuçlar");
                    mesaj.setIcon(R.drawable.resulticon);
                    mesaj.setMessage("Puanınız: " + dogru * 2 + "\n" + durum + "\nDoğru Sayısı: " + dogru + "\nYanlış Sayısı: " + yanlis);


                    mesaj.setNegativeButton("ANASAYFA", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, MainActivity.class);
                            startActivity(git);
                        }
                    });

                    mesaj.setPositiveButton("TEKRAR ÇÖZ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, Agustos_Sekiz.class);
                            startActivity(git);
                        }
                    });

                    Toast.makeText(Agustos_Sekiz.this, "SINAV BİTTİ..", Toast.LENGTH_LONG).show();

                    mSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    mTextView = findViewById(R.id.sure);
                    mCountDownTimer.cancel();

                    mesaj.create().show();
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

            }
        });

        CevapC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (soru == 1) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 2) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1) {
                        yanlis = yanlis + 1;

                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 3) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 4) {

                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 3) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);

                }


                if (soru == 5) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);

                }


                if (soru == 6) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);

                }

                if (soru == 7) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6) {
                        dogru = dogru + 1;
                    }

                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 8) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 9) {

                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8) {
                        dogru = dogru + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 10) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 11) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10) {
                        yanlis = yanlis + 1;
                    }

                    CevapC.setClickable(false);
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 12) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 13) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 14) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 15) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 16) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 17) {

                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16) {
                        dogru = dogru + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 18) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 19) {
                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18) {
                        dogru = dogru + 1;
                    }

                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 20) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 21) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 22) {

                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 23) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 24) {

                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 25) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 26) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 27) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 28) {
                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 29) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 30) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 31) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 32) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 33) {
                    CevapC.setBackgroundColor(Color.GREEN);
                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 34) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 35) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 36) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 37) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 38) {
                    CevapC.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 39) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 40) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 41) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 42) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 43) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 44) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 45) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 46) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 47) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 48) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);
                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42 || dogru == 43 || dogru == 44 || dogru == 45 || dogru == 46 || dogru == 47) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 49) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46 || yanlis == 47 || yanlis == 48) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 50) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46 || yanlis == 47 || yanlis == 48 || yanlis == 49) {
                        yanlis = yanlis + 1;
                    }


                    if ((dogru * 2) > 70) {
                        durum = "Tebrikler Sınavı Kazandınız";
                    } else {
                        durum = "Sınavı Geçemediniz!";
                    }


                    AlertDialog.Builder mesaj = new AlertDialog.Builder(Agustos_Sekiz.this);
                    mesaj.setTitle("Sonuçlar");
                    mesaj.setIcon(R.drawable.resulticon);
                    mesaj.setMessage("Puanınız: " + dogru * 2 + "\n" + durum + "\nDoğru Sayısı: " + dogru + "\nYanlış Sayısı: " + yanlis);


                    mesaj.setNegativeButton("ANASAYFA", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, MainActivity.class);
                            startActivity(git);
                        }
                    });

                    mesaj.setPositiveButton("TEKRAR ÇÖZ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, Agustos_Sekiz.class);
                            startActivity(git);
                        }
                    });


                    Toast.makeText(Agustos_Sekiz.this, "SINAV BİTTİ..", Toast.LENGTH_LONG).show();

                    mSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    mTextView = findViewById(R.id.sure);
                    mCountDownTimer.cancel();


                    mesaj.create().show();

                    CevapA.setClickable(false);
                    CevapC.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);

                }
            }


        });


        CevapD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (soru == 1) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 2) {

                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1) {
                        yanlis = yanlis + 1;

                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 3) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 4) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 5) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);

                }


                if (soru == 6) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 7) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);

                }

                if (soru == 8) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 9) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 10) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis==9) {
                        yanlis = yanlis + 1;
                    }


                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 11) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 12) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11) {
                        dogru = dogru + 1;
                    }

                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 13) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 14) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis==13) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 15) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14) {
                        dogru = dogru + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 16) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 17) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }


                if (soru == 18) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 19) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);

                }


                if (soru == 20) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis==19) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }


                if (soru == 21) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 22) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 23) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis==22) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 24) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 25) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 26) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 27) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 28) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 29) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 30) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 31) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 32) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 33) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 34) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 35) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);


                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis==34) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                    CevapD.setClickable(false);
                }

                if (soru == 36) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 37) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 38) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 39) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis==38) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 40) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 41) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.GREEN);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 42) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 43) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 44) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 45) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 46) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 47) {
                    CevapA.setBackgroundColor(Color.RED);
                    CevapB.setBackgroundColor(Color.GREEN);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis==46) {
                        yanlis = yanlis + 1;
                    }

                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 48) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42 || dogru == 43 || dogru == 44 || dogru == 45 || dogru == 46 || dogru == 47) {
                        dogru = dogru + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 49) {
                    CevapA.setBackgroundColor(Color.GREEN);
                    CevapB.setBackgroundColor(Color.RED);
                    CevapC.setBackgroundColor(Color.RED);
                    CevapD.setBackgroundColor(Color.RED);

                    if (yanlis == 0 || yanlis == 1 || yanlis == 2 || yanlis == 3 || yanlis == 4 || yanlis == 5 || yanlis == 6 || yanlis == 7 || yanlis == 8 || yanlis == 9 || yanlis == 10 || yanlis == 11 || yanlis == 12 || yanlis == 13 || yanlis == 14 || yanlis == 15 || yanlis == 16 || yanlis == 17 || yanlis == 18 || yanlis == 19 || yanlis == 20 || yanlis == 21 || yanlis == 22 || yanlis == 23 || yanlis == 24 || yanlis == 25 || yanlis == 26 || yanlis == 27 || yanlis == 28 || yanlis == 29 || yanlis == 30 || yanlis == 31 || yanlis == 32 || yanlis == 33 || yanlis == 34 || yanlis == 35 || yanlis == 36 || yanlis == 37 || yanlis == 38 || yanlis == 39 || yanlis == 40 || yanlis == 41 || yanlis == 42 || yanlis == 43 || yanlis == 44 || yanlis == 45 || yanlis == 46 || yanlis == 47 || yanlis == 48) {
                        yanlis = yanlis + 1;
                    }
                    CevapA.setClickable(false);
                    CevapB.setClickable(false);
                    CevapD.setClickable(false);
                    CevapC.setClickable(false);
                }

                if (soru == 50) {
                    CevapD.setBackgroundColor(Color.GREEN);

                    if (dogru == 0 || dogru == 1 || dogru == 2 || dogru == 3 || dogru == 4 || dogru == 5 || dogru == 6 || dogru == 7 || dogru == 8 || dogru == 9 || dogru == 10 || dogru == 11 || dogru == 12 || dogru == 13 || dogru == 14 || dogru == 15 || dogru == 16 || dogru == 17 || dogru == 18 || dogru == 19 || dogru == 20 || dogru == 21 || dogru == 22 || dogru == 23 || dogru == 24 || dogru == 25 || dogru == 26 || dogru == 27 || dogru == 28 || dogru == 29 || dogru == 30 || dogru == 31 || dogru == 32 || dogru == 33 || dogru == 34 || dogru == 35 || dogru == 36 || dogru == 37 || dogru == 38 || dogru == 39 || dogru == 40 || dogru == 41 || dogru == 42 || dogru == 43 || dogru == 44 || dogru == 45 || dogru == 46 || dogru == 47 || dogru == 48 || dogru == 49) {
                        dogru = dogru + 1;
                    }


                    if ((dogru * 2) > 70) {
                        durum = "Tebrikler Sınavı Kazandınız";
                    } else {
                        durum = "Sınavı Geçemediniz!";
                    }


                    AlertDialog.Builder mesaj = new AlertDialog.Builder(Agustos_Sekiz.this);
                    mesaj.setTitle("Sonuçlar");
                    mesaj.setIcon(R.drawable.resulticon);
                    mesaj.setMessage("Puanınız: " + dogru * 2 + "\n" + durum + "\nDoğru Sayısı: " + dogru + "\nYanlış Sayısı: " + yanlis);

                    mesaj.setNegativeButton("ANASAYFA", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, MainActivity.class);
                            startActivity(git);
                        }
                    });

                    mesaj.setPositiveButton("TEKRAR ÇÖZ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent git = new Intent(Agustos_Sekiz.this, Agustos_Sekiz.class);
                            startActivity(git);
                        }
                    });

                    Toast.makeText(Agustos_Sekiz.this, "SINAV BİTTİ..", Toast.LENGTH_LONG).show();

                    mSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    mTextView = findViewById(R.id.sure);
                    mCountDownTimer.cancel();

                    mesaj.create().show();
                    CevapA.setClickable(false);
                    CevapD.setClickable(false);
                    CevapB.setClickable(false);
                    CevapC.setClickable(false);
                }

            }
        });
    }


    public void degistir(View view) {


        ImageView resim = findViewById(R.id.imageView2);

        switch (soru) {
            case 1:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a2);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;

                break;

            case 2:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a3);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 3:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a4);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 4:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a5);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 5:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a6);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 6:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a7);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 7:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a8);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 8:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a9);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 9:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a10);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 10:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a11);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 11:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a12);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 12:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a13);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 13:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a14);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 14:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a15);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 15:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a16);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 16:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a17);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 17:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a18);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 18:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a19);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 19:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a20);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 20:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a21);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 21:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a22);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 22:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a23);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 23:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a24);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 24:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a25);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 25:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a26);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;


            case 26:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a27);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 27:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a28);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 28:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a29);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 29:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a30);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 30:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a31);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 31:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a32);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 32:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a33);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 33:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a34);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 34:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a35);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 35:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a36);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 36:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a37);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 37:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a38);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 38:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a39);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 39:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a40);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 40:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a41);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 41:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a42);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 42:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a43);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 43:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a44);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 44:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a45);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 45:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a46);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 46:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a47);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 47:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a48);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 48:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a49);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 49:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                resim.setImageResource(R.drawable.a50);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;

            case 50:
                CevapA.setClickable(true);
                CevapB.setClickable(true);
                CevapC.setClickable(true);
                CevapD.setClickable(true);
                CevapA.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapA.setTextColor(Color.WHITE);
                CevapB.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapB.setTextColor(Color.WHITE);
                CevapC.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapC.setTextColor(Color.WHITE);
                CevapD.setBackgroundColor(Color.rgb(54, 78, 74));
                CevapD.setTextColor(Color.WHITE);
                soru++;
                break;
            default:

        }

    }
}