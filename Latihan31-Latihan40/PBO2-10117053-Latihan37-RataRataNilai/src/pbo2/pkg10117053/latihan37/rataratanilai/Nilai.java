/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class nilai
                       
 */
package pbo2.pkg10117053.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class Nilai {
    public int jumlahSiswa;
    public double rataRata;
    public double jumlahNilai;
    public double nilai;
    
    public void inputHitungNilai(int jumSiswa, double Nilai){
        int i = 1;
        Scanner baca = new Scanner(System.in);
        while (i <= jumSiswa){
            System.out.println("Nilai Mahasiswa ke-" + i + " : ");
            Nilai = baca.nextDouble();
            jumlahNilai = jumlahNilai + Nilai;
            i = i + 1;  
        }
        System.out.println("");
    }
    public double rataRataNilai(){
        
        return rataRata = jumlahNilai / jumlahSiswa;
    }
}
