package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frmCheckboxRadiobutton;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btnFruit;
	private JTextField tfFruit;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frmCheckboxRadiobutton.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxRadiobutton = new JFrame();
		frmCheckboxRadiobutton.setTitle("CheckBox / RadioButton");
		frmCheckboxRadiobutton.setBounds(100, 100, 450, 300);
		frmCheckboxRadiobutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxRadiobutton.getContentPane().setLayout(null);
		frmCheckboxRadiobutton.getContentPane().add(getChApple());
		frmCheckboxRadiobutton.getContentPane().add(getChBanana());
		frmCheckboxRadiobutton.getContentPane().add(getBtnFruit());
		frmCheckboxRadiobutton.getContentPane().add(getTfFruit());
		frmCheckboxRadiobutton.getContentPane().add(getRbKBS());
		frmCheckboxRadiobutton.getContentPane().add(getRbMBC());
		frmCheckboxRadiobutton.getContentPane().add(getBtnBroad());
		frmCheckboxRadiobutton.getContentPane().add(getTfBroad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.setBounds(16, 17, 128, 23);
		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.setBounds(16, 52, 128, 23);
		}
		return chBanana;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();
				}
			});
			btnFruit.setBounds(16, 87, 117, 29);
		}
		return btnFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setEditable(false);
			tfFruit.setBounds(16, 128, 193, 26);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	
	
	private void fruitCheck() {
		tfFruit.setText("");
		if(chApple.isSelected() == true) {
			tfFruit.setText("Apple is selected");
		}
		if(chBanana.isSelected() == true) {
			tfFruit.setText("Banana is selected");
		}
		if(chApple.isSelected() == true && chBanana.isSelected() == true) {
			tfFruit.setText("Both have been selected");
		}
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(240, 17, 141, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(240, 52, 141, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
					
				}
			});
			btnBroad.setBounds(240, 87, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(240, 128, 204, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	
	private void broadCheck() {
		tfBroad.setText("");
		if(rbKBS.isSelected() == true) {
			tfBroad.setText("KBS is selected");
		}else if(rbMBC.isSelected() == true) {
			tfBroad.setText("MBC is selected");
		}
	}
	
} // End Line
