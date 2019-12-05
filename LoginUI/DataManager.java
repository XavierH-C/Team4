import java.sql.*;
import java.util.*;
public class DataManager {
	Connection connection = null;
	
	public DataManager() {
		 try {
	         Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
	     } catch (Exception e) {
	      System.err.println(e.toString());
	     }
		String url = "jdbc:mysql://cs2043.cs.unb.ca:3306/cs204301ateam4";
		try {
		connection = DriverManager.getConnection(url, "cs204301ateam4", "0RLUlIG3");
		} catch (SQLException e) {
		System.err.println("Database connection error.");
		}
	}
	
	public Student studentLogin(int id, String password) {
		Student student = new Student();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from Student where id = " + id + " and password = sha1('" + password + "');";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved row to customer
			rs.next();
			student.studentId = rs.getString(1);
			student.password = rs.getString(2);
			student.firstName = rs.getString(3);
			student.lastName = rs.getString(4);
			student.address = rs.getString(5);
			student.contactInfo = rs.getString(6);
		} catch (SQLException e) {
			System.err.println("SQL error: id or Password is incorrect.");
		}
		return student;
	}
	
	public Professor professorLogin(int id, String password) {
		Professor professor = new Professor();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from Professor where id = " + id + " and password = sha1('" + password + "');";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved row to customer
			rs.next();
			professor.professorId = rs.getString(1);
			professor.password = rs.getString(2);
			professor.firstName = rs.getString(3);
			professor.lastName = rs.getString(4);
			professor.address = rs.getString(5);
			professor.contactInfo = rs.getString(6);
		} catch (SQLException e) {
			System.err.println("SQL error: id or Password is incorrect.");
		}
		return professor;
	}
	
	public TeachingAssistant teachingAssistantLogin(int id, String password) {
		TeachingAssistant teachingAssistant = new TeachingAssistant();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from TeachingAssistant where id = " + id + " and password = sha1('" + password + "');";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved row to customer
			rs.next();
			teachingAssistant.teachingAssistantId = rs.getString(1);
			teachingAssistant.password = rs.getString(2);
			teachingAssistant.firstName = rs.getString(3);
			teachingAssistant.lastName = rs.getString(4);
			teachingAssistant.address = rs.getString(5);
			teachingAssistant.contactInfo = rs.getString(6);
		} catch (SQLException e) {
			System.err.println("SQL error: id or Password is incorrect.");
		}
		return teachingAssistant;
	}
	
	public Admin adminLogin(int id, String password) {
		Admin admin = new Admin();
		try {
			Statement st = connection.createStatement();
			
			//create query string
			String sqlQuery = "select * from Admin where id = " + id + " and password = sha1('" + password + "');";
			
			//execute SQL query
			ResultSet rs = st.executeQuery(sqlQuery);
			
			//convert retrieved row to customer
			rs.next();
			admin.adminId = rs.getString(1);
			admin.password = rs.getString(2);
			admin.firstName = rs.getString(3);
			admin.lastName = rs.getString(4);
			admin.address = rs.getString(5);
			admin.contactInfo = rs.getString(6);
		} catch (SQLException e) {
			System.err.println("SQL error: id or Password is incorrect.");
		}
		return admin;
	}
	
}
