package Arithmatic;
import java.util.Scanner;
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
    Membuat program sederhana kalkulator (menggunakan Arithmatic Exception).
    Program akan terhenti jika user memasukkan pembagian 0.
*/
public class ProgramPertama {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int hasil = 0, angka1, angka2;
        char operator;
        
        System.out.println("====== KALKULATOR ======");
        System.out.print("Angka Pertama : ");
        angka1 = input.nextInt();
        
        System.out.print("Angka Kedua : ");
        angka2 = input.nextInt();
        
        System.out.println("Pilih operator yang akan digunakan!");
        System.out.println("(+)");
        System.out.println("(-)");
        System.out.println("(*)");
        System.out.println("(/)");
        System.out.println("(%)");
        System.out.println("===================");
        
        System.out.print(">  ");
        operator = input.next().charAt(0);
       
            switch (operator) {
                case '+' -> {
                    System.out.println("Anda memilih (+)");
                    hasil = angka1 + angka2;
                    System.out.println("Hasil dari " + angka1 + " + " + angka2 + " = " + hasil);
                    break;
                }
                case '-' -> {
                    System.out.println("Anda memilih (-)");
                    hasil = angka1 - angka2;
                    System.out.println("Hasil dari " + angka1 + " - " + angka2 + " = " + hasil);
                    break;
                }
                case '*' -> {
                    System.out.println("Anda memilih (*)");
                    hasil = angka1 * angka2;
                    System.out.println("Hasil dari " + angka1 + " * " + angka2 + " = " + hasil);
                    break;
                }
                case '/' -> {
                    System.out.println("Anda memilih (/)");
                    hasil = angka1 / angka2;
                    System.out.println("Hasil dari " + angka1 + " / " + angka2 + " = " + hasil);
                    break;
                }
                case '%' -> {
                    System.out.println("Anda memilih (%)");
                    hasil = angka1 % angka2;
                    System.out.println("Hasil dari " + angka1 + " % " + angka2 + " = " + hasil);
                    break;
                }
                default -> System.out.println("Operator yang anda masukan tidak tersedia!");
            }
        System.out.println("=== Terimakasih telah menggunakan kalkulator ini! ===");
    }   
}
