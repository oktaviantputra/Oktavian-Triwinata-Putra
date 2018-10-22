/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan cetak nama
                       
 */
package pbo2.pkg10117053.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama ===");
        System.out.println("Masukkan Nama Anda : ");
        ptr.setNama(baca.nextLine());
        System.out.println("Mau Cetak Berapa Kali? : ");
        ptr.setJmlCetak(baca.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}
