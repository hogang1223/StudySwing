package com.javalec.base;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class GUI01 {

	private JFrame frame;
	private JLabel lblAdd;
	private JTextField txNum1;
	private JTextField txNum2;
	private JTextField txResult;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("더하기");
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblAdd());
		frame.getContentPane().add(getTxNum1());
		frame.getContentPane().add(getTxNum2());
		frame.getContentPane().add(getTxResult());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getBtnAdd());
	}

	private JLabel getLblAdd() {
		if (lblAdd == null) {
			lblAdd = new JLabel("더하기");
			lblAdd.setBounds(24, 21, 61, 16);
		}
		return lblAdd;
	}
	private JTextField getTxNum1() {
		if (txNum1 == null) {
			txNum1 = new JTextField();
			txNum1.setHorizontalAlignment(SwingConstants.RIGHT);
			txNum1.setBounds(54, 67, 70, 26);
			txNum1.setColumns(10);
		}
		return txNum1;
	}
	private JTextField getTxNum2() {
		if (txNum2 == null) {
			txNum2 = new JTextField();
			txNum2.setHorizontalAlignment(SwingConstants.RIGHT);
			txNum2.setBounds(158, 67, 70, 26);
			txNum2.setColumns(10);
		}
		return txNum2;
	}
	private JTextField getTxResult() {
		if (txResult == null) {
			txResult = new JTextField();
			txResult.setEditable(false);
			txResult.setHorizontalAlignment(SwingConstants.RIGHT);
			txResult.setBounds(270, 67, 80, 26);
			txResult.setColumns(10);
		}
		return txResult;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("+");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(136, 70, 14, 21);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("=");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(240, 70, 18, 21);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// 1st
//					String stNum1 = txNum1.getText();
//					String stNum2 = txNum2.getText();
//					
//					int wkNum1 = Integer.parseInt(stNum1);
//					int wkNum2 = Integer.parseInt(stNum2);
//					int wkResult = wkNum1 + wkNum2;
//					
//					String stResult = Integer.toString(wkResult);
//					txResult.setText(stResult);
					
					// 2nd
//					int scNum1 = Integer.parseInt(txNum1.getText());
//					int scNum2 = Integer.parseInt(txNum2.getText());
//					int scResult = scNum1 + scNum2;
//					
//					txResult.setText(Integer.toString(scResult));
					addSum();
					
				}
			});
			btnAdd.setBounds(362, 68, 70, 26);
		}
		return btnAdd;
	}
	private void addSum() {
		int wkNum1 = Integer.parseInt(txNum1.getText());
		int wkNum2 = Integer.parseInt(txNum2.getText());
		int wkResult = wkNum1 + wkNum2;
		
		txResult.setText(Integer.toString(wkResult));
		JOptionPane.showMessageDialog(frame, Integer.toString(wkResult));
	}
} // ----
