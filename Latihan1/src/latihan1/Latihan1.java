
package latihan1;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Latihan1 siswa = new Latihan1();
        Scanner input = new Scanner(System.in);
//        siswa.nis = 12323;
//        siswa.nama = "Refi Ahmad Fauzan";
        System.out.println("Masukkan nis:");
        int nis = input.nextInt();
        System.out.println(nis);
        System.out.println("Masukkan nama:");
        String nama = input.next();
        System.out.println("Your name is" + nama );
    }
    
}
