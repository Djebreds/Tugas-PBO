/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tugaspresentasi;

/**
 *
 * @author refiahmadfauzan
 */
public class PersegiPanjang extends javax.swing.JInternalFrame {

    class Persegi extends PersegiPanjang {
        double hitungLuas() {
            Double panjang, lebar, luas;
            panjang = Double.parseDouble(inputPanjang.getText());
            lebar = Double.parseDouble(inputLebar.getText());
            luas = panjang * lebar;
            
            return luas;
        }
        
        double hitungkeliling() {
            Double panjang, lebar, keliling;
            panjang = Double.parseDouble(inputPanjang.getText());
            lebar = Double.parseDouble(inputLebar.getText());
            keliling = (2 * panjang) + (2 * lebar);
            
            return keliling;
        }
    }
    
    /**
     * Creates new form PersegiPanjang
     */
    public PersegiPanjang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputPanjang = new javax.swing.JTextField();
        inputLebar = new javax.swing.JTextField();
        inputPilihan = new javax.swing.JComboBox<>();
        hasil = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Penerapan Inheritance");

        jLabel2.setText("Masukan panjang");

        jLabel3.setText("Masukan lebar");

        jLabel4.setText("Masukan pilihan");

        inputPilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luas", "Keliling" }));
        inputPilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPilihanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hasil)
                        .addComponent(jLabel4)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputPanjang)
                    .addComponent(inputLebar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(inputPilihan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(hasil)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPilihanActionPerformed
        // TODO add your handling code here:
        Persegi persegi = new Persegi();
        String pilihan;
        
        Double luas1, keliling1;
        pilihan = (String)inputPilihan.getSelectedItem();
        
        switch(pilihan) {
            case "Luas" :
                luas1 = persegi.hitungLuas();
                hasil.setText("Luas Persegi Panjang : " + String.valueOf(luas1));
                break;
            case "Keliling" : 
                keliling1 = persegi.hitungkeliling();
                hasil.setText("Keliling Persei Panjang :" + String.valueOf(keliling1));
                break;
        }
    }//GEN-LAST:event_inputPilihanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hasil;
    private javax.swing.JTextField inputLebar;
    private javax.swing.JTextField inputPanjang;
    private javax.swing.JComboBox<String> inputPilihan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
