package tp9.ejercicio2.modelo;

public class PersonaDelFutbol {

	private String nombre;
	private String insulto;

	public PersonaDelFutbol(String nombre) {

		this.nombre = nombre;
	}

	public void insultarA(Arbitro arbitro, String insulto) {
		this.insulto = insulto;
		arbitro.escucharInsulto(this.insulto());
	}

	public String insulto() {

		return this.insulto;
	}

	public String nombre() {
		return this.nombre;
	}

}
