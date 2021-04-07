import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private String func = "ADD";
	private int firstNumber;

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
		frame.setBounds(100, 100, 474, 662);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel answer = new JLabel("0");
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setFont(new Font("굴림", Font.BOLD, 50));
		answer.setBounds(12, 26, 412, 90);
		frame.getContentPane().add(answer);
		
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("굴림", Font.BOLD, 40));
		btn7.setBounds(12, 126, 97, 102);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("굴림", Font.BOLD, 40));
		btn8.setBounds(121, 126, 97, 102);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("굴림", Font.BOLD, 40));
		btn9.setBounds(230, 126, 97, 102);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func="ADD";
			}
		});
		btnPlus.setFont(new Font("굴림", Font.BOLD, 40));
		btnPlus.setBounds(339, 126, 97, 102);
		frame.getContentPane().add(btnPlus);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("굴림", Font.BOLD, 40));
		btn5.setBounds(121, 251, 97, 102);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setFont(new Font("굴림", Font.BOLD, 40));
		btn4.setBounds(12, 251, 97, 102);
		frame.getContentPane().add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("굴림", Font.BOLD, 40));
		btn6.setBounds(230, 251, 97, 102);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func="SUB";
			}
		});
		btnSub.setFont(new Font("굴림", Font.BOLD, 40));
		btnSub.setBounds(339, 251, 97, 102);
		frame.getContentPane().add(btnSub);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setFont(new Font("굴림", Font.BOLD, 40));
		btn2.setBounds(121, 376, 97, 102);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("굴림", Font.BOLD, 40));
		btn1.setBounds(12, 376, 97, 102);
		frame.getContentPane().add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("굴림", Font.BOLD, 40));
		btn3.setBounds(230, 376, 97, 102);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func="MULT";
			}
		});
		btnMul.setFont(new Font("굴림", Font.BOLD, 40));
		btnMul.setBounds(339, 376, 97, 102);
		frame.getContentPane().add(btnMul);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new NumberActionListener(answer,"0"));

		btn0.setFont(new Font("굴림", Font.BOLD, 40));
		btn0.setBounds(121, 500, 97, 102);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton("0.0");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText("0");
			}
		});
		btnDot.setFont(new Font("굴림", Font.BOLD, 40));
		btnDot.setBounds(12, 500, 97, 102);
		frame.getContentPane().add(btnDot);
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(func) {
					case "ADD":{
						int currValue = Integer.parseInt(answer.getText());
						answer.setText((firstNumber+currValue)+""); //숫자를 스트링값으로 바꾸는거다 +""을 통해서
						break;
					}
					case "SUB":{
						int currValue = Integer.parseInt(answer.getText());
						answer.setText((firstNumber-currValue)+""); //숫자를 스트링값으로 바꾸는거다 +""을 통해서
						break;
					}
					case "MULT":{
						int currValue = Integer.parseInt(answer.getText());
						answer.setText((firstNumber*currValue)+""); //숫자를 스트링값으로 바꾸는거다 +""을 통해서
						break;
					}
					case "DIV":{
						int currValue = Integer.parseInt(answer.getText());
						answer.setText((firstNumber/currValue)+""); //숫자를 스트링값으로 바꾸는거다 +""을 통해서
						break; 
					}

				}
			}
		});
		btnEnter.setFont(new Font("굴림", Font.BOLD, 40));
		btnEnter.setBounds(230, 500, 97, 102);
		frame.getContentPane().add(btnEnter);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func="DIV";
			}
		});
		btnDiv.setFont(new Font("굴림", Font.BOLD, 40));
		btnDiv.setBounds(339, 500, 97, 102);
		frame.getContentPane().add(btnDiv);
		
		btn1.addActionListener(new NumberActionListener(answer,"1"));
		btn2.addActionListener(new NumberActionListener(answer,"2"));
		btn3.addActionListener(new NumberActionListener(answer,"3"));
		btn4.addActionListener(new NumberActionListener(answer,"4"));
		btn5.addActionListener(new NumberActionListener(answer,"5"));
		btn6.addActionListener(new NumberActionListener(answer,"6"));
		btn7.addActionListener(new NumberActionListener(answer,"7"));
		btn8.addActionListener(new NumberActionListener(answer,"8"));
		btn9.addActionListener(new NumberActionListener(answer,"9"));
	}
}

class NumberActionListener implements ActionListener{
	private JLabel label;
	private String text;
	
	public NumberActionListener(JLabel l, String s) {
		label = l;
		text = s;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String curr = label.getText();
		if(curr.equals("0")) {
			label.setText(text);
		}else {
			label.setText(label.getText()+text);
		}
		
	}
	
}
