/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NullPointer;
/**
 *
 * @author refiahmadfauzan
 */
/*
    Nama pemogram : Refi Ahmad Fauzan
    Kelas : XI RPL 1
    TanggalPembuatan : 17 Maret - 2022
    Deskripsi :
    Tugas Exception Hadling
    Membuat program Film (Tidak menggunakan NullPointerException).
    program akan berhenti jika Judul Film di set Null. 
*/
public class ProgramPertama {
    
    private String judul;
    private String genre;
    private double hargaTiket;
    
    // akan yang akan menghasilkan NullPointerException
//    public void setJudul(String judul) {
//        throw null;
//    }
//     
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getJudul() {
        return this.judul;
    }      
  
    public void setGenre(String genre) {
        this.genre = genre;
    }  
    public String getGenre() {
        return this.genre;
    }  
    
    public void setHarga(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }  
    public double getHarga() {
        return this.hargaTiket;
    } 
}

