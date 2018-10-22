/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program class untuk menampilkan nilai
                       mahasiswa
 */
package pbo2.pkg10117053.latihan47.nilaimahasiswa;

/**
 *
 * @author paycom
 */
public class Nilai {
    private double nQuiz;
    private double nUTS;
    private double nUAS;
    private String indeks;
    private String keterangan;
    
    public Nilai (double nQuiz, double nUTS, double nUAS){
        this.nQuiz = nQuiz;
        this.nUTS = nUTS;
        this.nUAS = nUAS;
    }

    public double getnQuiz() {
        return nQuiz;
    }

    public double getnUTS() {
        return nUTS;
    }

    public double getnUAS() {
        return nUAS;
    }
    
    public double hitungNilaiAkhir(){
        return (nQuiz*0.2)+(nUTS*0.3)+(nUAS*0.5);
    }
    
    public String nilaiIndeks(double parNilaiAkhir){
        if(parNilaiAkhir >= 80 && parNilaiAkhir <= 100){
            indeks = "A";
        }else if(parNilaiAkhir >= 68 && parNilaiAkhir < 80){
            indeks = "B";
        }else if(parNilaiAkhir >= 56 && parNilaiAkhir < 68){
            indeks = "C";
        }else if(parNilaiAkhir >= 45 && parNilaiAkhir < 56){
            indeks = "D";
        }else if(parNilaiAkhir >= 0 && parNilaiAkhir < 45){
            indeks = "E";
        }
        return indeks;
    }
    
    public String indeksKeterangan(String parIndeks){
        if(parIndeks.equals("A")){
            keterangan = "Sangat Baik";
        }else if(parIndeks.equals("B")){
            keterangan = "Baik";
        }else if(parIndeks.equals("C")){
            keterangan = "Cukup";
        }else if(parIndeks.equals("D")){
            keterangan = "Kurang";
        }else if(parIndeks.equals("E")){
            keterangan = "Sangat Kurang";
        }
        return keterangan;
    }
            
}
