package com.example.anatomitubuhmanusia.activity.halaman_utama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anatomitubuhmanusia.R;
import com.example.anatomitubuhmanusia.activity.halaman_materi.MateriActivity;

public class HalamanUtamaActivity extends AppCompatActivity {

    private TextView tvJudul;
    private LinearLayout ctMateri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        tvJudul = findViewById(R.id.ds_judul);
        ctMateri = findViewById(R.id.ds_materi);

//        String text = "<font color=#FF0000>P</font>" +
//                "<font color=#FF7F00>e</font>" +
//                "<font color=#FFFF00>n</font>" +
//                "<font color=#00FF00>g</font>" +
//                "<font color=#0000FF>e</font>" +
//                "<font color=#4B0082>n</font>" +
//                "<font color=#4B0082>a</font>" +
//                "<font color=#FF0000>l</font>" +
//                "<font color=#FF7F00>a</font>" +
//                "<font color=#FFFF00>n</font> " +
//                "<font color=#00FF00>A</font>" +
//                "<font color=#0000FF>n</font>" +
//                "<font color=#4B0082>a</font>" +
//                "<font color=#4B0082>t</font>" +
//                "<font color=#FF0000>o</font>" +
//                "<font color=#FF7F00>m</font>" +
//                "<font color=#FFFF00>i</font> " +
//                "<font color=#00FF00>T</font>" +
//                "<font color=#0000FF>u</font>" +
//                "<font color=#4B0082>b</font>" +
//                "<font color=#4B0082>u</font>" +
//                "<font color=#FF0000>h</font> " +
//                "<font color=#FF7F00>M</font>" +
//                "<font color=#FFFF00>a</font>" +
//                "<font color=#00FF00>n</font>" +
//                "<font color=#0000FF>u</font>" +
//                "<font color=#4B0082>s</font>" +
//                "<font color=#4B0082>i</font>" +
//                "<font color=#FF0000>a</font>";
//        tvJudul.setText(Html.fromHtml(text));

        ctMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MateriActivity.class);
                startActivity(intent);
            }
        });
    }
}