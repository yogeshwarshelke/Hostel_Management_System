import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import  java.awt.color.*;
import javax.swing.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;
class FacilitiesDemo implements ActionListener
{
	
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2;
	Font f1,f3,f2;
	
	FacilitiesDemo()
	{
		f=new JFrame("FACILITIES");
		f.setSize(1366,768);
		f.getContentPane().setBackground(Color.BLACK);
		
		
		f1=new Font("Arial",Font.BOLD,15);
		f2=new Font("Arial",Font.BOLD,40);
		f3=new Font("Arial",Font.BOLD,30);
		
		f.setLayout(null);
		
			/* Date */
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
		
		l1=new JLabel("..* HOSTEL FACILITIES *..");
		l1.setFont(f2);
		l1.setForeground(Color.PINK);
		l1.setBounds(450,30,1000,50);
		f.add(l1);
		
		l2=new JLabel("* Hostel Contains 100 Rooms");
		l2.setFont(f3);
		l2.setForeground(Color.magenta);
		l2.setBounds(400,100,600,50);
		f.add(l2);
		
		l2=new JLabel("* Five Student Has One Room");
		l2.setFont(f3);
		l2.setForeground(Color.RED);
		l2.setBounds(400,150,600,50);
		f.add(l2);
		
		l3=new JLabel("* Each Student Has Its Own Bed,Table,Lockers");
		l3.setFont(f3);
		l3.setForeground(Color.magenta);
		l3.setBounds(400,200,700,50);
		f.add(l3);
		
		l4=new JLabel("* In Hostel There Is A STUDY ROOM For Study Purpose");
		l4.setFont(f3);
		l4.setForeground(Color.RED);
		l4.setBounds(400,250,800,50);
		f.add(l4);
		
		l5=new JLabel("* Hostel Has Identity Card For Security Purpose");
		l5.setFont(f3);
		l5.setForeground(Color.magenta);
		l5.setBounds(400,300,700,50);
		f.add(l5);
		
		l6=new JLabel("* Hostel Has A Mess Which Is Healthful For Students");
		l6.setFont(f3);
		l6.setForeground(Color.RED);
		l6.setBounds(400,350,700,50);
		f.add(l6);
		
		l7=new JLabel("* Hostel Has A StudyFul Atmosphere");
		l7.setFont(f3);
		l7.setForeground(Color.magenta);
		l7.setBounds(400,400,700,50);
		f.add(l7);
		
		b1=new JButton("BACK");
		b1.setBounds(0,0,100,50);
		b1.setFont(f1);
		f.add(b1);
		b1.addActionListener(this);
				
		f.setResizable(false);
		f.setVisible(true);	
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				f.setVisible(false);
				new HostelInfo();
			}
		}
}
class Facilities
{
	public static void main(String a[])
	{
		new FacilitiesDemo();
	}
}