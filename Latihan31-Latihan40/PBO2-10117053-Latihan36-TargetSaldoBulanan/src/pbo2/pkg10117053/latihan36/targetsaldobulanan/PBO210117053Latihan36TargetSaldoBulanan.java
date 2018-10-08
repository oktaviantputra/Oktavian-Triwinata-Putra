
import pbo2.pkg10117053.latihan36.targetsaldobulanan.TargetSaldo;

/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan target saldo
                        bulanan
                       
package pbo2.pkg10117053.latihan36.targetsaldobulanan;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan36TargetSaldoBulanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TargetSaldo saldo = new TargetSaldo();
        
        saldo.saldoAwal = 3500000;
        saldo.bunga = 0.08;
        
        saldo.targetSaldo(saldo.saldoAwal, saldo.bunga);
    }
    
}
