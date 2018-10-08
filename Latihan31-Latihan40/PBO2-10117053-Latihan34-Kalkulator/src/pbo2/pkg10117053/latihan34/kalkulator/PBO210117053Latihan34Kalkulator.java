/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan program
                        kalkulator
                       
 */
package pbo2.pkg10117053.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner hitung = new Scanner(System.in);
        Kalkulator bilangan = new Kalkulator();

        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.println("Masukkan Bilangan ke-1 : ");
        bilangan.value1 = hitung.nextDouble();
        System.out.println("Masukkan Bilangan ke-2 : ");
        bilangan.value2 = hitung.nextDouble();
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + bilangan.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + bilangan.kurangBilangan());
        System.out.println("Hasil Perkalian : " + bilangan.kaliBilangan());
        System.out.println("Hasil Pembagian : " + bilangan.bagiBilangan());
        System.out.println("Sisa Hasil : " + bilangan.sisaBilangan());
    }

}
