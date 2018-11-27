import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;

class MesInfo implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3,b4,b5;
	Font f1,f2,f3;
	JTable tab;
	JScrollPane jsp;
	DefaultTableModel model;
	
	public MesInfo()
	{
		f=new JFrame("Mess Information");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,23);
		f2=new Font("Arial",Font.ITALIC,100);
		f3=new Font("Arial",Font.PLAIN,20);
		f.setLayout(null);
		
		l=new JLabel("Mess Information");
		l.setFont(f2);
		l.setForeground(Color.RED);
		l.setBounds(100,50,1000,100);
		f.add(l); 
		
		/* Table */
		tab=new JTable();
		jsp=new JScrollPane(tab);
		jsp.setBounds(100,200,770,300);
		f.add(jsp);
		
		model=new DefaultTableModel();
		model.addColumn("Idno");
		model.addColumn("Name");
		model.addColumn("Expe");
		model.addColumn("Address");
		model.addColumn("Mobno ");
		model.addColumn("Gender");
		model.addColumn("Tiffin");
		tab.setModel(model);
		
		l1=new JLabel("*** Help ***");
		l1.setFont(f1);
		l1.setForeground(Color.PINK);
		l1.setBounds(950,100,250,40);
		f.add(l1); 
		
		l2=new JLabel("Per Month rates:");
		l2.setFont(f3);
		l2.setForeground(Color.BLUE);
		l2.setBounds(900,150,300,30);
		f.add(l2); 
		
		t1=new JTextField(10);
		t1.setText("1250 RS /-");
		t1.setFont(f3);
		t1.setBounds(1070,150,150,30);
		t1.setEditable(false);
		f.add(t1);
		
		l3=new JLabel("Nonveg per Month: ");
		l3.setFont(f3);
		l3.setForeground(Color.BLUE);
		l3.setBounds(900,180,300,30);
		f.add(l3);
		
		t2=new JTextField(10);
		t2.setText("2 or 3 ");
		t2.setFont(f3);
		t2.setBounds(1070,180,150,30);
		t2.setEditable(false);
		f.add(t2);
		
		l4=new JLabel("Sweet per Week: ");
		l4.setFont(f3);
		l4.setForeground(Color.BLUE);
		l4.setBounds(900,210,300,30);
		f.add(l4);
		
		t3=new JTextField(10);
		t3.setText("1 or 2 ");
		t3.setFont(f3);
		t3.setBounds(1070,210,150,30);
		t3.setEditable(false);
		f.add(t3);
		
		l5=new JLabel("Mess Time: ");
		l5.setFont(f3);
		l5.setForeground(Color.BLUE);
		l5.setBounds(900,240,300,30);
		f.add(l5);
		
		t4=new JTextField(10);
		t4.setText("10.00Am/7.50Pm ");
		t4.setFont(f3);
		t4.setBounds(1070,240,155,30);
		t4.setEditable(false);
		f.add(t4);
	
		l6=new JLabel(" Info MessMama : ");
		l6.setFont(f1);
		l6.setForeground(Color.GRAY);
		l6.setBounds(900,290,250,30);
		f.add(l6);
				 
		l7=new JLabel(" Id No: ");
		l7.setFont(f3);
		l7.setForeground(Color.BLUE);
		l7.setBounds(900,330,150,30);
		f.add(l7);	
		
		t5=new JTextField(10);
		t5.setFont(f3);
		t5.setBounds(1000,330,155,30);
		f.add(t5);	 
				 
		l8=new JLabel(" Id No: ");
		l8.setFont(f3);
		l8.setForeground(Color.BLUE);
		l8.setBounds(900,370,150,30);
		f.add(l8);	
		
		t6=new JTextField(10);
		t6.setFont(f3);
		t6.setBounds(1000,370,155,30);
		f.add(t6);	 		 
				 
				 
		b1=new JButton("Details");
		b1.setFont(f1);
		b1.setBounds(100,150,150,40);
		f.add(b1);
		
		b2=new JButton("Add New mess");
		b2.setFont(f1);
		b2.setBounds(620,150,250,40);
		f.add(b2);
		
		b3=new JButton("Back");
		b3.setFont(f1);
		b3.setBounds(0,0,120,40);
		f.add(b3);
		
		b4=new JButton("Search");
		b4.setFont(f1);
		b4.setBounds(1155,330,150,30);
		f.add(b4);
		
		b5=new JButton("Update");
		b5.setFont(f1);
		b5.setBounds(1155,370,150,30);
		f.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		f.setResizable(false);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		boolean flag=false;
	   if(e.getSource()==b1)
	   {
	   	
		String s[]=new String[7];
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
			
			String sql="select * from AddMess";
	
			PreparedStatement pstmt=con.prepareStatement(sql);
			//pstmt.setInt(1,rn);
		
			ResultSet rs=pstmt.executeQuery();
				
			while(rs.next())
			{
				s[0]=""+rs.getInt(1);
				s[1]=rs.getString(3);
				s[2]=rs.getString(2);
				s[3]=rs.getString(6);
				s[4]=rs.getString(8);
				s[5]=rs.getString(11);
				s[6]=""+rs.getInt(18);
				
				model.addRow(s);
				flag=true;	
			}
			con.close();
		}
	
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		if(flag==false)
		{
			l2.setVisible(true);
		}	
	  }	
	  if(e.getSource()==b2)
	  {
			f.setVisible(false);
			new NewMess();
	   }
	  if(e.getSource()==b3)
	  {
			f.setVisible(false);
			new HostelInfo();
	   }	
	  if(e.getSource()==b4)
	  {
	  		int id=Integer.parseInt(t5.getText());
			f.setVisible(false);
			new MessDisplay(id);
	   }
	  if(e.getSource()==b5)
	  {
	  		int id1=Integer.parseInt(t6.getText());
			f.setVisible(false);
			new MessUpdate(id1);
	   }	
	}
}
class MesInfoDemo
{
	public static void main(String arg[])
	{
		new MesInfo();
	}
}