package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class GUI02 {

	private JFrame frmComboBox;
	private JComboBox cbFruits;
	private JTextField tfFruits;
	private JTextField tfAdd;
	private JComboBox cbAdd;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmComboBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmComboBox = new JFrame();
		frmComboBox.setTitle("Combo Box");
		frmComboBox.setBounds(100, 100, 450, 300);
		frmComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmComboBox.getContentPane().setLayout(null);
		frmComboBox.getContentPane().add(getCbFruits());
		frmComboBox.getContentPane().add(getTfFruits());
		frmComboBox.getContentPane().add(getTfAdd());
		frmComboBox.getContentPane().add(getCbAdd());
		frmComboBox.getContentPane().add(getBtnAdd());
	}
	private JComboBox getCbFruits() {
		if (cbFruits == null) {
			cbFruits = new JComboBox();
			cbFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Pineapple", "Mango", "DragonFruits", "Peach"}));
			cbFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String stFruits = cbFruits.getSelectedItem().toString();
					tfFruits.setText(stFruits);
					}
			});
			cbFruits.setToolTipText("Apple");
			cbFruits.setBounds(31, 46, 113, 27);
		}
		return cbFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(177, 45, 130, 26);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setBounds(31, 165, 130, 26);
			tfAdd.setColumns(10);
		}
		return tfAdd;
	}
	private JComboBox getCbAdd() {
		if (cbAdd == null) {
			cbAdd = new JComboBox();
			cbAdd.setBounds(177, 166, 130, 27);
		}
		return cbAdd;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addCombo();
				}
			});
			btnAdd.setBounds(31, 212, 117, 29);
		}
		return btnAdd;
	}
	
	private void addCombo() {
		String stTemp = tfAdd.getText();
		cbAdd.addItem(stTemp);
	}
} // End Line