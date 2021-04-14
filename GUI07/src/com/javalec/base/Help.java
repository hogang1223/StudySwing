package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class Help extends JDialog {
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help dialog = new Help();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Help() {
		setTitle("Help");
		setBounds(100, 100, 300, 100);
		getContentPane().setLayout(null);
		getContentPane().add(getLblNewLabel());

	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("시스템에 문제가 있으면 연락주세요");
			lblNewLabel.setBounds(58, 31, 186, 16);
		}
		return lblNewLabel;
	}
}
