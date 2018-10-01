/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan target saldo tabungan
 */
package pbo2.pkg10117053.latihan20.target.saldo.tabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO210117053Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nSaldo, nBungan, bulan;

        nSaldo = 3500000;
        bulan = 1;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);

        while (nSaldo <= 6000000) {
            
            nSaldo = (int) ((nSaldo * 0.08) + nSaldo);
        
        System.out.printf("Saldo di bulan ke-" + bulan + " Rp.%s \n", kursIndonesia.format(nSaldo));
        bulan = bulan + 1;
    }

}
}