/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan perhitungan
                       kalkulator
 */
package pbo2.pkg10117053.latihan48.kalkulator;

/**
 *
 * @author paycom
 */
public class PBO210117053Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator klt = new Kalkulator();
        klt.setValue1(7);
        klt.setValue2(5);
        System.out.println("VALUE 1 = "+klt.getValue1());
        System.out.println("VALUE 2 = "+klt.getValue2());
        klt.setNameProject();
        klt.setNoteProject(null);
        System.out.println("Result Add is = "+klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Minus is = "+klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiplication is = "+klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is = "+klt.division(klt.getValue1(), klt.getValue2()));
    }
    
}
