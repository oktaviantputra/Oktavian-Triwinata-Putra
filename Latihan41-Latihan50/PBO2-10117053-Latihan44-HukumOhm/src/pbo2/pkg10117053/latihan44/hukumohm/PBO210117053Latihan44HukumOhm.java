/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       menghitung ohm
 */
package pbo2.pkg10117053.latihan44.hukumohm;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai (3,12);
        System.out.println("Kuat Arus : "+btr.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+btr.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+btr.hitungTegangan()+" volt");
    
    }
    
}
