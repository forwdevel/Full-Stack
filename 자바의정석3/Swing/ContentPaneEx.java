import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame{
    ContentPaneEx() {

        //창 이름
        setTitle("ContentPane and JFrame");

        // 창 종료시 프로세스도 종료 (메모리 반환)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        Container ContentPane = getContentPane();
        ContentPane.setBackground(Color.ORANGE);
        ContentPane.setLayout(new FlowLayout());

        ContentPane.add(new JButton("OK"));
        ContentPane.add(new JButton("Cancel"));
        ContentPane.add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }//Constructor
    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
