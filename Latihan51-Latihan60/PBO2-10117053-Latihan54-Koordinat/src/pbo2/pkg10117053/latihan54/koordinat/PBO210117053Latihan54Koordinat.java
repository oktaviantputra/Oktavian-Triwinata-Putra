/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       program Koordinat.
 */
package pbo2.pkg10117053.latihan54.koordinat;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat kordinat = new WarnaKoordinat(0,0,"");
        kordinat.setNamaWarna("Jingga");
        kordinat.setX(10);
        kordinat.setY(4);
        System.out.println("Warna Koordinat "+kordinat.getNamaWarna());
        System.out.println("Kordinat Sumbu x : "+kordinat.getX()+", y : "+kordinat.getY());
    }
    
}
