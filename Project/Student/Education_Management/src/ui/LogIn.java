package ui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import daovo.MemberDao;
import daovo.MemberVo;

public class LogIn extends JFrame {
	private JTextField id;
	private JTextField pw;
	private JLabel fixed_2;
	private JLabel fixed_3;
	private JPanel contentPane;
	private JButton logIn_btn;
	private JButton exit_btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		Dimension frameSize = contentPane.getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);
		setContentPane(contentPane);
		
		final Font h1 = new Font("돋움", Font.BOLD, 40);
		final Font h2 = new Font("돋움", Font.BOLD, 30);
		final Font h3 = new Font("돋움", Font.BOLD, 20);
		
		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		id = new JTextField();
		id.setBounds(399, 300, 224, 41);
		getContentPane().add(id);
		id.setColumns(10);
		
		pw = new JTextField();
		pw.setColumns(10);
		pw.setBounds(399, 234, 224, 41);
		getContentPane().add(pw);
		
		JLabel fixed_1 = new JLabel("학사관리 시스템");
		fixed_1.setBounds(346, 131, 311, 75);
		fixed_1.setFont(h1);
		getContentPane().add(fixed_1);
		
		fixed_2 = new JLabel("ID");
		fixed_2.setBounds(330, 247, 57, 28);
		fixed_2.setHorizontalAlignment(JLabel.RIGHT);
		fixed_2.setFont(h2);
		getContentPane().add(fixed_2);
		
		fixed_3 = new JLabel("PW");
		fixed_3.setBounds(330, 313, 57, 28);
		fixed_3.setHorizontalAlignment(JLabel.RIGHT);
		fixed_3.setFont(h2);
		getContentPane().add(fixed_3);
		
		logIn_btn = new JButton("\uB85C\uADF8\uC778");
		logIn_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// staff , professor, student
				MemberDao dao = new MemberDao();
				if(id.getText().equals("")) {
					// Null Id
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.");
				} else if(pw.getText().equals("")) {
					// Null pw
					JOptionPane.showMessageDialog(null,"비밀번호를 입력하세요.");
				} else {
					// System Log
					System.out.println(id.getText());
					System.out.println(pw.getText());
					
					// Check roll
					MemberVo vo = new MemberVo(Integer.parseInt(id.getText()), pw.getText());
					int b = dao.list(vo);
					
					// Close window
					setVisible(false);
					if(b == 0) {
						JOptionPane.showMessageDialog(null, "없는 정보입니다.");
					} 
					// Open new window
					else if(b == 1) {
						new Staff_Main();
					} else if (b == 2) {
						new Student_Main(Integer.parseInt(id.getText()), pw.getText());
					} else if (b == 3) {
						new Professor_Main();
					}
				}
			}
		});
		logIn_btn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		logIn_btn.setForeground(SystemColor.window);
		logIn_btn.setBackground(SystemColor.textHighlight);
		logIn_btn.setBounds(330, 399, 97, 41);
		contentPane.add(logIn_btn);
		
		exit_btn = new JButton("\uC885\uB8CC");
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit_btn.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		exit_btn.setBackground(SystemColor.controlShadow);
		exit_btn.setForeground(SystemColor.window);
		exit_btn.setBounds(560, 399, 97, 41);
		contentPane.add(exit_btn);
		
		setVisible(true);
	}

}
