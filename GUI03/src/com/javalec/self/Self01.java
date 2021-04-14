package com.javalec.self;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Self01 {

	private JFrame frmCheckbox;
	private JTextField tfNum2; 
	private JTextField tfNum1;
	private JCheckBox chAdd;
	private JCheckBox chSub;
	private JCheckBox chMul;
	private JCheckBox chDiv;
	private JLabel lblResult0;
	private JLabel lblResult1;
	private JLabel lblResult2;
	private JLabel lblResult3;
	private ArrayList<DataClass> hello;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Self01 window = new Self01();
					window.frmCheckbox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Self01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		hello = new ArrayList<DataClass>();
		DataClass h0 = new DataClass();
		DataClass h1 = new DataClass();
		DataClass h2 = new DataClass();
		DataClass h3 = new DataClass();
		
		hello.add(h0);
		hello.add(h1);
		hello.add(h2);
		hello.add(h3);
		
		
		frmCheckbox = new JFrame();
		frmCheckbox.setTitle("CheckBox");
		frmCheckbox.setBounds(100, 100, 450, 300);
		frmCheckbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckbox.getContentPane().setLayout(null);
		frmCheckbox.getContentPane().add(getTfNum1());
		frmCheckbox.getContentPane().add(getTfNum2());
		frmCheckbox.getContentPane().add(getChAdd());
		frmCheckbox.getContentPane().add(getChSub());
		frmCheckbox.getContentPane().add(getChMul());
		frmCheckbox.getContentPane().add(getChDiv());
		frmCheckbox.getContentPane().add(getLblResult0());
		frmCheckbox.getContentPane().add(getLblResult1());
		frmCheckbox.getContentPane().add(getLblResult2());
		frmCheckbox.getContentPane().add(getLblResult3());
	}

	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(16, 56, 130, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setColumns(10);
			tfNum1.setBounds(16, 18, 130, 26);
		}
		return tfNum1;
	}
	private JCheckBox getChAdd() {
		if (chAdd == null) {
			chAdd = new JCheckBox("+");
			chAdd.setBounds(299, 19, 128, 23);
			hello.get(0).ch = chAdd;
		}
		return chAdd;
	}
	private JCheckBox getChSub() {
		if (chSub == null) {
			chSub = new JCheckBox("-");
			chSub.setBounds(299, 57, 128, 23);
			hello.get(1).ch = chSub;
		}
		return chSub;
	}
	private JCheckBox getChMul() {
		if (chMul == null) {
			chMul = new JCheckBox("x");
			chMul.setBounds(299, 92, 128, 23);
		}
		return chMul;
	}
	private JCheckBox getChDiv() {
		if (chDiv == null) {
			chDiv = new JCheckBox("/");
			chDiv.setBounds(299, 127, 128, 23);
		}
		return chDiv;
	}
	private JLabel getLblResult0() {
		if (lblResult0 == null) {
			lblResult0 = new JLabel("New label");
			lblResult0.setBounds(16, 131, 240, 16);
		}
		return lblResult0;
	}
	private JLabel getLblResult1() {
		if (lblResult1 == null) {
			lblResult1 = new JLabel("New label");
			lblResult1.setBounds(16, 159, 240, 16);
		}
		return lblResult1;
	}
	private JLabel getLblResult2() {
		if (lblResult2 == null) {
			lblResult2 = new JLabel("New label");
			lblResult2.setBounds(16, 187, 240, 16);
		}
		return lblResult2;
	}
	private JLabel getLblResult3() {
		if (lblResult3 == null) {
			lblResult3 = new JLabel("New label");
			lblResult3.setBounds(16, 215, 240, 16);
		}
		return lblResult3;
	}
	
}

class DataClass{
	
	JCheckBox ch;
	JLabel label;
	String operator;

}

