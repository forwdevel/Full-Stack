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
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Choice;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Staff_Inquiry_Lecture extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton remove_btn;
	private JButton back_btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_Inquiry_Lecture frame = new Staff_Inquiry_Lecture();
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
	public Staff_Inquiry_Lecture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixded_1 = new JLabel("\uACFC\uBAA9 \uC870\uD68C");
		fixded_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		fixded_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixded_1.setBounds(353, 32, 227, 33);
		contentPane.add(fixded_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 85, 655, 386);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\uD559\uC218\uBC88\uD638", "\uACFC\uBAA9\uBA85", "\uBD84\uBC18", "\uB2E8\uACFC", "\uC804\uACF5", "\uAC15\uC758\uC2E4", "\uC120\uD0DD"
			}
		));
		
		remove_btn = new JButton("\uC0AD\uC81C");
		remove_btn.setBounds(309, 504, 97, 23);
		contentPane.add(remove_btn);
		
		back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		back_btn.setBounds(557, 504, 97, 23);
		contentPane.add(back_btn);
	}
}
