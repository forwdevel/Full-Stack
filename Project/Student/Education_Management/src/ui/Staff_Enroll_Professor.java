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
import javax.swing.UIManager;

//
//	complete
//
public class Staff_Enroll_Professor extends JFrame {

	private JPanel contentPane;
	private JTextField pro_enroll;
	private JTextField pro_name;
	private JTextField college;
	private JTextField major;

	public Staff_Enroll_Professor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(51, 102, 153));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel fixed_1 = new JLabel("교수 등록");
		fixed_1.setForeground(UIManager.getColor("ToolTip.background"));
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("휴먼엑스포", Font.PLAIN, 36));
		fixed_1.setBounds(393, 76, 167, 49);
		contentPane.add(fixed_1);

		JLabel fixed_2 = new JLabel("임용년도");
		fixed_2.setForeground(SystemColor.info);
		fixed_2.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_2.setFont(new Font("휴먼엑스포", Font.PLAIN, 18));
		fixed_2.setBounds(300, 208, 98, 23);
		contentPane.add(fixed_2);

		JLabel fixed_3 = new JLabel("교수명");
		fixed_3.setForeground(SystemColor.info);
		fixed_3.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_3.setFont(new Font("휴먼엑스포", Font.PLAIN, 18));
		fixed_3.setBounds(341, 257, 57, 23);
		contentPane.add(fixed_3);

		JLabel fixed_4 = new JLabel("단과");
		fixed_4.setForeground(SystemColor.info);
		fixed_4.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_4.setFont(new Font("휴먼엑스포", Font.PLAIN, 18));
		fixed_4.setBounds(341, 308, 57, 23);
		contentPane.add(fixed_4);

		JLabel fixed_5 = new JLabel("전공");
		fixed_5.setForeground(SystemColor.info);
		fixed_5.setHorizontalAlignment(SwingConstants.RIGHT);
		fixed_5.setFont(new Font("휴먼엑스포", Font.PLAIN, 18));
		fixed_5.setBounds(341, 358, 57, 23);
		contentPane.add(fixed_5);

		pro_enroll = new JTextField();
		pro_enroll.setToolTipText("");
		pro_enroll.setBounds(410, 208, 179, 27);
		contentPane.add(pro_enroll);
		pro_enroll.setColumns(10);

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

		JButton enter_btn = new JButton("등록");
		enter_btn.setBackground(SystemColor.textHighlightText);
		enter_btn.setForeground(new Color(0, 102, 153));
		enter_btn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		enter_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = 0;
				int enroll = 0;
				if (pro_enroll.getText().length() == 0) {
					new Alert("임용년도를 입력해주세요.");
				} else if (pro_name.getText().length() == 0) {
					new Alert("교수명을 입력해주세요.");
				} else if (college.getText().length() == 0) {
					new Alert("단과를 입력해주세요.");
				} else if (major.getText().length() == 0) {
					new Alert("전공을 입력해주세요.");
				} else {
					// not null

					// id check
					// 1. check format
					try {
						id = Integer.parseInt(pro_enroll.getText());
					} catch (NumberFormatException e1) {
						System.out.println(pro_enroll.getText());
						new Alert("임용년도는 숫자만 입력 가능합니다.");
						return;
					}
					// 2. check length
					if (pro_enroll.getText().length() != 4) {
						new Alert("임용년도는 4자리입니다.");
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

					boolean b = new ProfessorDao().enroll_pro(pro_name.getText(), college.getText(),
							major.getText(), enroll);

					if (b) {
						setVisible(false);
						new Alert("등록하였습니다.");
						new Staff_Main();
					}
				}
			}
		});
		enter_btn.setBounds(353, 440, 98, 37);
		contentPane.add(enter_btn);

		JButton back_btn = new JButton("취소");
		back_btn.setBackground(UIManager.getColor("textInactiveText"));
		back_btn.setForeground(SystemColor.info);
		back_btn.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 14));
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Main();
			}
		});
		back_btn.setBounds(495, 440, 94, 37);
		contentPane.add(back_btn);
		
		setVisible(true);
	}
}
