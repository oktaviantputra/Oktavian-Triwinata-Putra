/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Manager
 */
package pbo2.pkg10117053.latihan51.gajikaryawan;

/**
 *
 * @author paycom
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = kehadiran*10000;
        return tunjanganKehadiran;
    }
    public float tunjanganJabatan (String jabatan){
        if (jabatan.equals("Manager")){
            tunjanganJabatan=2000000;
        }else if(jabatan.equals("Kabag")){
            tunjanganJabatan=1000000;
        }
        else
            tunjanganJabatan=0;
        return tunjanganJabatan;
    }
    public float tunjanganGolongan (int golongan){
        if (golongan == 1){
            tunjanganGolongan=500000;
        }else if(golongan == 2){
            tunjanganGolongan=1000000;
        }else if(golongan == 3){
            tunjanganGolongan=1500000;
        }
        return tunjanganGolongan;
    }
    
    public float totalGaji(){
        return tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;
    }
    
}
