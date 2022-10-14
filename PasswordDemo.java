package ar.com.ada.backend12.ejercicio2;

import java.util.Scanner;

public class PasswordDemo {

	/**
	 * Este m�todo se encarga de iniciar la ejecuci�n del programar �ste es el
	 * m�todo principal del proyecto
	 * 
	 * @param args[] es un arreglo con los par�metros que el reciba por consola
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el nro de contrase�as que desea generar: ");
		int cantContrasenias = entrada.nextInt();
		System.out.print("Ingrese la cantidad de caracteres que tendran las contrase�as: ");
		int cantCaracter = entrada.nextInt();
		entrada.close();
		Password[] contrasenias = new Password[cantContrasenias];
		Boolean[] esFuerte = new Boolean[cantContrasenias];

		for (int i = 0; i < contrasenias.length; i++) {
			contrasenias[i] = new Password(cantCaracter);
			esFuerte[i] = contrasenias[i].esFuerte();
			System.out.println(
					"Contrase�a nro " + (i + 1) + ": " + contrasenias[i].getContrasenia() + "  ---->  " + esFuerte[i]);

		}

	}
}
