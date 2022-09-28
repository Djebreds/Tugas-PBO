/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulasi;

import java.util.Scanner;

/**
 *
 * @author refiahmadfauzan
 */
public class Karyawan {
    
    String ID,nama,divisi;
    Double gaji;
    public Karyawan(String kode, String nama, String div, Double gaji) {
        this.ID = kode;
        this.nama = nama;
        this.divisi = div;
        this.gaji = gaji;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Data karyawan :");
        System.out.println("ID : ");
        String id = scan.next();
        System.out.println("Nama : ");
        String n = scan.next();
        System.out.println("Divisi : ");
        String d = scan.next();
        System.out.println("Gaji : ");
        Double g = scan.nextDouble();
        Karyawan k = new Karyawan(id, n, d ,g);
        System.out.println("=======================");
        
        System.out.println("ID : " + k.ID);
        System.out.println("Nama : " + k.nama);
        System.out.println("Divisi : " + k.divisi);
        System.out.println("Gaji : " + k.gaji);
        
        
    }
}
