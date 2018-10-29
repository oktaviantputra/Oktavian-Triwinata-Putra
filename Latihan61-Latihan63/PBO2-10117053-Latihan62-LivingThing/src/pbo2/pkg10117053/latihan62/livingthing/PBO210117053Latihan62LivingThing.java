/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Data Living Thing.
 */
package pbo2.pkg10117053.latihan62.livingthing;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human nHuman = new Human();
        nHuman.setNama("Rizki Adam Kurniawan");
        nHuman.walk(nHuman.getNama());       
        nHuman.breath("Rizki Adam Kurniawan");
        nHuman.eat("Rizki Adam Kurniawan");
    }
    
}
