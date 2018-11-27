import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class Presenty implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t,t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3,b4,b5;
	Font f1,f2,f3;
	JMenuBar mb;
	JMenu m1,m2,m3;
	JMenuItem mn1,mn2,mn3,mn4,mn5,mn6,mn7,mn8,mn9,mn10;
	JTable tab;
	JScrollPane jsp;
	DefaultTableModel model;
	Statement stmt;
	String sql,s[];
	Connection con;
	ResultSet rs;
	Statement stmt1;
	String sql1;
	Connection conn;

				
	
	public Presenty()
	{
		f=new JFrame("Mess Information");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,23);
		f2=new Font("Arial",Font.ITALIC,100);
		f3=new Font("Arial",Font.PLAIN,20);
		f.setLayout(null);
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		l=new JLabel("Date:");
		l.setFont(f1);
		l.setForeground(Color.MAGENTA);
		l.setBounds(1060,10,100,30);
		f.add(l);
		
		t=new JTextField(10);
		t.setText(sdf.format(d));
		t.setFont(f3);
		t.setBounds(1140,10,120,30);
		t.setEditable(false);
		f.add(t);
		
		mb=new JMenuBar();
		
		m1=new JMenu("File");
		
		mn1=new JMenuItem("New");
		mn2=new JMenuItem("Open");
		mn3=new JMenuItem("Save");
		mn4=new JMenuItem("Save As");
		mn5=new JMenuItem("Print");
		mn6=new JMenuItem("Exit");
		
		m1.add(mn1);
		m1.add(mn2);
		m1.add(mn3);
		m1.add(mn4);	
		m1.add(mn5);
		m1.add(mn6);
		
		m2=new JMenu("Edit");
		mn7=new JMenuItem("Edit");
		m2.add(mn7);
		
		m3=new JMenu("Help");
		mn8=new JMenuItem("Help");
		m3.add(mn8);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		f.setJMenuBar(mb);
		
		tab=new JTable();
		tab.setBackground(Color.CYAN);
		jsp=new JScrollPane(tab);
		jsp.setBounds(50,50,1100,600);
		jsp.setVisible(false);
		f.add(jsp);
		
		model=new DefaultTableModel();
		model.addColumn("ID no");
		model.addColumn("Student Name");
		model.addColumn("Class");
		model.addColumn("Present(A/P)");
		tab.setModel(model);
		
		l1=new JLabel("ID no:");
		l1.setFont(f1);
		l1.setForeground(Color.BLUE);
		l1.setBounds(100,100,100,30);
		l1.setVisible(false);
		f.add(l1);
		
		l2=new JLabel("Student Name:");
		l2.setFont(f1);
		l2.setForeground(Color.BLUE);
		l2.setBounds(210,100,250,30);
		l2.setVisible(false);
		f.add(l2);
		
		l3=new JLabel("Class:");
		l3.setFont(f1);
		l3.setForeground(Color.BLUE);
		l3.setBounds(470,100,100,30);
		l3.setVisible(false);
		f.add(l3);
		
		l4=new JLabel("Roomno:");
		l4.setFont(f1);
		l4.setForeground(Color.BLUE);
		l4.setBounds(580,100,130,30);
		l4.setVisible(false);
		f.add(l4);
		
		l5=new JLabel("Present(A/P):");
		l5.setFont(f1);
		l5.setForeground(Color.BLUE);
		l5.setBounds(720,100,250,30);
		l5.setVisible(false);
		f.add(l5);
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(100,140,100,30);
		t1.setEditable(false);
		t1.setVisible(false);
		f.add(t1);
		
		t2=new JTextField(10);
		t2.setFont(f3);
		t2.setBounds(210,140,250,30);
		t2.setEditable(false);
		t2.setVisible(false);
		f.add(t2);
		
		t3=new JTextField(10);
		t3.setFont(f3);
		t3.setBounds(470,140,100,30);
		t3.setEditable(false);
		t3.setVisible(false);
		f.add(t3);
		
		t4=new JTextField(10);
		t4.setFont(f3);
		t4.setBounds(580,140,130,30);
		t4.setEditable(false);
		t4.setVisible(false);
		f.add(t4);
		
		t5=new JTextField(10);
		t5.setFont(f3);
		t5.setBounds(720,140,250,30);
		t5.setVisible(false);
		f.add(t5);
		
			
		
		b1=new JButton("Next");
		b1.setFont(f1);
		b1.setBounds(975,140,150,30);
		b1.setVisible(false);
		f.add(b1);
		
		b2=new JButton("Add Date");
		b2.setFont(f1);
		b2.setBounds(100,70,170,30);
		b2.setVisible(false);
		f.add(b2);
		
		mn1.addActionListener(this);
		mn2.addActionListener(this);
		mn3.addActionListener(this);
		mn4.addActionListener(this);
		mn5.addActionListener(this);
		mn6.addActionListener(this);
		mn7.addActionListener(this);
		mn8.addActionListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setResizable(false);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==mn1)
		{
			boolean flag=false;
	  		 s=new String[5];
			jsp.setVisible(false);
			l1.setVisible(true);
			l2.setVisible(true);
			l3.setVisible(true);
			l4.setVisible(true);
			l5.setVisible(true);
			t1.setVisible(true);
			t2.setVisible(true);
			t3.setVisible(true);
			t4.setVisible(true);
			t5.setVisible(true);
			b1.setVisible(true);
			b2.setVisible(true);
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("\n Record inserted successfully....");
				 con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
			
				 stmt=con.createStatement();
				 sql="select * from PresentySheet";
		
				 rs=stmt.executeQuery(sql);
				
				if(rs.next())
				{
					s[0]=""+rs.getInt(1);
					s[1]=rs.getString(2);
					s[2]=rs.getString(3);
					s[3]=rs.getString(4);
					s[4]=""+rs.getInt(5);
					
					t1.setText(s[0]);
					t2.setText(s[1]);
					t3.setText(s[2]);
					t4.setText(s[4]);	
				}
			
			}
			catch(Exception ee)
			{
				System.out.println(ee);
				
			}
		}
		if(e.getSource()==b1)
		{
			
			try
			{
				System.out.println("hi in");
				if(rs.next())
				{
					
						System.out.println("hi in");
				
						int id=Integer.parseInt(s[0]);
						String present=t5.getText();
						try
						{
							
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
							//System.out.println("\n Record inserted successfully....");
							 conn=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
			
							 stmt1=conn.createStatement();
							 
							 int n=stmt1.executeUpdate(sql1);
							 
							if(n==0)
							{
								
								JOptionPane.showMessageDialog(null,"Update Failed....","Update Failed",JOptionPane.ERROR_MESSAGE);	
							}
							else
							{
								
								JOptionPane.showMessageDialog(null,"Update Information Successfully....","Update Successful",JOptionPane.PLAIN_MESSAGE);
									
							}
						con.close();	
					}
					catch(Exception eee)
					{
						System.out.println(eee);
					}	
					s[0]=""+rs.getInt(1);
					s[1]=rs.getString(2);
					s[2]=rs.getString(3);
					s[3]=rs.getString(4);
					s[4]=""+rs.getInt(5);
					
					t1.setText(s[0]);
					t2.setText(s[1]);
					t3.setText(s[2]);
					t4.setText(s[4]);
				
					//model.addRow(s);		
				}
				else
				{
				con.close();
				conn.close();	
				}
			
			}
			catch(Exception ee)
			{
				System.out.println(ee);	
			}
		}
		
		/////////////
		/* Add date*/
		if(e.getSource()==b2)
		{
			String date=t.getText();
			System.out.println("\n date is:"+date);
			try
			{
				 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				
				 Connection con2=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
				 
				 Statement stmt2=con2.createStatement();
				 String s="Number";
				 String sql2="ALTER TABLE PresentySheet ADD dt"+s;
				 
				 int n=stmt2.executeUpdate(sql2);
				 System.out.println("\n Record inserted successfully....");
				if(n==0)
				{
					JOptionPane.showMessageDialog(null,"Create Column Failed...."," Failed",JOptionPane.ERROR_MESSAGE);	
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Created Column Successfully....","Column Successful",JOptionPane.PLAIN_MESSAGE);
				}
				con2.close();
			}
			catch(Exception eeee)
			{
				System.out.println(eeee);
			}
		}
		////	
	}
}
class PresentyDemo
{
	public static void main(String arg[])
	{
		new Presenty();
	}
}