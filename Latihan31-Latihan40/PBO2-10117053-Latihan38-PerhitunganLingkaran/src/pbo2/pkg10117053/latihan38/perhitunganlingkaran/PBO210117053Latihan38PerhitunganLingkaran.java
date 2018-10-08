/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan perhitungan
                        lingkaran
                       
 */
package pbo2.pkg10117053.latihan38.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author paycom
 */
public class PBO210117053Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String d;
        double diameter;
        
        Lingkaran circle = new Lingkaran();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("===Perhitungan Lingkaran====");
        
        do{
            System.out.println("Masukkan nilai diameter lingakran : ");
            d = scn.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");
            
        } while (!d.matches("[0-9]"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        diameter = Double.parseDouble(d);
        System.out.printf("Jari-jari Lingakran = %.0f cm %n",circle.jari2Lingkaran(diameter));
        System.out.printf("Luas Lingakran = %.2f cm %n",circle.luasLingkaran(circle.jari2Lingkaran(diameter)));
        System.out.printf("Keliling Lingakran = %.2f cm %n",circle.kelilingLingkaran(circle.jari2Lingkaran(diameter)));
    }
    
}
