package kell.patrones.jee.dci.negocio;

import java.io.Serializable;

/**
 * En una interacción se define la lógica de negocio. La iteracción hace uso de
 * los datos que provee el contexto para implementar la lógica.
 *
 * @author Maykell Sánchez Romero - kellsaro@gmail.com
 *
 */
public abstract class InteraccionBasica implements Serializable {

	private static final long serialVersionUID = 9012625353147119396L;

	/**
	 * Realiza la ejecución de la lógica de negocio.
	 *
	 * @return Object Depende de la implementación, este es un enfoque general y
	 *         permite devolver cualquier objeto, o null si no es de interés la
	 *         devolución.
	 *
	 * @throws ContextoNoValido
	 *             Cuando el contexto no es válido pues falta algún dato para la
	 *             correcta ejecución de la lógica de negocio
	 *
	 * @throws Exception
	 *             Una excepción que queda en dependencia de la implementación
	 *             de la lógica de negocio. Por ejemplo: En algunos casos podría
	 *             lanzarse OptimisticLockException, que es una excepción que
	 *             lanza la BD cuando se hace uso de versionamiento de entidades
	 *             para no sobreescribir los cambios realizados por otro usuario
	 *             sin conocimiento del hecho.
	 */
	public Object ejecutar() throws ContextoNoValido, Exception {

		if (!getContexto().esValido()) throw new ContextoNoValido(getContexto().toString());

		Object o = ejecucionDeLaLogicaDeNegocio();

		return o;
	}

	/**
	 * Método donde se define la lógica de negocio. Debe ser implementado por
	 * las interacciones.
	 *
	 * @return Object
	 */
	protected abstract Object ejecucionDeLaLogicaDeNegocio();

	/**
	 * Método para recuperar un contexto
	 * 
	 * @return Contexto
	 */
	public abstract Contexto getContexto();

}
