import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame{
    GridLayoutEx() {
        setTitle("Grid Layout Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();

        container.setLayout(new GridLayout(4,3,5,5));
        container.add(new JButton("1"));
        container.add(new JButton("2"));
        container.add(new JButton("3"));
        container.add(new JButton("4"));
        container.add(new JButton("5"));
        container.add(new JButton("6"));
        container.add(new JButton("7"));
        container.add(new JButton("8"));
        container.add(new JButton("9"));
        container.add(new JButton("*"));
        container.add(new JButton("0"));
        container.add(new JButton("#"));

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
