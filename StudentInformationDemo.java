import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.*;

class StudentInformation implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	Font f1,f2,f3;
	public StudentInformation()
	{
		f=new JFrame("Student Information");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,22);
		f2=new Font("Arial",Font.ITALIC,100);
		f3=new Font("Arial",Font.PLAIN,20);
		f.setLayout(null);
		
		/* Back Button */
		b=new JButton("Back");
		b.setFont(f1);
		b.setBounds(0,0,120,40);
		f.add(b);
		
		l1=new JLabel("Student Information Search:");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		l1.setBounds(380,50,450,40);
		f.add(l1);
		
		b1=new JButton("Search");
		b1.setFont(f1);
		b1.setBounds(750,50,150,40);
		f.add(b1);
		
		l2=new JLabel("Student Update Information:");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		l2.setBounds(380,130,450,40);
		f.add(l2);
		
		
		b2=new JButton("Update");
		b2.setFont(f1);
		b2.setBounds(750,130,150,40);
		f.add(b2);
		
		l3=new JLabel("Student Delete Information:");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		l3.setBounds(380,210,450,50);
		f.add(l3);
		
		b3=new JButton("Delete");
		b3.setFont(f1);
		b3.setBounds(750,210,150,40);
		f.add(b3);
		
		
	/* Start Search Information  */	
		b4=new JButton("ID Wise Search");
		b4.setFont(f1);
		b4.setBounds(300,290,300,40);
		f.add(b4);
		b4.setVisible(false);
		
		b5=new JButton("Name Wise Search");
		b5.setFont(f1);
		b5.setBounds(610,290,300,40);
		f.add(b5);
		b5.setVisible(false);
		
		b6=new JButton("Room Wise Search");
		b6.setFont(f1);
		b6.setBounds(300,370,300,40);
		f.add(b6);
		b6.setVisible(false);
		
		b7=new JButton("Class Wise Search");
		b7.setFont(f1);
		b7.setBounds(610,370,300,40);
		f.add(b7);
		b7.setVisible(false);
		
		b20=new JButton("All Student Info");
		b20.setFont(f1);
		b20.setBounds(455,450,300,40);
		f.add(b20);
		b20.setVisible(false);
		
		
		
		//////////////////////////////////ID Wise
		l4=new JLabel("Enter Student Id:");
		l4.setFont(f1);
		l4.setForeground(Color.BLUE);
		l4.setBounds(320,500,250,40);
		f.add(l4);
		l4.setVisible(false);
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(570,500,200,40);
		f.add(t1);
		t1.setVisible(false);
		
		b8=new JButton("Submit");
		b8.setFont(f1);
		b8.setBounds(320,550,200,40);
		f.add(b8);
		b8.setVisible(false);
		
		
		//Name Wise
		l5=new JLabel("Enter Student Name:");
		l5.setFont(f1);
		l5.setForeground(Color.BLUE);
		l5.setBounds(320,500,300,40);
		f.add(l5);
		l5.setVisible(false);
		
		t2=new JTextField(10);
		t2.setFont(f3);
		t2.setBounds(620,500,200,40);
		f.add(t2);
		t2.setVisible(false);
		
		b9=new JButton("Submit");
		b9.setFont(f1);
		b9.setBounds(320,550,200,40);
		f.add(b9);
		b9.setVisible(false);
		
		//Room Wise
		l6=new JLabel("Enter Student Room:");
		l6.setFont(f1);
		l6.setForeground(Color.BLUE);
		l6.setBounds(320,500,300,40);
		f.add(l6);
		l6.setVisible(false);
		
		t3=new JTextField(10);
		t3.setFont(f3);
		t3.setBounds(620,500,200,40);
		f.add(t3);
		t3.setVisible(false);
		
		b10=new JButton("Submit");
		b10.setFont(f1);
		b10.setBounds(320,550,200,40);
		f.add(b10);
		b10.setVisible(false);
		
		
		//Class Wise
		l7=new JLabel("Enter Student Class:");
		l7.setFont(f1);
		l7.setForeground(Color.BLUE);
		l7.setBounds(320,500,300,40);
		f.add(l7);
		l7.setVisible(false);
		
		t4=new JTextField(10);
		t4.setFont(f3);
		t4.setBounds(620,500,200,40);
		f.add(t4);
		t4.setVisible(false);
		
		b11=new JButton("Submit");
		b11.setFont(f1);
		b11.setBounds(320,550,200,40);
		f.add(b11);
		b11.setVisible(false);
	/*  Complete Search Information  */	
	
	
	
	
	/* Start Update Information  */
		b12=new JButton("ID Wise Update");
		b12.setFont(f1);
		b12.setBounds(300,290,300,40);
		f.add(b12);
		b12.setVisible(false);
		
		b13=new JButton("Name Wise Update");
		b13.setFont(f1);
		b13.setBounds(610,290,300,40);
		f.add(b13);
		b13.setVisible(false);
		
		b14=new JButton("Room Wise Update");
		b14.setFont(f1);
		b14.setBounds(300,370,300,40);
		f.add(b14);
		b14.setVisible(false);
		
		b15=new JButton("Class Wise Update");
		b15.setFont(f1);
		b15.setBounds(610,370,300,40);
		f.add(b15);
		b15.setVisible(false);
		
		//ID Wise
		l8=new JLabel("Enter Student Id:");
		l8.setFont(f1);
		l8.setForeground(Color.BLUE);
		l8.setBounds(320,500,250,40);
		f.add(l8);
		l8.setVisible(false);
		
		t5=new JTextField(10);
		t5.setFont(f3);
		t5.setBounds(570,500,200,40);
		f.add(t5);
		t5.setVisible(false);
		
		b16=new JButton("Submit");
		b16.setFont(f1);
		b16.setBounds(320,550,200,40);
		f.add(b16);
		b16.setVisible(false);
		
		
		//Name Wise
		l9=new JLabel("Enter Student Name:");
		l9.setFont(f1);
		l9.setForeground(Color.BLUE);
		l9.setBounds(320,500,300,40);
		f.add(l9);
		l9.setVisible(false);
		
		t6=new JTextField(10);
		t6.setFont(f3);
		t6.setBounds(620,500,200,40);
		f.add(t6);
		t6.setVisible(false);
		
		b17=new JButton("Submit");
		b17.setFont(f1);
		b17.setBounds(320,550,200,40);
		f.add(b17);
		b17.setVisible(false);
		
		//Room Wise
		l10=new JLabel("Enter Student Room:");
		l10.setFont(f1);
		l10.setForeground(Color.BLUE);
		l10.setBounds(320,500,300,40);
		f.add(l10);
		l10.setVisible(false);
		
		t7=new JTextField(10);
		t7.setFont(f3);
		t7.setBounds(620,500,200,40);
		f.add(t7);
		t7.setVisible(false);
		
		b18=new JButton("Submit");
		b18.setFont(f1);
		b18.setBounds(320,550,200,40);
		f.add(b18);
		b18.setVisible(false);
		
		
		//Class Wise
		l11=new JLabel("Enter Student Class:");
		l11.setFont(f1);
		l11.setForeground(Color.BLUE);
		l11.setBounds(320,500,300,40);
		f.add(l11);
		l11.setVisible(false);                                   
		
		t8=new JTextField(10);
		t8.setFont(f3);
		t8.setBounds(620,500,200,40);
		f.add(t8);
		t8.setVisible(false);
		
		b19=new JButton("Submit");
		b19.setFont(f1);
		b19.setBounds(320,550,200,40);
		f.add(b19);
		b19.setVisible(false);
	/*  Complete Update Information  */	
	
		

		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		
		f.setResizable(false);
		f.setVisible(true);	
		
	}
	public void actionPerformed(ActionEvent e)
	{
		/* Back Button */
		if(e.getSource()==b)
		{
			f.setVisible(false);
			new HostelInfo();
		}
		
		/*  Search Update Delete */
		if(e.getSource()==b1)
		{
			b4.setVisible(true);
			b5.setVisible(true);
			b6.setVisible(true);
			b7.setVisible(true);
			b20.setVisible(true);
		}
		if(e.getSource()==b2)
		{
			b12.setVisible(true);
			b13.setVisible(true);
			b14.setVisible(true);
			b15.setVisible(true);
		}
		if(e.getSource()==b3)
		{
			
		}
		
		/* Search Information */
		if(e.getSource()==b4)
		{
			f.setVisible(false);
			new IDSearch();
		}
		if(e.getSource()==b5)
		{
			f.setVisible(false);
			new NameSearch();
		}
		if(e.getSource()==b6)
		{
			f.setVisible(false);
			new RoomSearch();
		}
		if(e.getSource()==b7)
		{
			f.setVisible(false);
			new ClassSearch();
		}
		if(e.getSource()==b8)
		{
			
		}
		if(e.getSource()==b9)
		{
			
		}
		if(e.getSource()==b10)
		{
			
		}
		if(e.getSource()==b11)
		{
			
		}
		
		/* Update Information */
		if(e.getSource()==b12)
		{
			f.setVisible(false);
			new IDUpdate();
		}
		if(e.getSource()==b13)
		{
			f.setVisible(false);
			new NameUpdate();
		}
		if(e.getSource()==b14)
		{
			l10.setVisible(true);
			t7.setVisible(true);
			//Submit
			b18.setVisible(true);
		}
		if(e.getSource()==b15)
		{
			l11.setVisible(true);
			t8.setVisible(true);
			//Submit
			b19.setVisible(true);
		}
		if(e.getSource()==b16)
		{
			
		}
		if(e.getSource()==b17)
		{
			
		}
		if(e.getSource()==b18)
		{
			
		}
		if(e.getSource()==b19)
		{
			
		}
		if(e.getSource()==b20)
		{
			f.setVisible(false);
			new AllStudentSearch();
		}
		
	}
}
class StudentInformationDemo
{
	public static void main(String arg[])
	{
		new StudentInformation();
	}
}