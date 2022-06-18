package tp9.ejercicio2.main;

import tp9.ejercicio2.modelo.Arbitro;
import tp9.ejercicio2.modelo.Dirigente;
import tp9.ejercicio2.modelo.Jugador;
import tp9.ejercicio2.modelo.PersonaDelFutbol;
import tp9.ejercicio2.modelo.Tecnico;

public class MainPrueba {

	public static void main(String[] args) {

		Arbitro lunati = new Arbitro("lunati");
		Jugador messi = new Jugador("messi");
		PersonaDelFutbol caruso = new Tecnico("Caruso");
		PersonaDelFutbol moyano = new Dirigente("Moyano");

		messi.insultarA(lunati, "LTA");
		caruso.insultarA(lunati, "Sin Verguenza");
		moyano.insultarA(lunati, "HDP");

	}

}
