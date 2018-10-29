/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       data Handphone.
 */
package pbo2.pkg10117053.latihan55.handphone;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android andro = new Android("Xiaomi","Android","Redmi 6X",3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android KeyStore : "+andro.getKeyStore());
        System.out.println("");
        
        Blackberry bb = new Blackberry("Blackberry","BB10","Onyx",2000000);
        bb.setPinBB("ZH455HTT");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Microsoft","Windows Phone 10","RM 1090",3500000);
        wp.setWpKeyStore("AX55SB");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
    }
    
}
