
package proyecto1p;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class Tab extends JFrame{
    //PRUEBA
public Tab() {
        setTitle("Button Table Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new GridLayout(3, 3)); // 3x3 grid layout

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                JButton button = new JButton("Button " + (row * 3 + col + 1));
                button.addActionListener(new ButtonClickListener(row, col));
                add(button);
            }
        }

        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked: Row " + (row + 1) + ", Column " + (col + 1));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Tab());
    }
}

