package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class ConexionBaseDatos {
    public static void main(String[] args) {
        
        conectaOracle2();
    }

    private static void conectaOracle() {
		String url_oracle = "jdbc:oracle:thin:jose/password@localhost:1522:XE";
		String url_oracle2 = "jdbc:oracle:thin:@localhost:1522:XE";
		String username = "jose";
		String password = "password";

		
		try  {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(url_oracle);
			if (connection!=null) {
				System.out.println("Conexion establecida");
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error " + e.getMessage());
//			e.printStackTrace();
		} 
		//catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}

	}
	
	
	 private static void conectaOracle2() {
	 	String url_oracle = "jdbc:oracle:thin:jose/password@localhost:1522:XE";
	 	String url_oracle2 = "jdbc:oracle:thin:@localhost:1522:XE";
	 	String username = "jose";
	 	String password = "password";

	 	Connection connection = null;
	 	try {
	 		OracleDataSource ods = new OracleDataSource();
	 		ods.setURL(url_oracle);
			
	 		connection = ods.getConnection();
	 		if (connection!=null) {
	 			System.out.println("Conexion establecida");
	 		}
			
	 	} catch (SQLException e) {
	 		// TODO Auto-generated catch block
	 		e.printStackTrace();
	 	} finally {
	 		try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	 }
}
