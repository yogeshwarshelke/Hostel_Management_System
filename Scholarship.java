import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import  java.awt.color.*;
import javax.swing.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;
class ScholarshipDemo implements ActionListener
{
	
	JFrame f;
	JButton b;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2;
//	JTextArea l1;
	Font f1,f3;
	
	ScholarshipDemo()
	{
		f=new JFrame("...* SCHOLARSHIPS *...");
		f.setSize(1366,768);
		f.getContentPane().setBackground(Color.BLACK);
		
		
		f1=new Font("Arial",Font.BOLD,50);
		f3=new Font("Arial",Font.BOLD,30);
		
		f.setLayout(null);
		
			/* Date */
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
		
		l1=new JLabel("...* SCHOLARSHIPS *...");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		l1.setBounds(450,20,800,50);
		f.add(l1);
		
		l2=new JLabel("1.Rajshree Shahu Maharaj Schlorship...");
		l2.setFont(f3);
		l2.setForeground(Color.magenta);
		l2.setBounds(400,100,700,50);
		f.add(l2);
		
		b=new JButton("Back");
		b.setBounds(0,0,100,30);
		//b.setFont(f3);
		//b.setVisible(false);
		f.add(b);
		
		b.addActionListener(this);
		

				
		f.setResizable(false);
		f.setVisible(true);	
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b)
			{
				f.setVisible(false);
				new HostelInfo();
			}
		}
}
class Scholarship
{
	public static void main(String a[])
	{
		new ScholarshilpDemo();
	}
}