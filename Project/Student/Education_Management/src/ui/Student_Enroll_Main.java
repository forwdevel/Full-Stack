package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import daovo.StudentVo;

public class Student_Enroll_Main extends JFrame {

	private JPanel contentPane;

	public Student_Enroll_Main(StudentVo vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("ÀÏÁ¤");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_1.setBounds(129, 94, 84, 33);
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("¼ö°­½ÅÃ» ½Ã½ºÅÛ");
		fixed_2.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		fixed_2.setBounds(357, 42, 237, 64);
		contentPane.add(fixed_2);
		
		JLabel fixed_3 = new JLabel("°øÁö»çÇ×");
		fixed_3.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_3.setBounds(115, 368, 114, 33);
		contentPane.add(fixed_3);
		
		JButton enroll_btn = new JButton("¼ö°­½ÅÃ» ¹× Á¶È¸");
		enroll_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Enroll_Register(vo);
			}
		});
		enroll_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		enroll_btn.setBounds(645, 210, 252, 47);
		contentPane.add(enroll_btn);
		
		JButton interest_btn = new JButton("°ü½É°ú¸ñ µî·Ï ¹× Á¶È¸");
		interest_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Enroll_Interest(vo);
			}
		});
		interest_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		interest_btn.setBounds(645, 348, 252, 47);
		contentPane.add(interest_btn);
		
		JLabel fixed_4 = new JLabel("¼ö°­½ÅÃ»");
		fixed_4.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		fixed_4.setBounds(732, 159, 74, 15);
		contentPane.add(fixed_4);
		
		JLabel fixed_5 = new JLabel("°ü½É°ú¸ñ");
		fixed_5.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		fixed_5.setBounds(732, 311, 74, 15);
		contentPane.add(fixed_5);
		
		JButton back_btn = new JButton("µÚ·Î°¡±â");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Main(vo.getId(), vo.getPw());
			}
		});
		back_btn.setBounds(426, 485, 97, 23);
		contentPane.add(back_btn);
		
		setVisible(true);
	}
}
