/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       gaji pegawai
 */
package pbo2.pkg10117053.latihan43.gajipegawai;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("---------------------");
        GajiPegawai pgw = new GajiPegawai();
        pgw.setNama("Rizki Adam Kurniawan");
        pgw.setAlamat("Jalan Semar dalam 4 No 72/66");
        pgw.setUangTransport(250000);
        pgw.setUangTunjangan(300000);
        pgw.setGajiPokok(4500000);
        pgw.setTotalGaji(pgw.getTotalGaji());
        pgw.tampilData(pgw.getNama(), pgw.getAlamat(), pgw.getUangTunjangan(), pgw.getUangTransport(), pgw.getGajiPokok(), pgw.getTotalGaji());
        
    }
    
}
