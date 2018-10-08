/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan user login
                       
 */
package pbo2.pkg10117053.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan33UserLogin {

    private String usName;
    private String passWord;
    
    public static void main(String[] args) {
        
       User masuk = new User();
       Scanner scn = new Scanner(System.in);
       
        System.out.println("Masukkan Username\t: ");
        String user = scn.next();
        System.out.println("Masukan Password\t: ");
        String pass = scn.next();
        System.out.println();
        
        masuk.pengecekanLogin(user, pass);
                
                
               
               
               
               
     
    }
    
}
