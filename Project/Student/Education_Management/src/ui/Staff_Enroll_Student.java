package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
import daovo.StudentDao;

public class Staff_Enroll_Student extends JFrame {

	private JPanel contentPane;
	private JTextField stu_id;
	private JTextField stu_name;
	private JTextField college;
	private JTextField major;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_Enroll_Student frame = new Staff_Enroll_Student();
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
	public Staff_Enroll_Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel fixed_1 = new JLabel("학생 등록");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("맑은 고딕", Font.BOLD, 36));
		fixed_1.setBounds(393, 66, 167, 49);
		contentPane.add(fixed_1);

		JLabel fixed_2 = new JLabel("학번");
		fixed_2.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_2.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		fixed_2.setBounds(341, 208, 57, 23);
		contentPane.add(fixed_2);

		JLabel fixed_3 = new JLabel("이름");
		fixed_3.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		fixed_3.setBounds(341, 257, 57, 23);
		contentPane.add(fixed_3);

		JLabel fixed_5 = new JLabel("단과");
		fixed_5.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_5.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		fixed_5.setBounds(341, 308, 57, 23);
		contentPane.add(fixed_5);

		JLabel fixed_6 = new JLabel("전공");
		fixed_6.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_6.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		fixed_6.setBounds(341, 358, 57, 23);
		contentPane.add(fixed_6);

		JComboBox enroll_year = new JComboBox();
		enroll_year.setBackground(Color.WHITE);
		enroll_year.setModel(new DefaultComboBoxModel(new String[] { "입학년도", "2022", "2021", "2020", "2019", "2018",
				"2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010" }));
		enroll_year.setBounds(514, 169, 75, 23);
		contentPane.add(enroll_year);

		stu_id = new JTextField();
		stu_id.setBounds(410, 208, 179, 27);
		stu_id.setColumns(10);
		contentPane.add(stu_id);

		stu_name = new JTextField();
		stu_name.setColumns(10);
		stu_name.setBounds(410, 257, 179, 27);
		contentPane.add(stu_name);

		college = new JTextField();
		college.setColumns(10);
		college.setBounds(410, 308, 179, 27);
		contentPane.add(college);

		major = new JTextField();
		major.setColumns(10);
		major.setBounds(410, 358, 179, 27);
		contentPane.add(major);

		JButton enter_btn = new JButton("등록");
		enter_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = 0;
				int enroll = 0;
				if (stu_id.getText().length() == 0) {
					new Alert("학번을 입력하시오.");
					return;
				} else if (stu_name.getText().length() == 0) {
					new Alert("학생명을 입력하시오.");
					return;
				} else if (college.getText().length() == 0) {
					new Alert("단과를 입력하시오.");
					return;
				} else if (major.getText().length() == 0) {
					new Alert("전공을 입력하시오.");
					return;
				} else {
					// id check
					// 1. check format
					try {
						id = Integer.parseInt(stu_id.getText());
					} catch (NumberFormatException e1) {
						new Alert("학번은 숫자만 입력 가능합니다.");
						return; // Close Listener
					}
					// 2. check length
					if (stu_id.getText().length() != 10) {
						new Alert("학생의 학번은 10자리입니다.");
						stu_id.setText("");
						return;
					}

					// major & college check
					if (new EtcDao().inquiry(college.getText(), major.getText()) == -1) {
						// not exist college
						college.setText("");
						major.setText("");
						return;
					} else if (new EtcDao().inquiry(college.getText(), major.getText()) == -2) {
						major.setText("");
						return;
					}

					// enroll check
					if (enroll_year.getSelectedIndex() == -1) {
						// Doesn't selected anyone
						new Alert("입학년도를 선택하세요.");
						return;
					} else {
						try {
							enroll = Integer.valueOf((String) enroll_year.getSelectedItem());
						} catch (Exception e2) {
							e2.printStackTrace();
							return;
						}
					}

					boolean b = new StudentDao().enroll_stu(enroll, id, stu_name.getText(), college.getText(),
							major.getText());

					if (b) {
						setVisible(false);
						new Alert("등록에 성공하였습니다.");
						new Staff_Main();
					}

				}
			}
		});
		enter_btn.setBounds(386, 451, 65, 23);
		contentPane.add(enter_btn);

		JButton cancel_btn = new JButton("취소");
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Main();
			}
		});
		cancel_btn.setBounds(495, 451, 65, 23);
		contentPane.add(cancel_btn);
	}
}
