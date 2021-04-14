package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excercise00 {
	
	String userId = "abc";
	String userPw = "1234";

	private JFrame frmExcercise;
	private JLabel lblNewLabel;
	private JLabel lblPassword;
	private JTextField tfUser;
	private JPasswordField pfPw;
	private JButton btnOK;
	private JTextField tfMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excercise00 window = new Excercise00();
					window.frmExcercise.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Excercise00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExcercise = new JFrame();
		frmExcercise.setTitle("Excercise00");
		frmExcercise.setBounds(100, 100, 450, 300);
		frmExcercise.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExcercise.getContentPane().setLayout(null);
		frmExcercise.getContentPane().add(getLblNewLabel());
		frmExcercise.getContentPane().add(getLblPassword());
		frmExcercise.getContentPane().add(getTfUser());
		frmExcercise.getContentPane().add(getPfPw());
		frmExcercise.getContentPane().add(getBtnOK());
		frmExcercise.getContentPane().add(getTfMessage());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("user");
			lblNewLabel.setBounds(47, 71, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("password");
			lblPassword.setBounds(47, 119, 71, 16);
		}
		return lblPassword;
	}
	private JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(120, 66, 130, 26);
			tfUser.setColumns(10);
		}
		return tfUser;
	}
	private JPasswordField getPfPw() {
		if (pfPw == null) {
			pfPw = new JPasswordField();
			pfPw.setBounds(120, 114, 130, 26);
		}
		return pfPw;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkAction();
				}
			});
			btnOK.setBounds(287, 114, 71, 29);
		}
		return btnOK;
	}
	private JTextField getTfMessage() {
		if (tfMessage == null) {
			tfMessage = new JTextField();
			tfMessage.setBounds(47, 198, 245, 26);
			tfMessage.setColumns(10);
		}
		return tfMessage;
	}
	
	private void checkAction() {
		
		String ckid = tfUser.getText();
		
		char[] pw = pfPw.getPassword();
		String ckpw = new String(pw);
		
		if(userId.equals(ckid) && userPw.equals(ckpw)) {
			tfMessage.setText("로그인 성공");			
		}else {
			tfMessage.setText("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}
	}
}
