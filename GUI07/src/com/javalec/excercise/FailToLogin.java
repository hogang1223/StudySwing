package com.javalec.excercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class FailToLogin extends JDialog {
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FailToLogin dialog = new FailToLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FailToLogin() {
		setTitle("Login Failed");
		setBounds(100, 100, 300, 100);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Please Check your id and password");
			lblNewLabel.setBounds(42, 30, 229, 16);
		}
		return lblNewLabel;
	}
}
