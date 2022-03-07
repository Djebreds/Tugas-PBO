/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifbersarang;

/**
 *
 * @author refiahmadfauzan
 */
public class IfBersarang {
    public static void main(String[] args) {
        int angka = 13;
        int hasil;
        
        hasil = angka%2;
        
        if (hasil == 0) {
            System.out.println("Merupakan bilangan genap");
            if (angka >= 10) {
                System.out.println(angka + " lebih besar sama dengan 10");
            } else {
                System.out.println("lebih kecil dari 10");
            }
        } else {
            System.out.println("Merupakan bilangan ganjil");
            if (angka >= 10) {
                System.out.println(angka + " lebih besar sama dengan 10");
            } else {
                System.out.println(angka + " lebih kecil dari 10");
            }
        }
    }
}
