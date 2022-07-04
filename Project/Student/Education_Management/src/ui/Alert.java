package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Alert extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Alert(String str) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 238);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel alterMessage = new JLabel(str);
		alterMessage.setFont(new Font("±º∏≤", Font.BOLD, 16));
		alterMessage.setHorizontalAlignment(SwingConstants.CENTER);
		alterMessage.setBounds(48, 56, 343, 30);
		contentPane.add(alterMessage);
		
		JButton confirm_btn = new JButton("»Æ¿Œ");
		confirm_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		confirm_btn.setBackground(SystemColor.textHighlight);
		confirm_btn.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 12));
		confirm_btn.setForeground(Color.WHITE);
		confirm_btn.setBounds(169, 136, 97, 41);
		contentPane.add(confirm_btn);
		
		setVisible(true);
	}
}
