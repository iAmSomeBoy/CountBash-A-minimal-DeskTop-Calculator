package inteliCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountBash {

	private JFrame frame;
	private JTextField textField;
	private JButton btn_0;
	private JButton btn_4;
	private JButton btn4;
	private JButton btn7;
	private JButton btn_sin;
	private JButton btn_cos;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btn_tan;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btn_dot;
	private JButton btn_equal;
	private JButton btn_division;
	private JButton btn_backsp;
	private JButton btn_fact;
	private JButton btn_log;
	private JButton btn_power;
	private JButton btn_cube;
	private JButton btn_sqr;
	private JButton btn_root;
	private JButton btn_clr;
	private JButton btn_plus;
	private JButton btn_minus;
	private JButton btn_mlti;
	
	double int1;
	double int2;
	double total;
	String action;
	String answer;
	
	private static final String ERROR_TEXT = "Error";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountBash window = new CountBash();
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
	public CountBash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Zen Dots", Font.PLAIN, 25));
		frame.setBounds(100, 100, 454, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 31));
		textField.setBounds(10, 11, 420, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_0.setBounds(10, 306, 121, 47);
		frame.getContentPane().add(btn_0);
		
		btn_4 = new JButton("1");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_4.setBounds(10, 248, 58, 47);
		frame.getContentPane().add(btn_4);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Zen Dots", Font.PLAIN, 24));
		btn4.setBounds(10, 193, 58, 47);
		frame.getContentPane().add(btn4);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn7.setBounds(10, 138, 58, 47);
		frame.getContentPane().add(btn7);
		
		btn_sin = new JButton("sin");
		btn_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyUnary(value -> Math.sin(Math.toRadians(value)));
			}
		});
		btn_sin.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btn_sin.setBounds(10, 80, 58, 47);
		frame.getContentPane().add(btn_sin);
		
		btn_cos = new JButton("cos");
		btn_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyUnary(value -> Math.cos(Math.toRadians(value)));
			}
		});
		btn_cos.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btn_cos.setBounds(73, 80, 58, 47);
		frame.getContentPane().add(btn_cos);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Zen Dots", Font.PLAIN, 24));
		btn8.setBounds(73, 138, 58, 47);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn5.setBounds(73, 193, 58, 47);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn2.setBounds(73, 248, 58, 47);
		frame.getContentPane().add(btn2);
		
		btn_tan = new JButton("tan");
		btn_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyUnary(value -> Math.tan(Math.toRadians(value)));
			}
		});
		btn_tan.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 14));
		btn_tan.setBounds(138, 80, 58, 47);
		frame.getContentPane().add(btn_tan);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn9.setBounds(138, 138, 58, 47);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn6.setBounds(138, 193, 58, 47);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn3.setBounds(138, 248, 58, 47);
		frame.getContentPane().add(btn3);
		
		btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+ btn_dot.getText();
				textField.setText(number);
			}
		});
		btn_dot.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_dot.setBounds(138, 306, 58, 47);
		frame.getContentPane().add(btn_dot);
		
		btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double value = getFieldValue();
				if(value == null || action == null) {
					return;
				}
				int2 = value;
				if("+".equals(action)) {
					total= int1+ int2;
					textField.setText(formatResult(total));
				}else if("-".equals(action)) {
					total= int1- int2;
					textField.setText(formatResult(total));
				}else if("*".equals(action)) {
					total= int1* int2;
					textField.setText(formatResult(total));
				}else if("/".equals(action)) {
					if(int2 == 0) {
						textField.setText(ERROR_TEXT);
						action = null;
						return;
					}
					total= int1/ int2;
					textField.setText(formatResult(total));
				}else if("^".equals(action)) {
					total = Math.pow(int1, int2);
					textField.setText(formatResult(total));
				}
				action = null;
			}
		});
		btn_equal.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_equal.setBounds(201, 306, 120, 47);
		frame.getContentPane().add(btn_equal);
		
		btn_division = new JButton("/");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBinaryAction("/");
			}
		});
		btn_division.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_division.setBounds(327, 306, 101, 47);
		frame.getContentPane().add(btn_division);
		
		btn_backsp = new JButton("<=");
		btn_backsp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck= null;
				if(textField.getText().length() >0) {
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bck= str.toString();
					textField.setText(bck);
				}
			}
		});
		btn_backsp.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		btn_backsp.setBounds(201, 80, 63, 47);
		frame.getContentPane().add(btn_backsp);
		
		btn_fact = new JButton("x!");
		btn_fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double value = getFieldValue();
				if(value == null || value < 0 || value % 1 != 0) {
					textField.setText(ERROR_TEXT);
					return;
				}
				long result = 1;
				int n = value.intValue();
				for (int i = 2; i <= n; i++) {
					result *= i;
				}
				textField.setText(String.valueOf(result));
			}
		});
		btn_fact.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 22));
		btn_fact.setBounds(201, 138, 58, 47);
		frame.getContentPane().add(btn_fact);
		
		btn_log = new JButton("log");
		btn_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double value = getFieldValue();
				if(value == null || value <= 0) {
					textField.setText(ERROR_TEXT);
					return;
				}
				textField.setText(formatResult(Math.log10(value)));
			}
		});
		btn_log.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		btn_log.setBounds(201, 193, 58, 47);
		frame.getContentPane().add(btn_log);
		
		btn_power = new JButton("x^n");
		btn_power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBinaryAction("^");
			}
		});
		btn_power.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
		btn_power.setBounds(201, 248, 58, 47);
		frame.getContentPane().add(btn_power);
		
		btn_cube = new JButton("x^3");
		btn_cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyUnary(value -> Math.pow(value, 3));
			}
		});
		btn_cube.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 13));
		btn_cube.setBounds(263, 138, 58, 47);
		frame.getContentPane().add(btn_cube);
		
		btn_sqr = new JButton("x^2");
		btn_sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				applyUnary(value -> Math.pow(value, 2));
			}
		});
		btn_sqr.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		btn_sqr.setBounds(263, 193, 58, 47);
		frame.getContentPane().add(btn_sqr);
		
		btn_root = new JButton("sqrt");
		btn_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double value = getFieldValue();
				if(value == null || value < 0) {
					textField.setText(ERROR_TEXT);
					return;
				}
				textField.setText(formatResult(Math.sqrt(value)));
			}
		});
		btn_root.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btn_root.setBounds(263, 248, 58, 47);
		frame.getContentPane().add(btn_root);
		
		btn_clr = new JButton("C");
		btn_clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				action = null;
				int1 = 0;
				int2 = 0;
				total = 0;
			}
		});
		btn_clr.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_clr.setBounds(269, 80, 159, 47);
		frame.getContentPane().add(btn_clr);
		
		btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBinaryAction("+");
			}
		});
		btn_plus.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_plus.setBounds(327, 138, 101, 47);
		frame.getContentPane().add(btn_plus);
		
		btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBinaryAction("-");
			}
		});
		btn_minus.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_minus.setBounds(327, 193, 101, 47);
		frame.getContentPane().add(btn_minus);
		
		btn_mlti = new JButton("*");
		btn_mlti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBinaryAction("*");
			}
		});
		btn_mlti.setFont(new Font("Zen Dots", Font.PLAIN, 25));
		btn_mlti.setBounds(327, 248, 101, 47);
		frame.getContentPane().add(btn_mlti);
	}
	
	private interface UnaryOperation {
		double apply(double value);
	}
	
	private void applyUnary(UnaryOperation operation) {
		Double value = getFieldValue();
		if(value == null) {
			return;
		}
		textField.setText(formatResult(operation.apply(value)));
	}
	
	private void setBinaryAction(String operation) {
		Double value = getFieldValue();
		if(value == null) {
			return;
		}
		int1 = value;
		action = operation;
		textField.setText("");
	}
	
	private Double getFieldValue() {
		String text = textField.getText();
		if(text == null || text.trim().isEmpty() || ERROR_TEXT.equals(text)) {
			return null;
		}
		try {
			return Double.parseDouble(text.trim());
		} catch (NumberFormatException ex) {
			textField.setText(ERROR_TEXT);
			return null;
		}
	}
	
	private String formatResult(double value) {
		if (Double.isNaN(value) || Double.isInfinite(value)) {
			return ERROR_TEXT;
		}
		return String.format("%.6f", value).replaceAll("\\.?0+$", "");
	}
}
