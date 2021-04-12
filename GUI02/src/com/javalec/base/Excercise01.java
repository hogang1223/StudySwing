package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excercise01 {


	private JFrame frame;
	private JComboBox cbNum1;
	private JComboBox cbSymbol;
	private JComboBox cbNum2;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excercise01 window = new Excercise01();
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
	public Excercise01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbNum1());
		frame.getContentPane().add(getCbSymbol());
		frame.getContentPane().add(getCbNum2());
		frame.getContentPane().add(getTfResult());
	}
	private JComboBox getCbNum1() {
		if (cbNum1 == null) {
			cbNum1 = new JComboBox();
			cbNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			cbNum1.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum1.setBounds(19, 32, 80, 27);
		}
		return cbNum1;
	}
	private JComboBox getCbSymbol() {
		if (cbSymbol == null) {
			cbSymbol = new JComboBox();
			cbSymbol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			cbSymbol.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", "/"}));
			cbSymbol.setBounds(115, 32, 80, 27);
		}
		return cbSymbol;
	}
	private JComboBox getCbNum2() {
		if (cbNum2 == null) {
			cbNum2 = new JComboBox();
			cbNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					stNum2 = cbNum2.getSelectedItem().toString();
					calcAction();
				}
			});
			cbNum2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum2.setBounds(207, 32, 80, 27);
		}
		return cbNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			tfResult.setBounds(299, 31, 80, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	
	private void calcAction() {
		String stNum1 = cbNum1.getSelectedItem().toString();
		String stNum2 = cbNum2.getSelectedItem().toString();
		String stSymbol = cbSymbol.getSelectedItem().toString();
		
		Calc01 calc01 = new Calc01(stNum1, stNum2);
		if(stSymbol.equals("+")) {
			tfResult.setText(calc01.add());
		}else if(stSymbol.equals("-")) {
			tfResult.setText(calc01.sub());
		}else if(stSymbol.equals("x")) {
			tfResult.setText(calc01.mul());
		}else if(stSymbol.equals("/")) {
			tfResult.setText(calc01.div());
		}
		
//		String stResult = "";
//		tfResult.setText(stResult);
	}
	
} // End Line
