package proyecto1p;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
 private int contcontra=0,contusuario=0;
    private String contra; 
    private String usuario;
    boolean mododejuego_Tutorial=true;
    ArrayList<Loggs> ArrayLoggs;
    ArrayList<Usuario> ArrayUsuarios;


    public Login(ArrayList<Usuario> AtributUsuario,ArrayList<Loggs> AtributLoggs,boolean mododejuego) {
        //el atributo es la variable en la que se guarda los valores de cada clase en la variable global
      if(AtributUsuario==null){
        ArrayUsuarios = new ArrayList<Usuario>();
        }else{
            ArrayUsuarios=AtributUsuario;    
       }
       if ( AtributLoggs== null) {
            ArrayLoggs = new ArrayList<Loggs>();
       } else {
           ArrayLoggs  = AtributLoggs;
       }   
        mododejuego_Tutorial=mododejuego;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAceptar = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAceptarMouseClicked(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(BotonAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(BotonAceptar)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAceptarMouseClicked
        //el for busca la concidencia con un usuario porque el array tiene dos valores
        boolean usuarioExistente=false;
        if(user.getText().equalsIgnoreCase("")||password.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe llenar todas las casillas","Cuidado",JOptionPane.WARNING_MESSAGE);
            usuarioExistente = true;
        }
        int posicion=-1;
     if(!usuarioExistente){
        for(int indice=0;indice<ArrayUsuarios.size();indice++){
            if(ArrayUsuarios.get(indice).getUsername().equalsIgnoreCase(user.getText())){
               posicion=indice;
            }
        }
        //Valida que existe el usuario

        if(posicion!=-1){
            //aqui le estamos diciendo que en esa posicion nos verifica la contraseña
            if( ArrayUsuarios.get(posicion).getPassword().equals(password.getText())  ){
                
                JOptionPane.showMessageDialog(null,"¡Inicializó correctamente!");
                MenuPrincipal Mp=new MenuPrincipal(this.ArrayUsuarios,this.ArrayLoggs,user.getText(),mododejuego_Tutorial);
                Mp.setVisible(true);
                this.setVisible(false);
                
            }else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta","Cuidado",JOptionPane.WARNING_MESSAGE);
            }
        }else{
                JOptionPane.showMessageDialog(null,"Usuario no existente","Cuidado",JOptionPane.WARNING_MESSAGE);
                MenuInicio inicio=new MenuInicio(null,null,true);
                inicio.setVisible(true);
                this.dispose();
        }
     }
    }//GEN-LAST:event_BotonAceptarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        MenuInicio inicio= new MenuInicio(ArrayUsuarios,ArrayLoggs,mododejuego_Tutorial);
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(null,null,true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
