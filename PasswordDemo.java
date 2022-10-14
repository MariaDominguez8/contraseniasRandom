package ar.com.ada.backend12.ejercicio2;

import java.util.Scanner;

public class PasswordDemo {

	/**
	 * Este método se encarga de iniciar la ejecución del programar Éste es el
	 * método principal del proyecto
	 * 
	 * @param args[] es un arreglo con los parámetros que el reciba por consola
	 * @return void
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese el nro de contraseñas que desea generar: ");
		int cantContrasenias = entrada.nextInt();
		System.out.print("Ingrese la cantidad de caracteres que tendran las contraseñas: ");
		int cantCaracter = entrada.nextInt();
		entrada.close();
		Password[] contrasenias = new Password[cantContrasenias];
		Boolean[] esFuerte = new Boolean[cantContrasenias];

		for (int i = 0; i < contrasenias.length; i++) {
			contrasenias[i] = new Password(cantCaracter);
			esFuerte[i] = contrasenias[i].esFuerte();
			System.out.println(
					"Contraseña nro " + (i + 1) + ": " + contrasenias[i].getContrasenia() + "  ---->  " + esFuerte[i]);

		}

	}
}
