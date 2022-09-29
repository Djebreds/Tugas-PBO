/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author refiahmadfauzan
 */
public class Inheritance {
    public static void main(String[] args) {
        A ParentClass = new A();
        B ChildClass = new B();
        
        System.out.println("Parent Class");
        
        ParentClass.x = 10;
        ParentClass.y = 20;
        ParentClass.tampilkanNilaiXY();
        
        System.out.println("Child Class");
        
        ChildClass.x = 5;
        ChildClass.y = 4;
        ChildClass.tampilkanNilaiXY();
        
        System.out.println("Jumlah Child Class");
        
        ChildClass.y = 4;
        ChildClass.tampilkanJumlah();
        
        System.out.println("Child Class");
        
        ChildClass.x = 15;
        ChildClass.y = 14;
        ChildClass.tampilkanNilaiXY();
        
        System.out.println("Parent Class");
        
        ParentClass.x = 10;
        ParentClass.y = 20;
        
        ParentClass.tampilkanNilaiXY();
        
        System.out.println("Child Class Jumlah");
        
        ChildClass.z = 60;
        ChildClass.tampilkanJumlah();
        
        
    }
    private static class A {
         int x, y;
        
        void tampilkanNilaiXY() {
            System.out.println("Nilai x : " + x + ", y : " + y);
        }
    }
    private static class B extends A {
        int z;
        
        void tampilkanJumlah() {
            System.out.println("Jumlah : " + (x+y+z) );
        }
    }
}
