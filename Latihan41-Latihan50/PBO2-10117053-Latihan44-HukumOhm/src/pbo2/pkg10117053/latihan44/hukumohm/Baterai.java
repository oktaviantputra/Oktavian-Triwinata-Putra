/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program class untuk menampilkan hasil
                       menghitung ohm
 */
package pbo2.pkg10117053.latihan44.hukumohm;

/**
 *
 * @author paycom
 */
public class Baterai {
    
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus=kuatArus;
        this.hambatan=hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus*hambatan;
    }
    
}
