package proyecto1p;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CrearJugador extends javax.swing.JFrame {
    //hacer loggs
    ArrayList<Loggs> ArrayLoggs;
    ArrayList<Usuario> ArrayUsuarios;
    boolean mododejuego_Tutorial=true;
    
    //atributUsuario = AtributListadeUsuarios
    //atributLoggs = AtributListadeLoggs
    
    public CrearJugador(ArrayList<Usuario> AtributUsuario,ArrayList <Loggs> AtributLoggs,boolean mododejuego) {
        //si es null crea otra lista y si no es null agrega los valores de lista que vienen como atributo
        if (AtributUsuario == null) {
            ArrayUsuarios = new ArrayList<Usuario>();

        } else {

            ArrayUsuarios = AtributUsuario;

        }
        if ( AtributLoggs== null) {
            ArrayLoggs = new ArrayList<Loggs>();

        } else {

            ArrayLoggs  = AtributLoggs;

        } 
        
        initComponents();
        setLocationRelativeTo(null);
        Ocultar.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancel = new javax.swing.JButton();
        contra = new javax.swing.JPasswordField();
        Ver = new javax.swing.JLabel();
        Ocultar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setText("CREAR JUGADOR");

        jLabel2.setText("Username:");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Password:");

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarMouseClicked(evt);
            }
        });
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonCancel.setText("Cancel");
        BotonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelActionPerformed(evt);
            }
        });

        Ver.setText("jLabel4");
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });

        Ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1p/imagenes/base.png"))); // NOI18N
        Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(contra))
                        .addGap(29, 29, 29)
                        .addComponent(Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(BotonRegistrar)
                        .addGap(116, 116, 116)
                        .addComponent(BotonCancel)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ver)
                    .addComponent(Ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar)
                    .addComponent(BotonCancel))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
       
        boolean usuarioExistente = false;
        //esto lee si ya existe el usuario en la lista 
       
        if(usuario.getText().equalsIgnoreCase("")||String.valueOf(contra.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null,"Debe llenar todas las casillas","Cuidado",JOptionPane.WARNING_MESSAGE);
            usuarioExistente = true;
        }
        for (int i = 0; i < ArrayUsuarios.size(); i++) {

            if (ArrayUsuarios.get(i).getUsername().equalsIgnoreCase(usuario.getText())) {
                JOptionPane.showMessageDialog(null, "Usuario existente");
                usuarioExistente = true;
                MenuInicio inicio=new MenuInicio(ArrayUsuarios,ArrayLoggs,mododejuego_Tutorial);
                inicio.setVisible(true);
                this.dispose();
                }
            }
        
        if(!usuarioExistente){
            Usuario nuevoUsuario=new Usuario(usuario.getText().toUpperCase().toLowerCase(),String.valueOf(contra.getPassword()));
            ArrayUsuarios.add(nuevoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente!");
            MenuPrincipal principal = new MenuPrincipal(ArrayUsuarios,ArrayLoggs,usuario.getText(),mododejuego_Tutorial);
            principal.setVisible(true);
            this.dispose();
            
            
        }  
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelActionPerformed
        MenuInicio inicio=new MenuInicio(ArrayUsuarios,ArrayLoggs,mododejuego_Tutorial);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonCancelActionPerformed

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
        Ver.setVisible(false);
        Ocultar.setVisible(true);
        contra.setEchoChar((char)0);
        
    }//GEN-LAST:event_VerMouseClicked

    private void OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarMouseClicked
        Ocultar.setVisible(false);
        Ver.setVisible(true);
        contra.setEchoChar('⚫');
    }//GEN-LAST:event_OcultarMouseClicked

    private void BotonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarMouseClicked

    
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
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearJugador(null,null,true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancel;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel Ocultar;
    private javax.swing.JLabel Ver;
    private javax.swing.JPasswordField contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
