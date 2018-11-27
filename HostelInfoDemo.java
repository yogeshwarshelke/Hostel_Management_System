import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class HostelInfo implements ActionListener,KeyListener
{
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel l1,l2;
	JTextField t1,t2;
	Font f1,f3;
	public HostelInfo()
	{
		f=new JFrame("Hostel Info");
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
		l1.setForeground(Color.CYAN);
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
		l2.setForeground(Color.CYAN);
		l2.setBounds(1130,20,100,30);
		f.add(l2);
		
		t2=new JTextField(10);
		t2.setText(sdf1.format(d));
		t2.setFont(f3);
		t2.setBounds(1210,20,100,30);
		t2.setEditable(false);
		f.add(t2);
		
		b1=new JButton("Presenty");
		b1.setBounds(550,30,250,50);
		b1.setFont(f1);
		f.add(b1);
		
		b2=new JButton("Student Info");
		b2.setBounds(550,100,250,50);
		b2.setFont(f1);
		f.add(b2);
		
		b3=new JButton("New Addmission");
		b3.setBounds(550,170,250,50);
		b3.setFont(f1);
		f.add(b3);
		
		b4=new JButton("Room Info");
		b4.setBounds(550,240,250,50);
		b4.setFont(f1);
		f.add(b4);
		
		b5=new JButton("Mess Info");
		b5.setBounds(550,310,250,50);
		b5.setFont(f1);
		f.add(b5);
		
		b6=new JButton("Other");
		b6.setBounds(550,380,250,50);
		b6.setFont(f1);
		f.add(b6);
		
		b7=new JButton("Exit");
		b7.setBounds(550,450,250,50);
		b7.setFont(f1);
		f.add(b7);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		f.addKeyListener(this);
		t2.addKeyListener(this);
		t1.addKeyListener(this);
		f.setResizable(false);
		f.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			
		}
		if(e.getSource()==b2)
		{
			f.setVisible(false);
			new StudentInformation();
		}
		if(e.getSource()==b3)
		{
			f.setVisible(false);
			new NewAddmission();
		}
		if(e.getSource()==b4)
		{
			f.setVisible(false);
			new RoomInfo();
		}
		if(e.getSource()==b5)
		{
			f.setVisible(false);
			new MesInfo();
		}
		if(e.getSource()==b6)
		{
			f.setVisible(false);
			new OtherPage();
		}
		if(e.getSource()==b7)
		{
			System.exit(0);
		}
	}
	/* KeyEvent  */
	public void keyPressed(KeyEvent k)
	{
		if((k.getKeyCode()==KeyEvent.VK_BACK_SPACE) && ((KeyEvent.CTRL_MASK)!=0))
		{
			f.setVisible(false);
			new UP();
		}
		if((k.getKeyCode()==KeyEvent.VK_E) && ((KeyEvent.CTRL_MASK)!=0))
		{
			int p=JOptionPane.showConfirmDialog(null,"Are you Sure Exit System","Confirm",JOptionPane.YES_NO_OPTION);
			if(p==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(null,"Thank you for Use System...","Exit",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
		if((k.getKeyCode()==KeyEvent.VK_M) && ((KeyEvent.CTRL_MASK)!=0))
		{
			f.setVisible(false);
			new MesInfo();
		}
		if((k.getKeyCode()==KeyEvent.VK_O) && ((KeyEvent.CTRL_MASK)!=0))
		{
			f.setVisible(false);
			new OtherPage();
		}
		if((k.getKeyCode()==KeyEvent.VK_R) && ((KeyEvent.CTRL_MASK)!=0))
		{
			f.setVisible(false);
			new RoomInfo();
		}
		if((k.getKeyCode()==KeyEvent.VK_N) && ((KeyEvent.CTRL_MASK)!=0))
		{
			f.setVisible(false);
			new NewAddmission();
		}
		if((k.getKeyCode()==KeyEvent.VK_S) && ((KeyEvent.CTRL_MASK)!=0))
		{
			f.setVisible(false);
			new StudentInformation();
		}
	}
	public void keyReleased(KeyEvent k)
	{
	}
	public void keyTyped(KeyEvent k)
	{
	}
}
class HostelInfoDemo
{
	public static void main(String arg[])
	{
		new HostelInfo();
	}
}