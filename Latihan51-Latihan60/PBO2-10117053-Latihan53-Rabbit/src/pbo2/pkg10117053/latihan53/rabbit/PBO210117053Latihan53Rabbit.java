/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       program Rabbit.
 */
package pbo2.pkg10117053.latihan53.rabbit;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit kelinci = new Rabbit("Peter",false,"grass",4,"grey");
        System.out.println("Hello, His name is "+kelinci.getName());
        System.out.println(kelinci.getName()+" is Vegetarian? "+kelinci.isVegetarian());
        System.out.println(kelinci.getName()+" eats "+kelinci.getEats());
        System.out.println(kelinci.getName()+" has "+kelinci.getNoOfLegs()+" legs.");
        System.out.println(kelinci.getName()+" color is "+kelinci.getColor());
    }
    
}
