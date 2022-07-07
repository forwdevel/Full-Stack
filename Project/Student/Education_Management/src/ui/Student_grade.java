package ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import daovo.StudentVo;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Student_grade extends JFrame {
	private JPanel contentPane;
	private JTable table;
	private Object[][] object;
	
	public Student_grade(StudentVo vo) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		contentPane.setLayout(null);
		setContentPane(contentPane);

		
		JLabel fixed_1 = new JLabel("2022년 여름계절");
		fixed_1.setBounds(333, 46, 296, 40);
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("휴먼엑스포", Font.BOLD, 24));
		contentPane.add(fixed_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(235, 131, 514, 316);
		scrollPane.setBackground(Color.WHITE);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"학수번호", "과목명", "교수명", "학점", "성적"
			}
		));
		table.setBackground(Color.white);
		scrollPane.setViewportView(table);
		
		JButton back_btn = new JButton("뒤로가기");
		back_btn.setBounds(446, 492, 97, 23);
		// ActionListener
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Main(vo);
			}
		});
		contentPane.add(back_btn);
		
		if(object == null) {
			System.out.println("table is null");
			setVisible(false);
			new Student_Main(vo);
			new Alert("성적공시기간이 아닙니다.");
		} else {
			setVisible(true);
		}
	}
}
