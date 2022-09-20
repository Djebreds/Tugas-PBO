/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaslk5;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author refiahmadfauzan
 */
public class NilaiSiswa {

    /**
     * @param args the command line arguments
     */
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(String[] args) {
        String nama, nis;
        double nilaiAkhir, pts, pas, nilaiTugas;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("================ Menghitung Nilai Siswa =============");
        System.out.print("Masukan Nama Anda \t: ");
        nama = scan.nextLine();
        System.out.print("Masukan NIS Anda \t: ");
        nis = scan.next();
        System.out.print("Masukan Nilai Tugas \t: ");
        nilaiTugas = scan.nextDouble();
        System.out.print("Masukan Nilai PTS \t: ");
        pts = scan.nextDouble();
        System.out.print("Masukan Nilai PAS \t: ");
        pas = scan.nextDouble();
        System.out.println("==================================================");
        
        System.out.print("\n\n");
        nilaiAkhir = (nilaiTugas + pts + pas) / 3;
        
        System.out.println("================ Hasil Akhir ==================");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIS\t\t: " + nis);
        System.out.println("Nilai Tugas\t: " + nilaiTugas);
        System.out.println("Nilai PTS\t: " + pts);
        System.out.println("Nilai PAS\t: " + pas);
        System.out.println("---------------------------------------------");
        System.out.println("Nilai Akhir\t: " + df2.format(nilaiAkhir));
        System.out.println("=============================================");
        
    }
    
}
