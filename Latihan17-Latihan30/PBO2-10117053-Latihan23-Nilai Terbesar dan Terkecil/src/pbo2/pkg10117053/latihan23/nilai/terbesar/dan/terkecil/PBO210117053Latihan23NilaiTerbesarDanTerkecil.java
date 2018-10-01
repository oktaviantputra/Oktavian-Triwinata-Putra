/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan nilai terbesar dan terkecil
 */
package pbo2.pkg10117053.latihan23.nilai.terbesar.dan.terkecil;

import java.util.Scanner;

public class PBO210117053Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int nBanyak, nilai[];
        float rata = 0;
        String Nama;
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Mahasiswa====");
        System.out.print("Masukkan Nama Petugas : ");
        Nama = input.nextLine();
        
        System.out.print("Masukkan Banyak Mahasiswa : ");
        nBanyak = input.nextInt();
        
        nilai = new int[nBanyak];
        
        for (int i = 0; i <= nBanyak - 1; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
    }
        
        int max = 0;
        for (int val : nilai){
            if (max < val){
                max = val;
            }
        }
        System.out.println("Nilai terbesar adalah " + max);
        
        int min = nilai[0];
        for (int val : nilai){
            if (min > val){
                min = val;
            }
        }
        System.out.println("Nilai terkecil adalah " + min);
        
        System.out.println("Petugas : " + Nama);
}
}