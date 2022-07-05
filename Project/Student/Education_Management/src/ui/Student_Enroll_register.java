package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import daovo.StudentVo;

public class Student_Enroll_Register extends JFrame {

	private JPanel contentPane;
	private JTextField lec_year;
	private JTextField lec_credit;
	private JTextField lec_id;
	private JTextField lec_div;
	private JTextField lec_pro;
	private JTextField lec_name;
	private JTable inquiry_table;
	private JTable enroll_table;
	private JLabel fixed_6;

	public Student_Enroll_Register(StudentVo vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lec_year = new JTextField();
		lec_year.setBounds(84, 48, 67, 30);
		lec_year.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_year.setText("2022");
		contentPane.add(lec_year);
		lec_year.setColumns(10);
		
		JComboBox semester = new JComboBox();
		semester.setModel(new DefaultComboBoxModel(new String[] {"2", "�ܿ����", "1", "��������"}));
		semester.setBounds(165, 48, 75, 30);
		semester.setFont(new Font("���� ���", Font.PLAIN, 14));
		semester.setToolTipText("");
		contentPane.add(semester);
		
		JLabel fixed_7 = new JLabel("�� ���ɵ�� �� ������û ����");
		fixed_7.setFont(new Font("���� ���", Font.BOLD, 14));
		fixed_7.setBounds(84, 188, 188, 15);
		contentPane.add(fixed_7);
		
		JLabel fixed_1 = new JLabel("����");
		fixed_1.setBounds(94, 98, 57, 15);
		fixed_1.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_1.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("�м���ȣ");
		fixed_2.setBounds(94, 130, 57, 15);
		fixed_2.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_2.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_2);
		
		lec_credit = new JTextField();
		lec_credit.setBounds(165, 88, 75, 30);
		lec_credit.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_credit.setColumns(10);
		contentPane.add(lec_credit);
		
		lec_id = new JTextField();
		lec_id.setBounds(165, 122, 75, 30);
		lec_id.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_id.setColumns(10);
		contentPane.add(lec_id);
		
		JLabel fixed_3 = new JLabel("�й�");
		fixed_3.setBounds(280, 98, 57, 15);
		fixed_3.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_3);
		
		lec_div = new JTextField();
		lec_div.setBounds(349, 88, 75, 30);
		lec_div.setEnabled(false);
		lec_div.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_div.setColumns(10);
		contentPane.add(lec_div);
		
		JLabel fixed_4 = new JLabel("\uB2F4\uB2F9\uAD50\uC218");
		fixed_4.setBounds(280, 58, 57, 15);
		fixed_4.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_4.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_4);
		
		lec_pro = new JTextField();
		lec_pro.setBounds(349, 48, 75, 30);
		lec_pro.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_pro.setColumns(10);
		contentPane.add(lec_pro);
		
		JLabel fixed_5 = new JLabel("�������");
		fixed_5.setBounds(280, 130, 57, 15);
		fixed_5.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_5.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_5);
		
		lec_name = new JTextField();
		lec_name.setBounds(349, 122, 386, 30);
		lec_name.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_name.setColumns(10);
		contentPane.add(lec_name);
		
		fixed_6 = new JLabel("�̼�����");
		fixed_6.setBounds(487, 58, 57, 15);
		fixed_6.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_6.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_6);
		
		JComboBox lec_com = new JComboBox();
		lec_com.setBounds(556, 48, 106, 30);
		lec_com.setToolTipText("");
		lec_com.setFont(new Font("���� ���", Font.PLAIN, 14));
		contentPane.add(lec_com);
		
		JComboBox college = new JComboBox();
		college.setBounds(668, 48, 106, 30);
		college.setToolTipText("");
		college.setFont(new Font("���� ���", Font.PLAIN, 14));
		contentPane.add(college);
		
		JComboBox major = new JComboBox();
		major.setBounds(779, 48, 106, 30);
		major.setToolTipText("");
		major.setFont(new Font("���� ���", Font.PLAIN, 14));
		contentPane.add(major);
		
		JButton inquiry_btn = new JButton("조회");
		inquiry_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lec_credit.getText().equals("") || lec_pro.getText().equals("") || lec_id.getText().equals("") || lec_name.getText().equals("") ||) {
					
				}
			}
		});
		inquiry_btn.setBounds(740, 122, 67, 30);
		contentPane.add(inquiry_btn);
		
		JButton reset_btn = new JButton("초기화");
		reset_btn.setBounds(810, 122, 75, 30);
		contentPane.add(reset_btn);
		
		JScrollPane inquiry_pane = new JScrollPane();
		inquiry_pane.setBounds(84, 329, 801, 165);
		contentPane.add(inquiry_pane);
		
		inquiry_table = new JTable();
		inquiry_pane.setViewportView(inquiry_table);
		inquiry_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"학수번호", "이수구분", "과목명", "교수명", "학점", "강의실", "인원제한", "현재인원"
			}
		));
		inquiry_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Enroll_Main(vo);
			}
		});
		back_btn.setBounds(437, 517, 97, 23);
		contentPane.add(back_btn);
		
		JScrollPane enroll_pane = new JScrollPane();
		enroll_pane.setBounds(84, 207, 801, 96);
		contentPane.add(enroll_pane);
		
		enroll_table = new JTable();
		enroll_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"학수번호", "이수구분", "과목명", "교수명", "학점", "강의실", "인원제한", "현재인원"
			}
		));
		enroll_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		enroll_pane.setViewportView(enroll_table);
		
		setVisible(true);
	}
}
