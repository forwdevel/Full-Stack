package ui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class Staff_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Staff_Main frame = new Staff_Main();
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
	public Staff_Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.white);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fixed_1 = new JLabel("±³Á÷¿ø ½Ã½ºÅÛ");
		fixed_1.setHorizontalAlignment(SwingConstants.CENTER);
		fixed_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 36));
		fixed_1.setBounds(272, 56, 397, 49);
		contentPane.add(fixed_1);
		
		JButton enter_stu_btn = new JButton("ÇÐ»ý µî·Ï");
		enter_stu_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Enroll_Student();
			}
		});
		enter_stu_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		enter_stu_btn.setBounds(361, 211, 214, 23);
		contentPane.add(enter_stu_btn);
		
		JButton enter_pro_btn = new JButton("±³¼ö µî·Ï");
		enter_pro_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		enter_pro_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Enroll_Professor();
			}
		});
		enter_pro_btn.setBounds(361, 256, 214, 23);
		contentPane.add(enter_pro_btn);
		
		JButton inquiry_stu_btn = new JButton("ÇÐ»ý Á¶È¸");
		inquiry_stu_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Inquiry_Student();
			}
		});
		inquiry_stu_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		inquiry_stu_btn.setForeground(SystemColor.window);
		inquiry_stu_btn.setBackground(SystemColor.controlShadow);
		inquiry_stu_btn.setBounds(361, 304, 214, 23);
		contentPane.add(inquiry_stu_btn);
		
		JButton inquiry_pro_btn = new JButton("±³¼ö Á¶È¸");
		inquiry_pro_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Inquiry_Professor();
			}
		});
		inquiry_pro_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		inquiry_pro_btn.setForeground(SystemColor.window);
		inquiry_pro_btn.setBackground(SystemColor.controlShadow);
		inquiry_pro_btn.setBounds(361, 351, 214, 23);
		contentPane.add(inquiry_pro_btn);
		
		JButton inquiry_lec_btn = new JButton("°ú¸ñ Á¶È¸");
		inquiry_lec_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Staff_Inquiry_Lecture();
			}
		});
		inquiry_lec_btn.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 14));
		inquiry_lec_btn.setForeground(SystemColor.window);
		inquiry_lec_btn.setBackground(SystemColor.controlShadow);
		inquiry_lec_btn.setBounds(361, 397, 214, 23);
		contentPane.add(inquiry_lec_btn);
		
		JButton back_btn = new JButton("µÚ·Î°¡±â");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new LogIn();
			}
		});
		back_btn.setBounds(420, 489, 97, 23);
		contentPane.add(back_btn);
	}

}
