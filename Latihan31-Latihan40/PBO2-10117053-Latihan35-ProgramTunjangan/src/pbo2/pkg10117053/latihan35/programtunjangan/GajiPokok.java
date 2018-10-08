/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk class gaji pokok
                       
 */
package pbo2.pkg10117053.latihan35.programtunjangan;

/**
 *
 * @author paycom
 */
public class GajiPokok {
    
    public double gajiAwal;
    public String status;
    public double tunjangan;
    
    public double hitungTunjangan(){
        tunjangan = (status.equals("Menikah"))? 0.35 * gajiAwal:0;
        
        return tunjangan;
    }
    
    public double hitungTotalGaji(){
        
        return gajiAwal + tunjangan;
    }
}
