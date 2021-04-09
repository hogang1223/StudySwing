package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excercise01 {

	private JFrame frame;
	private JButton btnClear;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JLabel lblNum;

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
		frame.setTitle("Button Test");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getBtnClear());
		frame.getContentPane().add(getBtn1());
		frame.getContentPane().add(getBtn2());
		frame.getContentPane().add(getBtn3());
		frame.getContentPane().add(getLblNum());
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					lblNum.setText(null);
				}
			});
			btnClear.setBounds(164, 107, 117, 29);
		}
		return btnClear;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					lblNum.setText("1번 Button을 click 했습니다");
				}
			});
			btn1.setBounds(41, 189, 117, 29);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					lblNum.setText("2번 Button을 click 했습니다");
				}
			});
			btn2.setBounds(164, 189, 117, 29);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					lblNum.setText("3번 Button을 click 했습니다");
				}
			});
			btn3.setBounds(287, 189, 117, 29);
		}
		return btn3;
	}
	private JLabel getLblNum() {
		if (lblNum == null) {
			lblNum = new JLabel("Button Test");
			lblNum.setBounds(28, 16, 320, 16);
		}
		return lblNum;
	}
}
