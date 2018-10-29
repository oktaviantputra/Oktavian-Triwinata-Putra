/*
 * NAMA       : Oktavian Triwinata Putra
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117053
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Rabbit
 */
package pbo2.pkg10117053.latihan53.rabbit;

/**
 *
 * @author paycom
 */
public class Rabbit extends Animal {
    private String color;
    private String name;
    
    public Rabbit(String name,boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name=name;
        this.vegetarian=veg;
        this.eats=food;
        this.noOfLegs=legs;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
