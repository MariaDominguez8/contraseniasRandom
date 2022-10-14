package ar.com.ada.backend12.ejercicio2;

public class Password {

	/*----- Atributos ----- */

	int longitud = 8;
	String contrasenia;

	/*----- Constructores -----*/

	/**
	 * Constructor por defecto para la/s contrase�a/s a generar. Por defecto genera
	 * una contrase�a de 8 caracteres.
	 */
	public Password() {

		this.longitud = 8;
		this.contrasenia = generarPassword(longitud);

	}

	/**
	 * Constructor para generar contrase�a/s random.
	 * 
	 * @param longitud El par�metro longitud define el n�mero de caracteres que va a
	 *                 contener cada contrase�a a generar.
	 */
	public Password(int longitud) { // Constructor con longitud ingresada por parametro.
		this.longitud = longitud;
		this.contrasenia = generarPassword(longitud);
	}

	/*----- Metodos -----*/

	/**
	 * Este m�todo comprueba si la contrase�a es fuerte o no lo es.
	 * 
	 * @return Un boolean, si la contrase�a es fuerte true, de lo contrario false
	 */
	public boolean esFuerte() {

		if (nroLowerCasse(this.contrasenia) > 1 && nroUpperCasse(this.contrasenia) > 2
				&& cantidNro(this.contrasenia) > 5) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * Este m�todo se encarga de generar una contrase�a con la longitud que el
	 * usuario indique.
	 * 
	 * @param longitud es un entero con el numero que el usuario indique como
	 *                 longitud deseada para generar su/s contrase�a/s
	 * @return Una contrase�a con caracteres (letras,numeros y simbolos) random que
	 *         obtiene de la tabla ascii *
	 */
	private String generarPassword(int longitud) {

		char[] contrasenia = new char[longitud];
		for (int i = 0; i < contrasenia.length; i++) {
			int numero = (int) (Math.floor((Math.random() * 122) + 48)); // Generamos un numero aleatorio

			if (numero >= 48 && numero <= 57) {
				contrasenia[i] = (char) numero; // ese numero aleatorio lo pasamos al caracter con ese valor numerico en
												// la tabla ascii a traves de casting.
			} else if (numero >= 65 && numero <= 90) {
				contrasenia[i] = (char) numero;
			} else if (numero >= 97 && numero <= 122) {
				contrasenia[i] = (char) numero;
			} else {
				contrasenia[i] = (char) ((int) (Math.floor((Math.random() * 57) + 48)));
			}
		}
		return String.valueOf(contrasenia);
	}

	/*----- Metodos privados -----*/

	/**
	 * Este m�todo se encarga de contar la cantidad de minusculas que contiene la
	 * contrase�a
	 * 
	 * @param contrasenia es una cadena de caracteres que contiene la contrase�a ya
	 *                    generada por el metodo generarPassword.
	 * @return El numero de minusculas que contiene la contrase�a.
	 */
	private int nroLowerCasse(String contrasenia) {
		int contador = 0;
		for (int i = 0; i < contrasenia.length(); i++) {

			if (Character.isLowerCase(contrasenia.charAt(i))) {

				contador++;
			}
		}
		return contador;
	}

	/**
	 * Este m�todo se encarga de contar la cantidad de may�sculas que contiene la
	 * contrase�a
	 * 
	 * @param contrasenia es una cadena de caracteres que contiene la contrase�a ya
	 *                    generada por el metodo generarPassword.
	 * @return El numero de may�sculas que contiene la contrase�a.
	 */
	private int nroUpperCasse(String contrasenia) {
		int contador = 0;
		for (int i = 0; i < contrasenia.length(); i++) {

			if (Character.isUpperCase(contrasenia.charAt(i))) {

				contador++;
			}
		}
		return contador;
	}

	/**
	 * Este m�todo se encarga de contar la cantidad de n�meros que contiene la
	 * contrase�a
	 * 
	 * @param contrasenia es una cadena de caracteres que contiene la contrase�a ya
	 *                    generada por el metodo generarPassword.
	 * @return La cantidad de numeros que contiene la contrase�a.
	 */
	private int cantidNro(String contrasenia) { // verifica la cantidad de numeros en la contrasenia
		int contador = 0;
		for (int i = 0; i < contrasenia.length(); i++) {

			if (Character.isDigit(contrasenia.charAt(i))) {
				contador++;
			}
		}
		return contador;
	}

	/*----- M�todos Getters & Setters -----*/
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenia() {
		return contrasenia;
	}

}
