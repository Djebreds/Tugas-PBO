/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package aplikasi_dekstop;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author refiahmadfauzan
 */
public class LihatNilai extends javax.swing.JInternalFrame {
    Connection conn;
    DefaultTableModel tm;

    /**
     * Creates new form LihatNilai
     */
    public LihatNilai() {
        initComponents();
        connect();
        refreshTable();
    }
    
    private void connect() {
        conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/sakola_db_nilai_siswa", "root", "root");
        } catch (Exception e) {
            System.out.println("ERROR CONNECT KE DATABASE:\n" + e);
        }
    }
    
    private void refreshTable() {
        tm = new DefaultTableModel(null, new Object[] {"NIS", "Nama", "Jurusan", "Kelas" ,"Mapel", "Nilai Akhir"});
        tabelNilai.setModel(tm);
        tm.getDataVector().removeAllElements();
        
        try {
            String sql = "SELECT murid.nis, murid.nama, jurusan.namajurusan, kelas.nama_kelas, mapel.namamapel,nilai.nilaisiswa FROM nilai JOIN jurusan ON jurusan.kodejurusan = nilai.kodejurusan JOIN kelas ON kelas.kodekelas = nilai.kodekelas JOIN murid ON murid.nis = nilai.nis JOIN mapel ON mapel.idmapel = nilai.idmapel;";
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet result = p.executeQuery();
            
            while(result.next()) {
                Object[] data = {
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getString(5),
                    result.getString(6),
                };
                tm.addRow(data);
            }   
        } catch (Exception e) {
            System.out.println("ERROR QUERY KE DATABASE:\n"+ e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelNilai = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Daftar Nilai");

        tabelNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelNilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelNilaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelNilai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel3)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelNilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelNilaiMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tabelNilaiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelNilai;
    // End of variables declaration//GEN-END:variables
}
