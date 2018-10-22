/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program class untuk menampilkan cetak
                       nama
 */
package pbo2.pkg10117053.latihan45.cetaknama;

/**
 *
 * @author paycom
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak() {
        return jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void cetak (String nama){
        System.out.println("Nama Anda : "+nama);
    }
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil Cetak :");
        for(int i=1; i<=jmlCetak;i++){
            System.out.println(i+". "+nama);
        }
    }
    
}
