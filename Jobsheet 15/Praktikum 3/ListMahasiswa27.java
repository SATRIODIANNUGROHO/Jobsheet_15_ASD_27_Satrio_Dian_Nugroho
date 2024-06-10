package com.jobsheet15.praktikum03;
import java.util.*;
public class ListMahasiswa27 {
    List<Mahasiswa27> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa27... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa27 mhs) {
        mahasiswas.set(index, mhs);
    }
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + (mhs.toString()));
        });
    }
    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
    int binarySearch(String nim) {
        int low = 0;
        int high = mahasiswas.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nim.equals(mahasiswas.get(mid).nim)) {
                return mid;
            } else if (nim.compareTo(mahasiswas.get(mid).nim) < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public void sortByNimAscending() {
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }
    public void sortByNimDescending() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }
    public static void main(String[] args) {
        ListMahasiswa27 lm = new ListMahasiswa27();
        Mahasiswa27 m = new Mahasiswa27("201234", "Noureen", "021xx1");
        Mahasiswa27 m1 = new Mahasiswa27("201235", "Akhleema", "021xx2");
        Mahasiswa27 m2 = new Mahasiswa27("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa27("201235", "Akhleema Lela", "021xx2"));
        lm.update(lm.binarySearch("201234"), new Mahasiswa27("201234", "Noureen Alexander", "021xx1"));
        System.out.println("");
        lm.tampil();

        System.out.println("\nBefore sorting:");
        lm.tampil();
        System.out.println("\nSorting by NIM (ascending):");
        lm.sortByNimAscending();
        lm.tampil();
        System.out.println("\nSorting by NIM (descending):");
        lm.sortByNimDescending();
        lm.tampil();
    }
}