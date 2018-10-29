/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas  untuk menampilkan data
                       Android.
 */
package pbo2.pkg10117053.latihan55.handphone;

/**
 *
 * @author paycom
 */
public class Android extends Handphone {
    private String keyStore;
    
    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture=man;
        this.operatingSystem=os;
        this.model=model;
        this.harga=harga;
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
    
    
}
