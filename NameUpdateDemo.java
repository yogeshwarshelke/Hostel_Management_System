import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.util.*;

class NameUpdate implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	JButton b,b1,b2,b3,b4,b5;
	Font f1,f2,f3;
	JComboBox jcb1,jcb2,jcb3,jcb4,jcb5;
	JRadioButton rb1,rb2;	
	//JTextArea ta;
	JCheckBox cb1,cb2,cb3,cb4;
	
	public NameUpdate()
	{
		f=new JFrame("ID Update");
		f.setSize(1366,768);
		 	
		f1=new Font("Arial",Font.BOLD,24);
		f2=new Font("Arial",Font.BOLD,45);
		f3=new Font("Arial",Font.PLAIN,16);
		
		f.setLayout(null);
		
		l=new JLabel("Enter Student Name:");
		l.setFont(f1);
		l.setForeground(Color.BLUE);
		l.setBounds(320,30,260,40);
		f.add(l);
		
		t=new JTextField(10);
		t.setFont(f3);
		t.setBounds(560,30,200,40);
		f.add(t);
		
		b=new JButton("Submit");
		b.setFont(f1);
		b.setBounds(760,30,150,40);
		f.add(b);
		//
		
		l1=new JLabel("Student Update");
		l1.setFont(f2);
		l1.setForeground(Color.ORANGE);
		l1.setBounds(250,10,900,70);
		f.add(l1);
		l1.setVisible(false);
		
		
		l16=new JLabel("ID no:");
		l16.setFont(f1);
		l16.setForeground(Color.BLUE);
		l16.setBounds(250,110,100,30);
		f.add(l16);
		l16.setVisible(false);
		
		t8=new JTextField(10);
		t8.setFont(f3);
		t8.setBounds(330,110,100,30);
		f.add(t8);
		//t8.setEditable(false);
		t8.setVisible(false);
		
		l17=new JLabel("Room no:");
		l17.setFont(f1);
		l17.setForeground(Color.BLUE);
		l17.setBounds(460,110,150,30);
		f.add(l17);
		l17.setVisible(false);
		
		t9=new JTextField(10);
		t9.setFont(f3);
		t9.setBounds(590,110,100,30);
		f.add(t9);
		//t9.setEditable(false);
		t9.setVisible(false);
		
		l18=new JLabel("Date:");
		l18.setFont(f1);
		l18.setForeground(Color.BLUE);
		l18.setBounds(800,30,100,30);
		f.add(l18);
		l18.setVisible(false);
		
		t10=new JTextField(10);
		t10.setFont(f3);
		t10.setBounds(860,30,150,30);
		f.add(t10);
		//t10.setEditable(false);
		t10.setVisible(false);
		
		
		
		l2=new JLabel("Student Name:");
		l2.setFont(f1);
		l2.setForeground(Color.BLUE);
		l2.setBounds(250,170,200,30);
		f.add(l2);
		l2.setVisible(false);
		
		t1=new JTextField(10);
		t1.setFont(f3);
		t1.setBounds(450,170,300,30);
		f.add(t1);
		//t1.setEditable(false);
		t1.setVisible(false);
		
		l3=new JLabel("Father Name:");
		l3.setFont(f1);
		l3.setForeground(Color.BLUE);
		l3.setBounds(250,210,200,30);
		f.add(l3);
		l3.setVisible(false);
		
		t2=new JTextField(10);
		t2.setFont(f3);
		t2.setBounds(450,210,200,30);
		f.add(t2);
		//t2.setEditable(false);
		t2.setVisible(false);
		
		l4=new JLabel("Mother Name:");
		l4.setFont(f1);
		l4.setForeground(Color.BLUE);
		l4.setBounds(660,210,200,30);
		f.add(l4);
		l4.setVisible(false);
		
		t3=new JTextField(10);
		t3.setFont(f3);
		t3.setBounds(840,210,200,30);
		f.add(t3);
		//t3.setEditable(false);
		t3.setVisible(false);
		
		l5=new JLabel("Address:");
		l5.setFont(f1);
		l5.setForeground(Color.BLUE);
		l5.setBounds(250,250,200,30);
		f.add(l5);
		l5.setVisible(false);
		
		t4=new JTextField(10);
		t4.setFont(f3);
		t4.setBounds(450,250,200,30);
		f.add(t4);
		//t4.setEditable(false);
		t4.setVisible(false);
		
		l6=new JLabel("Tal.");
		l6.setFont(f1);
		l6.setForeground(Color.BLUE);
		l6.setBounds(660,250,100,30);
		f.add(l6);
		l6.setVisible(false);
		
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
		//jcb1.setEnabled(false);
		jcb1.setVisible(false);
		
		l7=new JLabel("Dist.");
		l7.setFont(f1);
		l7.setForeground(Color.BLUE);
		l7.setBounds(830,250,100,30);
		f.add(l7);
		l7.setVisible(false);
		
		jcb2=new JComboBox();
		jcb2.addItem("Ahmedanagar");
		jcb2.addItem("pune");
		jcb2.addItem("Satar");
		jcb2.addItem("Mumbai");
		jcb2.addItem("Aurangabad");
		jcb2.addItem("Beed");
		jcb2.setBounds(890,250,150,30);
		f.add(jcb2);
		//jcb2.setEnabled(false);
		jcb2.setVisible(false);
		
		l8=new JLabel("Student Cast:");
		l8.setFont(f1);
		l8.setForeground(Color.BLUE);
		l8.setBounds(250,290,200,30);
		f.add(l8);
		l8.setVisible(false);
		
		jcb3=new JComboBox();
		jcb3.addItem("OPEN");
		jcb3.addItem("ST");
		jcb3.addItem("NT");
		jcb3.addItem("OBC");
		jcb3.setBounds(450,290,100,30);
		f.add(jcb3);
		//jcb3.setEnabled(false);
		jcb3.setVisible(false);
		
		l9=new JLabel("SubCast:");
		l9.setFont(f1);
		l9.setForeground(Color.BLUE);
		l9.setBounds(560,290,150,30);
		f.add(l9);
		l9.setVisible(false);
		
		jcb4=new JComboBox();
		jcb4.addItem("OPEN");
		jcb4.addItem("OBC(Kunabi)");
		jcb4.addItem("ST");
		jcb4.addItem("NT");
		jcb4.addItem("OBC");
		jcb4.setBounds(680,290,100,30);
		f.add(jcb4);
		//jcb4.setEnabled(false);
		jcb4.setVisible(false);
		
		l10=new JLabel("Gender:");
		l10.setFont(f1);
		l10.setForeground(Color.BLUE);
		l10.setBounds(250,330,200,30);
		f.add(l10);
		l10.setVisible(false);
		
		rb1=new JRadioButton("Male");
		rb2=new JRadioButton("Female");
		f.add(rb1);
		f.add(rb2);
		rb1.setBounds(450,330,100,30);
		rb2.setBounds(550,330,150,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		//rb1.setEnabled(false);
		//rb2.setEnabled(false);
		rb1.setVisible(false);
		rb2.setVisible(false);
		
		l11=new JLabel("Birth Date(dd/mm/yy):");
		l11.setFont(f1);
		l11.setForeground(Color.BLUE);
		l11.setBounds(250,370,300,30);
		f.add(l11);
		l11.setVisible(false);
		
		t5=new JTextField(10);
		t5.setFont(f3);
		t5.setBounds(520,370,150,30);
		f.add(t5);
		//t5.setEditable(false);
		t5.setVisible(false);
		
		l12=new JLabel("New Class:");
		l12.setFont(f1);
		l12.setForeground(Color.BLUE);
		l12.setBounds(250,410,200,30);
		f.add(l12);
		l12.setVisible(false);
		
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
		//jcb5.setEnabled(false);
		jcb5.setVisible(false);
		
		l13=new JLabel("Previous College:");
		l13.setFont(f1);
		l13.setForeground(Color.BLUE);
		l13.setBounds(250,450,250,30);
		f.add(l13);
		l13.setVisible(false);
		
		t6=new JTextField(10);
		t6.setFont(f3);
		t6.setBounds(455,450,300,30);
		f.add(t6);
		//t6.setEditable(false);
		t6.setVisible(false);
		
		l14=new JLabel("Percentage:");
		l14.setFont(f1);
		l14.setForeground(Color.BLUE);
		l14.setBounds(250,490,200,30);
		f.add(l14);
		l14.setVisible(false);
		
		t7=new JTextField(10);
		t7.setFont(f3);
		t7.setBounds(450,490,100,30);
		f.add(t7);
		//t7.setEditable(false);
		t7.setVisible(false);
		
		l15=new JLabel("Documents Submitted:");
		l15.setFont(f1);
		l15.setForeground(Color.BLUE);
		l15.setBounds(250,530,280,30);
		f.add(l15);
		l15.setVisible(false);
		
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
		//cb1.setEnabled(false);
		//cb2.setEnabled(false);
		//cb3.setEnabled(false);
		//cb4.setEnabled(false);
		cb1.setVisible(false);
		cb2.setVisible(false);
		cb3.setVisible(false);
		cb4.setVisible(false);
		
		l18=new JLabel("Mob No:");
		l18.setFont(f1);
		l18.setForeground(Color.BLUE);
		l18.setBounds(700,330,200,30);
		l18.setVisible(false);
		f.add(l18);
		
		t11=new JTextField(10);
		t11.setFont(f3);
		t11.setBounds(800,330,150,30);
		t11.setVisible(false);
		f.add(t11);
	
		b1=new JButton("Submit");
		b1.setBounds(250,600,250,50);
		b1.setFont(f2);
		f.add(b1);
		//b1.setEnabled(false);
		b1.setVisible(false);
		
		b2=new JButton("New Search");
		b2.setBounds(520,600,250,50);
		b2.setFont(f2);
		f.add(b2);
		//b2.setEnabled(false);
		b2.setVisible(false);
		
		b3=new JButton("Back");
		b3.setBounds(790,600,250,50);
		b3.setFont(f2);
		f.add(b3);
		b3.setVisible(true);
		
		b4=new JButton("Image");
		b4.setBounds(850,65,170,140);
		b4.setFont(f2);
		f.add(b4);
		b4.setEnabled(false);
		b4.setVisible(false);
		
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
			String sn=t.getText();
			int flag=0;
			String gender="Male";
			String hf="NO",af="NO",ar="NO",ac="NO";
			
			l.setVisible(false);
			t.setVisible(false);
			b.setVisible(false);
			
			l1.setVisible(true);
			l2.setVisible(true);
			l3.setVisible(true);
			l4.setVisible(true);
			l5.setVisible(true);
			l6.setVisible(true);
			l7.setVisible(true);
			l8.setVisible(true);
			l9.setVisible(true);
			l10.setVisible(true);
			l11.setVisible(true);
			l12.setVisible(true);
			l13.setVisible(true);
			l14.setVisible(true);
			l15.setVisible(true);
			l16.setVisible(true);
			l17.setVisible(true);
			l18.setVisible(true);
			
			t1.setVisible(true);
			t2.setVisible(true);
			t3.setVisible(true);
			t4.setVisible(true);
			t5.setVisible(true);
			t6.setVisible(true);
			t7.setVisible(true);
			t8.setVisible(true);
			t9.setVisible(true);
			t10.setVisible(true);
			t11.setVisible(true);
			
			jcb1.setVisible(true);
			jcb2.setVisible(true);
			jcb3.setVisible(true);
			jcb4.setVisible(true);
			jcb5.setVisible(true);
			
			cb1.setVisible(true);
			cb2.setVisible(true);
			cb3.setVisible(true);
			cb4.setVisible(true);
			
			rb1.setVisible(true);
			rb2.setVisible(true);
			
			b1.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			b4.setVisible(true);
					
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
				
				String sql="select * from StudentAddmission where StudentName=?";	
		  	   	PreparedStatement pstmt=con.prepareStatement(sql);
				pstmt.setString(1,sn);
				
				ResultSet rs=pstmt.executeQuery();
			
				while(rs.next())
				{
					t8.setText(""+rs.getInt(1));
					t9.setText(""+rs.getInt(2));
					t10.setText(rs.getString(3));
					t1.setText(rs.getString(4));
					t2.setText(rs.getString(5));
					t3.setText(rs.getString(6));
					t4.setText(rs.getString(7));
					
					jcb1.setSelectedItem(rs.getString(8));
					jcb2.setSelectedItem(rs.getString(9));
					jcb3.setSelectedItem(rs.getString(10));
					jcb4.setSelectedItem(rs.getString(11));
				
					if(rs.getString(12).equals("Male"))
					{
						rb1.setSelected(true);
					}
					else
					{
						rb2.setSelected(true);
					}
				
					t5.setText(rs.getString(13));
					jcb5.setSelectedItem(rs.getString(14));
					t6.setText(rs.getString(15));
					t7.setText(""+rs.getInt(16));
						
            		if(rs.getString(17).equals("YES"))
            		{
            			cb1.setSelected(true);
        			}
        			if(rs.getString(18).equals("YES"))
            		{
        				cb2.setSelected(true);
        			}
        			if(rs.getString(19).equals("YES"))
            		{
        				cb3.setSelected(true);
        			}
        			
        			if(rs.getString(20).equals("YES"))
            		{
        				cb4.setSelected(true);
        			}
        			t11.setText(rs.getString(21));
					flag=1;
				}
				if(flag==0)
				{
					t.setText("");
					l.setVisible(true);
					t.setVisible(true);
					b.setVisible(true);
			
					l1.setVisible(false);
					l2.setVisible(false);
					l3.setVisible(false);
					l4.setVisible(false);
					l5.setVisible(false);
					l6.setVisible(false);
					l7.setVisible(false);
					l8.setVisible(false);
					l9.setVisible(false);
					l10.setVisible(false);
					l11.setVisible(false);
					l12.setVisible(false);
					l13.setVisible(false);
					l14.setVisible(false);
					l15.setVisible(false);
					l16.setVisible(false);
					l17.setVisible(false);
					l18.setVisible(false);
			
					t1.setVisible(false);
					t2.setVisible(false);
					t3.setVisible(false);
					t4.setVisible(false);
					t5.setVisible(false);
					t6.setVisible(false);
					t7.setVisible(false);
					t8.setVisible(false);
					t9.setVisible(false);
					t10.setVisible(false);
					t11.setVisible(false);
			
					jcb1.setVisible(false);
					jcb2.setVisible(false);
					jcb3.setVisible(false);
					jcb4.setVisible(false);
					jcb5.setVisible(false);
			
					cb1.setVisible(false);
					cb2.setVisible(false);
					cb3.setVisible(false);
					cb4.setVisible(false);
			
					rb1.setVisible(false);
					rb2.setVisible(false);
			
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(true);
					b4.setVisible(false);
					JOptionPane.showMessageDialog(null,"Record not Found","Confirmation",JOptionPane.ERROR_MESSAGE);
				}
				con.close();
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
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con=DriverManager.getConnection("Jdbc:Odbc:Hostel Managment");
				
				int idno1=Integer.parseInt(t8.getText());
				int roomno=Integer.parseInt(t9.getText());
				String date=t10.getText();
				String sn=t1.getText();
				String fn=t2.getText();
				String mn=t3.getText();
				String address=t4.getText();
				String tal=(String)jcb1.getSelectedItem();
				String dist=(String)jcb2.getSelectedItem();
				String cast=(String)jcb3.getSelectedItem();
				String subcast=(String)jcb4.getSelectedItem();
				String gender="",hf="NO",af="NO",ar="NO",ac="NO";
				
				if(rb1.isSelected())
				{
					gender="Male";
				}
				if(rb2.isSelected())
				{
					gender="Female";
				}
				String bd=t5.getText();
				String newclass=(String)jcb5.getSelectedItem();
				String pc=t6.getText();
				int perc=Integer.parseInt(t7.getText());
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
				String mobno=t11.getText();
			
				
				String sql="update StudentAddmission set Idno="+idno1+",Roomno="+roomno+",StudentName="+"'"+sn+"',FatherName="+"'"+fn+"',MotherName="+"'"+mn+"',Address="+"'"+address+"',Tal="+"'"+tal+"',Dist="+"'"+dist+"',StudentCast="+"'"+cast+"',SubCast="+"'"+subcast+"',Gender="+"'"+gender+"',BirthDate="+"'"+bd+"',NewClass="+"'"+newclass+"',PreviousCollege="+"'"+pc+"',Percentage="+perc+",HF="+"'"+hf+"',AF="+"'"+af+"',AR="+"'"+ar+"',AC="+"'"+ac+"',MobNo="+"'"+mobno+"' where StudentName="+"'"+sn+"'";                                                                                                                                                                                                                                                                   
				Statement stmt=con.createStatement();
				int n=stmt.executeUpdate(sql);
				
				/*String sql1="update StudentAddmission set Idno=?,Roomno=?,Date=?,StudentName=?,FatherName=?,MotherName=?,Address=?,Tal=?,Dist=?,StudentCast=?,SubCast=?,Gender=?,BirthDate=?,NewClass=?,PreviousCollege=?,Percentage=?,HF=?,Af=?,AR=?,AC=?,MobNo=? where Idno=?";
				PreparedStatement pstmt1=con.prepareStatement(sql1);
			
				pstmt1.setInt(1,idno1);
				pstmt1.setInt(2,roomno);
				pstmt1.setString(3,date);
				pstmt1.setString(4,sn);
				pstmt1.setString(5,fn);
				pstmt1.setString(6,mn);
				pstmt1.setString(7,address);
				pstmt1.setString(8,tal);
				pstmt1.setString(9,dist);
				pstmt1.setString(10,cast);
				pstmt1.setString(11,subcast);
				pstmt1.setString(12,gender);
				pstmt1.setString(13,bd);
				pstmt1.setString(14,newclass);
				pstmt1.setString(15,pc);
				pstmt1.setInt(16,perc);
				pstmt1.setString(17,hf);
				pstmt1.setString(18,af);
				pstmt1.setString(19,ar);
				pstmt1.setString(20,ac);
				pstmt1.setString(21,mobno);
				pstmt1.setInt(22,idno1);

				int n=pstmt1.executeUpdate();
				*/
				
				
				if(n==0)
				{
					JOptionPane.showMessageDialog(null,"Update Failed....","Update Failed",JOptionPane.PLAIN_MESSAGE);	
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
		if(e.getSource()==b2)
		{
			t.setText("");
			l.setVisible(true);
			t.setVisible(true);
			b.setVisible(true);
			
			l1.setVisible(false);
			l2.setVisible(false);
			l3.setVisible(false);
			l4.setVisible(false);
			l5.setVisible(false);
			l6.setVisible(false);
			l7.setVisible(false);
			l8.setVisible(false);
			l9.setVisible(false);
			l10.setVisible(false);
			l11.setVisible(false);
			l12.setVisible(false);
			l13.setVisible(false);
			l14.setVisible(false);
			l15.setVisible(false);
			l16.setVisible(false);
			l17.setVisible(false);
			l18.setVisible(false);
			
			t1.setVisible(false);
			t2.setVisible(false);
			t3.setVisible(false);
			t4.setVisible(false);
			t5.setVisible(false);
			t6.setVisible(false);
			t7.setVisible(false);
			t8.setVisible(false);
			t9.setVisible(false);
			t10.setVisible(false);
			t11.setVisible(false);
			
			jcb1.setVisible(false);
			jcb2.setVisible(false);
			jcb3.setVisible(false);
			jcb4.setVisible(false);
			jcb5.setVisible(false);
			
			cb1.setVisible(false);
			cb2.setVisible(false);
			cb3.setVisible(false);
			cb4.setVisible(false);
			
			rb1.setVisible(false);
			rb2.setVisible(false);
			
			b1.setVisible(false);
			b2.setVisible(false);
			b3.setVisible(true);
			b4.setVisible(false);
		}
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new HostelInfo();	
		}
	}		 
}
class NameUpdateDemo
{
	public static void main(String arg[])
	{
		new NameUpdate();
	}
}