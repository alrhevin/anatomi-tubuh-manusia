package com.example.anatomitubuhmanusia.model;

public class SubMateriModel {
    private int idMateri;
    private int subMateri;
    private String nama;
    private String gambar;
    private String suara;
    private String keterangan;

    public SubMateriModel(int idMateri, int subMateri, String nama, String gambar, String suara, String keterangan) {
        this.idMateri = idMateri;
        this.subMateri = subMateri;
        this.nama = nama;
        this.gambar = gambar;
        this.suara = suara;
        this.keterangan = keterangan;
    }

    public int getIdMateri() {
        return idMateri;
    }

    public int getSubMateri() {
        return subMateri;
    }

    public String getNama() {
        return nama;
    }

    public String getGambar() {
        return gambar;
    }

    public String getSuara() {
        return suara;
    }

    public String getKeterangan() {
        return keterangan;
    }
}
