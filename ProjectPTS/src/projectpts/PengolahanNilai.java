/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package projectpts;

import javax.swing.JOptionPane;

/**
 *
 * @author refiahmadfauzan
 */
public class PengolahanNilai extends javax.swing.JInternalFrame {

    /**
     * Creates new form PengolahanNilai
     */
    public PengolahanNilai() {
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

        title = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelKelas = new javax.swing.JLabel();
        labelJenisKelamin = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        inputMapel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputKeterangan = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        inputNilai = new javax.swing.JTextField();
        labelJenisKelamin1 = new javax.swing.JLabel();
        inputKelas = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        title.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        title.setText("Pengolahan Nilai Siswa");

        labelNama.setText("Nama Siswa");

        labelKelas.setText("Kelas");

        labelJenisKelamin.setText("Mapel");

        labelAlamat.setText("Keterangan");

        inputMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMapelActionPerformed(evt);
            }
        });

        inputKeterangan.setEditable(false);
        inputKeterangan.setColumns(20);
        inputKeterangan.setRows(5);
        jScrollPane1.setViewportView(inputKeterangan);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        inputNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiActionPerformed(evt);
            }
        });

        labelJenisKelamin1.setText("Nilai");

        inputKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih kelas", "Kelas 10", "Kelas 11", "Kelas 12", "Kelas 13" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAlamat)
                            .addComponent(labelKelas)
                            .addComponent(labelNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJenisKelamin1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelJenisKelamin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submitButton)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputNama)
                            .addComponent(inputMapel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(inputNilai))))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKelas)
                    .addComponent(inputKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJenisKelamin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJenisKelamin1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMapelActionPerformed

    private void inputNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNilaiActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String nama, kelas, mapel;
        Double nilai;
        
        try {
        
        nama = inputNama.getText();
        kelas = (String)inputKelas.getSelectedItem();
        mapel = inputMapel.getText();
        nilai = Double.parseDouble(inputNilai.getText());
        
        if (nilai >= 90) {
            inputKeterangan.setText("Predikat A, Selamat anda lulus dengan nilai paling baik");
        } else if (nilai >= 80) {
            inputKeterangan.setText("Predikat B, Selamat anda lulus dengan nilai baik");
        } else if (nilai >= 70) {
            inputKeterangan.setText("Predikat C, Selamat anda lulus dengan nilai cukup baik");
        } else {
            inputKeterangan.setText("Predikat D, Mohon maaf nilai anda kurang, silahkan lakukan perbaikan");
        }
        
        JOptionPane.showMessageDialog(this, "Nama\t: " + nama + "\nKelas\t: " + kelas + "\nmapel\t: " + mapel + "\nnilai\t: " + nilai + "\nKeterangan\t: " + inputKeterangan.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukan nilai dengan angka!");
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> inputKelas;
    private javax.swing.JTextArea inputKeterangan;
    private javax.swing.JTextField inputMapel;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNilai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelJenisKelamin1;
    private javax.swing.JLabel labelKelas;
    private javax.swing.JLabel labelNama;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
