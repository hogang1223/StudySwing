package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmButtonTest;
	private JButton ok;
	private JLabel lblTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
					window.frmButtonTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButtonTest = new JFrame();
		frmButtonTest.setTitle("Button Test");
		frmButtonTest.setBounds(100, 100, 450, 300);
		frmButtonTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmButtonTest.getContentPane().setLayout(null);
		frmButtonTest.getContentPane().add(getOk());
		frmButtonTest.getContentPane().add(getLblTest());
	}
	private JButton getOk() {
		if (ok == null) {
			ok = new JButton("OK");
			ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showMessageDialog(null, "Message");
					lblTest.setText("Button을 click 했습니다");
				}
			});
			ok.setBounds(168, 116, 117, 29);
		}
		return ok;
	}
	private JLabel getLblTest() {
		if (lblTest == null) {
			lblTest = new JLabel("Java Swing Button Test");
			lblTest.setBounds(29, 29, 181, 16);
		}
		return lblTest;
	}
}
