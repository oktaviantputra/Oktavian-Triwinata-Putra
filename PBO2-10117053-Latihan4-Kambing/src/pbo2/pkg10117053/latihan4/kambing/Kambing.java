/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117053.latihan4.kambing;

/**  NAMA : Oktavian Triwinata Putra
 *  Kelas: IF-2
 *  NIM  : 10117053
 *  Matkul : PBO-2
 *  Deskripsi Program : Program untuk menampilkan data kambing menggunakan
 *                      variabel lokal
 *
 * 
 */
public class Kambing {

    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " +
                            jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
