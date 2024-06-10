package com.jobsheet15.tugas01;
import java.util.*;
class MataKuliah27 {
    String kodeMatKul;
    String namaMatKul;
    int sksMatKul;
    public MataKuliah27(String kodeMatKul, String namaMatKul, int sksMatKul) {
        this.kodeMatKul = kodeMatKul;
        this.namaMatKul = namaMatKul;
        this.sksMatKul = sksMatKul;
    }
    public String getKodeMatKul() {
        return kodeMatKul;
    }
    public String getNamaMatKul() {
        return namaMatKul;
    }
    public int getSksMatKul() {
        return sksMatKul;
    }
    @Override
    public String toString() {
        return kodeMatKul + "\t" + namaMatKul + "\t" + sksMatKul;
    }
    public static void daftarMatKul(List<MataKuliah27> mataKuliah27s) {
        int kodeMatKulWidth = 23;
        int namaMatKulWidth = 39;
        int sksMatKulmWidth = 24;
        String header = "DAFTAR MATA KULIAH";
        System.out.printf("\n%54s\n", header);
        System.out.println("+-----------------------+---------------------------------------+------------------------+");
        System.out.println("|          KODE         |              MATA KULIAH              |           SKS          |");
        System.out.println("+-----------------------+---------------------------------------+------------------------+");
        for (MataKuliah27 matkuls : mataKuliah27s) {
            System.out.println("|" + padRight(matkuls.kodeMatKul, kodeMatKulWidth) + "|" + padRight(matkuls.namaMatKul, namaMatKulWidth) + "|" + padRight(String.valueOf(matkuls.sksMatKul), sksMatKulmWidth) + "|");
        }
        System.out.println("+-----------------------+---------------------------------------+------------------------+");
    }
    // Method to pad string to the right
    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}