/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcutator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.LayoutManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

/**
 *
 * @author Akram Kasem
 */


public class Calcutator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	 DecimalFormat format = new DecimalFormat("0.###############");
	 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calcutator frame = new Calcutator();
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
	public Calcutator() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel((LayoutManager) null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 401, 342);
		contentPane.add(panel);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				autoAddOrRemove("number");
		        textField.setText(textField.getText() + "0");
			}
		});
		b0.setForeground(Color.WHITE);
		b0.setFont(new Font("Arial", Font.BOLD, 17));
		b0.setBackground(Color.DARK_GRAY);
		b0.setBounds(11, 285, 146, 38);
		panel.add(b0);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 autoAddOrRemove("number");
			        textField.setText(textField.getText() + "1");
			}
		});
		b1.setForeground(Color.WHITE);
		b1.setFont(new Font("Arial", Font.BOLD, 17));
		b1.setBackground(Color.DARK_GRAY);
		b1.setBounds(11, 245, 70, 38);
		panel.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 autoAddOrRemove("number");
			        textField.setText(textField.getText() + "2");
			}
		});
		b2.setForeground(Color.WHITE);
		b2.setFont(new Font("Arial", Font.BOLD, 17));
		b2.setBackground(Color.DARK_GRAY);
		b2.setBounds(87, 245, 70, 38);
		panel.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("number");
		        textField.setText(textField.getText() + "3");
			}
		});
		b3.setForeground(Color.WHITE);
		b3.setFont(new Font("Arial", Font.BOLD, 17));
		b3.setBackground(Color.DARK_GRAY);
		b3.setBounds(162, 245, 70, 38);
		panel.add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("number");
		        textField.setText(textField.getText() + "4");
			}
		});
		b4.setForeground(Color.WHITE);
		b4.setFont(new Font("Arial", Font.BOLD, 17));
		b4.setBackground(Color.DARK_GRAY);
		b4.setBounds(11, 205, 70, 38);
		panel.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("number");
		        textField.setText(textField.getText() + "5");
			}
		});
		b5.setForeground(Color.WHITE);
		b5.setFont(new Font("Arial", Font.BOLD, 17));
		b5.setBackground(Color.DARK_GRAY);
		b5.setBounds(87, 205, 70, 38);
		panel.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("number");
		        textField.setText(textField.getText() + "6");
			}
		});
		b6.setForeground(Color.WHITE);
		b6.setFont(new Font("Arial", Font.BOLD, 17));
		b6.setBackground(Color.DARK_GRAY);
		b6.setBounds(162, 205, 70, 38);
		panel.add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("number");
		        textField.setText(textField.getText() + "7");
			}
		});
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("Arial", Font.BOLD, 17));
		b7.setBackground(Color.DARK_GRAY);
		b7.setBounds(11, 165, 70, 38);
		panel.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("number");
		        textField.setText(textField.getText() + "8");
			}
		});
		b8.setForeground(Color.WHITE);
		b8.setFont(new Font("Arial", Font.BOLD, 17));
		b8.setBackground(Color.DARK_GRAY);
		b8.setBounds(87, 165, 70, 38);
		panel.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("number");
		        textField.setText(textField.getText() + "9");
			}
		});
		b9.setForeground(Color.WHITE);
		b9.setFont(new Font("Arial", Font.BOLD, 17));
		b9.setBackground(Color.DARK_GRAY);
		b9.setBounds(162, 165, 70, 38);
		panel.add(b9);
		
		JButton comma = new JButton(".");
		comma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String str = textField.getText();
		        if (textField.getText().isEmpty()) {
		            textField.setText("0.");
		        }
		        else {
		            int lastPointIndex = str.lastIndexOf(".");
		            int lastPlusIndex = str.lastIndexOf("+");
		            int lastMinusIndex = str.lastIndexOf("-");
		            int lastMultipleIndex = str.lastIndexOf("×");
		            int lastDivideIndex = str.lastIndexOf("÷");
		            int lastModuloIndex = str.lastIndexOf("%");
		 
		            if (lastPointIndex <= lastPlusIndex ||
		                lastPointIndex <= lastMinusIndex ||
		                lastPointIndex <= lastMultipleIndex ||
		                lastPointIndex <= lastDivideIndex ||
		                lastPointIndex <= lastModuloIndex ) {
		                    autoAddOrRemove("point");
		                    textField.setText(textField.getText() + ".");
		            }
		        }
			}
		});
		comma.setForeground(Color.WHITE);
		comma.setFont(new Font("Arial", Font.BOLD, 17));
		comma.setBackground(Color.DARK_GRAY);
		comma.setBounds(162, 285, 70, 38);
		panel.add(comma);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (!textField.getText().isEmpty()) {
		            try {
		                Double answer = calculate(textField.getText());
		                if (answer.isInfinite()) {
		                    textField.setText("cannot divide by 0");
		                }
		                else if (answer.isNaN()) {
		                    textField.setText("Error");
		                }
		                else {
		                    textField.setText(format.format(answer));
		                }
		            }
		            catch (Exception ex) {
		                textField.setText("Error");
		            }
		        }
			}
		});
		equal.setForeground(Color.WHITE);
		equal.setFont(new Font("Arial", Font.BOLD, 17));
		equal.setBackground(Color.BLACK);
		equal.setBounds(313, 245, 70, 78);
		panel.add(equal);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("operand");
		        textField.setText(textField.getText() + "+");
			}
		});
		plus.setForeground(Color.WHITE);
		plus.setFont(new Font("Arial", Font.BOLD, 17));
		plus.setBackground(Color.BLACK);
		plus.setBounds(238, 165, 70, 38);
		panel.add(plus);
		
		JButton multiple = new JButton("×");
		multiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (!textField.getText().isEmpty()) {
		            autoAddOrRemove("operand");
		            textField.setText(textField.getText() + "×");
		        }
			}
		});
		multiple.setForeground(Color.WHITE);
		multiple.setFont(new Font("Arial", Font.BOLD, 17));
		multiple.setBackground(Color.BLACK);
		multiple.setBounds(238, 245, 70, 38);
		panel.add(multiple);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("operand");
		        textField.setText(textField.getText() + "-");
			}
		});
		minus.setForeground(Color.WHITE);
		minus.setFont(new Font("Arial", Font.BOLD, 17));
		minus.setBackground(Color.BLACK);
		minus.setBounds(238, 205, 70, 38);
		panel.add(minus);
		
		JButton divide = new JButton("÷");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (!textField.getText().isEmpty()) {
		            autoAddOrRemove("operand");
		            textField.setText(textField.getText() + "÷");
		        }
			}
		});
		divide.setForeground(Color.WHITE);
		divide.setFont(new Font("Arial", Font.BOLD, 17));
		divide.setBackground(Color.BLACK);
		divide.setBounds(238, 285, 70, 38);
		panel.add(divide);
		
		JButton cos = new JButton("cos");
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("symbol");
		        textField.setText(textField.getText() + "cos");
			}
		});
		cos.setForeground(Color.WHITE);
		cos.setFont(new Font("Arial", Font.BOLD, 9));
		cos.setBackground(Color.BLACK);
		cos.setBounds(11, 84, 70, 38);
		panel.add(cos);
		
		JButton sin = new JButton("sin");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("symbol");
		        textField.setText(textField.getText() + "sin");
			}
		});
		sin.setForeground(Color.WHITE);
		sin.setFont(new Font("Arial", Font.BOLD, 9));
		sin.setBackground(Color.BLACK);
		sin.setBounds(87, 84, 70, 38);
		panel.add(sin);
		
		JButton tan = new JButton("tan");
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("symbol");
		        textField.setText(textField.getText() + "tan");
			}
		});
		tan.setForeground(Color.WHITE);
		tan.setFont(new Font("Arial", Font.BOLD, 9));
		tan.setBackground(Color.BLACK);
		tan.setBounds(162, 84, 70, 38);
		panel.add(tan);
		
		JButton sqrt = new JButton("√");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("symbol");
		        textField.setText(textField.getText() + "√");
			}
		});
		sqrt.setForeground(Color.WHITE);
		sqrt.setFont(new Font("Arial", Font.BOLD, 17));
		sqrt.setBackground(Color.BLACK);
		sqrt.setBounds(313, 205, 70, 38);
		panel.add(sqrt);
		
		JButton power = new JButton("^");
		power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (textField.getText().matches(".*[0-9eπ)]$"))
		            textField.setText(textField.getText() + "^");
			}
		});
		power.setForeground(Color.WHITE);
		power.setFont(new Font("Arial", Font.BOLD, 17));
		power.setBackground(Color.BLACK);
		power.setBounds(313, 165, 70, 38);
		panel.add(power);
		
		JButton modulo = new JButton("%");
		modulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (!textField.getText().isEmpty()) {
		            autoAddOrRemove("operand");
		            textField.setText(textField.getText() + "%");
		        }
			}
		});
		modulo.setForeground(Color.WHITE);
		modulo.setFont(new Font("Arial", Font.BOLD, 17));
		modulo.setBackground(Color.BLACK);
		modulo.setBounds(162, 125, 70, 38);
		panel.add(modulo);
		
		JButton exponential = new JButton("e");
		exponential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("symbol");
		        textField.setText(textField.getText() + "e");
			}
		});
		exponential.setForeground(Color.WHITE);
		exponential.setFont(new Font("Arial", Font.BOLD, 17));
		exponential.setBackground(Color.BLACK);
		exponential.setBounds(87, 125, 70, 38);
		panel.add(exponential);
		
		JButton pi = new JButton("π");
		pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("symbol");
		        textField.setText(textField.getText() + "π");
			}
		});
		pi.setForeground(Color.WHITE);
		pi.setFont(new Font("Arial", Font.BOLD, 17));
		pi.setBackground(Color.BLACK);
		pi.setBounds(11, 125, 70, 38);
		panel.add(pi);
		
		JButton parentesesRight = new JButton(")");
		parentesesRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        if (textField.getText().matches(".*[^ns√(]$")) {
		            int leftParentesesCounter = 0, rightParentesesCounter = 0;
		            for(char c: textField.getText().toCharArray()) {
		                if( c == '(' )
		                    leftParentesesCounter++;
		                else if( c == ')' )
		                    rightParentesesCounter++;
		            }
		            if (leftParentesesCounter > rightParentesesCounter)
		                textField.setText(textField.getText() + ")");
		        }
			}
		});
		parentesesRight.setForeground(Color.WHITE);
		parentesesRight.setFont(new Font("Arial", Font.BOLD, 17));
		parentesesRight.setBackground(Color.BLACK);
		parentesesRight.setBounds(313, 125, 70, 38);
		panel.add(parentesesRight);
		
		JButton parentesesLeft = new JButton("(");
		parentesesLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        autoAddOrRemove("symbol");
		        textField.setText(textField.getText() + "(");
			}
		});
		parentesesLeft.setForeground(Color.WHITE);
		parentesesLeft.setFont(new Font("Arial", Font.BOLD, 17));
		parentesesLeft.setBackground(Color.BLACK);
		parentesesLeft.setBounds(238, 125, 70, 38);
		panel.add(parentesesLeft);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        textField.setText("");
			}
		});
		clear.setForeground(Color.WHITE);
		clear.setFont(new Font("Arial", Font.BOLD, 17));
		clear.setBackground(new Color(223, 1, 1));
		clear.setBounds(313, 84, 70, 38);
		panel.add(clear);
		
		JButton back = new JButton("←");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String temp = textField.getText();
		        if (temp.equals("Error") || temp.equals("cannot divide by 0")) {
		            textField.setText("");
		        }
		        else if (!temp.isEmpty()) {
		            temp = textField.getText().substring(0, textField.getText().length() - 1);
		            if (temp.length() >= 2) {
		                switch (temp.substring(temp.length() - 2)) {
		                    case "co":
		                    case "si":
		                    case "ta":
		                        temp = temp.substring(0, temp.length() - 2);
		                        break;
		                }
		            }
		            textField.setText(temp);
		        }
			}
		});
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Arial", Font.BOLD, 17));
		back.setBackground(new Color(255, 128, 0));
		back.setBounds(238, 84, 70, 38);
		panel.add(back);
		
		textField = new JTextField("");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Monospaced", Font.BOLD, 19));
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(11, 11, 372, 60);
		panel.add(textField);
	}
	
	private void autoAddOrRemove(String button) {
		 
        if (!textField.getText().isEmpty()) {
            Character lastCharacter = textField.getText().charAt(textField.getText().length() - 1);
 
            switch (button) {
 
                 case "symbol":
                    switch (lastCharacter) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'e':
                        case 'π':
                            textField.setText(textField.getText() + "×");
                            break;
                        case '.':
                            textField.setText(textField.getText() + "0×");
                            break;
                    }
                    break;
 
                 case "number":
                    switch (lastCharacter) {
                        case 'e':
                        case 'π':
                            textField.setText(textField.getText() + "×");
                            break;
                        case '0':
                            String str = textField.getText();
                            if ( str.equals("0") ||
                                 str.endsWith("+0") ||
                                 str.endsWith("-0") ||
                                 str.endsWith("×0") ||
                                 str.endsWith("÷0") ||
                                 str.endsWith("%0") ||
                                 str.endsWith("^0") ||
                                 str.endsWith("√0") ||
                                 str.endsWith("(0") ||
                                 str.endsWith("cos0") ||
                                 str.endsWith("sin0") ||
                                 str.endsWith("tan0") )
                                textField.setText(textField.getText().substring(0, textField.getText().length()-1));
                        break;
                    }
                break;
 
               case "operand":
                    switch (lastCharacter) {
                        case '+':
                        case '-':
                        case '×':
                        case '÷':
                        case '%':
                        case '.':
                        textField.setText(textField.getText().substring(0, textField.getText().length()-1));
                        break;
                    }
                break;
 
                case "point":
                    switch (lastCharacter) {
                        case '+':
                        case '-':
                        case '×':
                        case '÷':
                        case '%':
                        case '(':
                        case '√':
                        case 'π':
                        case 's':
                        case 'n':
                        case '^':
                            textField.setText(textField.getText() + "0");
                            break;
                        case ')':
                            textField.setText(textField.getText() + "×0");
                            break;
                        case '.':
                            textField.setText(textField.getText().substring(0, textField.getText().length()-1));
                            break;
                    }
                break;
 
            }
        }
    }
	
	private double calculate(String str) {
		 
        return new Object() {
            int pos = -1, ch;
 
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
 
            boolean eat(int charToEat) {
                while (ch == ' ') {
                    nextChar();
                }
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
 
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                return x;
            }
 
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) {
                        x += parseTerm();
                    }
                    else if (eat('-')) {
                        x -= parseTerm();
                    }
                    else {
                        return x;
                    }
                }
            }
 
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('×')) {
                        x *= parseFactor();
                    }
                    else if (eat('÷')) {
                        x /= parseFactor();
                    }
                    else if (eat('%')) {
                        x %= parseFactor();
                    }
                    else {
                        return x;
                    }
                }
            }
 
            double parseFactor() {
                if (eat('+')) {
                    return parseFactor();
                }
                if (eat('-')) {
                    return -parseFactor();
                }
                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                }
                else if (eat('e')) {
                    x = Math.E;
                }
                else if (eat('π')) {
                    x = Math.PI;
                }
                else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                }
                else if (ch >= 'a' && ch <= 'z' || ch == '√') {
                    while (ch >= 'a' && ch <= 'z' || ch == '√') {
                        nextChar();
                    }
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    switch (func) {
                        case "√":
                            x = Math.sqrt(x);
                            break;
                        case "sin":
                            x = Math.sin(Math.toRadians(x));
                            break;
                        case "cos":
                            x = Math.cos(Math.toRadians(x));
                            break;
                        case "tan":
                            x = Math.tan(Math.toRadians(x));
                            break;
                        default:
                            throw new RuntimeException("Unknown function: " + func);
                    }
                }
                else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                if (eat('^')) {
                    x = Math.pow(x, parseFactor());
                }
                return x;
 
            }
 
        }.parse();
    }
	
}
