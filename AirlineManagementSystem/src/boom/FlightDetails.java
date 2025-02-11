package boom;
import javax.swing.*;

import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;
public class FlightDetails extends JFrame implements ActionListener {
	JButton back ;
    
    public FlightDetails() {
        
        getContentPane().setBackground(Color.black);
        setLayout(null);
        
        JTable table = new JTable();
        
        try {
            Conn conn = new Conn();
            
            ResultSet rs = conn.s.executeQuery("select * from flight");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 800, 500);
        add(jsp);
        
        setSize(800, 500);
        setLocation(400, 200);
        setVisible(true);
        
       back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.cyan);
        back.setBounds(900,800,50,50);
        add(back);
        //save.addActionListener(this);
    }

    public void actionPerformed (ActionEvent ae) {
    	if(ae.getSource()==back) {
    		setVisible(false);
    	}
    }
    public static void main(String[] args) {
        new FlightDetails();
    }
}
