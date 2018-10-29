/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Data Gradien Garis Lurus.
 */
package pbo2.pkg10117053.latihan63.gradiengarislurus;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat nKoordinat = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+nKoordinat.getX1()+","+nKoordinat.getY1()+") dan ("+nKoordinat.getX2()+","+nKoordinat.getY2()+")");
        System.out.println("memiliki gradien sebesar " + nKoordinat.hitungGradien());
        
        Koordinat nKoordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+nKoordinat2.getX1()+","+nKoordinat2.getY1()+") dan ("+nKoordinat2.getX2()+","+nKoordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar " + nKoordinat2.hitungGradien());
    }
    
}
