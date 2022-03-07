/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author refiahmadfauzan
 */
public class Siswa {
    int nis;
    String nama;
    public void insertData(int nis, String nama) {
        this.nis = nis;
        this.nama = nama;
    }
    public void tampilData() {
        System.out.println(this.nis);
        System.out.println(this.nama);
    }
        
}
