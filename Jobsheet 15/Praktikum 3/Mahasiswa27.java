package com.jobsheet15.praktikum03;
public class Mahasiswa27 {
    String nim;
    String nama;
    String notelp;
    public Mahasiswa27() {

    }
    public Mahasiswa27(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim = " 
        + (nim) + ", nama = " + (nama) 
        + ", notelp = " + (notelp) + '}';
    }
}