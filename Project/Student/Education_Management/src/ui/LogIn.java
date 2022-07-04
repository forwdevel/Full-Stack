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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import daovo.MemberDao;
import daovo.MemberVo;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class LogIn extends JFrame {
	private JTextField pw;
	private JTextField id;
	private JLabel fixed_2;
	private JLabel fixed_3;
	private JPanel contentPane;
	private JButton logIn_btn;
	private JButton exit_btn;

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

	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(70, 130, 180));
		setContentPane(contentPane);

		final Font h1 = new Font("�޸յձ�������", Font.BOLD, 40);
		final Font h2 = new Font("�޸յձ�������", Font.BOLD, 30);
		final Font h3 = new Font("�޸յձ�������", Font.BOLD, 20);

		getContentPane().setLayout(null);
		contentPane.setLayout(null);

		pw = new JPasswordField();
		pw.setBounds(399, 300, 224, 41);
		pw.setBorder(null);
		pw.setColumns(10);
		getContentPane().add(pw);

		id = new JTextField();
		id.setFont(h3);
		id.setColumns(10);
		id.setBounds(399, 234, 224, 41);
		id.setBorder(null);
		getContentPane().add(id);

		JLabel fixed_1 = new JLabel("�л���� �ý���");
		fixed_1.setForeground(new Color(255, 255, 255));
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setBounds(333, 131, 311, 75);
		fixed_1.setFont(new Font("�޸յձ�������", Font.PLAIN, 40));
		getContentPane().add(fixed_1);

		fixed_2 = new JLabel("No.");
		fixed_2.setForeground(new Color(255, 255, 255));
		fixed_2.setBounds(333, 247, 57, 28);
		fixed_2.setHorizontalAlignment(JLabel.RIGHT);
		fixed_2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		getContentPane().add(fixed_2);

		fixed_3 = new JLabel("PW");
		fixed_3.setForeground(new Color(255, 255, 255));
		fixed_3.setBounds(330, 313, 57, 28);
		fixed_3.setHorizontalAlignment(JLabel.RIGHT);
		fixed_3.setFont(new Font("Segoe UI", Font.BOLD, 30));
		getContentPane().add(fixed_3);

		logIn_btn = new JButton("�α���");
		logIn_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// staff , professor, student
				MemberDao dao = new MemberDao();
				if (id.getText().equals("")) {
					// Null Id
					new Alert("���̵� �Է��ϼ���.");
				} else if (pw.getText().equals("")) {
					// Null pw
					new Alert("��й�ȣ�� �Է��ϼ���.");
				} else {
					// System Log
					System.out.println(pw.getText());
					System.out.println(id.getText());

					// Check roll
					MemberVo vo = new MemberVo(Integer.parseInt(id.getText()), pw.getText());
					int b = dao.list(vo);

					// Close window
					setVisible(false);
					if (b == 0) {
						System.out.println("b==0");
						new Alert("���̵� �� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					}
					// Open new window
					else if (b == 1) {
						new Staff_Main();
					} else if (b == 2) {
						new Student_Main(Integer.parseInt(id.getText()), pw.getText());
					} else if (b == 3) {
						new Professor_Main(Integer.parseInt(id.getText()), pw.getText());
					}
				}
			}
		});

		logIn_btn.setFont(new Font("�޸յձ�������", Font.PLAIN, 16));
		logIn_btn.setForeground(SystemColor.textHighlight);
		logIn_btn.setBackground(new Color(255, 255, 255));
		logIn_btn.setBorder(null);
		logIn_btn.setBounds(330, 399, 97, 41);
		contentPane.add(logIn_btn);

		exit_btn = new JButton("����");
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit_btn.setFont(new Font("�޸յձ�������", Font.PLAIN, 16));
		exit_btn.setBackground(SystemColor.controlDkShadow);
		exit_btn.setForeground(SystemColor.window);
		exit_btn.setBorder(null);
		exit_btn.setBounds(560, 399, 97, 41);
		contentPane.add(exit_btn);

		setVisible(true);
	}

}
