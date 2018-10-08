/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan program
                        tunjangan
                       
 */
package pbo2.pkg10117053.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        GajiPokok gaji1 = new GajiPokok();
        
        System.out.println("===Program Tunjangan===");
        System.out.print("Berapa gaji pokok anda perbulan\t : ");
        gaji1.gajiAwal = baca.nextDouble();
        System.out.print("Status Anda (Menikah/Belum)t : ");
        gaji1.status = baca.next();
        
        System.out.println("==== Hasil Perhitungan ====");
        System.out.println("Gaji Pokok\t : " + gaji1.gajiAwal);
        System.out.println("Tunjangan\t : " + gaji1.hitungTunjangan());
        System.out.println("Total gaji\t : " + gaji1.hitungTotalGaji());
    }
    
}
