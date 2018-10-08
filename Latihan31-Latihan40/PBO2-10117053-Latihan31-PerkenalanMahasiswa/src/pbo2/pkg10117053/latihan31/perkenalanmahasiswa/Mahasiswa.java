/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class mahasiswa
                       
 */
package pbo2.pkg10117053.latihan31.perkenalanmahasiswa;

/**
 *
 * @author paycom
 */
public class Mahasiswa {
    public String nama;
    public String nim;
    
    public void perkenalkanDiri(String parNim, String parNama){
        System.out.println("Hello Everyone");
        System.out.println("My nim is : " +parNim);
        System.out.println("My name is : " +parNama);
        System.out.println("");
    }
}
