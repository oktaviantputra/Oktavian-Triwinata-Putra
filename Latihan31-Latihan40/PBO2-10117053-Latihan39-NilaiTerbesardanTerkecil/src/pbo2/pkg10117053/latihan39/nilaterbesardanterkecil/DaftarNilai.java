/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class daftar nilai
                       
 */
package pbo2.pkg10117053.latihan39.nilaterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DaftarNilai {

    public int jumlahMhs;
    public int nBesar = 0;
    public int nKecil = 100;
    public int nilaiMhs[] = new int[40];
    Scanner scn = new Scanner(System.in);

    public void inputJumlahMhs() {
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jumlahMhs = scn.nextInt();
    }

    public int hitungNilaiTerbesar(int i) {
        return nBesar = ((nBesar <= nilaiMhs[i]) ? nilaiMhs[i] : nBesar);
    }

    public int hitungNilaiTerkecil(int i) {
        return nKecil = ((nKecil >= nilaiMhs[i]) ? nilaiMhs[i] : nKecil);
    }

    public void hasilNilaiMhs() {
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " = " + nilaiMhs[i] + "\n");
        }
    }

}
