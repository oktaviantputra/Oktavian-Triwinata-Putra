/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       biodata Detective Conan.
 */
package pbo2.pkg10117053.latihan59.detectiveconan;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kartun mnc = new Kartun("Conan Edogawa",false,"mancing","Sushi");
        System.out.println("Nama Saya Adalah "+ mnc.getName());
        System.out.println(mnc.getName()+" Sifat Saya tidak mudah menyerah "+ mnc.isSifat());
        System.out.println(mnc.getName()+ " Hobby saya adalah "+ mnc.Hobby);
        System.out.println(mnc.getName()+" Makanan Kesukaan "+mnc.getMakanan());
        
    }
    
}
