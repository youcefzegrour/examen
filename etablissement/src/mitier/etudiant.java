package mitier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class etudiant {
 public etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
public etudiant(String id, String nom, String prenom, String mail, String adresse, int tel, Date dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.dateNaissance = dateNaissance;
	}
private String id;
private String nom;
private String prenom;
private String mail;
private String adresse;
private int tel;
private Date dateNaissance;

public void Creer(etudiant e) {
	e.id=this.id;
	e.nom=this.nom;
	e.prenom=this.prenom;
	e.mail=this.mail;
	e.adresse=this.adresse;
	e.tel=this.tel;
	e.dateNaissance=this.dateNaissance;
	
	
	String url= "jdbc:mysql://localhost/etablissement";
	String login = "root";
	String passwd = "";
	Connection cn=null;
	Statement st=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		cn=DriverManager.getConnection(url,login,passwd);
		st=cn.createStatement();
		String sql="INSERT INTO  (etudiant) VALUES ('"+id+","+ nom +","+prenom+","+mail+","+adresse+","+tel+","+dateNaissance+"')";
		st.executeUpdate(sql);
		

	}catch(SQLException e1) {
		e1.printStackTrace();
	
}catch(ClassNotFoundException e1) {
	e1.printStackTrace();}
	finally { try {
		cn.close();
		st.close();
	}catch(SQLException e1) {
		e1.printStackTrace();
	}}
	
	
	
	
	
	
}
public void Modifier(etudiant e ,String adresse) {
	e.adresse=this.adresse;
	
	

	String url= "jdbc:mysql://localhost/etablissement";
	String login = "root";
	String passwd = "";
	Connection cn=null;
	Statement st=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		cn=DriverManager.getConnection(url,login,passwd);
		st=cn.createStatement();
		String sql = "UPDATE etudiant" + "SET adresse = '" + this.adresse+ "'" + "WHERE adresse = '" + adresse+ "'";
		st.executeUpdate(sql);
		

	}catch(SQLException e1) {
		e1.printStackTrace();
	
}catch(ClassNotFoundException e1) {
	e1.printStackTrace();}
	finally { try {
		cn.close();
		st.close();
	}catch(SQLException e1) {
		e1.printStackTrace();
	}}
	
	
	
}
public void supprimer (etudiant e) {
	   
	String url= "jdbc:mysql://localhost/etablissement";
	String login = "root";
	String passwd = "";
	Connection cn=null;
	Statement st=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		cn=DriverManager.getConnection(url,login,passwd);
		st=cn.createStatement();
		String sql = "DELETE FROM etudiant WHERE Id = '" + e.id + "'";
		
		st.executeUpdate(sql);
		

	}catch(SQLException e1) {
		e1.printStackTrace();
	
}catch(ClassNotFoundException e1) {
	e1.printStackTrace();}
	finally { try {
		cn.close();
		st.close();
	}catch(SQLException e1) {
		e1.printStackTrace();
	}}
	
	
	
	
}
public void lister(){
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
			
			String sql = "SELECT * FROM etudiant  ";

			System.out.println("Les Etudiants : ");
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
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public int getTel() {
	return tel;
}
public void setTel(int tel) {
	this.tel = tel;
}
public Date getDateNaissance() {
	return dateNaissance;
}
public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}
@Override
public String toString() {
	return "etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse
			+ ", tel=" + tel + ", dateNaissance=" + dateNaissance + "]";
}}
