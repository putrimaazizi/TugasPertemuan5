/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Bidang.persegi;
import Ruang.balok;

import javax.swing.JOptionPane;


public class mainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public mainGUI() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopUp = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Hitung = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        InputPanjang = new javax.swing.JTextField();
        InputLebar = new javax.swing.JTextField();
        InputTinggi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VolumeBalok = new javax.swing.JLabel();
        LuasPermukaanBalok = new javax.swing.JLabel();
        OutputLuasPersegi = new javax.swing.JLabel();
        OutputKelilingPersegi = new javax.swing.JLabel();
        OutputVolumeBalok = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        PopUp.setMessage("Masukkan angka!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        jLabel1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KALKULATOR BALOK");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Hitung.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 11)); // NOI18N
        Hitung.setText("Hitung");
        Hitung.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Hitung.addActionListener(this::HitungActionPerformed);

        Reset.setFont(new java.awt.Font("Geometr415 Blk BT", 0, 11)); // NOI18N
        Reset.setText("Reset");
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Reset.addActionListener(this::ResetActionPerformed);

        InputPanjang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InputPanjang.addActionListener(this::InputPanjangActionPerformed);

        InputLebar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        InputTinggi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InputTinggi.addActionListener(this::InputTinggiActionPerformed);

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel2.setText("Panjang");

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel3.setText("Lebar");

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel4.setText("Tinggi");

        jLabel5.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel5.setText("Luas Persegi");

        jLabel6.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel6.setText("Keliling  Persegi");

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        jLabel7.setText("Hasil");

        VolumeBalok.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        VolumeBalok.setText("Volume Balok");

        LuasPermukaanBalok.setFont(new java.awt.Font("Dubai", 0, 11)); // NOI18N
        LuasPermukaanBalok.setText("Luas Permukaan Balok");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LuasPermukaanBalok)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(VolumeBalok)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OutputVolumeBalok))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OutputKelilingPersegi))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(OutputLuasPersegi)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(InputPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(InputLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(InputTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Hitung)
                                .addGap(69, 69, 69)
                                .addComponent(Reset)
                                .addGap(24, 24, 24))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InputPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(InputLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(OutputLuasPersegi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(OutputKelilingPersegi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolumeBalok)
                    .addComponent(OutputVolumeBalok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LuasPermukaanBalok)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hitung)
                    .addComponent(Reset))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        
          if ("".equals(InputPanjang.getText()) || "".equals(InputLebar.getText()) || "".equals(InputTinggi.getText())){
           JOptionPane.showMessageDialog(PopUp,"empty data!");
       
      }
              
        try {
            
        double lebar, tinggi, panjang;
      
      panjang = Double.parseDouble(InputPanjang.getText());
      lebar = Double.parseDouble(InputLebar.getText());
      tinggi = Double.parseDouble(InputTinggi.getText());
      
      
      persegi PersegiPanjang = new persegi(panjang,lebar);
      balok Balok = new balok(panjang, lebar, tinggi);
      
      
      double Luas = PersegiPanjang.luas();
      double Keliling = PersegiPanjang.keliling();
      double Volume = Balok.volume();
      double LuasPermukaan = Balok.luasPermukaan();
      
      OutputKelilingPersegi.setText(String.valueOf(Keliling));
      jLabel13.setText(String.valueOf(LuasPermukaan));
      OutputLuasPersegi.setText(String.valueOf(Luas));
      OutputVolumeBalok.setText(String.valueOf(Volume));
      
        }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(PopUp,"input data!");
       
       }
    }//GEN-LAST:event_HitungActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        
        
      InputLebar.setText("");
      InputPanjang.setText("");
      InputTinggi.setText("");
      
      OutputKelilingPersegi.setText("");
      jLabel13.setText("");
      OutputLuasPersegi.setText("");
      OutputVolumeBalok.setText("");
     
    }//GEN-LAST:event_ResetActionPerformed

    private void InputPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPanjangActionPerformed
       
        
    }//GEN-LAST:event_InputPanjangActionPerformed

    private void InputTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputTinggiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField InputLebar;
    private javax.swing.JTextField InputPanjang;
    private javax.swing.JTextField InputTinggi;
    private javax.swing.JLabel LuasPermukaanBalok;
    private javax.swing.JLabel OutputKelilingPersegi;
    private javax.swing.JLabel OutputLuasPersegi;
    private javax.swing.JLabel OutputVolumeBalok;
    private javax.swing.JOptionPane PopUp;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel VolumeBalok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

