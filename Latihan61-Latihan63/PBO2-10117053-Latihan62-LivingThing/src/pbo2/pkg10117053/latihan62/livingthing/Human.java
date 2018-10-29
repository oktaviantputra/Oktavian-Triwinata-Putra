/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Human.
 */
package pbo2.pkg10117053.latihan62.livingthing;

/**
 *
 * @author paycom
 */
public class Human extends LivingThing {
    private String nama;
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama + " sedang berjalan");
    }
    
    
}
