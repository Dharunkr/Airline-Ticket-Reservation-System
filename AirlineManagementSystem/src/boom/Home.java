package boom;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JMenuItem;

public class Home implements ActionListener{

	//JButton close,submit,reset = new JButton();
	JFrame f = new JFrame();
	JLabel heading;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem flightdetails;
	public Home() {
		
		/*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("/Screenshot (427).png"));
		
		JLabel image = new JLabel(i1);
		f.add(image);
		image.setBounds(0,0,1600,800); */
		
		f.setVisible(true);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.getContentPane().setBackground(Color.black);
		f.setLayout(null);
		heading = new JLabel("DHROOON AIRLINES WELCOMES YOU ");
		heading.setForeground(Color.pink);
		heading.setBounds(350,50,900,50);
		heading.setFont(new Font("TAHOMA", Font.BOLD,40));
		//heading.setFont(new Font("TAHOMA" , font.bold,40));//heading.setfont font "tahoma" , font.bold ,40
		f.add(heading);
		
		
		//menubar -> menu (many menus), -> each menu can have menu items
		
		 menubar = new JMenuBar();
		f. setJMenuBar(menubar);
		
		 menu = new JMenu("Details");
		 menubar.add(menu);
		 
		JMenuItem  cd = new JMenuItem("Add Customer Details");
		cd.addActionListener(this);
		 menu.add(cd);
		 
		 JMenuItem  fd = new JMenuItem("Flight Details"); 		
		 fd.addActionListener(this);
			 menu.add(fd);
			 
			 JMenuItem bf = new JMenuItem("Book Flight"); 	
			 bf.addActionListener(this);
				 menu.add(bf);
				 
				 JMenuItem jd = new JMenuItem("Journey Details"); 	
				 jd.addActionListener(this);
				 menu.add(jd);
				 
				 JMenuItem c = new JMenuItem("Ticket Cancellation"); 		
				 c.addActionListener(this);
				 menu.add(c);
		
	 JMenu ticket = new JMenu("Ticket");	
	 menubar.add(ticket);
	 
	 JMenuItem BoardingPass = new  JMenuItem ("Boarding Pass"); 		
	 BoardingPass.addActionListener(this);
	 
	 JMenu credits = new JMenu("Credits");
	 menubar.add(credits);
	 
	 JMenuItem madeby = new JMenuItem("made by");
	 JMenuItem dharun = new  JMenuItem("Dharun Kumar Murugesan");
	 JMenuItem smile = new  JMenuItem(" :) thank you");
	 
	 credits.add(madeby);
	 credits.add(dharun);credits.add(smile);
	 
	 ticket.add(BoardingPass);
	 
	 
	 
	}
	 public void actionPerformed(ActionEvent ae) {
	        String text = ae.getActionCommand();
	        
	        if (text.equals("Add Customer Details")) {
	            new AddCustomer();
	        } else if (text.equals("Flight Details")) {
	            new FlightDetails();
	        } else if (text.equals("Book Flight")) {
	          new BookFlight();
	        } else if (text.equals("Journey Details")) {
	            new JourneyDetails();
	        } else if (text.equals("Ticket Cancellationt")) {
	           new Cancel();
	        }
	        else if (text.equals("Boarding Pass")) {
		           new BoardingPass();
		        }
	    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Home();

	}

}
