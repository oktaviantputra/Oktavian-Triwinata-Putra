/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan perbandingan dua buah nilai
 */
package pbo2.pkg10117053.latihan24.perbandingan.dua.buah.nilai;

import java.util.Scanner;

public class PBO210117053Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);

        int nNilai1, nNilai2, Hasil, i;
        String jawaban, peritah;

        boolean ulang = true;

        while (ulang == true) {
            System.out.print("Masukkan Nilai Pertama : ");
            Scanner scanner = new Scanner(System.in);
            nNilai1 = scanner.nextInt();

            System.out.print("Masukkan Nilai Kedua : ");
            nNilai2 = scanner.nextInt();

            jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");

            System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);

            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            String perintah = scanner.next();

            if (perintah.equals("tidak")) {
                ulang = false;
                System.out.println("Keluar");
            } else {
                System.out.print("Masukkan Nilai Pertama : ");
                nNilai1 = scanner.nextInt();

                System.out.print("Masukkan Nilai Kedua : ");
                nNilai2 = scanner.nextInt();

                jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");

                System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);

                System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
                perintah = scanner.next();
            }
        }
    }

}
