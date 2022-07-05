package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

import daovo.EtcDao;
import daovo.StaffDao;
import daovo.StudentVo;

public class Student_Enroll_Interest extends JFrame {

	private JPanel contentPane;
	private JTextField lec_year;
	private JTextField lec_credit;
	private JTextField lec_id;
	private JTextField college;
	private JTextField lec_name;
	private JTable inquiry_table;
	private JTable interest_table;
	private JTextField lec_pro;
	private JTextField major;

	public Student_Enroll_Interest(StudentVo vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lec_year = new JTextField();
		lec_year.setHorizontalAlignment(SwingConstants.RIGHT);
		lec_year.setBounds(84, 48, 67, 30);
		lec_year.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_year.setText("2022");
		contentPane.add(lec_year);
		lec_year.setColumns(10);
		
		JComboBox lec_semester = new JComboBox();
		lec_semester.setModel(new DefaultComboBoxModel(new String[] {"여름계절", "2", "겨울계절", "1"}));
		lec_semester.setBounds(165, 48, 75, 30);
		lec_semester.setFont(new Font("Dialog", Font.PLAIN, 12));
		lec_semester.setToolTipText("");
		contentPane.add(lec_semester);
		
		JLabel fixed_1 = new JLabel("학점");
		fixed_1.setBounds(94, 98, 57, 15);
		fixed_1.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_1.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_1);
		
		JLabel fixed_2 = new JLabel("학수번호");
		fixed_2.setBounds(84, 130, 67, 15);
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
		
