/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117053.latihan6.kambingstatic;

/** NAMA : Oktavian Triwinata Putra
 *  Kelas: IF-2
 *  NIM  : 10117053
 *  Matkul : PBO-2
 *  Deskripsi Program : Menghubungkan antar satu kelas ke kelas lainnya 
 *
 * 
 */
public class KambingStatic {
    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 48500;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + 
                           Mamalia.jumlahKambing);
    }
    
}
