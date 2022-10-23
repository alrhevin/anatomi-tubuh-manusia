package com.example.anatomitubuhmanusia.model;

public class SoalModel {
    private int idSoal;
    private String soal;
    private String soalSuara;
    private String pilihanSatu;
    private String pilihanDua;
    private String pilihanTiga;
    private String jawaban;
    private String level;

    public SoalModel(int idSoal, String soal, String soalSuara, String pilihanSatu, String pilihanDua, String pilihanTiga, String jawaban, String level) {
        this.idSoal = idSoal;
        this.soal = soal;
        this.soalSuara = soalSuara;
        this.pilihanSatu = pilihanSatu;
        this.pilihanDua = pilihanDua;
        this.pilihanTiga = pilihanTiga;
        this.jawaban = jawaban;
        this.level = level;
    }

    public int getIdSoal() {
        return idSoal;
    }

    public String getSoal() {
        return soal;
    }

    public String getSoalSuara() {
        return soalSuara;
    }

    public String getPilihanSatu() {
        return pilihanSatu;
    }

    public String getPilihanDua() {
        return pilihanDua;
    }

    public String getPilihanTiga() {
        return pilihanTiga;
    }

    public String getJawaban() {
        return jawaban;
    }

    public String getLevel() {
        return level;
    }
}
