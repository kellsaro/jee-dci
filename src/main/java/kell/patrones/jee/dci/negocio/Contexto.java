package kell.patrones.jee.dci.negocio;

/**
 * Un contexto contiene el conjunto de objetos necesarios para ejecutar una
 * interacción o lógica de negocio de un caso de uso.
 *
 * Por ejemplo: En contextos seguros con frecuencia es necesario el usuario
 * realizó la acción, a qué hora, desde cuál ubicación, etc...
 *
 * @author Maykell Sánchez Romero - kellsaro@gmail.com
 */
public interface Contexto {

	/**
	 * Determina cuándo se considera válido un contexto.
	 * @return TRUE si es válido, FALSE en caso contrario
	 */
	public boolean esValido();
}
