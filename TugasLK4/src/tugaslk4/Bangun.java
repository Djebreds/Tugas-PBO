/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tugaslk4;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
/**
 *
 * @author refiahmadfauzan
 */
//mengatur canvas
public class Bangun extends javax.swing.JInternalFrame {
    public static final int Canvas_Width=600;
    public static final int Canvas_Height=480;
    private String jenis;

    /**
     * Creates new form Bangun
     */
    public Bangun() {
        initComponents();
        jenis="Kotak";
        setPreferredSize(new Dimension(Canvas_Width,Canvas_Height));
    }
    
    //switch case untuk menggambar jenis bangun datar
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        switch(jenis){
            case "Kotak":
                kotak(g);
            break;
            case "Lingkaran":
                lingkaran(g);
            break;
            case "Segitiga":
                segitiga(g);
            break;
            case "Garis":
                garis(g);
            break;
            case "Segienam" :
                segienam(g);
            break;
                
            
        }
    }
    
    //membuat bangun datar kotak,lingkaran,segitiga,garis
    public void kotak(Graphics g){
        setBackground(Color.WHITE);
        //setContentPane(new Form3a());
        Graphics2D g2=(Graphics2D) g;
        g2.setPaint(Color.MAGENTA);
        g2.draw(new Rectangle2D.Double(20,50, 80, 20));
        g2.fill(new Rectangle2D.Double(20,150, 100, 50));
    }
    public void lingkaran(Graphics g){
        setBackground(Color.YELLOW);
        Graphics2D g2=(Graphics2D) g;
        g2.setPaint(Color.blue);
        g2.draw(new Ellipse2D.Double(20,50, 100, 50));
        g2.fill(new Ellipse2D.Double(20,120, 100, 50));
    }
    
    public void segitiga(Graphics g){
        setBackground(Color.WHITE);
        Graphics2D g2=(Graphics2D) g;
        g2.setPaint(Color.RED);
        double x[]={183,72,45};
        double y[]={196,72,196};

        GeneralPath p=new GeneralPath();
        p.moveTo(x[0], y[0]);
        
        for (int i=1;i<x.length;i++){
            p.lineTo(x[i],y[i]);
        }
        
        g2.fill(p);

    }

    public void garis(Graphics g){
        setBackground(Color.WHITE);
        Graphics2D g2=(Graphics2D) g;
        g2.setPaint(Color.RED);
        double x[]={100,200,200,300,300,400,400,500,500,600};
        double y[]={300,300,150,150,300,300,50,50,300,300};
        GeneralPath p=new GeneralPath();
        p.moveTo(x[0], y[0]);
        
        for (int i=1;i<x.length;i++){
            p.lineTo(x[i],y[i]);
        }
        
        g2.draw(p);
    }
    
    public void segienam(Graphics g){
       setBackground(Color.WHITE);
       Graphics2D g2=(Graphics2D) g;
       g2.setPaint(Color.RED);
       double x[]={100,200,250,200,100,50,100};
       double y[]={300,300,200,100,100,200,300};
       
       GeneralPath p=new GeneralPath();
       p.moveTo(x[0], y[0]);
       for (int i=1;i<x.length;i++){
           p.lineTo(x[i],y[i]);
                      
       }
       g2.fill(p);
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
        pilihan = new javax.swing.JComboBox<>();
        labelBangunDatar = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setOpaque(true);

        judul.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        judul.setText("Bidang Datar");

        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kotak", "Lingkaran", "Segitiga", "Garis", "Segienam" }));
        pilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanActionPerformed(evt);
            }
        });

        labelBangunDatar.setText("PILIH YANG MANA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(judul))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelBangunDatar)
                        .addGap(37, 37, 37)
                        .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(judul)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBangunDatar)
                    .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanActionPerformed
        // TODO add your handling code here:

        String pil;
        pil=(String) pilihan.getSelectedItem();
        switch(pil){
            case "Kotak":
                jenis="Kotak";
                Bangun tigaa=new Bangun();
                setContentPane(tigaa);

                repaint();
                tigaa.setDefaultCloseOperation(PROPERTIES);
                tigaa.pack();
            break;

            case "Lingkaran":
                jenis="Lingkaran";
                setContentPane(new Bangun());
                repaint();
            break;

            case "Segitiga":
                jenis="Segitiga";
                setContentPane(new Bangun());
                repaint();
            break;

            case "Garis":
                jenis="Garis";
                setContentPane(new Bangun());
                repaint();
            break;
            
            case "Segienam" :
                jenis = "Segienam";
                setContentPane(new Bangun());
                repaint();
        }
    }//GEN-LAST:event_pilihanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelBangunDatar;
    private javax.swing.JComboBox<String> pilihan;
    // End of variables declaration//GEN-END:variables
}
