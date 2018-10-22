/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program class untuk menampilkan hasil
                       kubus
 */
package pbo2.pkg10117053.latihan41.massajenis;

/**
 *
 * @author paycom
 */
public class Kubus {
    
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
    return sisi*sisi*sisi;
}
    public int hitungMassaJenis(int parMassa, int volume){
        return massa/volume;
    }
    
}
