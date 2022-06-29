package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Student_Enroll_Interest extends JFrame {

	private JPanel contentPane;
	private JTextField lec_year;
	private JTextField lec_credit;
	private JTextField lec_id;
	private JTextField lec_div;
	private JTextField lec_pro;
	private JTextField lec_name;
	private JTable inquiry_table;
	private JTable interest_table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Enroll_Interest frame = new Student_Enroll_Interest();
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
	public Student_Enroll_Interest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lec_year = new JTextField();
		lec_year.setBounds(84, 48, 67, 30);
		lec_year.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lec_year.setText("2022");
		contentPane.add(lec_year);
		lec_year.setColumns(10);
		
		JComboBox lec_semester = new JComboBox();
		lec_semester.setModel(new DefaultComboBoxModel(new String[] {"2", "\uACA8\uC6B8\uACC4\uC808", "1", "\uC5EC\uB984\uACC4\uC808"}));
		lec_semester.setBounds(165, 48, 75, 30);
		lec_semester.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lec_semester.setToolTipText("");
		contentPane.add(lec_semester);
		
		JLabel fixed_1 = new JLabel("\uD559\uC810");
		fixed_1.setBounds(94, 98, 57, 15);
		fixed_1.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("\uD559\uC218\uBC88\uD638");
		fixed_2.setBounds(94, 130, 57, 15);
		fixed_2.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		contentPane.add(fixed_2);
		
		lec_credit = new JTextField();
		lec_credit.setBounds(165, 88, 75, 30);
		lec_credit.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lec_credit.setColumns(10);
		contentPane.add(lec_credit);
		
		lec_id = new JTextField();
		lec_id.setBounds(165, 122, 75, 30);
		lec_id.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lec_id.setColumns(10);
		contentPane.add(lec_id);
		
		JLabel fixed_3 = new JLabel("\uBD84\uBC18");
		fixed_3.setBounds(280, 98, 57, 15);
		fixed_3.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		contentPane.add(fixed_3);
		
		lec_div = new JTextField();
		lec_div.setBounds(349, 88, 75, 30);
		lec_div.setEnabled(false);
		lec_div.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lec_div.setColumns(10);
		contentPane.add(lec_div);
		
		JLabel fixed_4 = new JLabel("\uB2F4\uB2F9\uAD50\uC218");
		fixed_4.setBounds(280, 58, 57, 15);
		fixed_4.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		contentPane.add(fixed_4);
		
		lec_pro = new JTextField();
		lec_pro.setBounds(349, 48, 75, 30);
		lec_pro.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lec_pro.setColumns(10);
		contentPane.add(lec_pro);
		
		JLabel fixed_5 = new JLabel("\uAD50\uACFC\uBAA9\uBA85");
		fixed_5.setBounds(280, 130, 57, 15);
		fixed_5.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		contentPane.add(fixed_5);
		
		lec_name = new JTextField();
		lec_name.setBounds(349, 122, 386, 30);
		lec_name.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		lec_name.setColumns(10);
		contentPane.add(lec_name);
		
		JLabel fixed_6 = new JLabel("\uC774\uC218\uAD6C\uBD84");
		fixed_6.setBounds(487, 58, 57, 15);
		fixed_6.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		contentPane.add(fixed_6);
		
		JComboBox lec_com = new JComboBox();
		lec_com.setBounds(556, 48, 106, 30);
		lec_com.setToolTipText("");
		lec_com.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		contentPane.add(lec_com);
		
		JComboBox lec_college = new JComboBox();
		lec_college.setBounds(668, 48, 106, 30);
		lec_college.setToolTipText("");
		lec_college.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		contentPane.add(lec_college);
		
		JComboBox lec_major = new JComboBox();
		lec_major.setBounds(779, 48, 106, 30);
		lec_major.setToolTipText("");
		lec_major.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 14));
		contentPane.add(lec_major);
		
		JButton inquiry_btn = new JButton("\uC870\uD68C");
		inquiry_btn.setBounds(740, 122, 67, 30);
		contentPane.add(inquiry_btn);
		
		JButton reset_btn = new JButton("\uCD08\uAE30\uD654");
		reset_btn.setBounds(810, 122, 75, 30);
		contentPane.add(reset_btn);
		
		JScrollPane inquiry_table_pane = new JScrollPane();
		inquiry_table_pane.setBounds(84, 329, 801, 165);
		contentPane.add(inquiry_table_pane);
		
		inquiry_table = new JTable();
		inquiry_table_pane.setViewportView(inquiry_table);
		inquiry_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uD559\uC218\uBC88\uD638", "\uAD50\uACFC\uBAA9\uBA85", "\uC774\uC218\uAD6C\uBD84", "\uD559\uC810", "\uAD50\uC218\uBA85", "\uAC15\uC758\uC2E4", "\uD604\uC7AC\uC2E0\uCCAD\uC778\uC6D0", "\uC778\uC6D0\uC81C\uD55C"
			}
		));
		inquiry_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		back_btn.setBounds(437, 517, 97, 23);
		contentPane.add(back_btn);
		
		JScrollPane interest_table_pane = new JScrollPane();
		interest_table_pane.setBounds(84, 207, 801, 96);
		contentPane.add(interest_table_pane);
		
		interest_table = new JTable();
		interest_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uD559\uC218\uBC88\uD638", "\uAD50\uACFC\uBAA9\uBA85", "\uC774\uC218\uAD6C\uBD84", "\uD559\uC810", "\uAD50\uC218\uBA85", "\uAC15\uC758\uC2E4", "\uD604\uC7AC\uC2E0\uCCAD\uC778\uC6D0", "\uC778\uC6D0\uC81C\uD55C"
			}
		));
		interest_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		interest_table_pane.setViewportView(interest_table);
		
		JLabel fixed_7 = new JLabel("\uD604 \uAD00\uC2EC\uB4F1\uB85D \uACFC\uBAA9");
		fixed_7.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		fixed_7.setBounds(84, 188, 108, 15);
		contentPane.add(fixed_7);
		
		JLabel fixed_8 = new JLabel("\u203B \uBCF8 \uAE30\uB2A5\uC740 \uC218\uAC15\uC2E0\uCCAD\uC744 \uC704\uD55C \uC2DC\uC2A4\uD15C\uC77C \uBFD0, \uC2E4\uC81C \uC218\uAC15\uC2E0\uCCAD\uC744 \uC9C4\uD589\uD574\uC8FC\uC154\uC57C \uD569\uB2C8\uB2E4.");
		fixed_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 10));
		fixed_8.setHorizontalAlignment(SwingConstants.LEFT);
		fixed_8.setBounds(197, 190, 386, 15);
		contentPane.add(fixed_8);
	}
}
