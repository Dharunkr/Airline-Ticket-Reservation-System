package boom;
import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
public class Login implements ActionListener {
	JButton close,submit,reset = new JButton();
	JFrame f = new JFrame();
	JTextField tfus;
	JTextField tfpass ;

	public Login() {
		f.setVisible(true);
		f.setSize(410,250);
		f.setLocation(600,300);
		f.getContentPane().setBackground(Color.black);
		f.setLayout(null);
		
		JLabel username = new JLabel("Username :");
		username.setBounds(20,20,100,20);
		username.setForeground(Color.cyan);
		f.add(username);
		
		JLabel password = new JLabel("Password :");
		password.setBounds(20,70,100,20);
		password.setForeground(Color.cyan);
		f.add(password);
		
		 tfus = new JTextField();
		tfus.setBounds(130,20,200,20);
		f.add(tfus);
		
		 tfpass = new JTextField();
		tfpass.setBounds(130,70,200,20);
		f.add(tfpass);
		
		JPasswordField tfpasss = new JPasswordField();
		tfpass.setBounds(130,70,200,20);
		f.add(tfpasss);
		
		 submit = new JButton("SUBMIT");
		submit.setBounds(190,120,120,20);
		f.add(submit);
		submit.addActionListener(this);
		
		 close = new JButton("CLOSE");
		close.setBounds(120,160,120,20);
		close.addActionListener(this);

		f.add(close);
		
		 reset = new JButton("RESET");
		reset.setBounds(40,120,120,20);
		f.add(reset);
		reset.addActionListener(this);
		
		
	}
	public void actionPerformed (ActionEvent ae) {
		if(ae.getSource()==submit) {
			String usernamee =  tfus.getText();
			String password = tfpass.getText();
		
		
		try {
			Conn c = new Conn();
			String query = "select * from login where username = '"+usernamee+"' and password = '"+password+"'";
			ResultSet rs =	c.s.executeQuery(query);
			
			if(rs.next()) {
				new Home();
				f.setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null, "bhak bsdk");
				f.setVisible(false);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		}
		if(ae.getSource()==close) {
			f.setVisible(false);
		}
		else if(ae.getSource()==reset) {
			 tfus.setText("");
			 tfpass.setText("");
		}
	} 
	public static void main(String[] args) {
		new Login();

	}

}
