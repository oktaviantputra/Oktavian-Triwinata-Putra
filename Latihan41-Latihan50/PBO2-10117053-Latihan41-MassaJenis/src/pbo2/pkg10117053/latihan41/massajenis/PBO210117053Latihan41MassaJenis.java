/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       menghitung massa jenis
 */
package pbo2.pkg10117053.latihan41.massajenis;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus();
        System.out.println("====== Massa Jenis Kubus ======");
        kbs.setSisi(5);
        kbs.setMassa(250);
        System.out.println("Sisi : " + kbs.getSisi());
        System.out.println("Massa : " + kbs.getMassa());
        System.out.println("");
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(), kbs.hitungVolume(kbs.getSisi())));
    }
    
}
