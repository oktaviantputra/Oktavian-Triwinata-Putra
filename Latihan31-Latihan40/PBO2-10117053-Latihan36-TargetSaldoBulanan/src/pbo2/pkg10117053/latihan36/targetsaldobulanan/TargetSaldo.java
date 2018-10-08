/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class saldo
                      
 */
package pbo2.pkg10117053.latihan36.targetsaldobulanan;

/**
 *
 * @author paycom
 */
public class TargetSaldo {
    public int saldoAwal;
    public double bunga;
    public int saldoTarget;
    
    public void targetSaldo(int perSaldo, double parbunga){
        int i = 0;
        while (saldoAwal <= 6000000){
            i = i + 1;
            saldoTarget = (int) (bunga * saldoAwal);
            saldoAwal = saldoAwal + saldoTarget;
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + saldoAwal);
        }
    }
    
}
