/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tugaslk4;

/**
 *
 * @author refiahmadfauzan
 */
public class NilaiSiswa extends javax.swing.JInternalFrame {

    /**
     * Creates new form Nilai
     */
    public NilaiSiswa() {
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

        inputNama = new javax.swing.JTextField();
        inputUTS = new javax.swing.JTextField();
        inputUAS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelUTS = new javax.swing.JLabel();
        labelUAS = new javax.swing.JLabel();
        inputTugas = new javax.swing.JTextField();
        labelTugas = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        labelHasil = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextPane();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Nilai Siswa");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setText("Nilai Siswa");

        labelNama.setText("Nama siswa");

        labelUTS.setText("Nilai UTS");

        labelUAS.setText("Nilai UAS");

        labelTugas.setText("Nilai Tugas");

        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        labelHasil.setText("Hasil :");

        result.setBackground(new java.awt.Color(255, 204, 102));
        jScrollPane2.setViewportView(result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTugas)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUTS)
                                    .addComponent(labelUAS))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputUAS, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(inputTugas)
                                    .addComponent(inputUTS)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNama)
                                .addGap(48, 48, 48)
                                .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHasil)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hitung)))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUTS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUAS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTugas))
                .addGap(18, 18, 18)
                .addComponent(hitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        String nama;
        double uas, uts, tugas, akhir;
        nama = inputNama.getText();
        uas = Double.parseDouble(inputUAS.getText());
        uts = Double.parseDouble(inputUTS.getText());
        tugas = Double.parseDouble(inputTugas.getText());

        akhir = uts + uas + tugas / 3;

        if (akhir >= 90) {
            result.setText("Selamat, " + nama + " anda lulus, Predikat A");
        } else if (akhir >= 80) {
            result.setText("Selamat, " + nama + " anda lulus, Predikat B");
        } else if (akhir >= 70) {
            result.setText("Selamat, " + nama + " anda lulus, Predikat C");
        } else {
            result.setText("Mohon maaf, " + nama + " anda tidak lulus, Predikat D");
        }

    }//GEN-LAST:event_hitungActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hitung;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputTugas;
    private javax.swing.JTextField inputUAS;
    private javax.swing.JTextField inputUTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTugas;
    private javax.swing.JLabel labelUAS;
    private javax.swing.JLabel labelUTS;
    private javax.swing.JTextPane result;
    // End of variables declaration//GEN-END:variables
}