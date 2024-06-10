package com.jobsheet15.tugas01;
import java.util.*;
class Nilai27 {
    String nimMhs;
    String kodeMatKul;
    double nilaiMhs;
    public Nilai27(String nimMhs, String kodeMatKul, double nilaiMhs) {
        this.nimMhs = nimMhs;
        this.kodeMatKul = kodeMatKul;
        this.nilaiMhs = nilaiMhs;
    }
    public String getNim() {
        return nimMhs;
    }
    public String getKodeMatKul() {
        return kodeMatKul;
    }
    public double getNilai() {
        return nilaiMhs;
    }
    @Override
    public String toString() {
        return nimMhs + "\t" + kodeMatKul + "\t" + nilaiMhs;
    }
    public static void daftarNilaiMhs(List<Nilai27> nilaiList, List<Mahasiswa27> mahasiswa27s, List<MataKuliah27> mataKuliah27s) {
        int nimMhsWidth = 23;
        int namaMhsWidth = 24;
        int namaMatKulWidth = 39;
        int sksMatKulmWidth = 24;
        int nilaiMhsWidth = 24;
        System.out.println("\n+-----------------------+------------------------+---------------------------------------+------------------------+------------------------+");
        System.out.println("|          NIM          |          NAMA          |              MATA KULIAH              |          SKS           |          NILAI         |");
        System.out.println("+-----------------------+------------------------+---------------------------------------+------------------------+------------------------+");
        for (Nilai27 nilai : nilaiList) {
            Mahasiswa27 mhs = mahasiswa27s.stream().filter(m -> m.nimMhs.equals(nilai.nimMhs)).findFirst().orElse(null);
            MataKuliah27 matkul = mataKuliah27s.stream().filter(mk -> mk.kodeMatKul.equals(nilai.kodeMatKul)).findFirst().orElse(null);
            if (mhs != null && matkul != null) {
                System.out.println("|" + padRight(nilai.nimMhs, nimMhsWidth) + "|" + padRight(mhs.namaMhs, namaMhsWidth) + "|" + padRight(matkul.namaMatKul, namaMatKulWidth) + "|" + padRight(String.valueOf(matkul.sksMatKul), sksMatKulmWidth) + "|" + padRight(String.valueOf(nilai.nilaiMhs), nilaiMhsWidth) + "|");
            }
        }
        System.out.println("+-----------------------+------------------------+---------------------------------------+------------------------+------------------------+");
    }
    // Method to pad string to the right
    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}