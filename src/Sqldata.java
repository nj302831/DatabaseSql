import java.sql.*;
public class Sqldata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/data1","root","1234567890mysql@");
				Statement  stmt=con.createStatement();
		System.out.println("inserting record");
		String sql="Insert Into employee values('niki','20')";
		stmt.executeUpdate(sql);
		
		}catch (Exception e) {
			System.out.println(e);
		}
	

	}

}
