package boom;
import java.sql.Connection;//\\////\\//\\///\/////\/\//\/\/\\//\/\/\/\/\\\///\\//\\//\\//\\/\//\\/\/\//\\/\/\\\//\
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class Conn {

	Connection c;
	Statement s ;
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//c= DriverManager.getConnection("jdbc:mysql:///")
					
					c = DriverManager.getConnection("jdbc:mysql:///air","root","hihello123");
	    	s = c.createStatement();
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		
	}
}
