package arrays;

public class Operacion {

	public static void main(String[] args) {

		int[] pares = { 2, 4, 6 };
		int[] impares = { 1, 3, 5, 7 };
		int[] numeros = { 1, 2, 3, 4, 5 };

		// acceso a posiciones del array
		// lectura
		System.out.println(pares[2]); // posición de array, empezando por 0

		// escrituta
		pares[2] = 8;
		System.out.println(pares[2]);

		// tamaño de un array
		System.out.println(pares.length);
		System.out.println(impares.length);
		System.out.println(numeros.length);
		System.out.println(impares); // no se puede imprimir un array de esta manera
		System.out.println("\n");

		// bucle for arrays
		for (int i = 0; i < pares.length; i++) {
			// System.out.println (pares[i]);
			System.out.printf("%d ", numeros[i]);
		}
		System.out.println("\n");

		for (int i = 0; i < impares.length; i++) {
			// System.out.println (impares[i]);
			System.out.printf("%d ", numeros[i]);
		}
		System.out.println("\n");

		for (int i = 0; i < numeros.length; i++) {
			// System.out.println (numeros[i]);
			System.out.printf("%d ", numeros[i]);
		}

		// crear un array de tamaño determinado sin indicar valores

		int[] masNumeros = new int[5];
		for (int i = 0; i < masNumeros.length; i++) {
			System.out.printf("%d ", masNumeros[i]);
		}

		// array de tamaño 10, meter los 10 primeros números pares

		int cantidadDePares = 10;
		int[] arrayPares = new int[cantidadDePares];

		for (int i = 0; i < cantidadDePares; i++) {
			arrayPares[i] = (i + 1) * 2;
		}

		for (int i = 0; i < arrayPares.length; i++) {
			System.out.printf("%d ", arrayPares[i]);
		}
		System.out.println();

		// manera más chula de imprimir los arrays

		for (int num : arrayPares) {
			System.out.printf("%d ", num); // podemos añadir num + 100
		}
		System.out.println();

	}

}
