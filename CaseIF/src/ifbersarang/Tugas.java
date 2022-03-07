package ifbersarang;
import java.util.*;
/**
 *
 * @author refiahmadfauzan
 */
public class Tugas {
    public static void main(String[] args) {
        double tugas = 70, quiz = 70, uts = 70, uas = 80, akhir;
        char index;
        String status;
        
        Scanner input = new Scanner(System.in);
        
        
        akhir = ((0.1 * tugas) + (0.2 * quiz) + (0.3 * uts) + (0.4 * uas));        
        
        if (akhir >= 91) {
            index = 'A';
        } else if (akhir >= 81) {
            index = 'B';
        } else if (akhir >= 71) {
            index = 'C';
        } else if (akhir >= 61) {
            index = 'D';
        } else {
            index = 'E';
        }
        
        status = (akhir >= 70) ? "Siswa Lulus" : "Siswa Gagal";
        
        System.out.println("========= Hasil =========");
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai Quiz: " + quiz);
        System.out.println("Nilai UTS: " + uts);
        System.out.println("Nilai UAS: " + uas);
        System.out.println("--------------------------");
        System.out.println("Nilai Akhir : " + akhir );
        System.out.println("Status: " + status);
        System.out.println("Predikat: " + index);

    }
}
