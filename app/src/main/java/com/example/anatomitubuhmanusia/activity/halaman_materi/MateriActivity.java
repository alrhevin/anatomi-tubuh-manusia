package com.example.anatomitubuhmanusia.activity.halaman_materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.anatomitubuhmanusia.R;

public class MateriActivity extends AppCompatActivity {

    TextView materi1, materi2, materi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        materi1 = findViewById(R.id.materi_level_1);
        materi2 = findViewById(R.id.materi_level_2);
        materi3 = findViewById(R.id.materi_level_3);

        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ListMateriActivity.class);
                intent.putExtra("level", 1);
                startActivity(intent);
            }
        });
    }
}