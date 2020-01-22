package mitier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class authentification {
String mail;
String mdp;

public int Authentifier(String mail,String mdp) {
	
		String url = "jdbc:mysql://localhost/etablissement";
		String login = "root";
		String password = "";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			
			statement = connection.createStatement();
			
			String sql = "SELECT mdp FROM access WHERE mail = '" + this.mail + "'";

			result = statement.executeQuery(sql);
			
			
			
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				connection.close();
				statement.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	if(result!=null)
		return(1);
	return 0;

}}
