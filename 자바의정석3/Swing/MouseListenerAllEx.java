import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseListenerAllEx extends JFrame {
    private JLabel la = new JLabel();

    MouseListenerAllEx() {
        setTitle("MouseListener & MouseMotionListener");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.add(la);

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {

        @Override
        public void mousePressed(MouseEvent e) {
            la.setText("mousePressed(" + e.getX() + "," + e.getY() + ")");
        } // Click

        @Override
        public void mouseReleased(MouseEvent e) {
            la.setText("mouseReleased(" + e.getX() + "," + e.getY() + ")");
        } // After Click

        @Override
        public void mouseEntered(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.cyan);
        } // In the tap Range

        @Override
        public void mouseExited(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.yellow);
        } // Out of Tap Range

        @Override
        public void mouseDragged(MouseEvent e) {
            la.setText("mouseDragged(" + e.getX() + "," + e.getY() + ")");
        } // Drag

        @Override
        public void mouseMoved(MouseEvent e) {
            la.setText("mouseMoved(" + e.getX() + "," + e.getY() + ")");
        } // Move

        @Override
        public void mouseClicked(MouseEvent e) {
        }

    }

    public static void main(String[] args) {
        new MouseListenerAllEx();
    }
}
