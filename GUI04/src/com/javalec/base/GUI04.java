package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04 {

	private JFrame frmPasswordfield;
	private JLabel lblNewLabel;
	private JPasswordField pfInput;
	private JButton btnOK;
	private JTextField tfMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
					window.frmPasswordfield.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordfield = new JFrame();
		frmPasswordfield.setTitle("PasswordField");
		frmPasswordfield.setBounds(100, 100, 414, 300);
		frmPasswordfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordfield.getContentPane().setLayout(null);
		frmPasswordfield.getContentPane().add(getLblNewLabel());
		frmPasswordfield.getContentPane().add(getPfInput());
		frmPasswordfield.getContentPane().add(getBtnOK());
		frmPasswordfield.getContentPane().add(getTfMessage());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password : ");
			lblNewLabel.setBounds(22, 43, 80, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPfInput() {
		if (pfInput == null) {
			pfInput = new JPasswordField();
			pfInput.setBounds(96, 38, 150, 26);
		}
		return pfInput;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOK.setBounds(258, 38, 104, 29);
		}
		return btnOK;
	}
	private JTextField getTfMessage() {
		if (tfMessage == null) {
			tfMessage = new JTextField();
			tfMessage.setBounds(26, 94, 220, 26);
			tfMessage.setColumns(10);
		}
		return tfMessage;
	}
	
	private void checkPassword() {
		char[] str = pfInput.getPassword();
		String pass= new String(str); // String은 원래 char[] --> String은... Class .... 라고 생각하면 되는걸까 ?....
		tfMessage.setText(pass);
	}
}
