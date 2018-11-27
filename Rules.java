import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import  java.awt.color.*;
import javax.swing.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;
class RulesDemo implements ActionListener 
{
	
	JFrame f;
	JButton b,b1,b2,b3;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	Font f1,f3;
	
	RulesDemo()
	{
		f=new JFrame("RULES");
		f.setSize(1366,768);
		f.getContentPane().setBackground(Color.BLACK);
		
		
		f1=new Font("Arial",Font.BOLD,30);
		f3=new Font("Arial",Font.BOLD,30);
		
		f.setLayout(null);
		
			/* Date */
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
		
		l1=new JLabel("..* RULES *..");
		l1.setFont(f1);
		l1.setForeground(Color.PINK);
		l1.setBounds(500,30,400,50);
		f.add(l1);
		
		l2=new JLabel("* I Card Of Hostel Students Are Compulsary");
		l2.setFont(f3);
		l2.setForeground(Color.magenta);
		l2.setBounds(250,100,1000,50);
		f.add(l2);
		
		l3=new JLabel("* Dicipline Is Most Important For All Students");
		l3.setFont(f3);
		l3.setForeground(Color.RED);
		l3.setBounds(250,150,1000,50);
		f.add(l3);
		
		l4=new JLabel("* Presenty Is Compulsary For All Students");
		l4.setFont(f3);
		l4.setForeground(Color.magenta);
		l4.setBounds(250,200,1000,50);
		f.add(l4);
		
		l5=new JLabel("* All Students Are In Hostels After 9 PM");
		l5.setFont(f3);
		l5.setForeground(Color.RED);
		l5.setBounds(250,250,1000,50);
		f.add(l5);
		
		l6=new JLabel("* When Students Release The Hostel Then Application Form Is Compulsary ");
		l6.setFont(f3);
		l6.setForeground(Color.magenta);
		l6.setBounds(250,300,1000,50);
		f.add(l6);
		
		l7=new JLabel("* When Students Release The Hostel Then Note Your Absenty Report  ");
		l7.setFont(f3);
		l7.setForeground(Color.RED);
		l7.setBounds(250,350,1000,50);
		f.add(l7);
		
		l8=new JLabel("* Rooms Must Be Clean");
		l8.setFont(f3);
		l8.setForeground(Color.magenta);
		l8.setBounds(250,400,1000,50);
		f.add(l8);
		
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(250,100,1000,50);
		t1.setVisible(false);
		f.add(t1);
	
		
		b1=new JButton("Edit");
		b1.setFont(f3);
		b1.setForeground(Color.RED);
		b1.setBounds(250,460,120,30);
		f.add(b1);
		
			
		b2=new JButton("Update");
		b2.setFont(f3);
		b2.setForeground(Color.magenta);
		b2.setBounds(380,460,150,30);
		//b2.setVisible(false);
		f.add(b2);
		
		b=new JButton("Back");
		b.setBounds(0,0,100,30);
		//b.setFont(f3);
		//b.setVisible(false);
		f.add(b);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
				
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
			if(e.getSource()==b1)
			{
				String str1=l2.getText();
				l2.setVisible(false);
				t1.setVisible(true);
				t1.setText(str1);
				
			}
			if(e.getSource()==b2)
			{
				
				String str1=t1.getText();
				l2.setText(str1);
				int n=JOptionPane.showConfirmDialog(null,"Are you sure update...","Confirmation",JOptionPane.YES_NO_OPTION);
				if(n==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null,"Update Successfully...","Update",JOptionPane.PLAIN_MESSAGE);
					t1.setVisible(false);
					l2.setVisible(true);
				}
			
			
			}
		}
}
class Rules
{
	public static void main(String a[])
	{
		new RulesDemo();
	}
}