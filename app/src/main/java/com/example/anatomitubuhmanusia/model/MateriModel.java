package com.example.anatomitubuhmanusia.model;

public class MateriModel {
    private int idMateri;
    private String nama;
    private String gambar;
    private String suara;
    private String keterangan;
    private String levelMateri;

    public MateriModel(int idMateri, String nama, String gambar, String suara, String keterangan, String levelMateri) {
        this.idMateri = idMateri;
        this.nama = nama;
        this.gambar = gambar;
        this.suara = suara;
        this.keterangan = keterangan;
        this.levelMateri = levelMateri;
    }

    public int getIdMateri() {
        return idMateri;
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

    public String getLevelMateri() {
        return levelMateri;
    }
}
