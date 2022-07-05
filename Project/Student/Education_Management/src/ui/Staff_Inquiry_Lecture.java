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

import daovo.StaffDao;

import java.awt.Choice;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;

//
//	complete
//

public class Staff_Inquiry_Lecture extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton back_btn;

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

	public Staff_Inquiry_Lecture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixded_1 = new JLabel("과목 조회");
		fixded_1.setFont(new Font("���� ���", Font.BOLD, 24));
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
				{"CULC463", "\uC804\uACF5\uC120\uD0DD", "\uBB38\uD654\uCF58\uD150\uCE20\uD604\uC7A5\uC2E4\uC2B5III", new Integer(6), "\uBB38\uD654\uCF58\uD150\uCE20\uC804\uACF5", "\uAE40\uAD11\uD6C8"},
				{"CULC462", "\uC804\uACF5\uC120\uD0DD", "\uBB38\uD654\uCF58\uD150\uCE20\uD604\uC7A5\uC2E4\uC2B5II", new Integer(3), "\uBB38\uD654\uCF58\uD150\uCE20\uC804\uACF5", "\uC548\uB0A8\uC77C"},
				{"CULC461", "\uC804\uACF5\uC120\uD0DD", "\uBB38\uD654\uCF58\uD150\uCE20\uD604\uC7A5\uC2E4\uC2B5I", new Integer(3), "\uBB38\uD654\uCF58\uD150\uCE20\uC804\uACF5", "\uC548\uB0A8\uC77C"},
				{"GLOB476", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5iii", new Integer(3), "\uAE00\uB85C\uBC8C\uACBD\uC601\uC804\uACF5", "\uAE40\uD765\uC218"},
				{"GLOB474", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5i", new Integer(3), "\uAE00\uB85C\uBC8C\uACBD\uC601\uC804\uACF5", "\uAE40\uD765\uC218"},
				{"GLOB347", "\uC804\uACF5\uC120\uD0DD", "\uB370\uC774\uD130\uC0AC\uC774\uC5B8\uC2A4\uAC1C\uB860", new Integer(3), "\uAE00\uB85C\uBC8C\uACBD\uC601\uC804\uACF5", "\uC7A5\uD6C8"},
				{"GLOB272", "\uC804\uACF5\uC120\uD0DD", "\uCC3D\uC5C5\uB860", new Integer(3), "\uAE00\uB85C\uBC8C\uACBD\uC601\uC804\uACF5", "\uAE40\uD765\uC218"},
				{"GLOB243", "\uC804\uACF5\uC120\uD0DD", "\uC0DD\uC0B0\uC6B4\uC601\uAD00\uB9AC", new Integer(3), "\uAE00\uB85C\uBC8C\uACBD\uC601\uC804\uACF5", "\uAE40\uC9C4\uBBFC"},
				{"ENGS314", "\uC804\uACF5\uC120\uD0DD", "\uC601\uBBF8\uC18C\uC124", new Integer(3), "\uC601\uBBF8\uD559\uC804\uACF5", "\uC774\uC724\uC9C4"},
				{"ENGS265", "\uC804\uACF5\uC120\uD0DD", "\uC601\uBBF8\uAD8C\uC0DD\uD65C\uC758\uC774\uD574", new Integer(3), "\uC601\uBBF8\uD559\uC804\uACF5", "Brubacher"},
				{"DCCS417", "\uC804\uACF5\uC120\uD0DD", "\uD658\uACBD\uACF5\uD559\uD604\uC7A5\uC778\uD134\uC2EDII", new Integer(3), "\uD658\uACBD\uC2DC\uC2A4\uD15C\uACF5\uD559\uACFC", "\uD64D\uC6A9\uC11D"},
				{"DCCS416", "\uC804\uACF5\uC120\uD0DD", "\uD658\uACBD\uACF5\uD559\uD604\uC7A5\uC778\uD134\uC2EDI", new Integer(3), "\uD658\uACBD\uC2DC\uC2A4\uD15C\uACF5\uD559\uACFC", "\uD64D\uC6A9\uC11D"},
				{"DCCS415", "\uC804\uACF5\uC120\uD0DD", "\uCEF4\uD4E8\uD130\uD1B5\uC2E0\uBC0F\uC2E4\uC2B5", new Integer(3), "\uCEF4\uD4E8\uD130\uC735\uD569\uC18C\uD504\uD2B8\uC6E8\uC5B4\uD559\uACFC", "\uAE40\uC2B9\uC5F0"},
				{"DCCS316", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5II", new Integer(3), "\uCEF4\uD4E8\uD130\uC735\uD569\uC18C\uD504\uD2B8\uC6E8\uC5B4\uD559\uACFC", "\uAE40\uC2B9\uC5F0"},
				{"DCCS315", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5I", new Integer(3), "\uCEF4\uD4E8\uD130\uC735\uD569\uC18C\uD504\uD2B8\uC6E8\uC5B4\uD559\uACFC", "\uAE40\uC2B9\uC5F0"},
				{"EIEN488", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5iii", new Integer(3), "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", "\uAE40\uC885\uC77C"},
				{"EIEN487", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5II", new Integer(3), "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", "\uAE40\uC885\uC77C"},
				{"EIEN486", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5I", new Integer(3), "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", "\uAE40\uC885\uC77C"},
				{"EIEN233", "\uC804\uACF5\uC120\uD0DD", "\uB370\uC774\uD130\uAD6C\uC870", new Integer(3), "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", "\uAE40\uC0C1\uACE4"},
				{"EIEN220", "\uC804\uACF5\uD544\uC218", "\uB514\uC9C0\uD138\uC2DC\uC2A4\uD15C", new Integer(3), "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", "\uAE40\uC0C1\uACE4"},
				{"EIEN209", "\uC804\uACF5\uC120\uD0DD", "\uACF5\uC5C5\uC218\uD559I", new Integer(3), "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", "\uAE40\uC885\uC77C"},
				{"EIEN180", "\uC804\uACF5\uC120\uD0DD", "\uACC4\uC0B0\uC218\uD559", new Integer(3), "\uC804\uC790\uBC0F\uC815\uBCF4\uACF5\uD559\uACFC", "\uAE40\uC885\uC77C"},
				{"EMSE461", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5ii", new Integer(3), "\uC804\uC790\uAE30\uACC4\uC735\uD569\uACF5\uD559\uACFC", "\uBC15\uAC15\uBC15"},
				{"EMSE360", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5i", new Integer(3), "\uC804\uC790\uAE30\uACC4\uC735\uD569\uACF5\uD559\uACFC", "\uBC15\uAC15\uBC15"},
				{"EMSE341", "\uC804\uACF5\uC120\uD0DD", "\uAE30\uC804\uC751\uC6A9\uC784\uBCA0\uB514\uB4DC\uC2DC\uC2A4\uD15C\uAC1C\uB860", new Integer(3), "\uC804\uC790\uAE30\uACC4\uC735\uD569\uACF5\uD559\uACFC", "\uC815\uD604\uD658"},
				{"EMSE335", "\uC804\uACF5\uC120\uD0DD", "CAD", new Integer(3), "\uC804\uC790\uAE30\uACC4\uC735\uD569\uACF5\uD559\uACFC", "\uAE40\uC7AC\uD6C8"},
				{"KFBT484", "\uC804\uACF5\uC120\uD0DD", "\uC2DD\uD488\uBC14\uC774\uC624\uD604\uC7A5\uC778\uD134\uC2EDii", new Integer(3), "\uC2DD\uD488\uC0DD\uBA85\uACF5\uD559\uACFC", "\uD64D\uC9C0\uC5F0"},
				{"KFBT483", "\uC804\uACF5\uC120\uD0DD", "\uC2DD\uD488\uBC14\uC774\uC624\uD604\uC7A5\uC778\uD134\uC2EDi", new Integer(3), "\uC2DD\uD488\uC0DD\uBA85\uACF5\uD559\uACFC", "\uD55C\uBCF5\uACBD"},
				{"BTEC498", "\uC804\uACF5\uC120\uD0DD", "\uBC14\uC774\uC624\uC0B0\uC5C5\uCCB4\uD604\uC7A5\uC2E4\uC2B5II", new Integer(3), "\uC0DD\uBA85\uC815\uBCF4\uACF5\uD559\uACFC", "\uD558\uC6B4\uD658"},
				{"BTEC497", "\uC804\uACF5\uC120\uD0DD", "\uBC14\uC774\uC624\uC0B0\uC5C5\uCCB4\uD604\uC7A5\uC2E4\uC2B5I", new Integer(3), "\uC0DD\uBA85\uC815\uBCF4\uACF5\uD559\uACFC", "\uD558\uC6B4\uD658"},
				{"DSSP454", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5II", new Integer(3), "\uBC18\uB3C4\uCCB4\uBB3C\uB9AC\uC804\uACF5", "\uB958\uC2B9\uC724"},
				{"DSSP453", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5I", new Integer(3), "\uBC18\uB3C4\uCCB4\uBB3C\uB9AC\uC804\uACF5", "\uB958\uC2B9\uC724"},
				{"BDSC442", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5II", new Integer(3), "\uBE45\uB370\uC774\uD130\uC0AC\uC774\uC5B8\uC2A4\uD559\uBD80", "\uC804\uC218\uC601"},
				{"BDSC441", "\uC804\uACF5\uC120\uD0DD", "\uD604\uC7A5\uC2E4\uC2B5I", new Integer(3), "\uBE45\uB370\uC774\uD130\uC0AC\uC774\uC5B8\uC2A4\uD559\uBD80", "\uC804\uC218\uC601"},
				{"BDSC432", "\uC804\uACF5\uC120\uD0DD", "\uB370\uC774\uD130\uC0AC\uC774\uC5B8\uC2A4\uD2B9\uAC15II", new Integer(3), "\uBE45\uB370\uC774\uD130\uC0AC\uC774\uC5B8\uC2A4\uD559\uBD80", "\uC784\uC131\uC218"},
				{"BDSC201", "\uC804\uACF5\uD544\uC218", "\uC218\uB9AC\uD1B5\uACC4\uD559", new Integer(3), "\uBE45\uB370\uC774\uD130\uC0AC\uC774\uC5B8\uC2A4\uD559\uBD80", "\uC774\uC9C0\uC218"},
				{"KUDS352", "\uC804\uACF5\uC120\uD0DD", "\uD55C\uBC18\uB3C4\uD3C9\uD654\uCCB4\uC81C", new Integer(3), "\uD1B5\uC77C\uC678\uAD50\uC548\uBCF4\uC804\uACF5", "\uAE40\uC601\uBBFC"},
				{"ECOP210", "\uC804\uACF5\uC120\uD0DD", "\uACBD\uC81C\uD1B5\uACC4\uD559(\uC601\uAC15)", new Integer(3), "\uACBD\uC81C\uC815\uCC45\uD559\uC804\uACF5", "\uC81C\uC0C1\uC601"},
			},
			new String[] {
				"\uD559\uC218\uBC88\uD638", "\uC774\uC218\uAD6C\uBD84", "\uACFC\uBAA9\uBA85", "\uD559\uC810", "\uC804\uACF5", "\uAD50\uC218"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(133);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(15);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		table.getColumnModel().getColumn(5).setResizable(false);
		
		back_btn = new JButton("뒤로가기");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Main();
			}
		});
		back_btn.setBounds(423, 507, 97, 23);
		contentPane.add(back_btn);
		
		setVisible(true);
	}
}
