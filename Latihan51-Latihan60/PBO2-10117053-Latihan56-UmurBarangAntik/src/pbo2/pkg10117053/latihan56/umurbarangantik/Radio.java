/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Radio.
 */
package pbo2.pkg10117053.latihan56.umurbarangantik;

/**
 *
 * @author paycom
 */
public class Radio extends BarangAntik {
     private String name;

    public Radio(int umur) {
        super(umur);
        this.umur=umur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
