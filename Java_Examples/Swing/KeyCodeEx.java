import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class KeyCodeEx extends JFrame {
    private JLabel la = new JLabel();

    KeyCodeEx() {
        setTitle("Key Code Event");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300, 150);
        setVisible(true);

        // Set focusing to get key value
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            // Bring informations of c.
            Container contentPane = (Container) e.getSource();
            la.setText(e.getKeyText(e.getKeyCode()));

            if (e.getKeyChar() == '%') {
                contentPane.setBackground(Color.yellow);
            } else if (e.getKeyCode() == KeyEvent.VK_F1) {
                contentPane.setBackground(Color.green);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
