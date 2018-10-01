/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan waktu saat ini
 */
package pbo2.pkg10117053.latihan26.waktu.saat.ini;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PBO210117053Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date Waktu = new Date ( );
        SimpleDateFormat FormatWaktu = new SimpleDateFormat ("EEEE, dd MMM yyy hh:mm:ss");
        
        System.out.println("Hari ini adalah hari : " + FormatWaktu.format(Waktu));
    }
    
}
