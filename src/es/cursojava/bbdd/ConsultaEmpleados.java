package es.cursojava.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import es.cursojava.utilidades.UtilidadesBasesDeDatos;

public class ConsultaEmpleados {

	private static final String CONSULTA_EMPLEADOS = "SELECT ID,NOMBRE ,EDAD, SALARIO,DEPARTAMENTO_ID,FECHA_CONTRATACION FROM EMPLEADOS";
	private static final String CONSULTA_DEPARTAMENTOS = "SELECT e.id, e.nombre, e.edad, e.salario, e.departamento_id, e.fecha_contratacion, d.id as ID_D, d.nombre_departamento,d.fecha_creacion FROM DEPARTAMENTOS d JOIN EMPLEADOS e ON e.departamento_id=d.id";
	public static void main(String[] args) {

		ConsultaEmpleados main = new ConsultaEmpleados();

		List<Empleado> listaEmpleados = main.crearLista();
		System.out.println("Hay " + listaEmpleados.size() + " empleados");

		int edad = 30;
		List<Empleado> listaEmpleadosMayor = main.filtroEdad(edad);
		System.out.println("Hay " + listaEmpleadosMayor.size() + " empleados mayores de " + edad);

		Map<Integer, List<Empleado>> equipos = main.equiposEmpleados();
		Set<Entry<Integer, List<Empleado>>> entries = equipos.entrySet();
		for (Entry<Integer, List<Empleado>> entry : entries) {
			System.out.println("Equipo " + entry.getKey() + ": Tiene " + entry.getValue().size() + " empleados");
		}
		
		Map<String, Equipo> equiposDepartamentos = main.crearEquipos();
		Set<Entry<String, Equipo>> entriesDepartamentos = equiposDepartamentos.entrySet();
		for (Entry<String, Equipo> entry : entriesDepartamentos) {
			System.out.println("Equipo " + entry.getKey() + entry.getValue());
		}
	}

	public List<Empleado> crearLista() {
		List<Empleado> empleados = new ArrayList<Empleado>();

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
				float salario = rs.getFloat("SALARIO");
				int departamento_id = rs.getInt("DEPARTAMENTO_ID");

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date fecha = null;
				try {
					fecha = format.parse(rs.getString("FECHA_CONTRATACION"));
				} catch (ParseException e) {
					e.printStackTrace();
				}

				Empleado empleado = new Empleado(id, nombre, edad, salario, departamento_id, fecha);
				empleados.add(empleado);
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
		return empleados;
	}

	public List<Empleado> filtroEdad(int mayorEdad) {
		List<Empleado> empleadosEdadMayor = new ArrayList<Empleado>();

		Connection conexion = UtilidadesBasesDeDatos.crearConexion();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_EMPLEADOS+" WHERE EDAD>"+mayorEdad);
			//rs = st.executeQuery(CONSULTA_EMPLEADOS_EDAD);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String nombre = rs.getString("NOMBRE");
				int edad = rs.getInt("EDAD");
				float salario = rs.getFloat("SALARIO");
				int departamento_id = rs.getInt("DEPARTAMENTO_ID");

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date fecha = null;
				try {
					fecha = format.parse(rs.getString("FECHA_CONTRATACION"));
				} catch (ParseException e) {
					e.printStackTrace();
				}

				Empleado empleado = new Empleado(id, nombre, edad, salario, departamento_id, fecha);
				empleadosEdadMayor.add(empleado);
				
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
		return empleadosEdadMayor;
	}

	public Map<Integer, List<Empleado>> equiposEmpleados() {
		Map<Integer, List<Empleado>> equiposEmpleados = new HashMap<>();
		List<Empleado> empleados = crearLista();
		
		for (Empleado empleado : empleados) {

			if (equiposEmpleados.get(empleado.getDepartamento_id()) == null) {
				List<Empleado> equipoEmp = new ArrayList<>();
				equipoEmp.add(empleado);
				equiposEmpleados.put(empleado.getDepartamento_id(), equipoEmp);
			} else {
				equiposEmpleados.get(empleado.getDepartamento_id()).add(empleado);
			}
		}
		return equiposEmpleados;
	}

	public Map<String, Equipo> crearEquipos() {
		Map<String, Equipo> equipos = new HashMap<>();
		Equipo equipo = null;
		Connection conexion = UtilidadesBasesDeDatos.crearConexion();
		Statement st = null;
		ResultSet rs = null;
		try {
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_DEPARTAMENTOS);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String nombre = rs.getString("NOMBRE");
				int edad = rs.getInt("EDAD");
				float salario = rs.getFloat("SALARIO");
				int departamento_id = rs.getInt("DEPARTAMENTO_ID");

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date fecha = null;
				try {
					fecha = format.parse(rs.getString("FECHA_CONTRATACION"));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				int idD = rs.getInt("ID_D");
				String nombreD = rs.getString("NOMBRE_DEPARTAMENTO");
				SimpleDateFormat formatD = new SimpleDateFormat("yyyy-MM-dd");
				Date fechaD = null;
				try {
					fechaD = format.parse(rs.getString("FECHA_CREACION"));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				Empleado empleado = new Empleado(id, nombre, edad, salario, departamento_id, fecha);
				

				if (equipos.get(nombreD) == null) {
					equipo = new Equipo(idD, nombreD, fechaD, new ArrayList<Empleado>());
					equipo.getEmpleados().add(empleado);
					equipos.put(equipo.getNombreDepartamento(), equipo);
				} else {
					equipos.get(equipo.getNombreDepartamento()).getEmpleados().add(empleado);
				}
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
		return equipos;
	}
}
