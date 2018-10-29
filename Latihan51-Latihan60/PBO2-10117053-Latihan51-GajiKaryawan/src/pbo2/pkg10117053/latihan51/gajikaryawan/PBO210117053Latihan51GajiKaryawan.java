/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Gaji Karyawan
 */
package pbo2.pkg10117053.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        Manager man1 = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        man1.setNik(baca.nextLine());
        System.out.print("Masukkan Nama : ");
        man1.setNama(baca.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        man1.setGolongan(baca.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        man1.setJabatan(baca.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        man1.setKehadiran(baca.nextInt());
        System.out.println("");
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : "+man1.getNik());
        System.out.println("Nama : "+man1.getNama());
        System.out.println("Golongan : "+man1.getGolongan());
        System.out.println("Jabatan : "+man1.getJabatan());
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN : "+man1.tunjanganGolongan(man1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : "+man1.tunjanganJabatan(man1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+man1.tunjanganKehadiran(man1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL "+man1.totalGaji());
    }
    
}
