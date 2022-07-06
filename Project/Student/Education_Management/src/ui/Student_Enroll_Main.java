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

	Color c1 = new Color(95,113,97); 	// Dark Green
	Color c2 = new Color(109,139,116);	// Ash Green
	Color c3 = new Color(239,234,216);	// light meal
	Color c4 = new Color(208,201,192);	// dark meal

	public Student_Enroll_Main(StudentVo vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(c3);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("일정");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("휴먼엑스포", Font.BOLD, 20));
		fixed_1.setForeground(c1);
		fixed_1.setBounds(126, 40, 84, 33);
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("수강신청 시스템");
		fixed_2.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_2.setFont(new Font("휴먼엑스포", Font.BOLD, 30));
		fixed_2.setForeground(c1);
		fixed_2.setBounds(517, 63, 237, 64);
		contentPane.add(fixed_2);
		
		JLabel fixed_3 = new JLabel("공지사항");
		fixed_3.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_3.setFont(new Font("휴먼엑스포", Font.BOLD, 20));
		fixed_3.setForeground(c1);
		fixed_3.setBounds(109, 311, 114, 33);
		contentPane.add(fixed_3);
		
		JButton enroll_btn = new JButton("수강신청 조회 및 등록");
		enroll_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Enroll_Register(vo);
			}
		});
		enroll_btn.setFont(new Font("휴먼엑스포", Font.BOLD, 16));
		enroll_btn.setBounds(645, 210, 252, 47);
		enroll_btn.setBackground(c1);
		enroll_btn.setForeground(c3);
		enroll_btn.setBorder(null);
		contentPane.add(enroll_btn);
		
		JButton interest_btn = new JButton("관심과목 조회 및 등록");
		interest_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Enroll_Interest(vo);
			}
		});
		interest_btn.setFont(new Font("휴먼엑스포", Font.BOLD, 16));
		interest_btn.setBounds(645, 348, 252, 47);
		interest_btn.setBackground(c1);
		interest_btn.setForeground(c3);
		interest_btn.setBorder(null);
		contentPane.add(interest_btn);
		
		JButton back_btn = new JButton("뒤로가기");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Main(vo.getId(), vo.getPw());
			}
		});
		back_btn.setBounds(426, 485, 97, 23);
		back_btn.setBackground(c1);
		back_btn.setForeground(c3);
		back_btn.setBorder(null);
		back_btn.setFont(new Font("휴먼엑스포", Font.PLAIN, 12));
		contentPane.add(back_btn);
		
		setVisible(true);
	}
}
