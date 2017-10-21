package kell.patrones.jee.dci.negocio;

/* Se lanza cuando el contexto no es válido para la
 * ejecución de la lógica de negocio.
 */
public class ContextoNoValido extends Exception {

	private static final long serialVersionUID = 7543466440595592560L;

	public ContextoNoValido() {
	}

	public ContextoNoValido(String message) {

		super(message);
	}
}
