package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class Excercise03 {

	private JFrame frmRadiocheckbox;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rbAdd;
	private JRadioButton rbSub;
	private JRadioButton rbMul;
	private JRadioButton rbDiv;
	private JLabel lblResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excercise03 window = new Excercise03();
					window.frmRadiocheckbox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Excercise03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadiocheckbox = new JFrame();
		frmRadiocheckbox.setTitle("RadioButton");
		frmRadiocheckbox.setBounds(100, 100, 450, 300);
		frmRadiocheckbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadiocheckbox.getContentPane().setLayout(null);
		frmRadiocheckbox.getContentPane().add(getTfNum1());
		frmRadiocheckbox.getContentPane().add(getTfNum2());
		frmRadiocheckbox.getContentPane().add(getRbAdd());
		frmRadiocheckbox.getContentPane().add(getRbSub());
		frmRadiocheckbox.getContentPane().add(getRbMul());
		frmRadiocheckbox.getContentPane().add(getRbDiv());
		frmRadiocheckbox.getContentPane().add(getLblResult());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(21, 21, 130, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(21, 59, 130, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JRadioButton getRbAdd() {
		if (rbAdd == null) {
			rbAdd = new JRadioButton("+");
			buttonGroup.add(rbAdd);
			rbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			rbAdd.setBounds(229, 22, 141, 23);
		}
		return rbAdd;
	}
	private JRadioButton getRbSub() {
		if (rbSub == null) {
			rbSub = new JRadioButton("-");
			buttonGroup.add(rbSub);
			rbSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			rbSub.setBounds(229, 60, 141, 23);
		}
		return rbSub;
	}
	private JRadioButton getRbMul() {
		if (rbMul == null) {
			rbMul = new JRadioButton("x");
			buttonGroup.add(rbMul);
			rbMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			rbMul.setBounds(229, 95, 141, 23);
		}
		return rbMul;
	}
	private JRadioButton getRbDiv() {
		if (rbDiv == null) {
			rbDiv = new JRadioButton("/");
			buttonGroup.add(rbDiv);
			rbDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			rbDiv.setBounds(229, 130, 141, 23);
		}
		return rbDiv;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			lblResult.setBounds(20, 199, 351, 45);
		}
		return lblResult;
	}
	
	private void calcAction() {
		
		int num1 = Integer.parseInt(tfNum1.getText());
		int num2 = Integer.parseInt(tfNum2.getText());
		String stResult = "";
		
		if(rbAdd.isSelected() == true) {
			stResult = Integer.toString(num1 + num2);
			lblResult.setText(num1 + " + " + num2 + " = " + stResult);
		}
		if(rbSub.isSelected() == true) {
			stResult = Integer.toString(num1 - num2);
			lblResult.setText(num1 + " - " + num2 + " = " + stResult);
		}
		if(rbMul.isSelected() == true) {
			stResult = Integer.toString(num1 * num2);
			lblResult.setText(num1 + " x " + num2 + " = " + stResult);
		}
		if(rbDiv.isSelected() == true) {
			
			if(num1==0 || num2==0) {
				lblResult.setText("0이 아닌 숫자를 입력해주세요.");
				return ;
				
			}else {
				stResult = Double.toString((num1*1.0) / num2);
				lblResult.setText(num1 + " / " + num2 + " = " + stResult);
			}
		}
		
		
		
		
	}
} // End Line
