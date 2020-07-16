package com.example.ehliyetsnavsorular;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AracGostergePaneli extends AppCompatActivity {

    ImageView icon;
    ImageButton geri_btn;
    ImageButton ileri_btn;
    int sayac = 0;
    String s1 = "Akü Göstergesi \nArabayı ilk çalıştırdığınızda görünen ancak daha sonra kaybolan bu gösterge aküye ilişkindir. \nAncak bu lambanın sönmeyip, ekranda kalması akü voltaj seviyesinin çok düşük olduğunu \nve şarj sisteminin çalışmadığını bildirir.";
    String s2 = "Lastik Basıncı \nÖn panelde bu lambanın daimi olarak yanık kalması, \nlastiklerinizden birinin hava basıncının düşük olduğunu gösterir.";
    String s3 = "Bu ikaz lambasının yanması motor ateşleme, emisyon kontrol\nveya yakıt sistemindeki herhangi bir probleme işaret edebilir.";
    String s4 = "Ön panelinizdeki bu lambanın daimi şekilde yandığını \ngörüyorsanız aracın fren sisteminde bir sorun var demektir.";
    String s5 = "Ekranınızda bu küçük termometre işaretinin görünmesi, \naracınızın soğutma sistemi ile ilgili bir sorun olduğuna işaret eder. ";
    String s6 = "Bu gösterge lambasının yanıyor olması sürücüyü anti patinaj \nsisteminin devre dışı olduğu konusunda uyarmak içindir. ";
    String s7 = "Eğer ekranınızda bu lambanın yandığını görüyorsanız, \naracın yağ basıncı düşük demektir. ";
    String s8 = "Genellikle kış aylarında kullandığınız araç buz / buğu \nçözme sistemi devrede olduğunda panelde bu işareti görürsünüz.";
    String s9 = "Ön gösterge panelinizde bu ışığın yanık olduğunu görmeniz, \narka sis lambalarınızın açık olduğu anlamına gelir.";
    String s10 = "ABS ışığının sürekli yanması ABS fren \nsisteminin devre dışı kaldığını gösterir.";
    String s11 = "Bu uyarı lambası otomatik vitesli\naraçlar için geçerlidir.";
    String s12 = "Bu ikaz araçta 7 litre yakıt kaldığını gösterir.";
    String s13 = "Eğer bu ışık sürüş esnasında yanıp sönüyor veya sürekli \nyanıyorsa hava yastığı sisteminizde arıza \nolduğunu belli eder ve hava yastığını kapatır.";
    String s14 = "Bu ikaz ışığının sürekli yanması cam \nsuyunun bittiği anlamına gelir.";
    String s15 = "Bu ikaz ışığının yanması fren balatalarının aşındığı \nve değişmesi gerektiği anlamına gelir.";
    String s16 = "Eğer aracınız dizel ise bu ikaz ışığı \nsizin araçta da var demektir. ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arac_gosterge_paneli);

        icon = findViewById(R.id.resim);
        geri_btn = findViewById(R.id.imageButton3);
        ileri_btn = findViewById(R.id.imageButton4);

        if (sayac == 0) {
            icon.setImageResource(R.drawable.g1);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s1);
        }

    }

    public void geri(View view) {
        sayac--;

        if (sayac < 0) {
            sayac = 0;
        }

        if (sayac == 0) {
            icon.setImageResource(R.drawable.g1);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s1);
        }

        if (sayac == 1) {
            icon.setImageResource(R.drawable.g2);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s2);
        }

        if (sayac == 2) {
            icon.setImageResource(R.drawable.g3);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s3);
        }

        if (sayac == 3) {
            icon.setImageResource(R.drawable.g4);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s4);
        }

        if (sayac == 4) {
            icon.setImageResource(R.drawable.g5);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s5);
        }

        if (sayac == 5) {
            icon.setImageResource(R.drawable.g6);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s6);
        }

        if (sayac == 6) {
            icon.setImageResource(R.drawable.g7);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s7);
        }

        if (sayac == 7) {
            icon.setImageResource(R.drawable.g8);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s8);
        }

        if (sayac == 8) {
            icon.setImageResource(R.drawable.g9);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s9);
        }

        if (sayac == 9) {
            icon.setImageResource(R.drawable.g10);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s10);
        }

        if (sayac == 10) {
            icon.setImageResource(R.drawable.g11);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s11);
        }

        if (sayac == 11) {
            icon.setImageResource(R.drawable.g12);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s12);
        }

        if (sayac == 12) {
            icon.setImageResource(R.drawable.g13);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s13);
        }

        if (sayac == 13) {
            icon.setImageResource(R.drawable.g14);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s14);
        }

        if (sayac == 14) {
            icon.setImageResource(R.drawable.g15);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s15);
        }

        if (sayac >= 14) {
            sayac = 14;
        }
    }

    public void ileri(View view) {
        sayac++;

        if (sayac < 0) {
            sayac = 0;
        }

        if (sayac == 0) {
            icon.setImageResource(R.drawable.g1);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s1);
        }

        if (sayac == 1) {
            icon.setImageResource(R.drawable.g2);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s2);
        }

        if (sayac == 2) {
            icon.setImageResource(R.drawable.g3);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s3);
        }

        if (sayac == 3) {
            icon.setImageResource(R.drawable.g4);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s4);
        }

        if (sayac == 4) {
            icon.setImageResource(R.drawable.g5);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s5);
        }

        if (sayac == 5) {
            icon.setImageResource(R.drawable.g6);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s6);
        }

        if (sayac == 6) {
            icon.setImageResource(R.drawable.g7);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s7);
        }

        if (sayac == 7) {
            icon.setImageResource(R.drawable.g8);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s8);
        }

        if (sayac == 8) {
            icon.setImageResource(R.drawable.g9);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s9);
        }

        if (sayac == 9) {
            icon.setImageResource(R.drawable.g10);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s10);
        }

        if (sayac == 10) {
            icon.setImageResource(R.drawable.g11);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s11);
        }

        if (sayac == 11) {
            icon.setImageResource(R.drawable.g12);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s12);
        }

        if (sayac == 12) {
            icon.setImageResource(R.drawable.g13);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s13);
        }

        if (sayac == 13) {
            icon.setImageResource(R.drawable.g14);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s14);
        }

        if (sayac == 14) {
            icon.setImageResource(R.drawable.g15);
            TextView yazi;
            yazi = findViewById(R.id.bilgi);
            yazi.setText("" + s15);
        }

        if (sayac >= 14) {
            sayac = 14;
        }
    }

}
