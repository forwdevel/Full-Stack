package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import daovo.ProfessorDao;
import daovo.ProfessorVo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class Professor_Main extends JFrame {
	private JPanel contentPane;
	public Professor_Main(int id_txt, String pw_txt) {
		ProfessorDao dao = new ProfessorDao();
		ProfessorVo vo = dao.pro(id_txt, pw_txt);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pro_name = new JLabel(vo.getName());
		pro_name.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 36));
		pro_name.setBounds(27, 33, 116, 52);
		contentPane.add(pro_name);
		
		JLabel fixed_1 = new JLabel("±³¼ö,");
		fixed_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 36));
		fixed_1.setBounds(149, 33, 116, 52);
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("±³¼ö¹øÈ£");
		fixed_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_2.setBounds(27, 119, 87, 27);
		contentPane.add(fixed_2);
		
		JLabel fixed_3 = new JLabel("ÀÓ¿ë³âµµ");
		fixed_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_3.setBounds(27, 156, 87, 27);
		contentPane.add(fixed_3);
		
		JLabel fixed_4 = new JLabel("´Ü°ú");
		fixed_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_4.setBounds(27, 193, 87, 27);
		contentPane.add(fixed_4);
		
		JLabel fixed_5 = new JLabel("Àü°ø");
		fixed_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_5.setBounds(27, 230, 87, 27);
		contentPane.add(fixed_5);
		
		JButton enter_grade_btn = new JButton("¼ºÀû ÀÔ·Â");
		enter_grade_btn.setForeground(Color.WHITE);
		enter_grade_btn.setBackground(SystemColor.controlDkShadow);
		enter_grade_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		enter_grade_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		enter_grade_btn.setBounds(67, 459, 150, 45);
		contentPane.add(enter_grade_btn);
		
		JButton enter_lecture_btn = new JButton("°ú¸ñ ÀÔ·Â");
		enter_lecture_btn.setBackground(SystemColor.textHighlight);
		enter_lecture_btn.setForeground(Color.WHITE);
		enter_lecture_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 16));
		enter_lecture_btn.setBounds(67, 379, 150, 45);
		contentPane.add(enter_lecture_btn);
		
		JLabel fixed_6 = new JLabel("ÀÏÁ¤");
		fixed_6.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_6.setBounds(634, 88, 87, 27);
		contentPane.add(fixed_6);
		
		JLabel fixed_7 = new JLabel("°øÁö»çÇ×");
		fixed_7.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_7.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		fixed_7.setBounds(634, 311, 87, 27);
		contentPane.add(fixed_7);
		
		JLabel pro_id = new JLabel("" + vo.getId());
		pro_id.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_id.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pro_id.setBounds(126, 119, 114, 27);
		contentPane.add(pro_id);
		
		JLabel pro_enroll = new JLabel("" + vo.getEnroll());
		pro_enroll.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_enroll.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		pro_enroll.setBounds(126, 156, 114, 27);
		contentPane.add(pro_enroll);
		
		JLabel pro_college = new JLabel(vo.getCollege());
		pro_college.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_college.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		pro_college.setBounds(90, 193, 150, 27);
		contentPane.add(pro_college);
		
		JLabel pro_major = new JLabel(vo.getMajor());
		pro_major.setHorizontalAlignment(SwingConstants.TRAILING);
		pro_major.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 16));
		pro_major.setBounds(90, 230, 150, 27);
		contentPane.add(pro_major);
	}

}
