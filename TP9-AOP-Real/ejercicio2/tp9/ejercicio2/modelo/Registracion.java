package tp9.ejercicio2.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Registracion {

	// private PersistenciaInsultos persistencia; preguntar como manejamos la
	// inyeccion de dependencia
	private String pathCasa = "C:\\Users\\Frodo\\Desktop\\Uni\\Objetos 2\\RegistrosDeTrabajos\\tp9-RegistroInsultos.txt";

	@After("execution(* *.insultarA(..))")
	public void registrar(JoinPoint joinPoint) {
		// Jugador unJugador = (Jugador) joinPoint.getThis();
		PersonaDelFutbol unaPersona = (PersonaDelFutbol) joinPoint.getThis();
		Arbitro unArbitro = (Arbitro) joinPoint.getArgs()[0];
//		System.out.print("Registración: El jugador " + unJugador.nombre() + " le va a decir " + unJugador.insulto()
//				+ " al árbitro " + unArbitro.nombre());
		String registro = "Registración: La persona " + unaPersona.nombre() + " le va a decir " + unaPersona.insulto()
				+ " al árbitro " + unArbitro.nombre() + System.lineSeparator();

		try {
			Files.write(Paths.get(pathCasa), registro.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo guardar en disco", e);
		}
	}

}