		JLabel fixed_4 = new JLabel("단과");
		fixed_4.setBounds(506, 98, 57, 15);
		fixed_4.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_4.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_4);
		
		college = new JTextField();
		college.setBounds(575, 88, 129, 30);
		college.setFont(new Font("���� ���", Font.PLAIN, 14));
		college.setColumns(10);
		contentPane.add(college);
		
		JLabel fixed_5 = new JLabel("과목명");
		fixed_5.setBounds(280, 130, 57, 15);
		fixed_5.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_5.setFont(new Font("���� ���", Font.BOLD, 14));
		contentPane.add(fixed_5);
		
		lec_name = new JTextField();
		lec_name.setBounds(349, 122, 386, 30);
		lec_name.setFont(new Font("���� ���", Font.PLAIN, 14));
		lec_name.setColumns(10);
		contentPane.add(lec_name);
		
		// complete
		JButton inquiry_btn = new JButton("조회");
		inquiry_btn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				if(lec_year.getText().length() == 0) {
					new Alert("년도를 입력해주세요.");
					return;
				}
				
				String query = "";
				
				if(lec_name.getText().length() != 0) {
					// lecture name is not null
					// only searching using lecture name
					// with year and semester
					// ignore others
					
					query = "select * from lecture where name = '" + lec_name.getText() +"'";
					query += " and year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
				} else if (lec_pro.getText().length() != 0) {
					// professor name is not null
					// only searching using professor name
					// with year and semester
					// ignore others
					
					query = "select * from lecture where professor = '" + lec_pro.getText() + "'";
					query += " and year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
							
				} else if (lec_id.getText().length() != 0) {
					// lecture id is not null
					// only searching using lecture id
					// with year and semester
					// ignore others
					
					query = "select * from lecture where id = '" + lec_id.getText() + "'" ;
					query += " and year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
					
				} else if (college.getText().length() != 0) {
					if(major.getText().length() != 0) {
						// college and major are not null
						// searching using college and major
						// with year and semester
						// ignore others
						
						query = "select * from lecture where college = '" + college.getText() + "' and major = '" + major.getText() + "'";
						query += " and year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
					} else {
						// college is not null
						// only searching using college
						// with year and semester
						// ignore others
						
						query = "select * from lecture where college = '" + college.getText() + "'";
						query += " and year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
					}
				} else if (major.getText().length() != 0) {
					// college is null
					// major is not null
					
					query = "select * from lecture where major = '" + major.getText() + "'";
					query += " and year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
				} else if (lec_credit.getText().length() != 0) {
					// credit is not null, but all is null
					// only searching using credit
					// with year and semester
					query = "select * from lecture where credit = " + lec_credit.getText();
					query += " and year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
				} else {
					// all is null
					// inquiry all lectures with year and semester
					query = "select * from lecture where";
					query += " year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
				}
				
				System.out.println("SQL : " + query);
				
				// inquiry
				object = new EtcDao().interestInquery(query);
				inquiry_table.setModel(new DefaultTableModel(
						object,
						new String[] {
								"학수번호", "이수구분", "과목명", "교수명", "학점", "강의실", "인원제한", "현재인원"
						}
					) {
						Class[] columnTypes = new Class[] {
							String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, Integer.class
						};
						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
					});
				inquiry_table.repaint();
			}
		});
		inquiry_btn.setBounds(740, 122, 67, 30);
		contentPane.add(inquiry_btn);
		
		JButton reset_btn = new JButton("초기화");
		reset_btn.setBounds(810, 122, 75, 30);
		contentPane.add(reset_btn);
		
		JScrollPane inquiry_table_pane = new JScrollPane();
		inquiry_table_pane.setBounds(84, 329, 801, 165);
		contentPane.add(inquiry_table_pane);
		
		String firstQuery = "select * from lecture where";
		firstQuery += " year = " + lec_year.getText() + " and semester = '" + lec_semester.getSelectedItem().toString()+"'";
		inquiry_table = new JTable();
		inquiry_table_pane.setViewportView(inquiry_table);
		inquiry_table.setModel(new DefaultTableModel(
			new EtcDao().interestInquery(firstQuery),
			new String[] {
					"학수번호", "이수구분", "과목명", "교수명", "학점", "강의실", "인원제한", "현재인원"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		inquiry_table.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				new Confirm("관심과목으로 등록하시겠습니까?", 1);
				// [ Design Func.1 ]
				// enter this lecture to register and 'interest' set to 1
				
				// repaint interest table.
				interest_table.repaint();
				
			}

			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		inquiry_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton back_btn = new JButton("뒤로가기");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Enroll_Main(vo);
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
				"학수번호", "이수구분", "과목명", "교수명", "학점", "강의실", "인원제한", "현재인원"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		interest_table.setBorder(new LineBorder(new Color(0, 0, 0)));
		interest_table_pane.setViewportView(interest_table);
		
		JLabel fixed_7 = new JLabel("현 관심등록 과목");
		fixed_7.setFont(new Font("���� ���", Font.BOLD, 14));
		fixed_7.setBounds(84, 188, 115, 15);
		contentPane.add(fixed_7);
		
		JLabel fixed_8 = new JLabel("해당 시스템은 본 수강신청과는 무관합니다. 수강신청은 별개로 진행됩니다.");
		fixed_8.setFont(new Font("���� ���", Font.PLAIN, 10));
		fixed_8.setHorizontalAlignment(SwingConstants.LEFT);
		fixed_8.setBounds(205, 189, 386, 15);
		contentPane.add(fixed_8);
		
		JLabel fixed_4_1 = new JLabel("교수명");
		fixed_4_1.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_4_1.setFont(new Font("Dialog", Font.BOLD, 14));
		fixed_4_1.setBounds(280, 98, 57, 15);
		contentPane.add(fixed_4_1);
		
		lec_pro = new JTextField();
		lec_pro.setFont(new Font("Dialog", Font.PLAIN, 14));
		lec_pro.setColumns(10);
		lec_pro.setBounds(349, 88, 75, 30);
		contentPane.add(lec_pro);
		
		major = new JTextField();
		major.setFont(new Font("Dialog", Font.PLAIN, 14));
		major.setColumns(10);
		major.setBounds(756, 88, 129, 30);
		contentPane.add(major);
		
		JLabel fixed_4_2 = new JLabel("전공");
		fixed_4_2.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_4_2.setFont(new Font("Dialog", Font.BOLD, 14));
		fixed_4_2.setBounds(687, 99, 57, 15);
		contentPane.add(fixed_4_2);
		
		setVisible(true);
	}
}
