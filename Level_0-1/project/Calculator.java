package calculator;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener 
{
	JButton one, two, three, four, five, six, seven, eight, nine, zero,add,sub,mult,div,mod,ce,eq,sqrt,dot,cal;
	JTextField t1;
	double v1,v2,result;
	char OP ;
	public Calculator()
	{
		setTitle("Calculator");
		setLayout(null);
		Container c = getContentPane();
		c.setBackground(Color.blue);
		t1 = new JTextField(10);
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		
		add = new JButton("+");
		sub = new JButton("-");
		mult = new JButton("*");
		div = new JButton("/");
		mod = new JButton("%");
		ce = new JButton("CE");
		eq = new JButton("=");
		sqrt = new JButton("SQ");
		dot = new JButton(".");
		cal = new JButton("Calculator");
		t1.addActionListener(this);
		add(t1);
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(213,134,145,123));
		p.add(one);
		p.add(two);
		p.add(three);
		p.add(four);
		p.add(five);
		p.add(six);
		p.add(seven);
		p.add(eight);
		p.add(nine);
		p.add(zero);
		
		p.add(add);
		p.add(sub);
		p.add(mult);
		p.add(div);
		p.add(mod);
		p.add(ce);
		p.add(sqrt);
		p.add(eq);
		p.add(dot);
		p.add(cal);
		p.setBounds(10,10,266,243);
		add(p);
		t1.setBounds(20,20,245,35);
		one.setBounds(10,50,56,25);
		two.setBounds(73,50,56,25);
		three.setBounds(134,50,56,25);
		four.setBounds(198,50,56,25);
		five.setBounds(10,80,56,25);
		six.setBounds(73,80,56,25);
		seven.setBounds(134,80,56,25);
		eight.setBounds(198,80,56,25);
		nine.setBounds(10,110,56,25);
		zero.setBounds(73,110,56,25);
		add.setBounds(134,110,56,25);
		sub.setBounds(198,110,56,25);
		mult.setBounds(10,140,56,25);
		div.setBounds(73,140,56,25);
		mod.setBounds(134,140,56,25);
		ce.setBounds(198,140,56,55);
		eq.setBounds(10,170,56,25);
		dot.setBounds(73,170,56,25);
		sqrt.setBounds(134,170,56,25);
		cal.setBounds(10,207,245,25);
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		eq.addActionListener(this);
		sqrt.addActionListener(this);
		ce.addActionListener(this);
		dot.addActionListener(this);
		cal.addActionListener(this);
		
		setSize(300,300);
		setVisible(true);
		setResizable(false);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String text = ae.getActionCommand();
		char c = text.charAt(0);
		if(Character.isDigit(c))
			t1.setText(t1.getText()+text);
		else
			if(text.equals("+"))
			{
				v1=Double.parseDouble(t1.getText());
				OP='+';
				t1.setText("");
			}
			else if(text.equals("-"))
			{
				v1=Double.parseDouble(t1.getText());
				OP='-';
				t1.setText("");	
			}
			else if(text.equals("*"))
			{
				v1=Double.parseDouble(t1.getText());
				OP='*';
				t1.setText("");	
			}
			else if(text.equals("/"))
			{
				v1=Double.parseDouble(t1.getText());
				OP='/';
				t1.setText("");	
			}
			else if(text.equals("%"))
			{
				v1=Double.parseDouble(t1.getText());
				OP='%';
				t1.setText("");	
			}
			else if(text.equals("="))
			{
				v2=Double.parseDouble(t1.getText());
				
				if(OP=='+')
					result = v1+v2;
				if(OP=='-')
					result = v1-v2;
				if(OP=='*')
					result = v1*v2;
				if(OP=='/')
					result = v1/v2;
				if(OP=='%')
					result = v1%v2;
				
				t1.setText(""+result);	
			}
		if(text.equals("CE"))
			t1.setText("");
		if(text.equals("SQ"))
		{
			if((t1.getText()).equals("1"))
			{
				System.out.println("try again");
			}
			else
			{
				v1=Double.parseDouble(t1.getText());
				double temp;
				double sr = v1/2;
				do
				{
					temp = sr;
					sr = (temp+(v1/temp))/2;
				}while((temp - sr) != 0);
				t1.setText(""+(int)sr);
			}
		}
		if(text.equals("Calculator"))
		{
			JFrame jf = new JFrame("feedback page");
			jf.setSize(600,600);
			jf.setVisible(true);
			jf.setResizable(false);
			JLabel jl = new JLabel("Write feedback here:");
			JTextField jt = new JTextField(10);
			jt.setBounds(180,50,250,100);
			jl.setBounds(50,50,250,20);
			JPanel jp = new JPanel();
			jp.setBackground(Color.gray);
			jp.add(jl);
			jp.add(jt);
			jf.add(jp);
			jp.setLayout(null);
		}
		if(text.contentEquals("."))
		{
			t1.setText((t1.getText()+"."));
		}
	}
	public static void main(String[] args)
	{
		new Calculator();
	}
}
