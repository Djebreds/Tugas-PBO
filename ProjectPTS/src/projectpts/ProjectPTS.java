/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpts;

/**
 *
 * @author refiahmadfauzan
 */
public class ProjectPTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        LoadingScreen loading = new LoadingScreen();
        loading.setVisible(true);
        
        LoginScreen login = new LoginScreen();
        
        try {
            for (int a = 0; a <= 100; a++) {
                Thread.sleep(50);
                loading.progress.setText(Integer.toString(a) + "%");
                loading.progressBar.setValue(a);
                
                if (a == 100) {
                    loading.setVisible(false);
                    login.setVisible(true);
                }
                
            }
        } catch (Exception e) {
            
        }
        
    }
    
}
