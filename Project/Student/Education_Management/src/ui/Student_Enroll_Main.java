package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Student_Enroll_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Enroll_Main frame = new Student_Enroll_Main();
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
	public Student_Enroll_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("\uC77C\uC815");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_1.setBounds(129, 94, 84, 33);
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("\uC218\uAC15\uC2E0\uCCAD \uC2DC\uC2A4\uD15C");
		fixed_2.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		fixed_2.setBounds(380, 42, 237, 64);
		contentPane.add(fixed_2);
		
		JLabel fixed_3 = new JLabel("\uACF5\uC9C0\uC0AC\uD56D");
		fixed_3.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_3.setBounds(115, 368, 114, 33);
		contentPane.add(fixed_3);
		
		JButton enroll_btn = new JButton("\uC218\uAC15\uC2E0\uCCAD \uBC0F \uC870\uD68C");
		enroll_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		enroll_btn.setBounds(645, 210, 252, 47);
		contentPane.add(enroll_btn);
		
		JButton interest_btn = new JButton("\uAD00\uC2EC\uACFC\uBAA9 \uB4F1\uB85D \uBC0F \uC870\uD68C");
		interest_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		interest_btn.setBounds(645, 348, 252, 47);
		contentPane.add(interest_btn);
		
		JLabel fixed_4 = new JLabel("\uC218\uAC15\uC2E0\uCCAD");
		fixed_4.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		fixed_4.setBounds(732, 159, 74, 15);
		contentPane.add(fixed_4);
		
		JLabel fixed_5 = new JLabel("\uAD00\uC2EC\uACFC\uBAA9");
		fixed_5.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		fixed_5.setBounds(732, 311, 74, 15);
		contentPane.add(fixed_5);
		
		JButton back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		back_btn.setBounds(426, 485, 97, 23);
		contentPane.add(back_btn);
		
		
	}
}
