package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Staff_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_Main frame = new Staff_Main();
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
	public Staff_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("\uAD50\uC9C1\uC6D0 \uC2DC\uC2A4\uD15C");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 36));
		fixed_1.setBounds(272, 56, 397, 49);
		contentPane.add(fixed_1);
		
		JButton enter_stu_btn = new JButton("\uD559\uC0DD \uB4F1\uB85D");
		enter_stu_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		enter_stu_btn.setBounds(361, 211, 214, 23);
		contentPane.add(enter_stu_btn);
		
		JButton enter_pro_btn = new JButton("\uAD50\uC218 \uB4F1\uB85D");
		enter_pro_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		enter_pro_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		enter_pro_btn.setBounds(361, 256, 214, 23);
		contentPane.add(enter_pro_btn);
		
		JButton inquiry_stu_btn = new JButton("\uD559\uC0DD \uC870\uD68C");
		inquiry_stu_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		inquiry_stu_btn.setForeground(SystemColor.window);
		inquiry_stu_btn.setBackground(SystemColor.controlShadow);
		inquiry_stu_btn.setBounds(361, 304, 214, 23);
		contentPane.add(inquiry_stu_btn);
		
		JButton inquiry_pro_btn = new JButton("\uAD50\uC218 \uC870\uD68C");
		inquiry_pro_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		inquiry_pro_btn.setForeground(SystemColor.window);
		inquiry_pro_btn.setBackground(SystemColor.controlShadow);
		inquiry_pro_btn.setBounds(361, 351, 214, 23);
		contentPane.add(inquiry_pro_btn);
		
		JButton inquiry_lec_btn = new JButton("\uACFC\uBAA9 \uC870\uD68C");
		inquiry_lec_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		inquiry_lec_btn.setForeground(SystemColor.window);
		inquiry_lec_btn.setBackground(SystemColor.controlShadow);
		inquiry_lec_btn.setBounds(361, 397, 214, 23);
		contentPane.add(inquiry_lec_btn);
		
		JButton back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		back_btn.setBounds(420, 489, 97, 23);
		contentPane.add(back_btn);
	}

}
