package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import daovo.ProfessorVo;

public class Professor_Enter_Lecture extends JFrame {

	private JPanel contentPane;

	Color c1 = new Color(95,113,97); 	// Dark Green
	Color c2 = new Color(109,139,116);	// Ash Green
	Color c3 = new Color(239,234,216);	// light meal
	Color c4 = new Color(208,201,192);	// dark meal
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Professor_Enter_Lecture frame = new Professor_Enter_Lecture();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Professor_Enter_Lecture(ProfessorVo vo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(c2);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// 받아야하는 것
		// 과목명
		// 이수구분
		// 학점
		// 강의실
		// 인원제한 빈칸이면 널로 채우기
		// 현재인원
		
		// 함수로 처리할 것
		// 학수번호 (전공별 별개의 코드 설정)
		// 년도, 학기 => 실제 날짜를 받아서 처리
		// 전공과 단과는 교수의 정보로 가져감
		
		JButton enter_btn = new JButton("등록");
		enter_btn.setBounds(346, 491, 97, 35);
		enter_btn.setBorder(null);
		contentPane.add(enter_btn);
		
		JButton back_btn = new JButton("취소");
		back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Professor_Main(vo);
			}
		});
		back_btn.setBounds(512, 491, 97, 35);
		back_btn.setBorder(null);
		contentPane.add(back_btn);
		
		JLabel lblNewLabel = new JLabel("과목 등록");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(236, 22, 498, 63);
		contentPane.add(lblNewLabel);
	}

}
