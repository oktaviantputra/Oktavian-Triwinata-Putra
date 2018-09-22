/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117053.latihan5.kambingglobal;

/** NAMA : Oktavian Triwinata Putra
 *  Kelas: IF-2
 *  NIM  : 10117053
 *  Matkul : PBO-2
 *  Deskripsi Program : Program untuk menampilkan data kambing menggunakan
 *                      variabel instance
 *
 * 
 */
public class KambingGlobal {

    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //  Method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
            System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
     public void tambahKambing(){
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah kambing setelah ditambah: " +
                                jumlahKambing);
    }
            
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        // Menampilkan jumlah yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
        
    }
    
}
