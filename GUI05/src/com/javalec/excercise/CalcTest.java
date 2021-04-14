package com.javalec.excercise;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CalcTest {

	String viewNum ="";
	int result = 0;
	ArrayList<String> inputArr = new ArrayList<String>();
	ArrayList<Integer> calcArr = new ArrayList<Integer>();
	ArrayList<String> opArr = new ArrayList<String>();
	
	private JFrame frame;
	private JTextField tfView;
	private JButton btnNum0;
	private JButton btnNum1;
	private JButton btnNum2;
	private JButton btnNum3;
	private JButton btnNum4;
	private JButton btnNum5;
	private JButton btnNum6;
	private JButton btnNum7;
	private JButton btnNum8;
	private JButton btnNum9;
	private JButton btnClear;
	private JButton btnResult;
	private JButton btnDiv;
	private JButton btnMul;
	private JButton btnSub;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
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
	public CalcTest() {
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
		frame.getContentPane().add(getBtnNum0());
		frame.getContentPane().add(getBtnNum1());
		frame.getContentPane().add(getBtnNum2());
		frame.getContentPane().add(getBtnNum3());
		frame.getContentPane().add(getBtnNum4());
		frame.getContentPane().add(getBtnNum5());
		frame.getContentPane().add(getBtnNum6());
		frame.getContentPane().add(getBtnNum7());
		frame.getContentPane().add(getBtnNum8());
		frame.getContentPane().add(getBtnNum9());
		frame.getContentPane().add(getBtnClear());
		frame.getContentPane().add(getBtnResult());
		frame.getContentPane().add(getBtnDiv());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnSub());
		frame.getContentPane().add(getBtnAdd());
	}

	private JTextField getTfView() {
		if (tfView == null) {
			tfView = new JTextField();
			tfView.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			tfView.setHorizontalAlignment(SwingConstants.RIGHT);
			tfView.setEditable(false);
			tfView.setBounds(6, 6, 288, 124);
			tfView.setColumns(10);
		}
		return tfView;
	}
	private JButton getBtnNum0() {
		if (btnNum0 == null) {
			btnNum0 = new JButton("0");
			btnNum0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum0.getText());
					input();
				}
			});
			btnNum0.setBounds(6, 317, 60, 55);
		}
		return btnNum0;
	}
	private JButton getBtnNum1() {
		if (btnNum1 == null) {
			btnNum1 = new JButton("1");
			btnNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum1.getText());
					input();
				}
			});
			btnNum1.setBounds(6, 259, 60, 55);
		}
		return btnNum1;
	}
	private JButton getBtnNum2() {
		if (btnNum2 == null) {
			btnNum2 = new JButton("2");
			btnNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum2.getText());
					input();
				}
			});
			btnNum2.setBounds(78, 259, 60, 55);
		}
		return btnNum2;
	}
	private JButton getBtnNum3() {
		if (btnNum3 == null) {
			btnNum3 = new JButton("3");
			btnNum3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum3.getText());
					input();
				}
			});
			btnNum3.setBounds(149, 259, 60, 55);
		}
		return btnNum3;
	}
	private JButton getBtnNum4() {
		if (btnNum4 == null) {
			btnNum4 = new JButton("4");
			btnNum4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum4.getText());
					input();
				}
			});
			btnNum4.setBounds(6, 200, 60, 55);
		}
		return btnNum4;
	}
	private JButton getBtnNum5() {
		if (btnNum5 == null) {
			btnNum5 = new JButton("5");
			btnNum5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum5.getText());
					input();
				}
			});
			btnNum5.setBounds(78, 200, 60, 55);
		}
		return btnNum5;
	}
	private JButton getBtnNum6() {
		if (btnNum6 == null) {
			btnNum6 = new JButton("6");
			btnNum6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum6.getText());
					input();
				}
			});
			btnNum6.setBounds(149, 200, 60, 55);
		}
		return btnNum6;
	}
	private JButton getBtnNum7() {
		if (btnNum7 == null) {
			btnNum7 = new JButton("7");
			btnNum7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum7.getText());
					input();
				}
			});
			btnNum7.setBounds(6, 142, 60, 55);
		}
		return btnNum7;
	}
	private JButton getBtnNum8() {
		if (btnNum8 == null) {
			btnNum8 = new JButton("8");
			btnNum8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum8.getText());
					input();
				}
			});
			btnNum8.setBounds(78, 142, 60, 55);
		}
		return btnNum8;
	}
	private JButton getBtnNum9() {
		if (btnNum9 == null) {
			btnNum9 = new JButton("9");
			btnNum9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnNum9.getText());
					input();
				}
			});
			btnNum9.setBounds(149, 142, 60, 55);
		}
		return btnNum9;
	}
	private JButton getBtnClear() {
		if (btnClear == null) {
			btnClear = new JButton("Clear");
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clear();
				}
			});
			btnClear.setBounds(78, 317, 60, 55);
		}
		return btnClear;
	}
	private JButton getBtnResult() {
		if (btnResult == null) {
			btnResult = new JButton("=");
			btnResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnResult.getText());
					opArr.add(btnResult.getText());
					input();
					calc();

					
				}
			});
			btnResult.setBounds(149, 317, 60, 55);
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
			btnDiv.setBounds(221, 317, 60, 55);
		}
		return btnDiv;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("x");
			btnMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnMul.setBounds(221, 259, 60, 55);
		}
		return btnMul;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnSub.getText());
					opArr.add(btnSub.getText());
					input();
				}
			});
			btnSub.setBounds(221, 200, 60, 55);
		}
		return btnSub;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputArr.add(btnAdd.getText());
					opArr.add(btnAdd.getText());
					input();
					
				}
			});
			btnAdd.setBounds(221, 142, 60, 55);
		}
		return btnAdd;
	}
	private void input() {
		
		int index = inputArr.size() -1;
		
		if(inputArr.get(index).equals("+")|| inputArr.get(index).equals("-")||inputArr.get(index).equals("=")) {
			inputArr.clear();
			calcArr.add(Integer.parseInt(viewNum));
			viewNum = "";
		}else {
			viewNum += inputArr.get(index);
			tfView.setText(viewNum);
		}
	}
	private void calc() {
		// 1 + 2 + 3 = 6
		int index = opArr.size()-1;
		
		if(opArr.get(index).equals("=")) {
			for(int i=0; i<calcArr.size()-1; i++) {
				if(opArr.get(i).equals("+")) {
					result = calcArr.get(i) + calcArr.get(i+1);
					calcArr.set(i+1, result);
				}
				if(opArr.get(i).equals("-")) {
					result = calcArr.get(i) - calcArr.get(i+1);
					calcArr.set(i+1, result);
				}
			}
			tfView.setText(Integer.toString(result));
		}
		
		
//		for(int i=1; i<calcArr.size(); i++) {
//			if(opArr.get(i-1).equals("+")) {
//				result = calcArr.get(i-1) + calcArr.get(i);
//				calcArr.set(i, result);
//				calcArr.remove(i-1);
//				System.out.println(result);
//			}
//			if(opArr.get(i-1).equals("-")) {
//				result = calcArr.get(i-1) - calcArr.get(i);
//				calcArr.set(i, result);
//				calcArr.remove(i-1);
//			}
//
//			if(opArr.get(i).equals("=")) {
//				String stResult = Integer.toString(result);
//				tfView.setText(stResult);
//			}
//		 }
		
	}
	private void clear() {
		inputArr.clear();
		calcArr.clear();
		opArr.clear();
		viewNum = "";
		tfView.setText("");
	}

	

}
