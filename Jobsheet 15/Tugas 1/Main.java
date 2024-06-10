package com.jobsheet15.tugas01;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Mahasiswa27> mahasiswa27s = new ArrayList<>(Arrays.asList(
                new Mahasiswa27("20001", "Thalhah", "021xxx"),
                new Mahasiswa27("20002", "Zubair", "021xxx"),
                new Mahasiswa27("20003", "Abdurrahman", "021xxx"),
                new Mahasiswa27("20004", "Sa'ad", "021xxx"),
                new Mahasiswa27("20005", "Sa'id", "021xxx"),
                new Mahasiswa27("20006", "Ubaidah", "021xxx")
        ));
        List<MataKuliah27> mataKuliah27s = new ArrayList<>(Arrays.asList(
                new MataKuliah27("00001", "Internet of Things", 3),
                new MataKuliah27("00002", "Algoritma dan Struktur Data", 2),
                new MataKuliah27("00003", "Algoritma dan Pemrograman", 2),
                new MataKuliah27("00004", "Praktikum Algoritma dan Struktur Data", 3),
                new MataKuliah27("00005", "Praktikum Algoritma dan Pemrograman", 3)
        ));
        List<Nilai27> nilaiList = new ArrayList<>();
        boolean kondisi = true;
        while (kondisi) {
            switch (menu()) {
                case 1:
                    System.out.println("\n-----------------{ MASUKKAN DATA }-----------------");
                    System.out.print("Kode\t : ");
                    String kodeUserInput = sc.nextLine();
                    System.out.print("Nilai\t : ");
                    double nilaiUserInput = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("---------------------------------------------------");
                    Mahasiswa27.tampilDataMhs(mahasiswa27s);
                    System.out.print("Pilih Mahasiswa Berdasarkan NIM : ");
                    String nimUserInput = sc.nextLine();
                    MataKuliah27.daftarMatKul(mataKuliah27s);
                    System.out.print("Pilih Mata Kuliah Berdasarkan Kode : ");
                    String kodeMatKulUserInput = sc.nextLine();
                    if (mahasiswa27s.stream().anyMatch(m -> m.getNim().equals(nimUserInput)) &&
                        mataKuliah27s.stream().anyMatch(mk -> mk.getKodeMatKul().equals(kodeMatKulUserInput))) {
                        nilaiList.add(new Nilai27(nimUserInput, kodeMatKulUserInput, nilaiUserInput));
                    } else {
                        System.out.println("\n+-----------------------------------------------------+");
                        System.out.println("| NIM Mahasiswa atau Kode Mata Kuliah Tidak Ditemukan |");
                        System.out.println("+-----------------------------------------------------+");
                    }
                    break;
                case 2:
                    Nilai27.daftarNilaiMhs(nilaiList, mahasiswa27s, mataKuliah27s);
                    break;
                case 3:
                    System.out.println("\n------------{ MENCARI NILAI MAHASISWA }------------");
                    System.out.print("Masukkan NIM\t: ");
                    String nimCari = sc.nextLine();
                    System.out.println("---------------------------------------------------");
                    Nilai27.daftarNilaiMhs(filterNilaiByNim(nilaiList, nimCari), mahasiswa27s, mataKuliah27s);
                    break;
                case 4:
                    nilaiList.sort(Comparator.comparing(Nilai27::getNilai));
                    Nilai27.daftarNilaiMhs(nilaiList, mahasiswa27s, mataKuliah27s);
                    break;
                case 5:
                    kondisi = false;
                    break;
                default:
                    System.out.println("\n+----------------------------------------+");
                    System.out.println("| Opsi Yang Anda Masukkan Tidak Tersedia |");
                    System.out.println("+----------------------------------------+");
            }
        }
    }
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n+-------------------------------------------------+");
        System.out.println("| SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| 1. Input Nilai                                  |");
        System.out.println("| 2. Tampil Nilai                                 |");
        System.out.println("| 3. Mencari Nilai Mahasiswa                      |");
        System.out.println("| 4. Urut Data Nilai                              |");
        System.out.println("| 5. Keluar                                       |");
        System.out.println("+-------------------------------------------------+");
        System.out.print("Masukkan Opsi Pilihan : ");
        return sc.nextInt();
    }
    public static List<Nilai27> filterNilaiByNim(List<Nilai27> nilaiList, String nim) {
        List<Nilai27> filteredNilai = new ArrayList<>();
        for (Nilai27 nilai : nilaiList) {
            if (nilai.getNim().equals(nim)) {
                filteredNilai.add(nilai);
            }
        }
        return filteredNilai;
    }
}