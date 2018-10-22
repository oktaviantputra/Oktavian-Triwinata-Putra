/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program class untuk menampilkan hasil
                       perhitugan energi kinetik
 */
package pbo2.pkg10117053.latihan50.energikinetik;

/**
 *
 * @author paycom
 */
public class Energi {
    private double massa;
    private double kecepatan;
    private double energikinetik1;
    private double energikinetik2;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik1(double m, double k){
        energikinetik1 = 0.5 * m* (k * k);
        return energikinetik1;
    }
    
    public void hiutngEnergiKinetik2(double m){
        this.energikinetik2 = 0.5 * m * 0;
    }
    
    public double usaha() {
        return energikinetik1-energikinetik2;
    }
    
    
    
    
}
