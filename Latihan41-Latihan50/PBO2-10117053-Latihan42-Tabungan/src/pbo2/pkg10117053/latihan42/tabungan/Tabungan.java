/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program class untuk menampilkan hasil
                       tabungan
 */
package pbo2.pkg10117053.latihan42.tabungan;

/**
 *
 * @author paycom
 */
public class Tabungan {
    private final int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
        
    }
    
    public int ambilUang(int jumlah){
        return saldo-jumlah;
    }
}
