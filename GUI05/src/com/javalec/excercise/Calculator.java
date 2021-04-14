package com.javalec.excercise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {
	
	String viewNum = "";
	ArrayList<Integer> arrNum = new ArrayList<Integer>();
	int result;
	
	private JFrame frame;
	private JTextField tfView;
	private JButton btnNum7;
	private JButton btnNum8;
	private JButton btnNum9;
	private JButton btnAdd;
	private JButton btnNum4;
	private JButton btnNum5;
	private JButton btnNum6;
	private JButton btnSub;
	private JButton btnNum1;
	private JButton btnNum2;
	private JButton btnNum3;
	private JButton btnMul;
	private JButton btnNum0;
	private JButton btnClear;
	private JButton btnResult;
	private JButton btnDiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfView());
		frame.getContentPane().add(getBtnNewButton_2_1());
		frame.getContentPane().add(getBtnNum8());
		frame.getContentPane().add(getBtnNum9());
		frame.getContentPane().add(getBtnNewButton_1_1());
		frame.getContentPane().add(getBtnNum5());
		frame.getContentPane().add(getBtnNum6());
		frame.getContentPane().add(getBtnNum7());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnSub());
		frame.getContentPane().add(getBtnNum2());
		frame.getContentPane().add(getBtnNum3());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnNewButton_3_1());
		frame.getContentPane().add(getBtnClear());
		frame.getContentPane().add(getBtnResult());
		frame.getContentPane().add(getBtnDiv());
	}

	private JTextField getTfView() {
		if (tfView == null) {
			tfView = new JTextField();
			tfView.setHorizontalAlignment(SwingConstants.RIGHT);
			tfView.setEditable(false);
			tfView.setBounds(6, 6, 288, 100);
			tfView.setColumns(10);
		}
		return tfView;
	}
	private JButton getBtnNewButton_2_1() {
		if (btnNum1 == null) {
			btnNum1 = new JButton("1");
			btnNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum1.getText();
					btnAction();
				}
			});
			btnNum1.setBounds(16, 242, 55, 50);
		}
		return btnNum1;
	}
	private JButton getBtnNum2() {
		if (btnNum2 == null) {
			btnNum2 = new JButton("2");
			btnNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum2.getText();
					btnAction();
				}
			});
			btnNum2.setBounds(87, 242, 55, 50);
		}
		return btnNum2;
	}
	private JButton getBtnNum7() {
		if (btnNum7 == null) {
			btnNum7 = new JButton("7");
			btnNum7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum7.getText();
					btnAction();
				}
			});
			btnNum7.setBounds(16, 118, 55, 50);
		}
		return btnNum7;
	}
	private JButton getBtnNum8() {
		if (btnNum8 == null) {
			btnNum8 = new JButton("8");
			btnNum8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum8.getText();
					btnAction();
				}
			});
			btnNum8.setBounds(87, 118, 55, 50);
		}
		return btnNum8;
	}
	private JButton getBtnNum9() {
		if (btnNum9 == null) {
			btnNum9 = new JButton("9");
			btnNum9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum9.getText();
					btnAction();
				}
			});
			btnNum9.setBounds(158, 118, 55, 50);
		}
		return btnNum9;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcAction();
				}
			});
			btnAdd.setBounds(229, 118, 55, 50);
		}
		return btnAdd;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNum4 == null) {
			btnNum4 = new JButton("4");
			btnNum4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum4.getText();
					btnAction();
				}
			});
			btnNum4.setBounds(16, 180, 55, 50);
		}
		return btnNum4;
	}
	private JButton getBtnNum5() {
		if (btnNum5 == null) {
			btnNum5 = new JButton("5");
			btnNum5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum5.getText();
					btnAction();
				}
			});
			btnNum5.setBounds(87, 180, 55, 50);
		}
		return btnNum5;
	}
	private JButton getBtnNum6() {
		if (btnNum6 == null) {
			btnNum6 = new JButton("6");
			btnNum6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum6.getText();
					btnAction();
				}
			});
			btnNum6.setBounds(158, 180, 55, 50);
		}
		return btnNum6;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					subAction();
				}
			});
			btnSub.setBounds(229, 180, 55, 50);
		}
		return btnSub;
	}
	private JButton getBtnNum3() {
		if (btnNum3 == null) {
			btnNum3 = new JButton("3");
			btnNum3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					viewNum += btnNum3.getText();
					btnAction();
				}
			});
			btnNum3.setBounds(158, 242, 55, 50);
		}
		return btnNum3;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("x");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnMul.setBounds(229, 242, 55, 50);
		}
		return btnMul;
	}
	private JButton getBtnNewButton_3_1() {
		if (btnNum0 == null) {
			btnNum0 = new JButton("0");
			btnNum0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(viewNum.equals("")) {
						btnAction();
					}else {
						viewNum += btnNum0.getText();
						btnAction();
					}
				}
			});
			btnNum0.setBounds(16, 304, 55, 50);
		}
		return btnNum0;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("AC");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clearAction();
				}
			});
			btnClear.setBounds(87, 304, 55, 50);
		}
		return btnClear;
	}
	private JButton getBtnResult() {
		if (btnResult == null) {
			btnResult = new JButton("=");
			btnResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					resultAction();
				}
			});
			btnResult.setBounds(158, 304, 55, 50);
		}
		return btnResult;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnDiv.setBounds(229, 304, 55, 50);
		}
		return btnDiv;
	}
	
	private void btnAction() {
		tfView.setText(viewNum);
	}
	
	private void calcAction() {
				
		int num1 = Integer.parseInt(viewNum);
		arrNum.add(num1);
		viewNum = "";
		
		// +버튼 누르면 더하기 연산
		for(int i=0; i<arrNum.size(); i++) {
			result +=arrNum.get(i);
		}
		arrNum.add(result);
		arrNum.clear();
		tfView.setText(Integer.toString(result));
	}
	private void resultAction() {
		
		/*
		 * arraylist 1 + 2 - 3 = 0
		 */
		
		int num1 = Integer.parseInt(viewNum);
		arrNum.add(num1);
		viewNum = "";
//		
//		int result = 0;
//		
//		for(int i=0; i<arrNum.size(); i++) {
//			result += arrNum.get(i);
//		}
		tfView.setText(Integer.toString(result));
//		
//		arrNum.clear();
//		viewNum = Integer.toString(result);
		
	}
	
	private void subAction(){
		
		int num1 = Integer.parseInt(viewNum);
		arrNum.add(num1);
		viewNum = "";
		
		// +버튼 누르면 더하기 연산
		for(int i=0; i<arrNum.size(); i++) {
			result -=arrNum.get(i);
		}
		arrNum.clear();
		tfView.setText(Integer.toString(result));
	}

	
	private void clearAction() {
		tfView.setText("");
		viewNum = "";
		result = 0;
		arrNum.clear();
	}

}
