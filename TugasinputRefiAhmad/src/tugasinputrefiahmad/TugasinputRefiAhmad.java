/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasinputrefiahmad;
import java.util.*;

public class TugasinputRefiAhmad {
    public static void main(String[] args) {
         String nama, status;
         float tugas, quiz, uts, uas, na;
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("============= Rekap NIlai Siswa ==============");
         System.out.print("Masukkan nama siswa : ");
         nama = input.nextLine();
         System.out.print("Nilai Tugas\t:");
         tugas = input.nextInt();
         System.out.print("Nilai Quiz\t:");
         quiz = input.nextInt();
         System.out.print("Nilai Uts\t:");
         uts = input.nextInt();
         System.out.print("Nilai Uas\t:");
         uas = input.nextInt();
         
         
         na = (float) ((0.1 * tugas) + (0.2* quiz) + (0.3 * uts) + (0.4 * uas));
         
//         if (na >= 70) {
//             status = "Anda Lulus";
//             
//         } else {
//             status = "Anda gagal";
//             
//         }

         System.out.println("Nama : " + nama);
         System.out.println("Nilai Tugas : " + tugas );
         System.out.println("Nilai Quiz : " + quiz);
         System.out.println("Nilai UTS : " + uts);
         System.out.println("Nilai UAS : " + uas);     
         System.out.println("Nilai Akhir Anda : " + na);
         
         status = (na >= 70) ? "Anda Lulus" : "Anda tidak lulus"; 
         
         System.out.println("=======================");
         System.out.println("Status : " + status );
         
         
         
         
    }
    
}
