/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan perkenalan
                       mahasiswa
 */
package pbo2.pkg10117053.latihan31.perkenalanmahasiswa;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Mahasiswa mhs1 = new Mahasiswa();
        
        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);
        
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs2.nim = "10110270";
        mhs2.nama = "Indra Tiola";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
        
        Mahasiswa mhs3 = new Mahasiswa();
        
        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tansil Ganefi";
        mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
        
        Mahasiswa mhs4 = new Mahasiswa();
        
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awaludin";
        mhs4.perkenalkanDiri(mhs4.nim, mhs4.nama);
    }
    
}
