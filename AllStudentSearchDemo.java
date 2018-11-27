import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;

class AllStudentSearch implements ActionListener
{
	JFrame f;
	JTable tab;
	JScrollPane jsp;
	DefaultTableModel model;
	Font f1,f2,f3;
	JButton b1,b2;
	
	public AllStudentSearch()
	{
		f=new JFrame("All Student Information");
		f.setSize(1366,768);
		 	
		f1=new Font("Arial",Font.BOLD,24);
		f2=new Font("Arial",Font.BOLD,35);
		f3=new Font("Arial",Font.PLAIN,16);
		
		f.setLayout(null);
		
		tab=new JTable();
		jsp=new JScrollPane(tab);
		jsp.setBounds(100,150,1100,300);
		f.add(jsp);
		
		model=new DefaultTableModel();
		model.addColumn("ID no");
		model.addColumn("Room no");
		model.addColumn("Date");
		model.addColumn("Student Name");
		model.addColumn("Father Name");
		model.addColumn("Mother Name");
		model.addColumn("Address");
		model.addColumn("Tal.");
		model.addColumn("Dist.");
		model.addColumn("Cast");
		model.addColumn("SubCast");
		model.addColumn("Gender");
		model.addColumn("Birth Date");
		model.addColumn("New Class");
		model.addColumn("Previous College");
		model.addColumn("Percentage");
		model.addColumn("Hostel Form");
		model.addColumn("Addmission Form");
		model.addColumn("Addmission receipt");
		model.addColumn("Adhar Card");
		model.addColumn("Mob no");
		tab.setModel(model);
		
		b1=new JButton("All Student Search Info");
		b1.setBounds(400,70,500,35);
		b1.setFont(f2);
		f.add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(0,0,120,40);
		b2.setFont(f2);
		f.add(b2);
		
		//f.setLayout(new FlowLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setResizable(false);
		f.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e)
	{  
	   if(e.getSource()==b1)
	   {
	   	boolean flag=false;
	  		   	
		String s[]=new String[21];
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
			
			Statement stmt=con.createStatement();
			String sql="select * from StudentAddmission";
			
			ResultSet rs=stmt.executeQuery(sql);
			//PreparedStatement pstmt=con.prepareStatement(sql);
			//pstmt.setInt(1,rn);
		
			//ResultSet rs=pstmt.executeQuery();
				
			while(rs.next())
			{
			
				s[0]=""+rs.getInt(1);
				s[1]=""+rs.getInt(2);
				s[2]=rs.getString(3);
				s[3]=rs.getString(4);
				s[4]=rs.getString(5);
				s[5]=rs.getString(6);
				s[6]=rs.getString(7);
				s[7]=rs.getString(8);
				s[8]=rs.getString(9);
				s[9]=rs.getString(10);
				s[10]=rs.getString(11);
				s[11]=rs.getString(12);
				s[12]=rs.getString(13);
				s[13]=rs.getString(14);
				s[14]=rs.getString(15);
				s[15]=""+rs.getInt(16);
				s[16]=rs.getString(17);
				s[17]=rs.getString(18);
				s[18]=rs.getString(19);
				s[19]=rs.getString(20);
				s[20]=rs.getString(21);
				
				model.addRow(s);
				flag=true;	
			}
			con.close();
		}
	
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		/*if(flag==false)
		{
			
		}*/
			
	  }	
	  if(e.getSource()==b2)
	  {
	  	f.setVisible(false);
	  	new StudentInformation();
	  }
	}
}
class AllStudentSearchDemo 
{
	public static void main(String arg[])
	{
		new AllStudentSearch();
	}
}