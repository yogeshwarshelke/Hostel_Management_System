import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;

class RoomDetails implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b,b1,b2,b3,b4,b5;
	Font f1,f2,f3;
	JTable tab;
	JScrollPane jsp;
	DefaultTableModel model;
	
	public RoomDetails()
	{
		f=new JFrame("Room Details");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,23);
		f2=new Font("Arial",Font.ITALIC,100);
		f3=new Font("Arial",Font.PLAIN,20);
		f.setLayout(null);
		
		l1=new JLabel("Total Room:");
		l1.setFont(f1);
		l1.setForeground(Color.BLUE);
		l1.setBounds(400,250,250,30);
		l1.setVisible(false);
		f.add(l1);
		
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(650,250,100,30);
		t1.setVisible(false);
		f.add(t1);
		
		l2=new JLabel("Available Room:");
		l2.setFont(f1);
		l2.setForeground(Color.BLUE);
		l2.setBounds(400,290,250,30);
		l2.setVisible(false);
		f.add(l2);
		
		t2=new JTextField(10);
		t2.setFont(f3);
		t2.setBounds(650,290,100,30);
		t2.setVisible(false);
		f.add(t2);
		
		l3=new JLabel("Guest Room:");
		l3.setFont(f1);
		l3.setForeground(Color.BLUE);
		l3.setBounds(400,330,250,30);
		l3.setVisible(false);
		f.add(l3);
		
		t3=new JTextField(10);
		t3.setFont(f3);
		t3.setBounds(650,330,100,30);
		t3.setVisible(false);
		f.add(t3);
		
		b=new JButton("Back");
		b.setBounds(0,0,100,40);
		b.setFont(f1);
		f.add(b);
		
		b1=new JButton("Edit");
		b1.setBounds(110,0,100,40);
		b1.setFont(f1);
		f.add(b1);
		
		b2=new JButton("Update");
		b2.setBounds(400,370,150,40);
		b2.setFont(f1);
		b2.setVisible(false);
		f.add(b2);
		
		b3=new JButton("Clear");
		b3.setBounds(650,370,100,40);
		b3.setFont(f1);
		b3.setVisible(false);
		f.add(b3);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		//b4.addActionListener(this);
		
		f.setResizable(false);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			f.setVisible(false);
			new RoomInfo();
		}
		if(e.getSource()==b1)
		{
			int flag=0;
			l1.setVisible(true);
			t1.setVisible(true);
			l2.setVisible(true);
			t2.setVisible(true);
			l3.setVisible(true);
			t3.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			
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
					t1.setText(""+rs.getInt(1));
					t2.setText(""+rs.getInt(2));
					t3.setText(""+rs.getInt(3));
					flag=1;
					//con.close();
				}
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null,"Record not Found","Confirmation",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		
		}
		if(e.getSource()==b2)
		{
			int troom=Integer.parseInt(t1.getText());
			int avbroom=Integer.parseInt(t2.getText());
			int groom=Integer.parseInt(t3.getText());
			
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
		
				Statement stmt1=con.createStatement();
				String sql1="Update RoomDetails Set totalroom="+troom+",avbroom="+avbroom+",guestroom="+groom ;
				int n=stmt1.executeUpdate(sql1);

				if(n==0)
				{
					//System.out.println(e);
					JOptionPane.showMessageDialog(null,"Update Failed....","Update Failed",JOptionPane.ERROR_MESSAGE);	
				}
				else
				{
					int p=JOptionPane.showConfirmDialog(null,"Are your sure Update Information.","Confirm Update",JOptionPane.YES_NO_OPTION);
					if(p==JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(null,"Update Information Successfully....","Update Successful",JOptionPane.PLAIN_MESSAGE);
					}		
				}
				con.close();	
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}	
			
		}
		if(e.getSource()==b3)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
	}
}
class RoomDetailsDemo
{
	public static void main(String arg[])
	{
		new RoomDetails();
	}
}
