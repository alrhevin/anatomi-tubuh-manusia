package com.example.anatomitubuhmanusia.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anatomitubuhmanusia.R;
import com.example.anatomitubuhmanusia.model.MateriModel;

import java.util.ArrayList;

public class MateriAdapter extends RecyclerView.Adapter<MateriAdapter.ViewHolder> {
    ArrayList<MateriModel> modelMateri = new ArrayList<>();
    Context context;

    public MateriAdapter(ArrayList<MateriModel> modelGejala, Context context) {
        this.modelMateri = modelGejala;
        this.context = context;
    }

    @NonNull
    @Override
    public MateriAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.list_materi,parent, false);
        return new MateriAdapter.ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull MateriAdapter.ViewHolder holder, int position) {
        holder.tvNama.setText(modelMateri.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return modelMateri.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNama;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.lm_nama);
        }
    }
}
