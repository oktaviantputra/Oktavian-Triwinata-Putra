/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Living Thing.
 */
package pbo2.pkg10117053.latihan62.livingthing;

/**
 *
 * @author paycom
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama + " Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama + " Makan");
    }
    
}
