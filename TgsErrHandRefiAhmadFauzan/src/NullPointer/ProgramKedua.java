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
    Membuat program sederhana kalkulator (menggunakan NullPointerException).
    Program tetap berjalan meski parameter pada method di set null
*/

public class ProgramKedua {
    
    private String judul;
    private String genre;
    private double hargaTiket;
     
    public void setJudul(String judul) {
        try {
            this.judul = judul;
            if (judul == null) throw new NullPointerException();
        } catch (NullPointerException ex) {
            System.err.println("Judul tidak boleh null");
        }
    }
    
    public String getJudul() {
        return this.judul;
    }
  
    public void setGenre(String genre) {
        try {
            this.genre = genre;
            if (genre == null) throw new NullPointerException();
        } catch (NullPointerException ex) {
            System.err.println("Genre tidak boleh null");
        }
    }  
    
    public String getGenre() {
        return this.genre;
    }  
  
    public void setHarga(double hargaTiket) {
        try {
            this.hargaTiket = hargaTiket;
            if (hargaTiket == 0) throw new NullPointerException();
        } catch (NullPointerException ex) {
            System.err.println("Masukan jumlah harga tiket yang benar!");
        }
    }
    
    public double getHarga() {
        return this.hargaTiket;
    }  
}
