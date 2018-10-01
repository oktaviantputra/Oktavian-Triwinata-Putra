/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan saldo tabungan
 */
package pbo2.pkg10117053.latihan19.saldo.tabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO210117053Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nSaldo, bulan;
        double nBungan;

        nSaldo = 2500000;
        bulan = 1;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        while (bulan <= 6){
        
        nSaldo = (int) (nSaldo + (nSaldo * 0.15));
        System.out.printf("Saldo di bulan ke-" + bulan + " Rp.%s\n", kursIndonesia.format(nSaldo));
        bulan = bulan + 1;
    }

    }

}
