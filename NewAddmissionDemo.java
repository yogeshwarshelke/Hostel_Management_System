import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class NewAddmission implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b1,b2,b3,b4;
	Font f1,f2,f3;
	JComboBox jcb1,jcb2,jcb3,jcb4,jcb5;
	JRadioButton rb1,rb2;	
	JTextArea ta;
	JCheckBox cb1,cb2,cb3,cb4;
	
	public NewAddmission()
	{
		f=new JFrame("New Student Info");
		f.setSize(1366,768);
		 	
		f1=new Font("Arial",Font.BOLD,24);
		f2=new Font("Arial",Font.BOLD,30);
		f3=new Font("Arial",Font.PLAIN,16);
		
		f.setLayout(null);
		
		l1=new JLabel("New Student Addmission");
		l1.setFont(f2);
		l1.setForeground(Color.ORANGE);
		l1.setBounds(250,10,900,70);
		f.add(l1);
		
		
		l16=new JLabel("ID no:");
		l16.setFont(f1);
		l16.setForeground(Color.BLUE);
		l16.setBounds(250,110,100,30);
		f.add(l16);
		
		
		t8=new JTextField(10);
		t8.setFont(f3);
		t8.setBounds(330,110,100,30);
		f.add(t8);
		
		
		l17=new JLabel("Room no:");
		l17.setFont(f1);
		l17.setForeground(Color.BLUE);
		l17.setBounds(460,110,150,30);
		f.add(l17);
		
		t9=new JTextField(10);
		t9.setFont(f3);
		t9.setBounds(590,110,100,30);
		f.add(t9);
		
		l17=new JLabel("Date:");
		l17.setFont(f1);
		l17.setForeground(Color.BLUE);
		l17.setBounds(800,30,100,30);
		f.add(l17);
		
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println("Date is:"+sdf.format(d));
		
		t10=new JTextField(10);
		t10.setText(sdf.format(d));
		t10.setFont(f3);
		t10.setBounds(860,30,150,30);
		t10.setEditable(false);
		f.add(t10);
		

		
		l2=new JLabel("Student Name:");
		l2.setFont(f1);
		l2.setForeground(Color.BLUE);
		l2.setBounds(250,170,200,30);
		f.add(l2);
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(450,170,300,30);
		f.add(t1);
		
		l3=new JLabel("Father Name:");
		l3.setFont(f1);
		l3.setForeground(Color.BLUE);
		l3.setBounds(250,210,200,30);
		f.add(l3);
		
		t2=new JTextField(10);
		t2.setFont(f3);
		t2.setBounds(450,210,200,30);
		f.add(t2);
		
		l4=new JLabel("Mother Name:");
		l4.setFont(f1);
		l4.setForeground(Color.BLUE);
		l4.setBounds(660,210,200,30);
		f.add(l4);
		
		t3=new JTextField(10);
		t3.setFont(f3);
		t3.setBounds(840,210,200,30);
		f.add(t3);
		
		l5=new JLabel("Address:");
		l5.setFont(f1);
		l5.setForeground(Color.BLUE);
		l5.setBounds(250,250,200,30);
		f.add(l5);
		
		t4=new JTextField(10);
		t4.setFont(f3);
		t4.setBounds(450,250,200,30);
		f.add(t4);
		
		l6=new JLabel("Tal.");
		l6.setFont(f1);
		l6.setForeground(Color.BLUE);
		l6.setBounds(660,250,100,30);
		f.add(l6);
		
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
		
		l7=new JLabel("Dist.");
		l7.setFont(f1);
		l7.setForeground(Color.BLUE);
		l7.setBounds(830,250,100,30);
		f.add(l7);
		
		jcb2=new JComboBox();
		jcb2.addItem("Ahmedanagar");
		jcb2.addItem("pune");
		jcb2.addItem("Satar");
		jcb2.addItem("Mumbai");
		jcb2.addItem("Aurangabad");
		jcb2.addItem("Beed");
		jcb2.setBounds(890,250,150,30);
		f.add(jcb2);
		
		l8=new JLabel("Student Cast:");
		l8.setFont(f1);
		l8.setForeground(Color.BLUE);
		l8.setBounds(250,290,200,30);
		f.add(l8);
		
		jcb3=new JComboBox();
		jcb3.addItem("OPEN");
		jcb3.addItem("ST");
		jcb3.addItem("NT");
		jcb3.addItem("OBC");
		jcb3.setBounds(450,290,100,30);
		f.add(jcb3);
		
		l9=new JLabel("SubCast:");
		l9.setFont(f1);
		l9.setForeground(Color.BLUE);
		l9.setBounds(560,290,150,30);
		f.add(l9);
		
		jcb4=new JComboBox();
		jcb4.addItem("OPEN");
		jcb4.addItem("OBC(Kunabi)");
		jcb4.addItem("ST");
		jcb4.addItem("NT");
		jcb4.addItem("OBC");
		jcb4.setBounds(680,290,100,30);
		f.add(jcb4);
		
		l10=new JLabel("Gender:");
		l10.setFont(f1);
		l10.setForeground(Color.BLUE);
		l10.setBounds(250,330,200,30);
		f.add(l10);
		
		rb1=new JRadioButton("Male");
		rb2=new JRadioButton("Female");
		f.add(rb1);
		f.add(rb2);
		rb1.setBounds(450,330,100,30);
		rb2.setBounds(550,330,150,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		l11=new JLabel("Birth Date(dd/mm/yy):");
		l11.setFont(f1);
		l11.setForeground(Color.BLUE);
		l11.setBounds(250,370,300,30);
		f.add(l11);
		
		t5=new JTextField(10);
		t5.setFont(f3);
		t5.setBounds(520,370,150,30);
		f.add(t5);
		
		l12=new JLabel("New Class:");
		l12.setFont(f1);
		l12.setForeground(Color.BLUE);
		l12.setBounds(250,410,200,30);
		f.add(l12);
		
		jcb5=new JComboBox();
		jcb5.addItem("11th");
		jcb5.addItem("12th");
		jcb5.addItem("FYBCS");
		jcb5.addItem("SYBCS");
		jcb5.addItem("TYBCS");
		jcb5.addItem("FYBSC");
		jcb5.addItem("SYBSC");
		jcb5.addItem("TYBSC");
		jcb5.addItem("FYMCS");
		jcb5.addItem("SYMCS");
		jcb5.addItem("FYMSC");
		jcb5.addItem("SYMSC");
		jcb5.addItem("FYBA");
		jcb5.addItem("SYBA");
		jcb5.addItem("TYBA");
		jcb5.addItem("FYMA");
		jcb5.addItem("SYMA");
		
		jcb5.setBounds(450,410,100,30);
		f.add(jcb5);
		
		l13=new JLabel("Previous College:");
		l13.setFont(f1);
		l13.setForeground(Color.BLUE);
		l13.setBounds(250,450,250,30);
		f.add(l13);
		
		t6=new JTextField(10);
		t6.setFont(f3);
		t6.setBounds(455,450,300,30);
		f.add(t6);
		
		l14=new JLabel("Percentage:");
		l14.setFont(f1);
		l14.setForeground(Color.BLUE);
		l14.setBounds(250,490,200,30);
		f.add(l14);
		
		t7=new JTextField(10);
		t7.setFont(f3);
		t7.setBounds(450,490,100,30);
		f.add(t7);
		
		l15=new JLabel("Documents Submitted:");
		l15.setFont(f1);
		l15.setForeground(Color.BLUE);
		l15.setBounds(250,530,280,30);
		f.add(l15);
		
		cb1=new JCheckBox();
		cb2=new JCheckBox();
		cb3=new JCheckBox();
		cb4=new JCheckBox();
		
		cb1.setText("Hostel Form");
		cb2.setText("Addmission receipt");
		cb3.setText("Result");
		cb4.setText("Adhar card");
		
		cb1.setBounds(530,530,200,30);
		cb2.setBounds(730,530,300,30);
		cb3.setBounds(530,560,200,30);
		cb4.setBounds(730,560,200,30);
		
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		
		l18=new JLabel("Mob No:");
		l18.setFont(f1);
		l18.setForeground(Color.BLUE);
		l18.setBounds(700,330,200,30);
		f.add(l18);
		
		t11=new JTextField(10);
		t11.setFont(f3);
		t11.setBounds(800,330,150,30);
		f.add(t11);
		
		b1=new JButton("Submit");
		b1.setBounds(250,600,250,50);
		b1.setFont(f2);
		f.add(b1);
		
		b2=new JButton("Clear");
		b2.setBounds(520,600,250,50);
		b2.setFont(f2);
		f.add(b2);
		
		b3=new JButton("Back");
		b3.setBounds(790,600,250,50);
		b3.setFont(f2);
		f.add(b3);
		
		b4=new JButton("Image");
		b4.setBounds(850,65,170,140);
		b4.setFont(f2);
		f.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
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
				int idno=0,roomno=0,perc=0,mbno=0;
				String hf="NO",af="NO",ar="NO",ac="NO";
				String sn=t1.getText();
				String fn=t2.getText();
				String mn=t3.getText();
				String addr=t4.getText();
				String bd=t5.getText();
				String pc=t6.getText();
				String perc1=t7.getText();
				if(perc1.length()>0)
				{
					perc=Integer.parseInt(perc1);
				}
				String idno1=t8.getText();
				if(idno1.length()>0)
				{
					idno=Integer.parseInt(idno1);
				}	
				String roomno1=t9.getText();
				if(roomno1.length()>0)
				{
					roomno=Integer.parseInt(roomno1);
				}
				String date=t10.getText();
			
				if(cb1.isSelected())
				{
					hf="YES";
				}
				if(cb2.isSelected())
				{
					af="YES";
				}
				if(cb3.isSelected())
				{
					ar="YES";
				}
				if(cb4.isSelected())
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
				String jcb15=(String)jcb5.getSelectedItem();
				String mbno1="";
				String mbno2=t11.getText();
				if(mbno2.length()==10)
				{
					mbno1=mbno2;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Mob no Must be 10 Digit...","Error",JOptionPane.ERROR_MESSAGE);
				}
				if(sn.length()>0 && fn.length()>0 && mn.length()>0 && addr.length()>0 && date.length()>0 && mbno1.length()>0 && bd.length()>0 && pc.length()>0 )
				{
				
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				//System.out.println("\n Record inserted successfully....");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
			
				String sql="insert into StudentAddmission values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
				PreparedStatement pstmt=con.prepareStatement(sql);
			
				pstmt.setInt(1,idno);
				pstmt.setInt(2,roomno);
				pstmt.setString(3,date);
				pstmt.setString(4,sn);
				pstmt.setString(5,fn);
				pstmt.setString(6,mn);
				pstmt.setString(7,addr);
				pstmt.setString(8,jcb11);
				pstmt.setString(9,jcb12);
				pstmt.setString(10,jcb13);
				pstmt.setString(11,jcb14);
				pstmt.setString(12,gn);
				pstmt.setString(13,bd);
				pstmt.setString(14,jcb15);
				pstmt.setString(15,pc);
				pstmt.setInt(16,perc);
				pstmt.setString(17,hf);
				pstmt.setString(18,af);
				pstmt.setString(19,ar);
				pstmt.setString(20,ac);
				pstmt.setString(21,mbno1);
						
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
				JOptionPane.showMessageDialog(null,"You Entered Incorrect IDno/ Other Information..","Duplicate Value",JOptionPane.ERROR_MESSAGE);
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
			t8.setText("");
			cb1.setSelected(false);
			cb2.setSelected(false);
			cb3.setSelected(false);
			cb3.setSelected(false);
		}
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new HostelInfo();
		}	
		if(e.getSource()==b4)
		{
		
		}		
	}
}

class NewAddmissionDemo
{
	public static void main(String arg[])
	{
		new NewAddmission();
	}
}

