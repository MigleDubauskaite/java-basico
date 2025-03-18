package bucles;

public class Operacion {

	public static void main(String[] args) {

		// a) Entre 50 y 2500 hay XX números múltiplos de 13.

		int contador_de_multiplos = 0;
		int valor_inicial = 50;
		int valor_final = 2500;
		int multiplo_de = 13;

		for (int i = valor_inicial; i <= valor_final; i++) {
			if (i % 13 == 0) {
				contador_de_multiplos++;// incremento el contador de multiplos
			}
		}

		System.out.printf("A) Entre %d y %d hay %d multiplos de 13", valor_inicial, valor_final, contador_de_multiplos,
				multiplo_de);

		System.out.println("a) Entre " + valor_inicial + " y " + valor_final + " hay " + contador_de_multiplos
				+ " números múltiplos de " + multiplo_de + ".");

		// Otra manera:

		int contador = 0;
		for (int i = 50; i <= 2500; i++) {
			if (i % 13 == 0) {
				contador++;// incremento el contador de multiplos
			}
		}
		System.out.printf("A) Entre 50 y 2500 hay %d multiplos de 13", contador);

		// B) La cuenta atrás de 7 en 7 desde 1935 a 1812 es:

		int inicio = 1_935;
		int fin = 1_812;
		int cuenta_por = 7;
		System.out.printf("B) La cuenta atrás de %d en %d desde %d a %d es:  %n    ", cuenta_por, cuenta_por, inicio,
				fin);

		for (int i = inicio; i >= fin; i -= 7) {
			System.out.printf("%d ", i);
		}
		System.out.println();

		// C) El producto de los números impares entre 10 y 20 es XX.

		int valor_inicial1 = 10;
		int valor_final1 = 20;
		int producto = 1;

		for (int i = valor_inicial1; i <= valor_final1; i++) {
			if (i % 2 != 0) {
				producto = producto * i;
				producto *= i;
			}
		}
		System.out.printf("El producto de los números impares entre %d y %d es %d%n  ", valor_inicial1, valor_final1,
				producto);

		// D) La suma de los números entre 70 y 800 es XXX.

		int valor_inicial2 = 70;
		int valor_final2 = 800;
		int suma = 0;

		for (int i = 70; i <= 800; i++) {
			suma += i;
		}
		System.out.printf("D) La suma de los números entre %d y %d es %d. %n", valor_inicial2, valor_final2, suma);

		// E) Esta es la cadena de texto AAAAAAAAAAAAAAAAAAAAAAAAA y ha sido obtenida
		// concatenando 25 veces la A.

		String texto = "";
		int numero_de_veces = 25;

		for (int i = 0; i < numero_de_veces; i++) {
			texto = texto + "A";
		}
		System.out.printf("E) Esta es la cadena de texto %s y ha sido obtenida concatenando %d veces la A. %n", texto,
				numero_de_veces);

		// Otra manera:

		String texto1 = " ";
		String texto_a_concatenar = "A";
		int num_veces = 25;

		for (int i = 0; i < num_veces; i++) {
			texto1 = texto1 + texto_a_concatenar;
		}
		System.out.printf("E) Esta es la cadena de texto %s y ha sido obtenida concatenando %d veces la A. %n", texto1,
				num_veces);

		// F) La suma de los cuadrados de los números pares entre 15 y 70 es XXX.

		int valor = 15;
		int valorfinal = 70;
		int suma1 = 0;

		for (int i = valor; i <= valorfinal; i++) {
			if (i % 2 == 0) {
				suma1 = suma1 + i * i;
				// suma *= i * i;
			}
		}
		System.out.printf("F) La suma de los cuadrados de los números pares entre %d y %d es %d. %n", valor, valorfinal,
				suma1);

	}

}
