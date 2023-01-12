import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Connect{

	private static String url, bdd= "location";
	private static String user= "root";
	private static String passwd= "";
	private static Connection connect;
        private static String ipLocal = "localhost";

	
	public Connect(String bdd, String user, String passwd) {
		// TODO Auto-generated constructor stub
		this.bdd = bdd;
		this.user = user;
		this.passwd = passwd;
	}

	/**
	 * @return
	 */
	public static Connection getInstance() throws ClassNotFoundException{
		url = "jdbc:mysql://" + ipLocal + ":3306/"+bdd;
		if(connect == null){
                               

			try {
                                Class.forName("com.mysql.jdbc.Driver");

				connect = DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERREUR DE CONNEXION ! ", JOptionPane.ERROR_MESSAGE);
			}
		
                
          
                
                
                
                
                
                }		
		return connect;	
	}
}
