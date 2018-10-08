/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan warna
                        kepribadian
                       
 */
package pbo2.pkg10117053.latihan40.warnakepribadian;

import java.util.Scanner;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.BIRU;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.BLUE;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.CYAN;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.GREEN;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.HIJAU;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.KUNING;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.MAGENTA;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.MERAH;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.NORMAL;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.RED;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.UNGU;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.WHITE;
import static pbo2.pkg10117053.latihan40.warnakepribadian.Warna.YELLOW;

public class  PBO210117053Latihan40WarnaKepribadian{

    public static void main(String[] args) {

        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU "
                + CYAN + "DARI " + MAGENTA + "WARNA " + BLUE + "FAVORITMU" + NORMAL);
        System.out.println("");
        System.out.println(WHITE + MERAH + "\t MERAH \t\t");
        System.out.println(WHITE + HIJAU + "\t HIJAU \t\t");
        System.out.println(WHITE + KUNING + "\t KUNING \t");
        System.out.println(WHITE + BIRU + "\t BIRU \t\t");
        System.out.println(WHITE + UNGU + "\t UNGU \t\t" + NORMAL);
        System.out.println("");

        Warna pWarna = new Warna();
        System.out.print("PILIH WARNA FAVORITMU : ");
        Scanner scanner = new Scanner(System.in);
        pWarna.pilihWarna = scanner.nextLine();

        Nama nama = new Nama();
        System.out.print("NAMA KAMU : ");
        nama.Nama = scanner.nextLine();

        String NAMABesar = nama.Nama.toUpperCase();
        System.out.println("===HASIL TEST KEPRIBADIAN " + NAMABesar + "===");

        nama.Nama(nama.Nama);
        pWarna.pilihWarna(pWarna.pilihWarna);

    }

}
