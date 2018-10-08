/*
 *NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class user
                       
 */
package pbo2.pkg10117053.latihan33.userlogin;

/**
 *
 * @author paycom
 */
public class User {

    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword) {
        if (parUserName.equals(username) && parPassword.equals(password)) {
            statusAkun = true;
        } else{
            statusAkun = false;
        }
        return statusAkun;
    }

    private void hasilLogin(boolean status, String parUsername) {
        if (status) {
            System.out.println("******Hallo " + username.toUpperCase() + "******");
            System.out.println("Selamat Datang di Aplikasi Ini");
        } else {
            System.out.println("Ooops, Username atau Password salah");
        }
    }

    public void pengecekanLogin(String parUserName, String parPassword) {
        System.out.println(cekAkun(parUserName, parPassword));
        hasilLogin(statusAkun,parUserName);
    }

}
