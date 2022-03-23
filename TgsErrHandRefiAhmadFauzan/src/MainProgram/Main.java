/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainProgram;
import NullPointer.ProgramKedua;
import NullPointer.ProgramPertama;
/**
 *
 * @author refiahmadfauzan
 */
public class Main {
    public static void main(String[] args) {
        // Program Kedua menggunakan NullPointerException
        ProgramPertama film1 = new ProgramPertama(); 
        System.out.println("==== Program Pertama ====");
        film1.setJudul(null);
        film1.setGenre("Mystery, Action, Drama");
        film1.setHarga(20000);
     
        System.out.println("Judul Film  : " + film1.getJudul());
        System.out.println("Genre Film  : " + film1.getGenre());
        System.out.println("Harga Tiket : Rp." + film1.getHarga());
      
        // Program Kedua menggunakan NullPointerException
        System.out.println("==== Program Pertama ====");
        ProgramKedua film2 = new ProgramKedua(); 
        film2.setJudul("Spider-Man No Way Home");
        film2.setGenre(null);
        film2.setHarga(75000);
     
        System.out.println("Judul Film  : " + film2.getJudul());
        System.out.println("Genre Film  : " + film2.getGenre());
        System.out.println("Harga Tiket : Rp." + film2.getHarga());
        
     
        
    }
}
