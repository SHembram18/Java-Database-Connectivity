
import java.sql.*;
class OracleConTest {
	public static void main(String[] args) {
		
	
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2 Create the connection object
			Connection con = DriverManager.getConnection(

			"jdbc:oracle:thin:@localhost:1521:xe","Santosh","12345");
			System.out.println("Log-In to Oracle Database Done Successfully...");


			//step3 create the statement object
			Statement stmt = con.createStatement();

			//step4 excute query
			ResultSet rs = stmt.executeQuery("select * from students");
			int count = 0;
			while(rs.next()) {

				count++;
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));

			}
			System.out.println(count+" records found...");

			//step5 close the connection object
			con.close();


		}
		catch(Exception e) {

			System.out.println(e);
		}
	}

}
