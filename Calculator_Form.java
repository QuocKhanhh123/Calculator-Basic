import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator_Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtResult;
	
	String operandl = "";
	String operator = "";
	
	boolean isEqualsFress = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_Form frame = new Calculator_Form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(29, 50, 570, 102);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtResult.setBounds(30, 24, 507, 52);
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(29, 162, 570, 277);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 5, 5, 5));
		
		JButton btnNumber1 = new JButton("1");
		btnNumber1.setBackground(new Color(192, 192, 192));
		btnNumber1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber1);
		
		JButton btnNumber2 = new JButton("2");
		btnNumber2.setBackground(new Color(192, 192, 192));
		btnNumber2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber2);
		
		JButton btnNumber3 = new JButton("3");
		btnNumber3.setBackground(new Color(192, 192, 192));
		btnNumber3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(192, 192, 192));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnDivide);
		
		JButton btnSquareRoot = new JButton("SQRT");
		btnSquareRoot.setBackground(new Color(192, 192, 192));
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return;
				}
				String cmd = e.getActionCommand();
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					if(cmd.equals("SQRT")) {
						value = Math.sqrt(value);
					}
					txtResult.setText(""+value);
					isEqualsFress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnSquareRoot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnSquareRoot);
		
		JButton btnNumber4 = new JButton("4");
		btnNumber4.setBackground(new Color(192, 192, 192));
		btnNumber4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber4);
		
		JButton btnNumber5 = new JButton("5");
		btnNumber5.setBackground(new Color(192, 192, 192));
		btnNumber5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber5);
		
		JButton btnNumber6 = new JButton("6");
		btnNumber6.setBackground(new Color(192, 192, 192));
		btnNumber6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBackground(new Color(192, 192, 192));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnMultiply);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.setBackground(new Color(192, 192, 192));
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return;
				}
				String cmd = e.getActionCommand();
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					if(cmd.equals("%")) {
						value = value * 100;
					}
					txtResult.setText(""+value);
					isEqualsFress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnPercentage);
		
		JButton btnNumber7 = new JButton("7");
		btnNumber7.setBackground(new Color(192, 192, 192));
		btnNumber7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber7);
		
		JButton btnNumber8 = new JButton("8");
		btnNumber8.setBackground(new Color(192, 192, 192));
		btnNumber8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber8);
		
		JButton btnNumber9 = new JButton("9");
		btnNumber9.setBackground(new Color(192, 192, 192));
		btnNumber9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber9);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(new Color(192, 192, 192));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnAdd);
		
		JButton btnFraction = new JButton("1/x");
		btnFraction.setBackground(new Color(192, 192, 192));
		btnFraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("")) {
					return;
				}
				String cmd = e.getActionCommand();
				try {
					double value = Double.parseDouble(txtResult.getText());
					
					if(cmd.equals("1/x")) {
						value = 1/value;
					}
					txtResult.setText(""+value);
					isEqualsFress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnFraction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnFraction);
		
		JButton btnNumber0 = new JButton("0");
		btnNumber0.setBackground(new Color(192, 192, 192));
		btnNumber0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isEqualsFress) {
					isEqualsFress = false;
					txtResult.setText("");
					
				}
				String cmd = e.getActionCommand();
				
				txtResult.setText(txtResult.getText() + cmd);
			}
		});
		btnNumber0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnNumber0);
		
		JButton btnPlus = new JButton("+/-");
		btnPlus.setBackground(new Color(192, 192, 192));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double value = Double.parseDouble(txtResult.getText());
					value =- value;
					txtResult.setText(""+value);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnPlus);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(192, 192, 192));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("");
				operandl = "";
				operator = "";
				isEqualsFress = false;
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnClear);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.setBackground(new Color(192, 192, 192));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				
				operator = cmd;
				operandl = txtResult.getText();
				
				txtResult.setText("");
			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnSubtract);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBackground(new Color(192, 192, 192));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtResult.getText().equals("") || operandl.equals("")) {
					return;
				}
				try {
					double oprand1 = Double.parseDouble(operandl);
					double oprand2 = Double.parseDouble(txtResult.getText());
					double result = 0;
					if(operator.equals("+")) {
						result = oprand1 + oprand2;
					}
					else if(operator.equals("-")) {
						result = oprand1 - oprand2;
					}
					else if(operator.equals("*")) {
						result = oprand1 * oprand2;
					}
					else if(operator.equals("/")) {
						result = oprand1 / oprand2;
					}
					
					txtResult.setText(""+result);
					isEqualsFress = true;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnEquals);
		
		JLabel lblNewLabel = new JLabel("CASIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(28, 10, 571, 30);
		contentPane.add(lblNewLabel);
	}
}
