package com.example.anatomitubuhmanusia.activity.halaman_materi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.anatomitubuhmanusia.R;
import com.example.anatomitubuhmanusia.helper.DBHelper;
import com.example.anatomitubuhmanusia.helper.MateriAdapter;
import com.example.anatomitubuhmanusia.model.MateriModel;

import java.util.ArrayList;

public class ListMateriActivity extends AppCompatActivity {

    DBHelper dbHelper;
    ArrayList<MateriModel> materiModels = new ArrayList<>();
    MateriAdapter materiAdapter;
    RecyclerView rvListMateri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_materi);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        rvListMateri = findViewById(R.id.materi_list);

        dbHelper = new DBHelper(getApplicationContext());
        materiModels = dbHelper.getAllMateri();

        materiAdapter = new MateriAdapter(materiModels, getApplicationContext());
        rvListMateri.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvListMateri.setAdapter(materiAdapter);
    }
}