package tp9.ejercicio3.modelo;

import tp9.ejercicio3.persistencia.JdbcPersistencia;

public class Persona {

	private String nombre = String.valueOf(Math.random()/* * 10 + 1 */);
	private PersistenciaPersonas persistencia = new JdbcPersistencia();

	@Time
	public void registrar10() {

		for (int i = 1; i <= 10; i = i + 1) {
			persistencia.registrar(new Persona());
		}

	}

	@Time
	public void registrar100() {

		for (int i = 1; i <= 100; i = i + 1) {
			persistencia.registrar(new Persona());
		}

	}

	public String nombre() {
		return this.nombre;
	}

}
