/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil data
                       Vehicle.
 */
package pbo2.pkg10117053.latihan57.vehicle;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyModel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        System.out.println("");
        
        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLeght(54.5);
        System.out.println("Brand : "+skate.getMyBrand());
        System.out.println("Model : "+skate.getMyModel());
        System.out.println("Panjangnya Board : "+skate.getMyBoardLeght());
    }
    
}
