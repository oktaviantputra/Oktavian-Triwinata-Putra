/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan Rata rata
                        nilai
                       
 */
package pbo2.pkg10117053.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        
        Nilai nilai1 = new Nilai();
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        nilai1.jumlahSiswa = baca.nextInt();
        nilai1.inputHitungNilai(nilai1.jumlahSiswa, nilai1.nilai);
        System.out.println("Maka Rata - Ratanya : " + nilai1.rataRataNilai());
    }
    
}
