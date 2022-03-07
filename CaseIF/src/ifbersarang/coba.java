/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifbersarang;
import java.util.*;

/**
 *
 * @author refiahmadfauzan
 */
public class coba {
    public static void main(String[] args) {
        int pbo, pkk, pwpb, ppl, produktip, nilaiPel = 80;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai pbo :");
        pbo = input.nextInt();
        System.out.println("Masukan nilai pkk :");
        pkk = input.nextInt();
        System.out.println("Masukan nilai pwpb :");
        pwpb = input.nextInt();
        System.out.println("Masukan nilai ppl :");
        ppl = input.nextInt();
        
        produktip = pbo * pkk * pwpb * ppl / 4;
        
        if (produktip >= 70 && nilaiPel >= 60) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda harus mengikuti remedial");
        }
        
        
    }
}
