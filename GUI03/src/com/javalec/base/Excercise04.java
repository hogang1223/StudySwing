package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excercise04 {

	private JFrame frmCheckboxCalc;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JCheckBox chAdd;
	private JCheckBox chSub;
	private JCheckBox chMul;
	private JCheckBox chDiv;
	private JLabel lblSol1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblSol2;
	private JLabel lblSol3;
	private JLabel lblSol4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excercise04 window = new Excercise04();
					window.frmCheckboxCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Excercise04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxCalc = new JFrame();
		frmCheckboxCalc.setTitle("CheckBox Calc");
		frmCheckboxCalc.setBounds(100, 100, 450, 300);
		frmCheckboxCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxCalc.getContentPane().setLayout(null);
		frmCheckboxCalc.getContentPane().add(getTfNum1());
		frmCheckboxCalc.getContentPane().add(getTfNum2());
		frmCheckboxCalc.getContentPane().add(getChAdd());
		frmCheckboxCalc.getContentPane().add(getChSub());
		frmCheckboxCalc.getContentPane().add(getChMul());
		frmCheckboxCalc.getContentPane().add(getChDiv());
		frmCheckboxCalc.getContentPane().add(getLblSol1());
		frmCheckboxCalc.getContentPane().add(getLblSol2());
		frmCheckboxCalc.getContentPane().add(getLblSol3());
		frmCheckboxCalc.getContentPane().add(getLblSol4());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(23, 30, 130, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(23, 68, 130, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JCheckBox getChAdd() {
		if (chAdd == null) {
			chAdd = new JCheckBox("+");
			chAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			chAdd.setBounds(286, 17, 128, 23);
		}
		return chAdd;
	}
	private JCheckBox getChSub() {
		if (chSub == null) {
			chSub = new JCheckBox("-");
			chSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			chSub.setBounds(286, 49, 128, 23);
		}
		return chSub;
	}
	private JCheckBox getChMul() {
		if (chMul == null) {
			chMul = new JCheckBox("x");
			chMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			chMul.setBounds(286, 84, 128, 23);
		}
		return chMul;
	}
	private JCheckBox getChDiv() {
		if (chDiv == null) {
			chDiv = new JCheckBox("/");
			chDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			chDiv.setBounds(286, 119, 128, 23);
		}
		return chDiv;
	}
	private JLabel getLblSol1() {
		if (lblSol1 == null) {
			lblSol1 = new JLabel("");
			lblSol1.setBounds(25, 153, 208, 16);
		}
		return lblSol1;
	}
		
	private JLabel getLblSol2() {
		if (lblSol2 == null) {
			lblSol2 = new JLabel("");
			lblSol2.setBounds(25, 181, 208, 16);
		}
		return lblSol2;
	}
	private JLabel getLblSol3() {
		if (lblSol3 == null) {
			lblSol3 = new JLabel("");
			lblSol3.setBounds(25, 206, 208, 16);
		}
		return lblSol3;
	}
	private JLabel getLblSol4() {
		if (lblSol4 == null) {
			lblSol4 = new JLabel("");
			lblSol4.setBounds(25, 234, 208, 16);
		}
		return lblSol4;
	}
	
	private void calcAction() {
		lblSol1.setText("");
		lblSol2.setText("");
		lblSol3.setText("");
		lblSol4.setText("");
		
		String stNum1 = tfNum1.getText();
		String stNum2 = tfNum2.getText();
		Calc04 calc = new Calc04(stNum1, stNum2);

		boolean[] result = {chAdd.isSelected(), chSub.isSelected(), chMul.isSelected(), chDiv.isSelected()};
		String[] stResult = {calc.add(), calc.sub(), calc.mul(), calc.div()};
		
		if(result[0]==true) {
			lblSol1.setText(stResult[0]);
		}
		if(result[1]==true) {
			if(lblSol1.getText().equals("")) {
				lblSol1.setText(stResult[1]);
			}else {
			lblSol2.setText(stResult[1]);
			}
		}
		if(result[2]==true) {
			if(lblSol1.getText().equals("")) {
				lblSol1.setText(stResult[2]);
			}else if(lblSol2.getText().equals("")){
				lblSol2.setText(stResult[2]);
			}else {
				lblSol3.setText(stResult[2]);
			}
		}
		if(result[3]==true) {
			if(lblSol1.getText().equals("")) {
				lblSol1.setText(stResult[3]);
			}else if(lblSol2.getText().equals("")){
				lblSol2.setText(stResult[3]);
			}else if(lblSol3.getText().equals("")){
				lblSol3.setText(stResult[3]);
			}else {
				lblSol4.setText(stResult[3]);
			}
		}
		
	}
	
} // End Line
