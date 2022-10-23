package com.example.anatomitubuhmanusia.model;

public class UsersModel {
    private int idUser;
    private String namUser;
    private String umur;
    private String jenisKelamin;
    private String alamat;

    public UsersModel(int idUser, String namUser, String umur, String jenisKelamin, String alamat) {
        this.idUser = idUser;
        this.namUser = namUser;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNamUser() {
        return namUser;
    }

    public String getUmur() {
        return umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }
}
