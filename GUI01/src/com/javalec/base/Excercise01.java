package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Excercise01 {

	private JFrame frmFirstCalc;
	private JLabel lblNum1;
	private JTextField txtNum1;
	private JLabel lblNum2;
	private JTextField txtNum2;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;
	private JTextField unTxtNum1;
	private JTextField unTxtNum2;
	private JTextField unResult;
	private JLabel lblOpSymbol;
	private JLabel lblOpSymbol_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Excercise01 window = new Excercise01();
					window.frmFirstCalc.setVisible(true);
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
		frmFirstCalc = new JFrame();
		frmFirstCalc.setTitle("First Calc");
		frmFirstCalc.setBounds(100, 100, 450, 200);
		frmFirstCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFirstCalc.getContentPane().setLayout(null);
		frmFirstCalc.getContentPane().add(getLblNum1());
		frmFirstCalc.getContentPane().add(getTxtNum1());
		frmFirstCalc.getContentPane().add(getLblNum2());
		frmFirstCalc.getContentPane().add(getTxtNum2());
		frmFirstCalc.getContentPane().add(getBtnAdd());
		frmFirstCalc.getContentPane().add(getBtnSub());
		frmFirstCalc.getContentPane().add(getBtnMul());
		frmFirstCalc.getContentPane().add(getBtnDiv());
		frmFirstCalc.getContentPane().add(getUnTxtNum1());
		frmFirstCalc.getContentPane().add(getUnTxtNum2());
		frmFirstCalc.getContentPane().add(getUnResult());
		frmFirstCalc.getContentPane().add(getLblOpSymbol());
		frmFirstCalc.getContentPane().add(getLblOpSymbol_1());
	}

	private JLabel getLblNum1() {
		if (lblNum1 == null) {
			lblNum1 = new JLabel("1 :");
			lblNum1.setBounds(20, 20, 30, 16);
		}
		return lblNum1;
	}
	private JTextField getTxtNum1() {
		if (txtNum1 == null) {
			txtNum1 = new JTextField();
			txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
			txtNum1.setBounds(50, 15, 70, 26);
			txtNum1.setColumns(10);
		}
		return txtNum1;
	}
	private JLabel getLblNum2() {
		if (lblNum2 == null) {
			lblNum2 = new JLabel("2 :");
			lblNum2.setBounds(20, 53, 30, 16);
		}
		return lblNum2;
	}
	private JTextField getTxtNum2() {
		if (txtNum2 == null) {
			txtNum2 = new JTextField();
			txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
			txtNum2.setColumns(10);
			txtNum2.setBounds(50, 48, 70, 26);
		}
		return txtNum2;
	}
	
	/* -- >ActionEvent 라는 외부 라이브러리가 존재하는데
	 *  라이브러리의 인터페이스를 implement 하여 본인의 새로운 객체를 생성한다. 
	 *  그에 따른 요구 조건으로는 클래스안의 내부 클래스를 본인의 임의 대로 
	 * 생성하여 인터페이스를 implement 한다. 
	 * 필수 적으로 명시되어 있는 메소드인 ActionPerformed를 사용하여 재정의 하여 우리가 사용
	 * 하는 방법이라고 생각하면 된다. */ 
	
	
	
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new Hello());
			btnAdd.setBounds(145, 30, 60, 29);
		}
		return btnAdd;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new Hello());
			btnSub.setBounds(217, 30, 60, 29);
		}
		return btnSub;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("x");
			btnMul.addActionListener(new Hello());
			btnMul.setBounds(289, 30, 60, 29);
		}
		return btnMul;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new Hello());
			btnDiv.setBounds(361, 30, 60, 29);
		}
		return btnDiv;
	}
	private JTextField getUnTxtNum1() {
		if (unTxtNum1 == null) {
			unTxtNum1 = new JTextField();
			unTxtNum1.setEditable(false);
			unTxtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
			unTxtNum1.setColumns(10);
			unTxtNum1.setBounds(52, 120, 70, 26);
		}
		return unTxtNum1;
	}
	private JTextField getUnTxtNum2() {
		if (unTxtNum2 == null) {
			unTxtNum2 = new JTextField();
			unTxtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
			unTxtNum2.setEditable(false);
			unTxtNum2.setColumns(10);
			unTxtNum2.setBounds(163, 120, 70, 26);
		}
		return unTxtNum2;
	}
	private JTextField getUnResult() {
		if (unResult == null) {
			unResult = new JTextField();
			unResult.setHorizontalAlignment(SwingConstants.RIGHT);
			unResult.setEditable(false);
			unResult.setColumns(10);
			unResult.setBounds(289, 120, 70, 26);
		}
		return unResult;
	}
	private JLabel getLblOpSymbol() {
		if (lblOpSymbol == null) {
			lblOpSymbol = new JLabel("+");
			lblOpSymbol.setHorizontalAlignment(SwingConstants.CENTER);
			lblOpSymbol.setBounds(128, 125, 30, 16);
		}
		return lblOpSymbol;
	}
	private JLabel getLblOpSymbol_1() {
		if (lblOpSymbol_1 == null) {
			lblOpSymbol_1 = new JLabel("=");
			lblOpSymbol_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblOpSymbol_1.setBounds(245, 125, 30, 16);
		}
		return lblOpSymbol_1;
	}
		
		
	
 class Hello implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(txtNum1.getText().equals("") || txtNum2.getText().equals("")){
			JOptionPane.showMessageDialog(btnDiv, "숫자를 입력해 주세요.");
			return ;
		}
		Calc calc = new Calc(txtNum1.getText(), txtNum2.getText());
		unTxtNum1.setText(txtNum1.getText());
		unTxtNum2.setText(txtNum2.getText());
		
		if (e.getSource() == btnAdd) {
			lblOpSymbol.setText("+");
			unResult.setText(calc.actionAdd());
		}else if(e.getSource()==btnSub) {
			lblOpSymbol.setText("-");
			unResult.setText(calc.actionSub());
		}else if(e.getSource()==btnMul) {
			lblOpSymbol.setText("x");
			unResult.setText(calc.actionMul());
		}else {
			lblOpSymbol.setText("/");
			if(txtNum1.getText().equals("0") || txtNum2.getText().equals("0")) {
				JOptionPane.showMessageDialog(btnDiv, "0이 아닌 숫자를 입력해 주세요.");
				unResult.setText("");
				return;
			}else {
				unResult.setText(calc.actionDiv());
			}
		
			
		}
	
	}
	 
 }
}




