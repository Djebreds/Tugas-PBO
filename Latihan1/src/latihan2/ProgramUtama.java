/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2;

/**
 *
 * @author refiahmadfauzan
 */
public class ProgramUtama {
    public static void main(String [] args) {
        Siswa siswa1 = new Siswa();
        Siswa siswa2 = new Siswa();
        
        siswa1.insertData(1010, "Refi Ahmad Fauzan");
        siswa1.tampilData();
        
        siswa2.insertData(2020, "Someone");
        siswa2.tampilData();
    }
}
