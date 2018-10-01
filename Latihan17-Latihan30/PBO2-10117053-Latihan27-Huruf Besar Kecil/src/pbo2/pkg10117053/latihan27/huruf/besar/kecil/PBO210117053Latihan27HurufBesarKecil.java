/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil besar dan kecil
 */
package pbo2.pkg10117053.latihan27.huruf.besar.kecil;

import java.util.Scanner;

public class PBO210117053Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Kalimat;
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("======Hasil Formating======");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf kecil = " + Kecil);
    }
    
}
