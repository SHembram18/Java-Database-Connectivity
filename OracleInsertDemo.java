import java.sql.*;
class OracleInsertDemo {

	public static void main(String[] args) {
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");


			Connection con = DriverManager.getConnection(

					"jdbc:oracle:thin:@localhost:1521:xe","Santosh","12345"
				);

			Statement stmt = con.createStatement();


			String sqlCmd = "INSERT INTO students VALUES('19IMCA014','Diptesh','Male','IMCA,UTKAL','9938436939','Nayagarh')";
			con.setAutoCommit(false);
			int rowsAffected = stmt.executeUpdate(sqlCmd);
			con.commit();

			System.out.println(rowsAffected + " records INSERTED Successfully...");

			con.close();

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}