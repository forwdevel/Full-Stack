package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import daovo.StudentVo;

import javax.swing.JButton;

public class Student_Grade extends JFrame {
	private JPanel contentPane;
	private JTable table;
	
	public Student_Grade(StudentVo vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("2022년 2학기");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		fixed_1.setBounds(333, 46, 296, 40);
		contentPane.add(fixed_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(235, 131, 514, 316);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"학수번호", "과목명", "이수구분", "학점", "성적"
			}
		));
		table.setBackground(Color.white);
		scrollPane.setViewportView(table);
		
		JButton back_btn = new JButton("뒤로가기");
		// ActionListener
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Student_Main(vo.getId(), vo.getPw());
			}
		});
		back_btn.setBounds(446, 492, 97, 23);
		contentPane.add(back_btn);
		
		if(table.getRowCount() == 0) {
			System.out.println("table is null");
			setVisible(false);
			JOptionPane.showMessageDialog(null, "성적 공시기간이 아닙니다.");
			new Student_Main(vo.getId(), vo.getPw());
		} else {
			setVisible(true);
		}
	}

}
