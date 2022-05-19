import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        // 출력할 때 나오는 창 이름
        setTitle("창 이름");

        // 300 x 300 사이즈 창만들기 
        setSize(300, 300);

        // 프레임 출력
        setVisible(true);
    }//constructor

    public static void main(String[] args) {
        new MyFrame();
    }//main()
}//Main
