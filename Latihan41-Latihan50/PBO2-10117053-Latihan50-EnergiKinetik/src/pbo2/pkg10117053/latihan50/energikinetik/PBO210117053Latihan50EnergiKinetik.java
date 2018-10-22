/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       perhitungan energi kinetik
 */
package pbo2.pkg10117053.latihan50.energikinetik;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Energi bola = new Energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan masa = " + bola.getMassa() + " g");
        System.out.println("Bola baseball tersebut dilempar dengan kecepatan = " + bola.getKecepatan() + " m/s");
        
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + bola.usaha());
        System.out.println("P.S : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
