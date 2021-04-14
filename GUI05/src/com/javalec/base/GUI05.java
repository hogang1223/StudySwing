package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI05 {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_1;
	private JMenuItem menuAdd;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JButton btnAdd;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI05 window = new GUI05();
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
	public GUI05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(getMenuBar());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnClear());
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Open");
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("Exit");
		}
		return mntmNewMenuItem_2;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Calc");
			mnNewMenu_1.add(getMenuAdd());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMenuAdd() {
		if (menuAdd == null) {
			menuAdd = new JMenuItem("Add");
			menuAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
		}
		return menuAdd;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.RIGHT);
			tfNum1.setBounds(6, 59, 130, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.RIGHT);
			tfNum2.setBounds(6, 97, 130, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setHorizontalAlignment(SwingConstants.RIGHT);
			tfResult.setEditable(false);
			tfResult.setColumns(10);
			tfResult.setBounds(6, 138, 130, 26);
		}
		return tfResult;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
			btnAdd.setBounds(148, 138, 117, 29);
		}
		return btnAdd;
	}
	
	private void addAction() {
		
		int num1 = Integer.parseInt(tfNum1.getText());
		int num2 = Integer.parseInt(tfNum2.getText());
		
		tfResult.setText(Integer.toString(num1 + num2));
		
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clearAction();
				}
			});
			btnClear.setBounds(277, 138, 117, 29);
		}
		return btnClear;
	}
	private void clearAction() {
		tfNum1.setText("");
		tfNum2.setText("");
		tfResult.setText("");
	}
}
