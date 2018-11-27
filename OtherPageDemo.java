import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class OtherPage implements ActionListener
{
	
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel l1,l2;
	JTextField t1,t2;
	Font f1,f3;
	
	public OtherPage()
	{
		f=new JFrame("OTHER INFORMATION ABOUT HOSTEL");
		f.setSize(1366,768);
		
		f1=new Font("Arial",Font.BOLD,26);
		f3=new Font("Arial",Font.PLAIN,16);
		
		f.setLayout(null);
		
			/* Date */
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("hh:mm:ss");
		
		l1=new JLabel("Date:");
		l1.setFont(f1);
		l1.setForeground(Color.BLACK);
		l1.setBounds(50,20,100,30);
		f.add(l1);
		
		t1=new JTextField(10);
		t1.setText(sdf.format(d));
		t1.setFont(f3);
		t1.setBounds(120,20,100,30);
		t1.setEditable(false);
		f.add(t1);
		
		l2=new JLabel("Time:");
		l2.setFont(f1);
		l2.setForeground(Color.BLACK);
		l2.setBounds(1130,20,100,30);
		f.add(l2);
		
		t2=new JTextField(10);
		t2.setText(sdf1.format(d));
		t2.setFont(f3);
		t2.setBounds(1210,20,100,30);
		t2.setEditable(false);
		f.add(t2);
		
		b1=new JButton("FACILITIES");
		b1.setBounds(550,30,250,50);
		b1.setFont(f1);
		f.add(b1);
		
		b2=new JButton("SCHEMES");
		b2.setBounds(550,100,250,50);
		b2.setFont(f1);
		f.add(b2);
		
		b3=new JButton("SCHOLARSHIP");
		b3.setBounds(550,170,250,50);
		b3.setFont(f1);
		f.add(b3);
		
		b4=new JButton("RULES");
		b4.setBounds(550,240,250,50);
		b4.setFont(f1);
		f.add(b4);
		
		b5=new JButton("HOME PAGE");
		b5.setBounds(550,310,250,50);
		b5.setFont(f1);
		f.add(b5);
		
		b6=new JButton("BACK");
		b6.setBounds(550,380,250,50);
		b6.setFont(f1);
		f.add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		f.setResizable(false);
		f.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			f.setVisible(false);
			new FacilitiesDemo();
		}
		if(e.getSource()==b2)
		{
			f.setVisible(false);
			new SchemeDemo();
		}
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new ScholarshipDemo();
		}
		if(e.getSource()==b4)
		{	
			f.setVisible(false);
			new RulesDemo();
		}
		if(e.getSource()==b5)
		{
			f.setVisible(false);
			new HostelInfo();
		}
		if(e.getSource()==b6)
		{
			f.setVisible(false);
			new HostelInfo();
		}
	}
}	

class OtherPageDemo
{
	public static void main(String arg[])
	{
		new OtherPage();
	}
}