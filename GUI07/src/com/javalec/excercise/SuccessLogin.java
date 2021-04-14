package com.javalec.excercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class SuccessLogin extends JDialog {
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SuccessLogin dialog = new SuccessLogin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SuccessLogin() {
		setTitle("Welcome");
		setBounds(100, 100, 300, 100);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome");
			lblNewLabel.setBounds(120, 28, 89, 16);
		}
		return lblNewLabel;
	}
}
