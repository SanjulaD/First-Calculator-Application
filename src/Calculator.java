import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

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
		frame.setBounds(100, 100, 371, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 13, 330, 59);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//-------------------Row 0------------------------------------------------------//
		JButton btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Back=null;
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					Back = strB.toString();
					textField.setText(Back);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBack.setBounds(12, 85, 64, 64);
		frame.getContentPane().add(btnBack);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnCancel.setBounds(100, 85, 64, 64);
		frame.getContentPane().add(btnCancel);
		
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPerc.setBounds(188, 85, 64, 64);
		frame.getContentPane().add(btnPerc);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPlus.setBounds(276, 85, 64, 64);
		frame.getContentPane().add(btnPlus);
		//-------------------Row 1------------------------------------------------------//
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn7.setBounds(12, 165, 64, 64);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn8.setBounds(100, 165, 64, 64);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn9.setBounds(188, 165, 64, 64);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSub.setBounds(276, 165, 64, 64);
		frame.getContentPane().add(btnSub);
		//-------------------Row 2------------------------------------------------------//
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn4.setBounds(12, 245, 64, 64);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn5.setBounds(100,245, 64, 64);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn6.setBounds(188,245, 64, 64);
		frame.getContentPane().add(btn6);
		
		JButton btnDev = new JButton("/");
		btnDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDev.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDev.setBounds(276, 245, 64, 64);
		frame.getContentPane().add(btnDev);
		//-------------------Row 3------------------------------------------------------//
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn1.setBounds(12, 325, 64, 64);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn2.setBounds(100, 325, 64, 64);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn3.setBounds(188,325, 64, 64);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMul.setBounds(276, 325, 64, 64);
		frame.getContentPane().add(btnMul);
		//-------------------Row 4------------------------------------------------------//
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn0.setBounds(12,405, 64, 64);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnDot.setBounds(100, 405, 64, 64);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPM.setBounds(188,405, 64, 64);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEqual.setBounds(276,405, 64, 64);
		frame.getContentPane().add(btnEqual);
	}
}
