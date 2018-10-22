/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program class untuk menghitung harga
                       emas kawin
 */
package pbo2.pkg10117053.latihan49.biayaemaskawin;

/**
 *
 * @author paycom
 */
public class Emas {
    private double harga = 570000;
    private double berat;
    
    public Emas(double berat){
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public double getBerat() {
        return berat;
    }
    
    public double hitungHargaEmas(double parBerat, double parHarga){
        return berat*harga;
    }
    
}
