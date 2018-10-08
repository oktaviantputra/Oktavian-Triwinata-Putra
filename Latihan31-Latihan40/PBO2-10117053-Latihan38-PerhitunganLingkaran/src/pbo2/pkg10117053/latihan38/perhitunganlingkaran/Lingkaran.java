/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class lingkaran
                       
 */
package pbo2.pkg10117053.latihan38.perhitunganlingkaran;

/**
 *
 * @author paycom
 */
public class Lingkaran {
    public double jari;
    public double luas;
    public double keliling;
    
    public double jari2Lingkaran(double diameter){
        jari = diameter / 2;
        return jari;
    }
    
    public double luas2Lingkaran(double r){
        luas = Math.PI*r*r;
        return luas;
    }
    
    public double kelilingLingkaran(double r){
        luas = 2*Math.PI*r;
        return jari;
    }

    Object[] luasLingkaran(double jari2Lingkaran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
