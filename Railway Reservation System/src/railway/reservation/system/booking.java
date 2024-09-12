/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railway.reservation.system;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author lenovo
 */
public class booking extends javax.swing.JFrame {

   
    public booking() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namef1 = new javax.swing.JLabel();
        lastnamef1 = new javax.swing.JLabel();
        cnicf1 = new javax.swing.JLabel();
        genderf1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        contact1 = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        namef2 = new javax.swing.JTextField();
        lastnamef2 = new javax.swing.JTextField();
        cnicf2 = new javax.swing.JTextField();
        malef2 = new javax.swing.JRadioButton();
        femalef2 = new javax.swing.JRadioButton();
        emailf2 = new javax.swing.JTextField();
        contactf2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressf2 = new javax.swing.JTextArea();
        clear1 = new javax.swing.JButton();
        quit1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Railway Reservation System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 381, -1));

        namef1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namef1.setText("Name");
        jPanel1.add(namef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, -1));

        lastnamef1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lastnamef1.setText("Last  Name");
        jPanel1.add(lastnamef1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 120, -1));

        cnicf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cnicf1.setText("CNIC");
        jPanel1.add(cnicf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, -1));

        genderf1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        genderf1.setText("Gender");
        jPanel1.add(genderf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 70, -1));

        email1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        email1.setText("Email");
        jPanel1.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 70, -1));

        contact1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        contact1.setText("Contact");
        jPanel1.add(contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 70, -1));

        address1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        address1.setText("Address");
        jPanel1.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 70, -1));
        jPanel1.add(namef2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 559, 20));
        jPanel1.add(lastnamef2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 559, -1));
        jPanel1.add(cnicf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 559, -1));

        malef2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        malef2.setText("Male");
        malef2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malef2ActionPerformed(evt);
            }
        });
        jPanel1.add(malef2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 66, -1));

        femalef2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        femalef2.setText("Female");
        jPanel1.add(femalef2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 91, -1));
        jPanel1.add(emailf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 559, -1));
        jPanel1.add(contactf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 559, -1));

        addressf2.setColumns(20);
        addressf2.setRows(5);
        jScrollPane1.setViewportView(addressf2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 559, 76));

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        quit1.setText("Quit");
        quit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit1ActionPerformed(evt);
            }
        });
        jPanel1.add(quit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jLabel2.setBackground(java.awt.Color.black);
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("BOOKING");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 110, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway/reservation/system/image1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        namef2.setText("");
        lastnamef2.setText("");
        cnicf2.setText("");
        malef2.setText("");
        femalef2.setText("");
        emailf2.setText("");
        contactf2.setText("");
        addressf2.setText("");
    }//GEN-LAST:event_clear1ActionPerformed

    private void quit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit1ActionPerformed
       int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?", "Confirm",JOptionPane.YES_NO_OPTION, HEIGHT);
        if(x==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_quit1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    JOptionPane.showMessageDialog(this,"Booking done! Now please start Payment Method. Thank You!");
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void malef2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malef2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malef2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address1;
    private javax.swing.JTextArea addressf2;
    private javax.swing.JButton clear1;
    private javax.swing.JLabel cnicf1;
    private javax.swing.JTextField cnicf2;
    private javax.swing.JLabel contact1;
    private javax.swing.JTextField contactf2;
    private javax.swing.JLabel email1;
    private javax.swing.JTextField emailf2;
    private javax.swing.JRadioButton femalef2;
    private javax.swing.JLabel genderf1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnamef1;
    private javax.swing.JTextField lastnamef2;
    private javax.swing.JRadioButton malef2;
    private javax.swing.JLabel namef1;
    private javax.swing.JTextField namef2;
    private javax.swing.JButton quit1;
    // End of variables declaration//GEN-END:variables
}
