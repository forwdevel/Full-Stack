package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Choice;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Staff_Inquiry_Student extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton remove_btn;
	private JButton back_btn;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_Inquiry_Student frame = new Staff_Inquiry_Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Staff_Inquiry_Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("학생 조회");
		fixed_1.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setBounds(353, 32, 227, 33);
		contentPane.add(fixed_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 85, 655, 386);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"학번", "이름", "단과", "전공", "학년", "입학년도", "선택"
			}
		));
		
		remove_btn = new JButton("삭제");
		remove_btn.setBounds(309, 504, 97, 23);
		contentPane.add(remove_btn);
		
		back_btn = new JButton("뒤로가기");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Main();
			}
		});
		back_btn.setBounds(557, 504, 97, 23);
		contentPane.add(back_btn);
	}
}
