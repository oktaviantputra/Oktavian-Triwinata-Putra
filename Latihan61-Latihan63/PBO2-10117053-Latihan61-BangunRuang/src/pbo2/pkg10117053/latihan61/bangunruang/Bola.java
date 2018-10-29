/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Bola.
 */
package pbo2.pkg10117053.latihan61.bangunruang;

/**
 *
 * @author paycom
 */
public class Bola extends BangunRuang {
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
        return (4 * 22 * r * r * r) / 7/ 3;
    }
}
