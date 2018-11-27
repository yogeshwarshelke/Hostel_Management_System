import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;

class RoomInfo implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b,b1,b2,b3,b4,b5;
	Font f1,f2,f3;
	JTable tab;
	JScrollPane jsp;
	DefaultTableModel model;
	
	public RoomInfo()
	{
		f=new JFrame("Room Information");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,23);
		f2=new Font("Arial",Font.ITALIC,100);
		f3=new Font("Arial",Font.PLAIN,20);
		f.setLayout(null);
		
		b=new JButton("Back");
		b.setBounds(0,0,100,40);
		b.setFont(f1);
		f.add(b);
		
		b1=new JButton("Total Room");
		b1.setBounds(500,200,250,40);
		b1.setFont(f1);
		f.add(b1);
		
		b2=new JButton("Available Room");
		b2.setBounds(500,250,250,40);
		b2.setFont(f1);
		f.add(b2);
		
		b3=new JButton("Room Search");
		b3.setBounds(500,300,250,40);
		b3.setFont(f1);
		f.add(b3);
		
		b4=new JButton(" Edit Room");
		b4.setBounds(500,350,250,40);
		b4.setFont(f1);
		f.add(b4);
		
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
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
			int totalroom=0;
			int flag=0;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");	
				//System.out.println("\n Record inserted successfully....");
				String str="select * from RoomDetails";
			
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(str);
				while(rs.next())
				{
					totalroom=rs.getInt(1);
					//t2.setText(""+rs.getInt(2));
					//t3.setText(""+rs.getInt(3));
					flag=1;
				}
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null,"Record not Found","Confirmation",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					int totalroom1=totalroom;
					JOptionPane.showMessageDialog(null,"Total Room:"+totalroom1,"Total Room",JOptionPane.PLAIN_MESSAGE);
				}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}
		if(e.getSource()==b2)
		{
			f.setVisible(false);
			new RoomSearch();
		}
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new RoomSearch();
		}
		if(e.getSource()==b4)
		{
			f.setVisible(false);
			new RoomDetails();
		}
		
	}
}
class RoomInfoDemo
{
	public static void main(String arg[])
	{
		new RoomInfo();
	}
}