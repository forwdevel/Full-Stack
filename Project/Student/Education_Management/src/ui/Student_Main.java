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
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import daovo.StudentDao;
import daovo.StudentVo;

public class Student_Main extends JFrame {

	private JPanel contentPane;

	public Student_Main(int id_txt, String pw_txt) {
		StudentDao dao = new StudentDao();
		StudentVo vo = dao.stu(id_txt, pw_txt);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("\uD559\uC0DD,");
		fixed_1.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_1.setFont(new Font("���� ���", Font.BOLD, 32));
		fixed_1.setBounds(179, 22, 110, 69);
		contentPane.add(fixed_1);
		
		JLabel fixed_6 = new JLabel("\uD559\uBC88");
		fixed_6.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_6.setBounds(26, 108, 56, 43);
		contentPane.add(fixed_6);
		
		JLabel fixed_7 = new JLabel("\uD559\uB144");
		fixed_7.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_7.setBounds(26, 146, 56, 43);
		contentPane.add(fixed_7);
		
		JLabel fixed_8 = new JLabel("\uB2E8\uACFC");
		fixed_8.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_8.setBounds(26, 187, 56, 43);
		contentPane.add(fixed_8);
		
		JLabel fixed_9 = new JLabel("\uC804\uACF5");
		fixed_9.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_9.setBounds(26, 226, 56, 43);
		contentPane.add(fixed_9);
		
		JLabel fixed_10 = new JLabel("\uC785\uD559\uB144\uB3C4");
		fixed_10.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_10.setBounds(26, 269, 80, 43);
		contentPane.add(fixed_10);
		
		JLabel fixed_11 = new JLabel("\uC218\uAC15\uC2E0\uCCAD \uD559\uC810");
		fixed_11.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_11.setBounds(26, 312, 127, 43);
		contentPane.add(fixed_11);
		
		JLabel fixed_2 = new JLabel("\uC2E0\uCCAD\uAC00\uB2A5 \uD559\uC810");
		fixed_2.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_2.setBounds(26, 353, 127, 43);
		contentPane.add(fixed_2);
		
		JLabel fixed_3 = new JLabel("18");
		fixed_3.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3.setFont(new Font("���� ���", Font.PLAIN, 20));
		fixed_3.setBounds(178, 353, 36, 43);
		contentPane.add(fixed_3);
		
		JLabel fixed_4 = new JLabel("\uC77C\uC815");
		fixed_4.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_4.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_4.setBounds(696, 20, 56, 43);
		contentPane.add(fixed_4);
		
		JLabel fixed_5 = new JLabel("\uACF5\uC9C0\uC0AC\uD56D");
		fixed_5.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_5.setFont(new Font("���� ���", Font.BOLD, 20));
		fixed_5.setBounds(667, 288, 110, 43);
		contentPane.add(fixed_5);
		
		JLabel stu_name = new JLabel(vo.getName());
		stu_name.setFont(new Font("���� ���", Font.BOLD, 32));
		stu_name.setBounds(26, 22, 154, 69);
		contentPane.add(stu_name);
		
		JButton lecture_register = new JButton("���� ��û");
		// ActionListener
		lecture_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Enroll_Main(vo);
			}
		});
		lecture_register.setFont(new Font("���� ���", Font.BOLD, 16));
		lecture_register.setForeground(SystemColor.textHighlightText);
		lecture_register.setBackground(SystemColor.textHighlight);
		lecture_register.setBounds(56, 457, 110, 43);
		contentPane.add(lecture_register);
		
		JButton grade_inquiry = new JButton("���� ��ȸ");
		// ActionListener
		grade_inquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_grade(vo);
			}
			
		});
		grade_inquiry.setForeground(Color.WHITE);
		grade_inquiry.setFont(new Font("���� ���", Font.BOLD, 16));
		grade_inquiry.setBackground(SystemColor.textHighlight);
		grade_inquiry.setBounds(222, 457, 110, 43);
		contentPane.add(grade_inquiry);
		
		JLabel stu_id = new JLabel("" +vo.getId());
		stu_id.setHorizontalAlignment(SwingConstants.RIGHT);
		stu_id.setFont(new Font("���� ���", Font.PLAIN, 20));
		stu_id.setBounds(95, 108, 119, 43);
		contentPane.add(stu_id);
		
		JLabel stu_grade = new JLabel("" + vo.getGrade());
		stu_grade.setHorizontalAlignment(SwingConstants.RIGHT);
		stu_grade.setFont(new Font("���� ���", Font.PLAIN, 20));
		stu_grade.setBounds(95, 146, 119, 43);
		contentPane.add(stu_grade);
		
		JLabel stu_college = new JLabel(vo.getCollege());
		stu_college.setHorizontalAlignment(SwingConstants.RIGHT);
		stu_college.setFont(new Font("���� ���", Font.PLAIN, 16));
		stu_college.setBounds(78, 187, 136, 43);
		contentPane.add(stu_college);
		
		JLabel stu_major = new JLabel(vo.getMajor());
		stu_major.setHorizontalAlignment(SwingConstants.RIGHT);
		stu_major.setFont(new Font("���� ���", Font.PLAIN, 16));
		stu_major.setBounds(78, 226, 136, 43);
		contentPane.add(stu_major);
		
		JLabel stu_enroll = new JLabel("" + vo.getEnroll());
		stu_enroll.setHorizontalAlignment(SwingConstants.RIGHT);
		stu_enroll.setFont(new Font("���� ���", Font.PLAIN, 20));
		stu_enroll.setBounds(95, 269, 119, 43);
		contentPane.add(stu_enroll);
		
		JLabel credit = new JLabel("" + vo.getCredit());
		credit.setHorizontalAlignment(SwingConstants.RIGHT);
		credit.setFont(new Font("���� ���", Font.PLAIN, 20));
		credit.setBounds(178, 312, 36, 43);
		contentPane.add(credit);
		
		setVisible(true);
	}
}
