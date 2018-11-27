import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class ChangePassword implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t2,t5;
	JPasswordField t1,t3,t4;
	JButton b1,b2,b3,b4,b5,b6;
	Font f1,f2,f3;
	
	public ChangePassword()
	{
		f=new JFrame("Change Password");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,23);
		f2=new Font("Arial",Font.ITALIC,50);
		f3=new Font("Arial",Font.PLAIN,16);
		f.setLayout(null);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		l=new JLabel("...Change UserName & Password...");
		l.setFont(f2);	
		l.setForeground(Color.ORANGE);
		l.setBounds(250,50,800,50);
		f.add(l);
		
		l1=new JLabel("Current Password:");
		l1.setFont(f1);	
		l1.setForeground(Color.BLUE);
		l1.setBounds(350,150,250,30);
		f.add(l1);
	    
	    t1=new JPasswordField(10);
	    t1.setFont(f3);
	    t1.setBounds(600,150,200,30);
	    f.add(t1);
	    
	    b1=new JButton("Change");
	    b1.setFont(f1);
	    b1.setBounds(400,185,150,30);
	    f.add(b1);
	    
	    l4=new JLabel("Enter New UserName & Password");
		l4.setFont(f1);	
		l4.setForeground(Color.PINK);
		l4.setBounds(350,240,700,30);
		l4.setVisible(false);
		f.add(l4);
		
	 /*	l5=new JLabel("Wrong Current Password...");
		l5.setFont(f1);	
		l5.setForeground(Color.PINK);
		l5.setBounds(350,240,700,30);
		l5.setVisible(false);
		f.add(l5);
	 */  
	    l2=new JLabel("New UserName:");
		l2.setFont(f1);	
		l2.setForeground(Color.BLUE);
		l2.setBounds(350,300,250,30);
		l2.setVisible(false);
		f.add(l2);
	    
	    t2=new JTextField(10);
	    t2.setFont(f3);
	    t2.setBounds(600,300,200,30);
	    t2.setVisible(false);
	    f.add(t2);
	    
	    l3=new JLabel("New Password:");
		l3.setFont(f1);	
		l3.setForeground(Color.BLUE);
		l3.setBounds(350,350,250,30);
		l3.setVisible(false);
		f.add(l3);
	    
	    t3=new JPasswordField(10);
	    t3.setFont(f3);
	    t3.setBounds(600,350,200,30);
	    t3.setVisible(false);
	    f.add(t3);
	    
	    l8=new JLabel("4");
		l8.setFont(f1);	
		l8.setForeground(Color.GRAY);
		l8.setBounds(805,350,250,30);
		l8.setVisible(false);
		f.add(l8);
	    
	    l6=new JLabel("Pin Number:");
		l6.setFont(f1);	
		l6.setForeground(Color.BLUE);
		l6.setBounds(350,400,250,30);
		l6.setVisible(false);
		f.add(l6);
	    
	    t4=new JPasswordField(10);
	    t4.setFont(f3);
	    t4.setBounds(600,400,200,30);
	    t4.setVisible(false);
	    f.add(t4);
	    
	    l9=new JLabel("4");
		l9.setFont(f1);	
		l9.setForeground(Color.GRAY);
		l9.setBounds(805,400,250,30);
		l9.setVisible(false);
		f.add(l9);
	        
	    b2=new JButton("Submit");
	    b2.setFont(f1);
	    b2.setBounds(400,450,150,30);
	    b2.setVisible(false);
	    f.add(b2);
	    
	    b3=new JButton("Clear");
	    b3.setFont(f1);
	    b3.setBounds(570,450,150,30);
	    b3.setVisible(false);
	    f.add(b3);
	    
	    b4=new JButton("Back");
	    b4.setFont(f1);
	    b4.setBounds(0,0,120,40);
	    //b4.setVisible(false);
	    f.add(b4);
	    
	    b5=new JButton("Forgot Password");
	    b5.setFont(f1);
	    b5.setBounds(560,185,200,30);
	    f.add(b5);
	    
	    l7=new JLabel("Current Pin no:");
		l7.setFont(f1);	
		l7.setForeground(Color.BLUE);
		l7.setBounds(350,150,250,30);
		l7.setVisible(false);
		f.add(l7);
	    
	    b6=new JButton("CHANGE");
	    b6.setFont(f3);
	    b6.setBounds(400,185,150,30);
	    b6.setVisible(false);
	    f.add(b6);
	    
	   /* l10=new JLabel("Gap Aai Ghala...");
		l10.setFont(f1);	
		l10.setForeground(Color.PINK);
		l10.setBounds(450,240,700,30);
		l10.setVisible(false);
		f.add(l10);
	    */
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		f.setResizable(false);
		f.setVisible(true);	
	}
	
	/*********************  Action Performed(Button)  *************************/
	public void actionPerformed(ActionEvent e)
	{	
		/* Change */
		if(e.getSource()==b1)
		{
			String pass=t1.getText();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
				Statement stmt=con.createStatement();
				String sql="select * from Password";

				ResultSet rs=stmt.executeQuery(sql);
					
				while(rs.next())
				{
					String pass1=rs.getString(2);
					if(pass1.equals(pass))
					{
						l1.setEnabled(false);
						t1.setEnabled(false);
						b1.setEnabled(false);
						b5.setEnabled(false);
						//l5.setVisible(false);
					
						l4.setVisible(true);
						l2.setVisible(true);
						t2.setVisible(true);
						l3.setVisible(true);
						t3.setVisible(true);
						l6.setVisible(true);
						t4.setVisible(true);
						b2.setVisible(true);
						b3.setVisible(true);
						b4.setVisible(true);
						l3.setVisible(true);
						l8.setVisible(true);
						l9.setVisible(true);
						
					}
					else
					{
						//l5.setVisible(true);
						JOptionPane.showMessageDialog(null,"Password Wrong..","Wrong",JOptionPane.ERROR_MESSAGE);
						t1.setText("");
					}
				}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
			
		}
		/* Submit */
		if(e.getSource()==b2)
		{
			String pass=t1.getText();
			String user=t2.getText();
			String npass=t3.getText();
			String pin1=t4.getText();
			// System.out.println("\n User:"+user+"pass:"+npass+"pin"+pin1);
			if(npass.length()>=4 && pin1.length()>=4 && user.length()>0)
			{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
				Statement stmt=con.createStatement();
				String sql="update Password set username='"+user+"',pass='"+npass+"',pinno='"+pin1+"'";//where pass='"+pass+"'";
				int n1=stmt.executeUpdate(sql);
				if(n1==0)
				{
					//System.out.println(e);
					JOptionPane.showMessageDialog(null,"Update Failed..","Failed",JOptionPane.PLAIN_MESSAGE);	
					
				}
				else
				{
				int p=JOptionPane.showConfirmDialog(null,"Are you sure Update Username & Password....","Confirm",JOptionPane.YES_NO_OPTION);
				if(p==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null,"Update UserName & Password Successfully..","Change",JOptionPane.PLAIN_MESSAGE);	
					f.setVisible(false);
					new UP();
				}
				}
			con.close();
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Character must be greater than 4","Error",JOptionPane.ERROR_MESSAGE);
			}	
		}
		/* Clear */
		if(e.getSource()==b3)
		{
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		/* New page */	
		if(e.getSource()==b4)
		{
			f.setVisible(false);
			new UP();
		}
		/* Forgate password */
		if(e.getSource()==b5)
		{
			b1.setVisible(false);
			l1.setVisible(false);
		//	t1.setVisible(true);
			l7.setVisible(true);
		//	t5.setVisible(false);
			b6.setVisible(true);
			b5.setEnabled(false);
		}
		/* Change1 */
		if(e.getSource()==b6)
		{
			String pass=t1.getText();
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
				Statement stmt=con.createStatement();
				String sql="select * from Password";

				ResultSet rs=stmt.executeQuery(sql);
					
				while(rs.next())
				{
					String pin=rs.getString(3);
					if(pin.equals(pass))
					{
						l1.setEnabled(false);
						t1.setEnabled(false);
						b1.setEnabled(false);
						b6.setEnabled(false);
						//l5.setVisible(false);
					
						l4.setVisible(true);
						l2.setVisible(true);
						t2.setVisible(true);
						l3.setVisible(true);
						t3.setVisible(true);
						l6.setVisible(true);
						t4.setVisible(true);
						b2.setVisible(true);
						b3.setVisible(true);
						b4.setVisible(true);
						l3.setVisible(true);
						l8.setVisible(true);
						l9.setVisible(true);
						//l10.setVisible(false);
						
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Pin no Wrong..","Change",JOptionPane.ERROR_MESSAGE);	
						//l10.setVisible(true);
						t1.setText("");
					}
				}
				con.close();
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		}	
	
	}
}
    /* Main */
class ChangePasswordDemo
{
	public static void main(String arg[])
	{
		new ChangePassword();
	}
}