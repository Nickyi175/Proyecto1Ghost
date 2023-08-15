package proyecto1p;




import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.accessibility.AccessibleContext;


public class Botones extends JFrame{
  private JButton[][] boton;
 

    public Botones() {
        
        boton = new JButton[6][6];
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                boton[fila][columna] = new JButton();
            }
        }
        
    }
    public void configurarTamanoBotones(Dimension tamano) {
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                boton[fila][columna].setPreferredSize(tamano);
            }
        }
    }
    public JButton[][] getBotones() {
        return boton;
    }

  
}
