package ar.com.ada.backend12.ejercicio2;

public class Password {

	/*----- Atributos ----- */

	int longitud = 8;
	String contrasenia;

	/*----- Constructores -----*/

	/**
	 * Constructor por defecto para la/s contraseña/s a generar. Por defecto genera
	 * una contraseña de 8 caracteres.
	 */
	public Password() {

		this.longitud = 8;
		this.contrasenia = generarPassword(longitud);

	}

	/**
	 * Constructor para generar contraseña/s random.
	 * 
	 * @param longitud El parámetro longitud define el número de caracteres que va a
	 *                 contener cada contraseña a generar.
	 */
	public Password(int longitud) { // Constructor con longitud ingresada por parametro.
		this.longitud = longitud;
		this.contrasenia = generarPassword(longitud);
	}

	/*----- Metodos -----*/

	/**
	 * Este método comprueba si la contraseña es fuerte o no lo es.
	 * 
	 * @return Un boolean, si la contraseña es fuerte true, de lo contrario false
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
	 * Este método se encarga de generar una contraseña con la longitud que el
	 * usuario indique.
	 * 
	 * @param longitud es un entero con el numero que el usuario indique como
	 *                 longitud deseada para generar su/s contraseña/s
	 * @return Una contraseña con caracteres (letras,numeros y simbolos) random que
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
	 * Este método se encarga de contar la cantidad de minusculas que contiene la
	 * contraseña
	 * 
	 * @param contrasenia es una cadena de caracteres que contiene la contraseña ya
	 *                    generada por el metodo generarPassword.
	 * @return El numero de minusculas que contiene la contraseña.
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
	 * Este método se encarga de contar la cantidad de mayúsculas que contiene la
	 * contraseña
	 * 
	 * @param contrasenia es una cadena de caracteres que contiene la contraseña ya
	 *                    generada por el metodo generarPassword.
	 * @return El numero de mayúsculas que contiene la contraseña.
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
	 * Este método se encarga de contar la cantidad de números que contiene la
	 * contraseña
	 * 
	 * @param contrasenia es una cadena de caracteres que contiene la contraseña ya
	 *                    generada por el metodo generarPassword.
	 * @return La cantidad de numeros que contiene la contraseña.
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

	/*----- Métodos Getters & Setters -----*/
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
