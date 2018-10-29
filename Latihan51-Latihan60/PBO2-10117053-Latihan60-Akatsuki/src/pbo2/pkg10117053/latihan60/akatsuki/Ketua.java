/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Ketua.
 */
package pbo2.pkg10117053.latihan60.akatsuki;

/**
 *
 * @author paycom
 */
public class Ketua extends Akatsuki {
    private String kekuatanKhusus  ;

    public Ketua(String nam, String asalDesa, String pasangan, String jurus, String kekuatanKhusus) {
        super(nam, asalDesa, pasangan, jurus);
        this.kekuatanKhusus=kekuatanKhusus;
    }

    @Override
    public void tampil() {
        System.out.println("Nama : "+nama);
        System.out.println("Asal Desa : "+asalDesa);
        System.out.println("pasangan : "+pasangan);
        System.out.println("Jurus : "+jurus);
        System.out.println("Kekuatan Khusus : "+kekuatanKhusus);
    }
    

    public String getKekuatanKhusus() {
        return kekuatanKhusus;
}
}