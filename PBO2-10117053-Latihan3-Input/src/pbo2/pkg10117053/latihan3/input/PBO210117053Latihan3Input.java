/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117053.latihan3.input;

import java.util.Scanner;

/** NAMA : Oktavian Triwinata Putra
 *  Kelas: IF-2
 *  NIM  : 10117053
 *  Matkul : PBO-2
 *  Deskripsi Program : Program ini berisi untuk memasukkan nilai menggunakan
 *                      keyboard
 *
 * 
 */
public class PBO210117053Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah :"+nama);
    }
    
}
