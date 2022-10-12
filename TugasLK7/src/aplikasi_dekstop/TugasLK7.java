/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasi_dekstop;

/**
 *
 * @author refiahmadfauzan
 */
public class TugasLK7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoadingScreen splash = new LoadingScreen();
        splash.setVisible(true);
        
        Login login = new Login();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                splash.progres.setText(Integer.toString(i) + "%");
                splash.loading.setValue(i);
                if (i == 100) {
                    splash.setVisible(false);
                    login.setVisible(true);
                }
            }
        } catch (Exception e) {
            
        }
    }
    
}
