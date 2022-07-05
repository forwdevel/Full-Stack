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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import daovo.StudentDao;

//
//	complete
//

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
		fixed_1.setFont(new Font("���� ���", Font.BOLD, 24));
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
				{"2021008001", "\uD14C\uC2A4\uD2B82", "\uACFC\uD559\uAE30\uC220\uB300\uD559", "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", new Integer(1), new Integer(2021)},
				{"2022008002", "\uD14C\uC2A4\uD2B8", "\uACFC\uD559\uAE30\uC220\uB300\uD559", "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", new Integer(1), new Integer(2022)},
				{"2016001001", "\uAE40\uCCA0\uC218", "\uC2A4\uB9C8\uD2B8\uB3C4\uC2DC\uD559\uBD80", "\uC2A4\uB9C8\uD2B8\uB3C4\uC2DC\uD559\uBD80", new Integer(1), new Integer(2016)},
				{"2022008001", "\uD14C\uC2A4\uD2B8", "\uACFC\uD559\uAE30\uC220\uB300\uD559", "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", new Integer(1), new Integer(2022)},
			},
			new String[] {
				"\uD559\uBC88", "\uD559\uC0DD\uBA85", "\uB2E8\uACFC", "\uC804\uACF5", "\uD559\uB144", "\uC785\uD559\uB144\uB3C4"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(55);
		table.getColumnModel().getColumn(2).setPreferredWidth(120);
		table.getColumnModel().getColumn(3).setPreferredWidth(120);
		table.getColumnModel().getColumn(4).setPreferredWidth(15);
		table.getColumnModel().getColumn(5).setPreferredWidth(50);
		
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
