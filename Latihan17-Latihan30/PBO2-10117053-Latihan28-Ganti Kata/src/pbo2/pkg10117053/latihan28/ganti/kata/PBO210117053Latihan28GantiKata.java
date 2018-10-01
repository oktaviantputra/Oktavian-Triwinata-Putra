/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk mengganti kata
 */
package pbo2.pkg10117053.latihan28.ganti.kata;

import java.util.Scanner;

public class PBO210117053Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.println("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.println("Ganti Kata : ");
        nGanti = scanner.nextLine();
        
        System.out.println("Menjadi Kata : ");
        nJadi = scanner.nextLine();
        
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : " + ganti);
    }
    
}
