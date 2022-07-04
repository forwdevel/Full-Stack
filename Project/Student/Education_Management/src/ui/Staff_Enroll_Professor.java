package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import daovo.EtcDao;
import daovo.ProfessorDao;

public class Staff_Enroll_Professor extends JFrame {

	private JPanel contentPane;
	private JTextField pro_id;
	private JTextField pro_name;
	private JTextField college;
	private JTextField major;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_Enroll_Professor frame = new Staff_Enroll_Professor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Staff_Enroll_Professor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel fixed_1 = new JLabel("���� ���");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("���� ���", Font.BOLD, 36));
		fixed_1.setBounds(393, 65, 167, 49);
		contentPane.add(fixed_1);

		JLabel fixed_2 = new JLabel("���� ��ȣ");
		fixed_2.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_2.setFont(new Font("���� ���", Font.BOLD, 18));
		fixed_2.setBounds(300, 208, 98, 23);
		contentPane.add(fixed_2);

		JLabel fixed_3 = new JLabel("�̸�");
		fixed_3.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3.setFont(new Font("���� ���", Font.BOLD, 18));
		fixed_3.setBounds(341, 257, 57, 23);
		contentPane.add(fixed_3);

		JLabel fixed_4 = new JLabel("�ܰ�");
		fixed_4.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_4.setFont(new Font("���� ���", Font.BOLD, 18));
		fixed_4.setBounds(341, 308, 57, 23);
		contentPane.add(fixed_4);

		JLabel fixed_5 = new JLabel("����");
		fixed_5.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_5.setFont(new Font("���� ���", Font.BOLD, 18));
		fixed_5.setBounds(341, 358, 57, 23);
		contentPane.add(fixed_5);

		JComboBox enroll_year = new JComboBox();
		enroll_year.setBackground(Color.WHITE);
		enroll_year.setModel(new DefaultComboBoxModel(new String[] { "�ӿ�⵵", "2022", "2021", "2020",
				"2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
		enroll_year.setBounds(514, 175, 75, 23);
		contentPane.add(enroll_year);

		pro_id = new JTextField();
		pro_id.setToolTipText("");
		pro_id.setBounds(410, 208, 179, 27);
		contentPane.add(pro_id);
		pro_id.setColumns(10);

		pro_name = new JTextField();
		pro_name.setColumns(10);
		pro_name.setBounds(410, 257, 179, 27);
		contentPane.add(pro_name);

		college = new JTextField();
		college.setColumns(10);
		college.setBounds(410, 308, 179, 27);
		contentPane.add(college);

		major = new JTextField();
		major.setColumns(10);
		major.setBounds(410, 358, 179, 27);
		contentPane.add(major);

		JButton enter_btn = new JButton("���");
		enter_btn.setBackground(SystemColor.textHighlight);
		enter_btn.setForeground(Color.WHITE);
		enter_btn.setFont(new Font("���� ���", Font.BOLD, 14));
		enter_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = 0;
				int enroll = 0;
				if (pro_id.getText().length() == 0) {
					new Alert("������ȣ�� �Է��Ͻÿ�.");
				} else if (pro_name.getText().length() == 0) {
					new Alert("�������� �Է��Ͻÿ�.");
				} else if (college.getText().length() == 0) {
					new Alert("�ܰ��� �Է��Ͻÿ�.");
				} else if (major.getText().length() == 0) {
					new Alert("������ �Է��Ͻÿ�.");
				} else {
					// not null

					// id check
					// 1. check format
					try {
						id = Integer.parseInt(pro_id.getText());
					} catch (NumberFormatException e1) {
						System.out.println(pro_id.getText());
						new Alert("������ ���ڸ� �Է��� �����մϴ�.");
						return;
					}
					// 2. check length
					if (pro_id.getText().length() != 9) {
						new Alert("������ 9�ڸ��Դϴ�.");
						return;
					}

					// major & college check
					if (new EtcDao().inquiry(college.getText(), major.getText()) == -1) {
						college.setText("");
						major.setText("");
						return;
					} else if (new EtcDao().inquiry(college.getText(), major.getText()) == -2) {
						major.setText("");
						return;
					}

					// enroll check
					if (enroll_year.getSelectedIndex() == -1) {
						new Alert("�ӿ�⵵�� �����ϼ���.");
						return;
					} else {
						try {
							enroll = Integer.valueOf((String) enroll_year.getSelectedItem());
						} catch (Exception e3) {
							return;
						}
					}

					boolean b = new ProfessorDao().enroll_pro(id, pro_name.getText(), college.getText(),
							major.getText(), enroll);

					if (b) {
						setVisible(false);
						new Alert("��Ͽ� �����Ͽ����ϴ�.");
						new Staff_Main();
					}
				}
			}
		});
		enter_btn.setBounds(353, 440, 98, 37);
		contentPane.add(enter_btn);

		JButton back_btn = new JButton("���");
		back_btn.setBackground(SystemColor.controlDkShadow);
		back_btn.setForeground(Color.WHITE);
		back_btn.setFont(new Font("���� ���", Font.BOLD, 14));
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Main();
			}
		});
		back_btn.setBounds(495, 440, 94, 37);
		contentPane.add(back_btn);
	}
}
