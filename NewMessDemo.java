import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class NewMess implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b1,b2,b3,b4;
	Font f1,f2,f3;
	JComboBox jcb1,jcb2,jcb3,jcb4,jcb5;
	JRadioButton rb1,rb2;	
	JTextArea ta;
	JCheckBox cb1,cb2;
	
	public NewMess()
	{
		f=new JFrame("Add New Mess");
		f.setSize(1366,768);
		 	
		f1=new Font("Arial",Font.BOLD,24);
		f2=new Font("Arial",Font.BOLD,80);
		f3=new Font("Arial",Font.PLAIN,16);
		
		f.setLayout(null);
		
		l=new JLabel("Add New Mess");
		l.setFont(f2);
		l.setForeground(Color.ORANGE);
		l.setBounds(250,10,900,70);
		f.add(l);
		
		
		l1=new JLabel("ID no:");
		l1.setFont(f1);
		l1.setForeground(Color.BLUE);
		l1.setBounds(250,130,100,30);
		f.add(l1);
		
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(330,130,100,30);
		f.add(t1);
		
		
		l2=new JLabel("Experiance:");
		l2.setFont(f1);
		l2.setForeground(Color.BLUE);
		l2.setBounds(460,130,150,30);
		f.add(l2);
		
		t2=new JTextField(10);
		t2.setFont(f3);
		t2.setBounds(600,130,100,30);
		f.add(t2);
		
		l3=new JLabel("Student Name:");
		l3.setFont(f1);
		l3.setForeground(Color.BLUE);
		l3.setBounds(250,170,200,30);
		f.add(l3);
		
		t3=new JTextField(10);
		t3.setFont(f3);
		t3.setBounds(450,170,300,30);
		f.add(t3);
		
		l4=new JLabel("Father Name:");
		l4.setFont(f1);
		l4.setForeground(Color.BLUE);
		l4.setBounds(250,210,200,30);
		f.add(l4);
		
		t4=new JTextField(10);
		t4.setFont(f3);
		t4.setBounds(450,210,200,30);
		f.add(t4);
		
		l5=new JLabel("Mother Name:");
		l5.setFont(f1);
		l5.setForeground(Color.BLUE);
		l5.setBounds(660,210,200,30);
		f.add(l5);
		
		t5=new JTextField(10);
		t5.setFont(f3);
		t5.setBounds(840,210,200,30);
		f.add(t5);
		
		l6=new JLabel("Address:");
		l6.setFont(f1);
		l6.setForeground(Color.BLUE);
		l6.setBounds(250,250,200,30);
		f.add(l6);
		
		t6=new JTextField(10);
		t6.setFont(f3);
		t6.setBounds(450,250,200,30);
		f.add(t6);
		
		l7=new JLabel("Tal.");
		l7.setFont(f1);
		l7.setForeground(Color.BLUE);
		l7.setBounds(660,250,100,30);
		f.add(l7);
		
		jcb1=new JComboBox();
		jcb1.addItem("Newasa");
		jcb1.addItem("Shrirampur");
		jcb1.addItem("Shevgaon");
		jcb1.addItem("Nagar");
		jcb1.addItem("Rahuri");
		jcb1.addItem("Rahata");
		jcb1.addItem("Kopergaon");
		jcb1.addItem("Akole");
		jcb1.setBounds(720,250,100,30);
		f.add(jcb1);
		
		l8=new JLabel("Dist.");
		l8.setFont(f1);
		l8.setForeground(Color.BLUE);
		l8.setBounds(830,250,100,30);
		f.add(l8);
		
		jcb2=new JComboBox();
		jcb2.addItem("Ahmedanagar");
		jcb2.addItem("pune");
		jcb2.addItem("Satar");
		jcb2.addItem("Mumbai");
		jcb2.addItem("Aurangabad");
		jcb2.addItem("Beed");
		jcb2.setBounds(890,250,150,30);
		f.add(jcb2);
		
		l9=new JLabel("Student Cast:");
		l9.setFont(f1);
		l9.setForeground(Color.BLUE);
		l9.setBounds(250,290,200,30);
		f.add(l9);
		
		jcb3=new JComboBox();
		jcb3.addItem("OPEN");
		jcb3.addItem("ST");
		jcb3.addItem("NT");
		jcb3.addItem("OBC");
		jcb3.setBounds(450,290,100,30);
		f.add(jcb3);
		
		l10=new JLabel("SubCast:");
		l10.setFont(f1);
		l10.setForeground(Color.BLUE);
		l10.setBounds(560,290,150,30);
		f.add(l10);
		
		jcb4=new JComboBox();
		jcb4.addItem("OPEN");
		jcb4.addItem("OBC(Kunabi)");
		jcb4.addItem("ST");
		jcb4.addItem("NT");
		jcb4.addItem("OBC");
		jcb4.setBounds(680,290,100,30);
		f.add(jcb4);
		
		l11=new JLabel("Gender:");
		l11.setFont(f1);
		l11.setForeground(Color.BLUE);
		l11.setBounds(250,330,200,30);
		f.add(l11);
		
		rb1=new JRadioButton("Male");
		rb2=new JRadioButton("Female");
		f.add(rb1);
		f.add(rb2);
		rb1.setBounds(450,330,100,30);
		rb2.setBounds(550,330,150,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		l12=new JLabel("Birth Date(dd/mm/yy):");
		l12.setFont(f1);
		l12.setForeground(Color.BLUE);
		l12.setBounds(250,370,300,30);
		f.add(l12);
		
		t7=new JTextField(10);
		t7.setFont(f3);
		t7.setBounds(520,370,150,30);
		f.add(t7);
		//
		
		l13=new JLabel("Mob No:");
		l13.setFont(f1);
		l13.setForeground(Color.BLUE);
		l13.setBounds(250,410,200,30);
		f.add(l13);
		
		t8=new JTextField(10);
		t8.setFont(f3);
		t8.setBounds(450,410,200,30);
		f.add(t8);
		
		t9=new JTextField(10);
		t9.setFont(f3);
		t9.setBounds(655,410,200,30);
		f.add(t9);
		
		l14=new JLabel("Documents Submitted:");
		l14.setFont(f1);
		l14.setForeground(Color.BLUE);
		l14.setBounds(250,440,280,30);
		f.add(l14);
		
		cb1=new JCheckBox();
		cb2=new JCheckBox();
		
		cb1.setText("Hostel Form");
		cb2.setText("Adhar card");
		
		cb1.setBounds(530,440,200,30);
		cb2.setBounds(730,440,300,30);
		
		f.add(cb1);
		f.add(cb2);
		
		l15=new JLabel("Date:");
		l15.setFont(f1);
		l15.setForeground(Color.BLUE);
		l15.setBounds(850,30,100,30);
		f.add(l15);
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println("Date is:"+sdf.format(d));
		
		t10=new JTextField(10);
		t10.setText(sdf.format(d));
		t10.setFont(f3);
		t10.setBounds(910,30,150,30);
		t10.setEditable(false);
		f.add(t10);
		
		l16=new JLabel("Total Tiffin:");
		l16.setFont(f1);
		l16.setForeground(Color.BLUE);
		l16.setBounds(710,130,200,30);
		f.add(l16);
		
		t11=new JTextField(10);
		t11.setFont(f3);
		t11.setBounds(850,130,100,30);
		f.add(t11);
		
		b1=new JButton("Submit");
		b1.setBounds(250,490,250,50);
		b1.setFont(f1);
		f.add(b1);
		
		b2=new JButton("Clear");
		b2.setBounds(520,490,250,50);
		b2.setFont(f1);
		f.add(b2);
		
		b3=new JButton("Back");
		b3.setBounds(790,490,250,50);
		b3.setFont(f1);
		f.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f.setResizable(false);
		f.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e)
	{
		/* Submit information */
		if(e.getSource()==b1)
		{
			try
			{	
				int idno=0,tiffin=0;
				
				String  mbno2="",mbno1="";
				String hf="NO",ac="NO";
				
				String idno1=t1.getText();
				if(idno1.length()>0)
				{
					idno=Integer.parseInt(idno1);
				}
				String exp=t2.getText();
				String sn=t3.getText();
				String fn=t4.getText();
				String mn=t5.getText();
				String addr=t6.getText();
				String bd=t7.getText();
				//String mob1=t8.getText();
				String mob1=t8.getText();
				if(mob1.length()>9 && mob1.length()<11)
				{
					  mbno1=mob1;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Mobno Length must be 10 Digit..","mob no",JOptionPane.ERROR_MESSAGE);
				}
				String mob2=t9.getText();
				if(mob1.length()>=0 && mob1.length()<11)
				{
					  mbno2=mob2;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Mob Length must be 10 Digit..","mob no",JOptionPane.ERROR_MESSAGE);
				}		
				
				String date=t10.getText();
				String tiffin1=t11.getText();
				if(tiffin1.length()>0)
				{
					tiffin=Integer.parseInt(idno1);
				}
				if(cb1.isSelected())
				{
					hf="YES";
				}
				if(cb2.isSelected())
				{
					ac="YES";
				}
			
				String gn="";
				if(rb1.isSelected())
				{
				 	gn="Male";
				}
				if(rb2.isSelected())
				{
					gn="Female";
				}
			
				String jcb11=(String)jcb1.getSelectedItem();
				String jcb12=(String)jcb2.getSelectedItem();
				String jcb13=(String)jcb3.getSelectedItem();
				String jcb14=(String)jcb4.getSelectedItem();
				
				if(exp.length()>0 && sn.length()>0 && fn.length()>0 && mn.length()>0 && addr.length()>0 && mbno1.length()>9 && mbno1.length()<11 && bd.length()>0)
				{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("\n Record inserted successfully....");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
			
				String sql="insert into AddMess values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";				
				PreparedStatement pstmt=con.prepareStatement(sql);
				
				pstmt.setInt(1,idno);
				pstmt.setString(2,exp);
				pstmt.setString(3,sn);
				pstmt.setString(4,fn);
				pstmt.setString(5,mn);
				pstmt.setString(6,addr);
				pstmt.setString(7,bd);
				pstmt.setString(8,mbno1);
				pstmt.setString(9,mbno2);
				pstmt.setString(10,date);
			
				pstmt.setString(11,gn);
				pstmt.setString(12,jcb11);
				pstmt.setString(13,jcb12);
				pstmt.setString(14,jcb13);
				pstmt.setString(15,jcb14);
				pstmt.setString(16,hf);
				pstmt.setString(17,ac);
				pstmt.setInt(18,tiffin);
						
				int p=JOptionPane.showConfirmDialog(null,"Are you sure.","Confirm",JOptionPane.YES_NO_OPTION);		
				if(p==JOptionPane.YES_OPTION)
				{
					
					pstmt.executeUpdate();
					JOptionPane.showMessageDialog(null,"Record Inserted Successfully....","Confirmation",JOptionPane.PLAIN_MESSAGE);
					con.close();
					
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
					t9.setText("");
					//t10.setText("");
					t11.setText("");
					
				}
				con.close();
			}
			else
			{
				JOptionPane.showMessageDialog(null," Incorrect TextField","Error",JOptionPane.ERROR_MESSAGE);
			}
			}
			catch(Exception ee)
			{
				System.out.println(ee);
				JOptionPane.showMessageDialog(null,"Id Number Already Exist","Duplicate Value",JOptionPane.ERROR_MESSAGE);
			}	
				
		}
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
			t11.setText("");
			cb1.setSelected(false);
			cb2.setSelected(false);
		}
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new HostelInfo();
		}	
				
	}
}

class NewMessDemo
{
	public static void main(String arg[])
	{
		new NewMess();
	}
}
