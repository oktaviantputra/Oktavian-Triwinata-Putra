/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       tabungan
 */
package pbo2.pkg10117053.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah;
        
        Scanner baca = new Scanner(System.in);
        System.out.println("=== Program Penarikan Uang ===");
        System.out.println("Masukkan Saldo Awal : ");
        Tabungan tbg = new Tabungan(baca.nextInt());
        System.out.println("Jumlah uang yang diambil : ");
        jumlah = baca.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
    }
    
}
