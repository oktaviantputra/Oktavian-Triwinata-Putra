/*
 * NAMA       : Oktavian Triwinata githuPutra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk Tunjangan
 */
package pbo2.pkg10117053.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
                
        String status;
        int gajiPokok;
        int tunjangan, totalGaji;
        
        System.out.println("======Program Tunjangan======");
        System.out.print("Berapa gaji pokok anda perbulan?: ");
        gajiPokok = scanner.nextInt();
        
        System.out.print("Status Anda ? (Menikah/Belum) : ");
        status = scanner.next();
        
        tunjangan = (int) ((status.equalsIgnoreCase("Menikah")) ? gajiPokok * 
                            0.35 : 0);
        
        totalGaji = tunjangan + gajiPokok;
        
        System.out.println("\n");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Gaji Pokok  : " + gajiPokok);
        System.out.println("Tunjangan Gaji : " + tunjangan);
        System.out.println("Total Gaji : " + totalGaji);
        System.out.println("(Develop By : Oktavian Triwinata Putra)");
        

    }

}
