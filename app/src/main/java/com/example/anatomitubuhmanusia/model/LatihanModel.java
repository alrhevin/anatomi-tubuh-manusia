package com.example.anatomitubuhmanusia.model;

public class LatihanModel {
    private int idLatihan;
    private int userId;
    private String jawabanBenar;
    private String jawabanSalah;
    private String totalNilai;
    private String level;

    public LatihanModel(int idLatihan, int userId, String jawabanBenar, String jawabanSalah, String totalNilai, String level) {
        this.idLatihan = idLatihan;
        this.userId = userId;
        this.jawabanBenar = jawabanBenar;
        this.jawabanSalah = jawabanSalah;
        this.totalNilai = totalNilai;
        this.level = level;
    }

    public int getIdLatihan() {
        return idLatihan;
    }

    public int getUserId() {
        return userId;
    }

    public String getJawabanBenar() {
        return jawabanBenar;
    }

    public String getJawabanSalah() {
        return jawabanSalah;
    }

    public String getTotalNilai() {
        return totalNilai;
    }

    public String getLevel() {
        return level;
    }
}
