package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import es.cursojava.utilidades.UtilidadesBasesDeDatos;

public class ConsultaBaseDeDatos {
	
	private static final String CONSULTA_EMPLEADOS = "SELECT ID,NOMBRE ,EDAD, SALARIO FROM EMPLEADOS WHERE EDAD>30 ORDER BY SALARIO DESC";

	public static void main(String[] args) {

		Connection conexion = UtilidadesBasesDeDatos.crearConexion();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_EMPLEADOS);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String nombre = rs.getString("NOMBRE");
				int edad = rs.getInt("EDAD");
				int salario = rs.getInt("SALARIO");

				System.out.println("Registro: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				st.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
