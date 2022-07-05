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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

//
//	complete
//

public class Staff_Enroll_Student extends JFrame {

	private JPanel contentPane;
	private JTextField stu_name;
	private JTextField college;
	private JTextField major;
	private JTextField enroll;

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
		fixed_1.setFont(new Font("���� ���", Font.BOLD, 36));
		fixed_1.setBounds(393, 66, 167, 49);
		contentPane.add(fixed_1);

		JLabel fixed_3 = new JLabel("학생명");
		fixed_3.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3.setFont(new Font("���� ���", Font.BOLD, 18));
		fixed_3.setBounds(341, 257, 57, 23);
		contentPane.add(fixed_3);

		JLabel fixed_5 = new JLabel("단과");
		fixed_5.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_5.setFont(new Font("���� ���", Font.BOLD, 18));
		fixed_5.setBounds(341, 308, 57, 23);
		contentPane.add(fixed_5);

		JLabel fixed_6 = new JLabel("전공");
		fixed_6.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_6.setFont(new Font("���� ���", Font.BOLD, 18));
		fixed_6.setBounds(341, 358, 57, 23);
		contentPane.add(fixed_6);

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
				if (enroll.getText().length() == 0) {
					new Alert("입학년도를 입력해주세요.");
					return;
				} else if (stu_name.getText().length() == 0) {
					new Alert("학생명을 입력해주세요.");
					return;
				} else if (college.getText().length() == 0) {
					new Alert("단과를 입력해주세요.");
					return;
				} else if (major.getText().length() == 0) {
					new Alert("전공을 입력해주세요.");
					return;
				} else {
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

					boolean b = new StudentDao().enroll_stu(Integer.parseInt(enroll.getText()), stu_name.getText(), college.getText(),
							major.getText());

					if (b) {
						setVisible(false);
						new Alert("등록하였습니다.");
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
		
		enroll = new JTextField();
		enroll.setColumns(10);
		enroll.setBounds(410, 209, 179, 27);
		contentPane.add(enroll);
		
		JLabel fixed_3_1 = new JLabel("입학년도");
		fixed_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3_1.setFont(new Font("Dialog", Font.BOLD, 18));
		fixed_3_1.setBounds(299, 209, 99, 23);
		contentPane.add(fixed_3_1);
		
		setVisible(true);
	}
}
