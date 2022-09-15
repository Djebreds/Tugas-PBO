/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tugaslk4;

import javax.swing.JOptionPane;

/**
 *
 * @author refiahmadfauzan
 */
public class Hotel extends javax.swing.JInternalFrame {

    /**
     * Creates new form Hotel
     */
    public Hotel() {
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

        judul = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        labelKamar = new javax.swing.JLabel();
        inputKamar = new javax.swing.JComboBox<>();
        inputMenginap = new javax.swing.JTextField();
        labelMenginap = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTotal = new javax.swing.JTextPane();

        setClosable(true);
        setTitle("Harga Hotel");

        judul.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        judul.setText("HOTEL");

        labelNama.setText("Nama");

        labelKamar.setText("Tipe Kamar");

        inputKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Superior", "Deluxe", "Premium" }));
        inputKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKamarActionPerformed(evt);
            }
        });

        inputMenginap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMenginapActionPerformed(evt);
            }
        });

        labelMenginap.setText("Menginap");

        labelTotal.setText("Total:");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 102));

        resultTotal.setBackground(new java.awt.Color(255, 204, 153));
        jScrollPane1.setViewportView(resultTotal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submit))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNama)
                                    .addComponent(labelKamar))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputKamar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTotal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelMenginap)
                                        .addGap(40, 40, 40)
                                        .addComponent(inputMenginap, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(judul)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(judul)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKamar)
                    .addComponent(inputKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMenginap)
                    .addComponent(inputMenginap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(labelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKamarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputKamarActionPerformed

    private void inputMenginapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMenginapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMenginapActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        String tipe_kamar;
        int menginap, harga, total;
        
        tipe_kamar = (String)inputKamar.getSelectedItem();
        menginap = Integer.parseInt(inputMenginap.getText());
        switch(tipe_kamar) {
            case "Superior" -> {
                if (menginap <= 2) {
                    harga = 100000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Superior\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.100000\n Harga Permalam Rp." + harga + "\n Total Harga Rp." + total);
                } else if (menginap > 2 && menginap <= 4) {
                    harga = 90000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Superior\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.90000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                } else if (menginap > 4) {
                    harga = 80000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Superior\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.80000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                }
            }
            case "Deluxe" -> {
                if (menginap <= 2) {
                    harga = 150000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Deluxe\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.150000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                } else if (menginap > 2 && menginap <= 4) {
                    harga = 135000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Deluxe\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.135000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                } else if (menginap >= 5) {
                    harga = 120000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Deluxe\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.120000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                }
            }
            case "Premium" -> {
                resultTotal.setText("Kamar Premium\n" + "Lama menginap " + menginap + " Hari");
                if (menginap <= 2) {
                    harga = 200000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Premium\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.200000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                } else if (menginap > 2 && menginap <= 4) {
                    harga = 180000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Premium\n" + "Lama menginap " + menginap + " Hari\n" + "Harga per malam = Rp.180000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                } else if (menginap >= 5) {
                    harga = 160000;
                    total = harga * menginap;
                    resultTotal.setText("Kamar Premium\n" + "Lama menginap" + menginap + " Hari\n" + "Harga per malam = Rp.160000\n Permalam Rp." + harga + "\n Total Harga Rp." + total);
                }
            }
            default -> resultTotal.setText("Silahkan pilih kamar");
        }

    }//GEN-LAST:event_submitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> inputKamar;
    private javax.swing.JTextField inputMenginap;
    private javax.swing.JTextField inputNama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelKamar;
    private javax.swing.JLabel labelMenginap;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTextPane resultTotal;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
