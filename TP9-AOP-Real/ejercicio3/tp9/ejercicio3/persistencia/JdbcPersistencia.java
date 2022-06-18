package tp9.ejercicio3.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import tp9.ejercicio3.modelo.PersistenciaPersonas;
import tp9.ejercicio3.modelo.Persona;

public class JdbcPersistencia implements PersistenciaPersonas {

	@Override
	public void registrar(Persona persona) {

		Connection con = null;
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/objetos2", "root", "");
			PreparedStatement statement = (PreparedStatement) con
					.prepareStatement("INSERT INTO personas(nombre) VALUES (?)");

			statement.setString(1, persona.nombre());
			statement.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("No se pudo guardar en BD", e);

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					throw new RuntimeException("No pudo cerrar conexion", e);

				}
			}
		}

	}

}
