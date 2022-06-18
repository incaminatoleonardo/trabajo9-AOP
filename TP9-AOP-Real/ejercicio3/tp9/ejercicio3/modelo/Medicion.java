package tp9.ejercicio3.modelo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Medicion {

	@Around("@annotation(Time)") // "execution(* tp9.ejercicio3.modelo.Persona.registrar*(..))")
	public void medirTiempo(ProceedingJoinPoint joinPoint) throws Throwable {
//		StopWatch sw = new StopWatch();
//		Object retVal;
//		try {
//			sw.start(pjp.getTarget() + "." + pjp.getSignature());
//			retVal = joinPoint.proceed();
//		} catch (Throwable e) {
//			throw e;
//		} finally {
//			sw.stop();
//			System.out.println(sw.prettyPrint());
//		}

		long inicio = System.currentTimeMillis();

		joinPoint.proceed();

		long fin = System.currentTimeMillis();

		double tiempo = (double) ((fin - inicio) / 1000);

		System.out.println(tiempo + " segundos");

	}

}
