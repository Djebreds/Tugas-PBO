/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorfisme;

/**
 *
 * @author refiahmadfauzan
 */

abstract class Bentuk {
    protected int panjang;
    protected int lebar;
    
    public String getBentuk() {
        return "Bentuk Dasar";
    }
    
    public int hitungLuas() {
        return panjang*lebar/2;
    }
    
}

class BujurSangkar extends Bentuk {
     public BujurSangkar(int panjang, int lebar) {
         this.panjang = panjang;
         this.lebar = lebar;
     }
     
     public String getBentuk() {
         return "Bentuk Bujur Sangkar";
     }
     
     public int hitungLuas() {
         return panjang*lebar;
     }
}

class SegiTiga extends Bentuk {
    public SegiTiga(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public String getBentuk() {
        return "Bentuk SegiTiga";
    }
    
}

public class Polymorfisme {
    public static void cetakLuasBentuk(Bentuk btk) {
        System.out.println(btk.getBentuk() + " dengan luas" + btk.hitungLuas());
    }
    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(10,20);
        BujurSangkar bs1 = new BujurSangkar(10,20);
        SegiTiga st = new SegiTiga(5,10);
        SegiTiga st1 = new SegiTiga(5,10);
        
        Bentuk bt = new BujurSangkar(10,2);
       
        cetakLuasBentuk(bs);
        cetakLuasBentuk(bs1);
        cetakLuasBentuk(st);
        cetakLuasBentuk(st1);
        
    }
}

