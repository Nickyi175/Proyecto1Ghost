package proyecto1p;

import java.util.ArrayList;

public class MenuInicio extends javax.swing.JFrame {

     ArrayList<Usuario> ArrayUsuarios;
     ArrayList<Loggs> ArrayLoggs;
     boolean mododejuego_Tutorial=true;
    public MenuInicio(ArrayList<Usuario> AtributUsuario,ArrayList<Loggs> AtributLoggs,boolean mododejuego){
        
        mododejuego_Tutorial=mododejuego;
        if (AtributUsuario == null) {
            ArrayUsuarios = new ArrayList<Usuario>();
            
        } else {
            ArrayUsuarios = AtributUsuario;
            
        }if ( AtributLoggs== null) {
            ArrayLoggs = new ArrayList<Loggs>();
            
        } else {
            ArrayLoggs  = AtributLoggs;

        }  
        
        initComponents();
        
        setExtendedState(6);
        setLocationRelativeTo(null);
        System.out.println(getSize());
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BotonCrearJ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonLogin.setText("LOGIN");
        BotonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLoginMouseClicked(evt);
            }
        });
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 145, 63));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 950, 590));

        BotonCrearJ.setText("CREAR JUGADOR");
        BotonCrearJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearJActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCrearJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 145, 63));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("MENU INICIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 61));

        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(730, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonCrearJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearJActionPerformed
        CrearJugador crear=new CrearJugador(ArrayUsuarios,ArrayLoggs,mododejuego_Tutorial);
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonCrearJActionPerformed

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed

    }//GEN-LAST:event_BotonLoginActionPerformed

    private void BotonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLoginMouseClicked
        Login log=new Login (ArrayUsuarios,this.ArrayLoggs,mododejuego_Tutorial);
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonLoginMouseClicked

   
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                    new MenuInicio(null,null,true).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearJ;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
