package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Professor_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Professor_Main frame = new Professor_Main();
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
	public Professor_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		Dimension frameSize = contentPane.getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2, (windowSize.height - frameSize.height) / 2);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pro_name = new JLabel("O O O");
		pro_name.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 36));
		pro_name.setBounds(27, 33, 116, 52);
		contentPane.add(pro_name);
		
		JLabel fixed_1 = new JLabel("\uAD50\uC218,");
		fixed_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 36));
		fixed_1.setBounds(149, 33, 116, 52);
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("\uAD50\uC218\uBC88\uD638");
		fixed_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_2.setBounds(27, 119, 87, 27);
		contentPane.add(fixed_2);
		
		JLabel fixed_3 = new JLabel("\uC784\uC6A9\uB144\uB3C4");
		fixed_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_3.setBounds(27, 156, 87, 27);
		contentPane.add(fixed_3);
		
		JLabel fixed_4 = new JLabel("\uB2E8\uACFC");
		fixed_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_4.setBounds(27, 193, 87, 27);
		contentPane.add(fixed_4);
		
		JLabel fixed_5 = new JLabel("\uC804\uACF5");
		fixed_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_5.setBounds(27, 230, 87, 27);
		contentPane.add(fixed_5);
		
		JButton enter_grade_btn = new JButton("\uC131\uC801 \uC785\uB825");
		enter_grade_btn.setBounds(67, 456, 97, 23);
		contentPane.add(enter_grade_btn);
		
		JButton enter_lecture_btn = new JButton("\uACFC\uBAA9 \uC785\uB825");
		enter_lecture_btn.setBounds(224, 456, 97, 23);
		contentPane.add(enter_lecture_btn);
		
		JLabel fixed_6 = new JLabel("\uC77C\uC815");
		fixed_6.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_6.setBounds(634, 88, 87, 27);
		contentPane.add(fixed_6);
		
		JLabel fixed_7 = new JLabel("\uACF5\uC9C0\uC0AC\uD56D");
		fixed_7.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_7.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_7.setBounds(634, 311, 87, 27);
		contentPane.add(fixed_7);
		
		JLabel pro_id = new JLabel("000000000");
		pro_id.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_id.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pro_id.setBounds(126, 119, 114, 27);
		contentPane.add(pro_id);
		
		JLabel pro_enroll = new JLabel("0000");
		pro_enroll.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_enroll.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pro_enroll.setBounds(126, 156, 114, 27);
		contentPane.add(pro_enroll);
		
		JLabel pro_college = new JLabel("\uB2E8\uACFC");
		pro_college.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_college.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		pro_college.setBounds(90, 193, 150, 27);
		contentPane.add(pro_college);
		
		JLabel pro_major = new JLabel("\uC804\uACF5");
		pro_major.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_major.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		pro_major.setBounds(90, 230, 150, 27);
		contentPane.add(pro_major);
	}

}
