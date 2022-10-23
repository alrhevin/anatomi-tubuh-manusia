package com.example.anatomitubuhmanusia.helper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.anatomitubuhmanusia.model.MateriModel;
import com.example.anatomitubuhmanusia.model.SubMateriModel;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "sistempakar.db";
    private static final String SCRIPT_DELETE_TABLE="DROP TABLE IF EXISTS " + DATABASE_NAME;

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createTableUser(db);
        createTableLatihan(db);
        createTableSoal(db);
        createTableMateri(db);
        createTableSubmateri(db);

        isiTableMateri(db);
        isiTableSubmateri(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
        db.execSQL(SCRIPT_DELETE_TABLE);
    }

    //handle create Table User
    public void createTableUser(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS tbl_user");
        db.execSQL("CREATE TABLE if not exists tbl_user (id_user INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nama_user TEXT, umur TEXT, jenis_kelamin TEXT, alamat_user TEXT);");
    }

    //handle create Table Latihan
    public void createTableLatihan(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS tbl_latihan");
        db.execSQL("CREATE TABLE if not exists tbl_latihan (id_latihan INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, user_id INTEGER, jawaban_benar TEXT, jawaban_salah TEXT, total_nilai TEXT, level TEXT);");
    }

    //handle create Table Soal
    public void createTableSoal(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        db.execSQL("CREATE TABLE if not exists tbl_soal (id_soal INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, soal TEXT, soal_suara TEXT, pilihan_satu TEXT, pilihan_dua TEXT, pilihan_tiga TEXT, jawaban TEXT, level TEXT);");
    }

    //handle create Table Materi
    public void createTableMateri(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS tbl_materi");
        db.execSQL("CREATE TABLE if not exists tbl_materi (id_materi INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nama TEXT, gambar TEXT, suara TEXT, keterangan TEXT, level TEXT);");
    }

    //handle create Table Materi
    public void createTableSubmateri(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS tbl_submateri");
        db.execSQL("CREATE TABLE if not exists tbl_submateri (id_submateri INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, materi_id INTEGER, nama TEXT, gambar TEXT, suara TEXT, keterangan TEXT);");
    }

    public void isiTableMateri(SQLiteDatabase db)
    {
        db.execSQL("INSERT INTO tbl_materi ('nama', 'gambar', 'suara', 'keterangan', 'level') VALUES ('Sistem Pencernaan', 'sistem_pencernaan', 'sistem_pencernaan', 'Sistem pencernaan, atau sistem gastrointestinal, terdiri dari beberapa organ pencernaan. Alat pencernaan manusia dibagi menjadi dua kelompok utama, yaitu organ dalam saluran pencernaan dan organ pencernaan pelengkap.\n" +
                "\n" +
                "Saluran pencernaan manusia, atau disebut juga dengan saluran gastrointestinal, merupakan saluran yang memanjang dari mulut hingga ke anus. Saluran ini berfungsi untuk mencerna, memecah, dan menyerap zat gizi makanan yang kemudian dialirkan melalui peredaran darah.\n" +
                "\n" +
                "Organ-organ saluran pencernaan meliputi mulut, esofagus (kerongkongan), lambung, usus halus, usus besar, rektum, dan anus. Sementara itu, organ-organ pencernaan pelengkap adalah mulut, kantung empedu, kelenjar air liur, hati, dan pankreas.', '1');");
        db.execSQL("INSERT INTO tbl_materi ('nama', 'gambar', 'suara', 'keterangan', 'level') VALUES ('Sistem Pencernaan', 'sistem_pencernaan', 'sistem_pencernaan', 'Sistem pencernaan, atau sistem gastrointestinal, terdiri dari beberapa organ pencernaan. Alat pencernaan manusia dibagi menjadi dua kelompok utama, yaitu organ dalam saluran pencernaan dan organ pencernaan pelengkap.\n" +
                "\n" +
                "Saluran pencernaan manusia, atau disebut juga dengan saluran gastrointestinal, merupakan saluran yang memanjang dari mulut hingga ke anus. Saluran ini berfungsi untuk mencerna, memecah, dan menyerap zat gizi makanan yang kemudian dialirkan melalui peredaran darah.\n" +
                "\n" +
                "Organ-organ saluran pencernaan meliputi mulut, esofagus (kerongkongan), lambung, usus halus, usus besar, rektum, dan anus. Sementara itu, organ-organ pencernaan pelengkap adalah mulut, kantung empedu, kelenjar air liur, hati, dan pankreas.', '1');");
        db.execSQL("INSERT INTO tbl_materi ('nama', 'gambar', 'suara', 'keterangan', 'level') VALUES ('Sistem Pencernaan', 'sistem_pencernaan', 'sistem_pencernaan', 'Sistem pencernaan, atau sistem gastrointestinal, terdiri dari beberapa organ pencernaan. Alat pencernaan manusia dibagi menjadi dua kelompok utama, yaitu organ dalam saluran pencernaan dan organ pencernaan pelengkap.\n" +
                "\n" +
                "Saluran pencernaan manusia, atau disebut juga dengan saluran gastrointestinal, merupakan saluran yang memanjang dari mulut hingga ke anus. Saluran ini berfungsi untuk mencerna, memecah, dan menyerap zat gizi makanan yang kemudian dialirkan melalui peredaran darah.\n" +
                "\n" +
                "Organ-organ saluran pencernaan meliputi mulut, esofagus (kerongkongan), lambung, usus halus, usus besar, rektum, dan anus. Sementara itu, organ-organ pencernaan pelengkap adalah mulut, kantung empedu, kelenjar air liur, hati, dan pankreas.', '1');");
        db.execSQL("INSERT INTO tbl_materi ('nama', 'gambar', 'suara', 'keterangan', 'level') VALUES ('Sistem Pencernaan', 'sistem_pencernaan', 'sistem_pencernaan', 'Sistem pencernaan, atau sistem gastrointestinal, terdiri dari beberapa organ pencernaan. Alat pencernaan manusia dibagi menjadi dua kelompok utama, yaitu organ dalam saluran pencernaan dan organ pencernaan pelengkap.\n" +
                "\n" +
                "Saluran pencernaan manusia, atau disebut juga dengan saluran gastrointestinal, merupakan saluran yang memanjang dari mulut hingga ke anus. Saluran ini berfungsi untuk mencerna, memecah, dan menyerap zat gizi makanan yang kemudian dialirkan melalui peredaran darah.\n" +
                "\n" +
                "Organ-organ saluran pencernaan meliputi mulut, esofagus (kerongkongan), lambung, usus halus, usus besar, rektum, dan anus. Sementara itu, organ-organ pencernaan pelengkap adalah mulut, kantung empedu, kelenjar air liur, hati, dan pankreas.', '1');");
        db.execSQL("INSERT INTO tbl_materi ('nama', 'gambar', 'suara', 'keterangan', 'level') VALUES ('Sistem Pencernaan', 'sistem_pencernaan', 'sistem_pencernaan', 'Sistem pencernaan, atau sistem gastrointestinal, terdiri dari beberapa organ pencernaan. Alat pencernaan manusia dibagi menjadi dua kelompok utama, yaitu organ dalam saluran pencernaan dan organ pencernaan pelengkap.\n" +
                "\n" +
                "Saluran pencernaan manusia, atau disebut juga dengan saluran gastrointestinal, merupakan saluran yang memanjang dari mulut hingga ke anus. Saluran ini berfungsi untuk mencerna, memecah, dan menyerap zat gizi makanan yang kemudian dialirkan melalui peredaran darah.\n" +
                "\n" +
                "Organ-organ saluran pencernaan meliputi mulut, esofagus (kerongkongan), lambung, usus halus, usus besar, rektum, dan anus. Sementara itu, organ-organ pencernaan pelengkap adalah mulut, kantung empedu, kelenjar air liur, hati, dan pankreas.', '1');");
        db.execSQL("INSERT INTO tbl_materi ('nama', 'gambar', 'suara', 'keterangan', 'level') VALUES ('Sistem Pencernaan', 'sistem_pencernaan', 'sistem_pencernaan', 'Sistem pencernaan, atau sistem gastrointestinal, terdiri dari beberapa organ pencernaan. Alat pencernaan manusia dibagi menjadi dua kelompok utama, yaitu organ dalam saluran pencernaan dan organ pencernaan pelengkap.\n" +
                "\n" +
                "Saluran pencernaan manusia, atau disebut juga dengan saluran gastrointestinal, merupakan saluran yang memanjang dari mulut hingga ke anus. Saluran ini berfungsi untuk mencerna, memecah, dan menyerap zat gizi makanan yang kemudian dialirkan melalui peredaran darah.\n" +
                "\n" +
                "Organ-organ saluran pencernaan meliputi mulut, esofagus (kerongkongan), lambung, usus halus, usus besar, rektum, dan anus. Sementara itu, organ-organ pencernaan pelengkap adalah mulut, kantung empedu, kelenjar air liur, hati, dan pankreas.', '1');");

    }

    public void isiTableSubmateri(SQLiteDatabase db)
    {
        db.execSQL("INSERT INTO tbl_submateri ('materi_id', 'nama', 'gambar', 'suara', 'keterangan') VALUES (1, 'Mulut', 'mulut', 'mulut', 'Proses pencernaan dimulai di dalam mulut, tempat terjadinya pencernaan mekanis dan kimiawi. Mulut berfungsi untuk mengunyah makanan menjadi lebih halus agar mudah dicerna. Di dalam mulut terjadi pencernaan secara mekanis oleh gigi dan kimiawi oleh enzim amilase.');");
    }

    public ArrayList<MateriModel> getAllMateri() {
        ArrayList<MateriModel> hasilList = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT  * FROM tbl_materi";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                MateriModel modelHasil = new MateriModel(
                        Integer.parseInt(cursor.getString(0)),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5)
                );
                hasilList.add(modelHasil);
            } while (cursor.moveToNext());
        }
        return hasilList;
    }

    public ArrayList<SubMateriModel> getAllSubmateri() {
        ArrayList<SubMateriModel> hasilList = new ArrayList<>();
        // Select All Query
        String selectQuery = "SELECT  * FROM tbl_submateri";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                SubMateriModel modelHasil = new SubMateriModel(
                        Integer.parseInt(cursor.getString(0)),
                        Integer.parseInt(cursor.getString(1)),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5)
                );
                hasilList.add(modelHasil);
            } while (cursor.moveToNext());
        }
        return hasilList;
    }

}
