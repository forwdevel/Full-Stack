import javax.swing.*;
import java.awt.*;

public class GridInputEx extends JFrame{
    GridInputEx() {
        setTitle("Grid Input Form Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();

        GridLayout grid = new GridLayout(4,2);
        grid.setVgap(5);

        container.setLayout(grid);
        container.add(new JLabel("Name"));
        container.add(new JTextField(""));
        container.add(new JLabel("No."));
        container.add(new JTextField(""));
        container.add(new JLabel("Field"));
        container.add(new JTextField(""));
        container.add(new JLabel("Subject"));
        container.add(new JTextField(""));

        setSize(300, 200);
        setVisible(true);
    }//Constructor

    public static void main(String[] args) {
        new GridInputEx();
    }
}
