package com.jobsheet15.tugas01;
import java.util.*;
class Mahasiswa27 {
    String nimMhs;
    String namaMhs;
    String noTelpMhs;
    public Mahasiswa27(String nimMhs, String namaMhs, String noTelpMhs) {
        this.nimMhs = nimMhs;
        this.namaMhs = namaMhs;
        this.noTelpMhs = noTelpMhs;
    }
    public String getNim() {
        return nimMhs;
    }
    public String getNama() {
        return namaMhs;
    }
    public String getNoTelp() {
        return noTelpMhs;
    }
    @Override
    public String toString() {
        return nimMhs + "\t" + namaMhs + "\t" + noTelpMhs;
    }
    public static void tampilDataMhs(List<Mahasiswa27> mahasiswa27s) {
        int nimMhsWidth = 23;
        int namaMhsWidth = 24;
        int noTelpMhsmWidth = 24;
        String header = "DAFTAR MAHASISWA";
        System.out.printf("\n%45s\n", header);
        System.out.println("+-----------------------+------------------------+------------------------+");
        System.out.println("|          NIM          |          NAMA          |        NO. TELP        |");
        System.out.println("+-----------------------+------------------------+------------------------+");
        for (Mahasiswa27 mhs : mahasiswa27s) {
            System.out.println("|" + padRight(mhs.nimMhs, nimMhsWidth) + "|" + padRight(mhs.namaMhs, namaMhsWidth) + "|" + padRight(mhs.noTelpMhs, noTelpMhsmWidth) + "|");
        }
        System.out.println("+-----------------------+------------------------+------------------------+");
    }
    // Method to pad string to the right
    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}