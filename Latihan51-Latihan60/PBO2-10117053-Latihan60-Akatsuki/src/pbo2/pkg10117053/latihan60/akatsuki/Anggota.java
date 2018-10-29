/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Anggota.
 */
package pbo2.pkg10117053.latihan60.akatsuki;

/**
 *
 * @author paycom
 */
public class Anggota extends Akatsuki {
    private String buruan;

    public Anggota(String nam, String asalDesa, String pasangan, String jurus, String buruan) {
        super(nam, asalDesa, pasangan, jurus);
        this.buruan=buruan;        
    }

    public String getBuruan() {
        return buruan;
    }

    @Override
    public void tampil() {
         System.out.println("Nama : "+nama);
        System.out.println("Asal Desa : "+asalDesa);
        System.out.println("pasangan : "+pasangan);
        System.out.println("Jurus : "+jurus);
        System.out.println("Target Buruan : "+buruan);
}
}
