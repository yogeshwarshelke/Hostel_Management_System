import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class UP implements ActionListener,KeyListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t3,t4;
	JPasswordField t2;
	JButton b1,b2,b3;
	Font f1,f2,f3;
	
	public UP()
	{
		f=new JFrame("Login Form");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,22);
		f2=new Font("Arial",Font.ITALIC,100);
		f3=new Font("Arial",Font.PLAIN,16);
		f.setLayout(null);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    JLabel b=new JLabel(new ImageIcon("D:\\Java Programs 2nd Sem\\cricket images\\2.jpg"));
		f.add(b);
		b.setBounds(0,0,1366,768);
		
		l3=new JLabel("Hostel Managment System");
		l3.setFont(f2);
		l3.setForeground(Color.RED);
		l3.setBounds(50,115,1300,110);
		b.add(l3);
		
		l1=new JLabel("UserName:");
		l1.setFont(f1);
		l1.setForeground(Color.CYAN);
		l1.setBounds(435,314,150,30);
		b.add(l1);
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(600,315,150,30);
		b.add(t1);
		
		l2=new JLabel("Password:");
		l2.setFont(f1);
		l2.setForeground(Color.CYAN);
		l2.setBounds(435,380,150,30);
		b.add(l2);
		
		
		t2=new JPasswordField();
		t2.setEchoChar('*');
		t2.setFont(f3);
		t2.setBounds(600,380,150,30);
		b.add(t2);
		
		/* Date */
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
		
		l4=new JLabel("Date:");
		l4.setFont(f1);
		l4.setForeground(Color.CYAN);
		l4.setBounds(50,20,100,30);
		b.add(l4);
		
		t3=new JTextField(10);
		t3.setText(sdf.format(d));
		t3.setFont(f3);
		t3.setBounds(120,20,100,30);
		t3.setEditable(false);
		b.add(t3);
		
		l5=new JLabel("Time:");
		l5.setFont(f1);
		l5.setForeground(Color.CYAN);
		l5.setBounds(1130,20,100,30);
		b.add(l5);
		
		t4=new JTextField(10);
		t4.setText(sdf1.format(d));
		t4.setFont(f3);
		t4.setBounds(1200,20,100,30);
		t4.setEditable(false);
		b.add(t4);
		
		b1=new JButton("Login");
		b1.setBounds(430,450,150,40);
		b.add(b1);
		
		b2=new JButton("Exit");
		b2.setBounds(600,450,150,40);
		b.add(b2);
		
		b3=new JButton("Change UserName & Password");
		b3.setBounds(990,700,300,30);
		b.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		t1.addKeyListener(this);
		t2.addKeyListener(this);
		t3.addKeyListener(this);
		t4.addKeyListener(this);
		f.setResizable(false);
		f.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e)
	{
		int flag=0;
		/* Login */
		if(e.getSource()==b1)
		{
			String user=t1.getText();
			String pass=t2.getText();
			
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
				Statement stmt=con.createStatement();
				
				String sql="select * from Password";

				ResultSet rs=stmt.executeQuery(sql);
					
				while(rs.next())
				{
					String username=rs.getString(1);
					String pass1=rs.getString(2);
					if(username.equals(user) && pass1.equals(pass))
					{
						flag=1;
					}
					else
					{
						flag=0;
					}
				}
				if(flag==1)
				{
					JOptionPane.showMessageDialog(null,"Login Successfully..","Login",JOptionPane.PLAIN_MESSAGE);
					f.setVisible(false);
					new HostelInfo();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Login Failed..","Change",JOptionPane.PLAIN_MESSAGE);
					t1.setText("");
					t2.setText("");
				}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
		
		}
		/* Exit */
		if(e.getSource()==b2)
		{
			int p=JOptionPane.showConfirmDialog(null,"Are you Sure Exit..","Exit",JOptionPane.YES_NO_OPTION);
			if(p==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null,"Thank you for Use System...","Exit",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
		/* Change password new page */
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new ChangePassword();
		}
	}
	public void keyPressed(KeyEvent k)
	{
		if((k.getKeyCode()==KeyEvent.VK_X) && ((k.getModifiers()&KeyEvent.CTRL_MASK)!=0))
		{
			int p=JOptionPane.showConfirmDialog(null,"Are you Sure Exit System","Confirm",JOptionPane.YES_NO_OPTION);
			if(p==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null,"Thank you for Use System...","Exit",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
		if((k.getKeyCode()==KeyEvent.VK_C) && ((KeyEvent.CTRL_MASK)!=0))
		{
			f.setVisible(false);
			new ChangePassword();
		}
	}
	public void keyReleased(KeyEvent k)
	{
	}
	public void keyTyped(KeyEvent k)
	{
	}
}

class UPD
{
	public static void main(String arg[])
	{
		new UP();
	}
}