package com.javalec.excercise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	
	String userId = "abcd";
	String userPw = "1234";

	private JFrame frmLogin;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfUser;
	private JPasswordField pfPassword;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.getContentPane().add(getLblNewLabel());
		frmLogin.getContentPane().add(getLblNewLabel_1());
		frmLogin.getContentPane().add(getTfUser());
		frmLogin.getContentPane().add(getPfPassword());
		frmLogin.getContentPane().add(getBtnOK());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User");
			lblNewLabel.setBounds(35, 79, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setBounds(35, 137, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(108, 74, 130, 26);
			tfUser.setColumns(10);
		}
		return tfUser;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(108, 132, 130, 26);
		}
		return pfPassword;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkAction();
				}
			});
			btnOK.setBounds(282, 132, 117, 29);
		}
		return btnOK;
	}
	private void checkAction() {
		
		SuccessLogin sl = new SuccessLogin();
		FailToLogin fl = new FailToLogin();
		
		String ckId= tfUser.getText();
		char[]charPw =pfPassword.getPassword();
		String chPw = new String(charPw);
		
		if(ckId.equals(userId) && chPw.equals(userPw)) {
			sl.setVisible(true);
		}else {
			fl.setVisible(true);
		}
		
	}
}
