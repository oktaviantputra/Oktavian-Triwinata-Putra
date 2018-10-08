/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class film
                       
 */
package pbo2.pkg10117053.latihan32.daftarfilm;

/**
 *
 * @author paycom
 */
public class Film {
    
    public String name;
    public String genre;
    public double rating;
    public int duration;
    
    public void nowPlaying(String parName, String parGenre, double parRating,
                int parDuration) {
        System.out.println("Judul Film : " + parName);
        System.out.println("Genre Film : " + parGenre);
        System.out.println("Rating Film : " + parRating);
        System.out.println("Duration Film : " + parDuration + " Menit ");
        System.out.println("");
    }
    
}
