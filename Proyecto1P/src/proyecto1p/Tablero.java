package proyecto1p;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Tablero extends javax.swing.JFrame {
   ArrayList<Loggs> ArrayLoggs;
   boolean turno=true;
   int contJugadas = 0, contTutorial = 0;
    
    TableroBotones tableroBotones = new TableroBotones();
    
    int[] Vencidos_Jugador1;
    int[][] Guia_botones;
    int[] Vencidos_Jugador2;
    int partidasjugadasheroes = 0, partidasjugadasvillanos = 0;
    ArrayList<Usuario> ArrayUsuarios;
    String nombreUsuario, RespTipopartida, RespUsuario, TipoInvitado;
    String[] TipoPartida = {"Jugador1", "Jugador2"};
    boolean mododejuego_Tutorial = true;
    
    public Tablero(ArrayList<Usuario> AtributUsuarios, ArrayList<Loggs> AtributLoggs, String nombreUsuario, boolean mododejuego){
        this.ArrayUsuarios = AtributUsuarios;
        this.nombreUsuario = nombreUsuario;
        this.ArrayLoggs = AtributLoggs;
        
        Guia_botones = tableroBotones.getGuia_botones();
        Vencidos_Jugador1 = tableroBotones.getVencidosJugador1();
        Vencidos_Jugador2 = tableroBotones.getVencidosJugador2();
        mododejuego_Tutorial = mododejuego;
        initComponents();
        
        
        String[] nomUsuarios = new String[ArrayUsuarios.size() - 1];
        int cont=0;
        for (int i = 0; i < ArrayUsuarios.size(); i++) {
            if (!ArrayUsuarios.get(i).getUsername().equals(this.nombreUsuario)) {
                nomUsuarios[cont] = ArrayUsuarios.get(i).getUsername();
                cont++;
                }
            }
        
        if (nomUsuarios.length > 1) {
            RespUsuario = (String) JOptionPane.showInputDialog(null, "Escoja el usuario", "", JOptionPane.QUESTION_MESSAGE, null, nomUsuarios, nomUsuarios[0]);
        } else {

            for (int i = 0; i < ArrayUsuarios.size(); i++) {
                if (!ArrayUsuarios.get(i).getUsername().equals(this.nombreUsuario)) {
                    RespUsuario = ArrayUsuarios.get(i).getUsername();
                }
            }
        }
        //setLayout(new GridLayout(6, 6));
        //llena el tablero con botones
        //Guia_botones=new int [6][6];
        for (int fila = 0; fila < Guia_botones.length; fila++) {
            for (int columna = 0; columna < Guia_botones[0].length; columna++) {
                JButton bottontemp = new JButton();
                //aqui le agrego caracteristicas al botton 
                // bottontemp.setText(""+i+":"+j);
                bottontemp.setBorder(null);
                bottontemp.setSize(new Dimension(55, 55));
                bottontemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1p/imagenes/base.png")));
                
                tableroBotones.add(bottontemp);
            }
        }
        jLabel1.setText("hola");
        mostrarTablero();
        
        }
    
    public void mostrarTablero(){
       this.Vencidos_Jugador1 = this.tableroBotones.getVencidosJugador1();
        this.Vencidos_Jugador2 = this.tableroBotones.getVencidosJugador2(); 
 //AGREGAR JLABELS
//        if (this.turno == false) {
//
//            jLabel2.setText("Turno Villano");
//
//            if (RespTipopartida.equals("Villano")) {
//
//                jLabel3.setText("Usuario: " + nombreUsuario);
//            } else {
//
//                jLabel3.setText("Usuario: " + RespUsuario);
//
//            }
//
//        }else {
//
//            jLabel2.setText("Turno Heroe");
//            if (RespTipopartida.equals("Heroe")) {
//                jLabel3.setText("Usuario: " + nombreUsuario);
//
//            } else {
//
//                jLabel3.setText("Usuario: " + RespUsuario);
//            }
//        }
       
        
        
        for (int fila = 0; fila < Guia_botones.length; fila++) {
//todos los mauselistener que coloque son para poder seguir cambiando de posicion las cartas
//el primer click es para sellecionar el personaje y el segun es para asignarle la posicion
            for (int columna = 0; columna < Guia_botones[0].length; columna++) {
                if (Guia_botones[fila][columna] != 0) {

                    if (this.Guia_botones[fila][columna] > 0) {
                        if (turno || this.mododejuego_Tutorial) {
                            JButton bottontemp = new JButton();
                            Dimension Dimentemp = new Dimension(columna, fila);
                            //aqui le agrego caracteristicas al botton 
                            // bottontemp.setText(""+i+":"+j);
                            bottontemp.setBorder(null);
                            bottontemp.setSize(new Dimension(55, 55));
                            bottontemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1p/Fantasma/bueno.png")));
                            bottontemp.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    clickcarta(Dimentemp.height, Dimentemp.width);
                                }

                            });

                            tabla.add(bottontemp);
                        } 

                    } else {
                        if ((!turno) || this.mododejuego_Tutorial) {

                            JButton bottontemp = new JButton();
                            Dimension Dimentemp = new Dimension(columna, fila);
                            //aqui le agrego caracteristicas al botton 
                            // bottontemp.setText(""+i+":"+j);
                            bottontemp.setBorder(null);
                            bottontemp.setSize(new Dimension(55, 55));
                            bottontemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1p/Fantasma/malo.png")));
                            bottontemp.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    clickcarta(Dimentemp.height, Dimentemp.width);
                                }

                            });

                            tabla.add(bottontemp);

                        }
                    }

                }else{
                   JButton bottontemp = new JButton();
                    Dimension Dimentemp = new Dimension(columna, fila);
                    //aqui le agrego caracteristicas al botton 
                    // bottontemp.setText(""+i+":"+j);
                    bottontemp.setBorder(null);
                    bottontemp.setSize(new Dimension(55, 55));
                    bottontemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto1p/imagenes/base.png")));
                    bottontemp.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            clickcarta(Dimentemp.height, Dimentemp.width);
                        }

                    });

                    tabla.add(bottontemp); 
                }
            }
        }
         contJugadas++;
        jLabel1.setText("Click" + contJugadas);
        //esto va a pedir si gano heroe o villano
        boolean ganoJugador1 = this.tableroBotones.getJugador1();
        boolean ganoJugador2 = this.tableroBotones.getJugador2();
        String player1 = "", player2 = "";
        if (RespUsuario == null) {

            for (int i = 0; i < this.ArrayUsuarios.size(); i++) {

                if (!ArrayUsuarios.get(i).getUsername().equals(this.nombreUsuario)) {

                    RespUsuario = ArrayUsuarios.get(i).getUsername();
                }
            }
        }
         if (ganoJugador1 == true) {
            for (int i = 0; i < this.ArrayUsuarios.size(); i++) {
                if (ArrayUsuarios.get(i).getUsername().equals(player1)) {
                    ArrayUsuarios.get(i).setpuntos(ArrayUsuarios.get(i).getpuntos() + 3);
                }
            }

            DateTimeFormatter fechapartida = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime fecha = LocalDateTime.now();
            this.ArrayLoggs.add(new Loggs(player1+ "Usando heroes ha ganado y " + player2 + " usando villanos ha perdido " + fechapartida.format(fecha), "Heroes"));

            JOptionPane.showMessageDialog(null, "Gano " + player1 + " ante " + player2);
            MenuPrincipal mp3 = new MenuPrincipal(this.ArrayUsuarios, this.ArrayLoggs, nombreUsuario, mododejuego_Tutorial);
            mp3.setVisible(true);
            this.setVisible(false);
            partidasjugadasheroes++;
        }
         if (ganoJugador2== true) {
            for (int indice = 0; indice < this.ArrayUsuarios.size(); indice++) {
                if (ArrayUsuarios.get(indice).getUsername().equals(player2)) {
                    ArrayUsuarios.get(indice).setpuntos(ArrayUsuarios.get(indice).getpuntos() + 3);
                }
            }

            DateTimeFormatter fechapartida = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime fecha = LocalDateTime.now();
            this.ArrayLoggs.add(new Loggs(player2+ "Usando villanos ha ganado ya que " + player1+ " usando heroes " + fechapartida.format(fecha), "Villano"));

            JOptionPane.showMessageDialog(null, "Gano" + player2+ " ante " + player1);
            MenuPrincipal mp3 = new MenuPrincipal(this.ArrayUsuarios, this.ArrayLoggs, nombreUsuario, mododejuego_Tutorial);
            mp3.setVisible(true);
            this.setVisible(false);
            partidasjugadasvillanos++;
        }
        
        
    }
    
    
    
    
    
    
    
     //el privatevoid va a ser para poder las fichas cada que las toquen
    private void clickcarta(int posicionx, int posiciony) {

        this.tableroBotones.controlMovimientos(posicionx, posiciony);
        this.turno = this.tableroBotones.getTurno();
        this.Guia_botones = this.tableroBotones.getGuia_botones();
        if (this.mododejuego_Tutorial == true && contTutorial == 0) {

            JOptionPane.showMessageDialog(null,
                    "<html><br><br>Las Cartas Rango 2 pueden moverse como las torres de Ajedres pero las demas cartas solo se pueden mover 1 casilla" + "<br><br>"
                    + "Las Cartas Rango 3 pueden vencer a las bombas pero las demas cartas no si caen en una bomba explotan" + "<br><br>"
                    + "Las Cartas no se pueden mover de forma diagonal solo adyacente" + "<br><br>"
                    + "Las demas cartas de Rango pueden vencer a las de Rango 10 " + "<br><br>"
                    + "Se gana el juego cuando el contricante se queda sin movimientos o captura a la tierra o si se rinde" + "</html>");

            contTutorial++;
        }
        mostrarTablero();
    }
//    public void panel(){
//        
//        //tab=new TableroBotones();
//        
//        setTitle("Panel con Tablero en JFrame");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//       
//        TableroBotones tablero = new TableroBotones(); 
//        tablero.setLayout(new BorderLayout());
//        tablero.add(tablero,BorderLayout.CENTER);
//        tablero.setVisible(true);
//        
//        tablero.setBounds(tablero.getBounds());
//        tablero.revalidate();  // Actualiza la disposición del panelFondo
//        tablero.repaint();     // Vuelve a pintar el panelFondo
//
//        tablero.setVisible(true);  // Asegúrate de que el panel sea visible
//        tablero.setBounds(0,0,1200,600);
//        add(tablero);
//        pack();
//        setLocationRelativeTo(null);
//        setLayout(null);
//        setBounds(0,0,1200,600);
//    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tabla = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(102, 102, 102));

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        tabla.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout tablaLayout = new javax.swing.GroupLayout(tabla);
        tabla.setLayout(tablaLayout);
        tablaLayout.setHorizontalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
        tablaLayout.setVerticalGroup(
            tablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 904, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(306, 306, 306))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero(null,null,null,true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel tabla;
    // End of variables declaration//GEN-END:variables

   
}
