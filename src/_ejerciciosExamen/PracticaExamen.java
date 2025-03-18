package _ejerciciosExamen;

public class PracticaExamen {

	public static void main(String[] args) {

		// 🟢 [0001] Cuenta las letras del alfabeto inglés cuyo valor numérico es par.

		char abc = ' ';
		char valor_inicial = 'a';
		char valor_final = 'z';
		int contador = 0;

		for (char c = valor_inicial; c <= valor_final; c++) {
			if (c % 2 == 0) {
				// System.out.print (c);
				contador++;
			}
		}

		System.out.printf("La cantidad de las letras del alfabeto inglés cuyo valor numérico es par es: %d. ",
				contador);

		/*
		 * 🟢 [0002] Crea una variable de tipo byte b con valor 20, otra de tipo short s
		 * con valor 20 y otra de tipo i int con valor 20. Consigue que las siguientes
		 * operaciones muestren el resultado correcto al ser impresas. s + i s + s s + b
		 * b + b
		 */

		byte b = 20;
		short s = 20;
		int i = 20;
		int suma = 0;

		System.out.printf("La operación s + i = %d%n", suma = s + i);
		System.out.printf("La operación s + s = %d%n", suma = s + s);
		System.out.printf("La operacion s + b = %d%n", suma = s + b);
		System.out.printf("La operación b + b = %d%n", suma = b + b);

		/*
		 * 🟢 [0011] Crea, utilizando operadores ternarios un programa que en base al
		 * valor de una variable de tipo byte para la hora y otra de tipo String para el
		 * nombre, salude. Los posibles saludos se muestran en el ejemplo abajo. Los
		 * horarios son: Buenos días: de 6 a 14. Buenas tardes: de 15 a 21. Buenas
		 * noches: de 22 a 24.
		 */

		byte hora = 24;
		String nombre = "Cosmin";

		String saludo = hora >= 6 && hora <= 14 ? "Buenos días"
				: hora >= 15 && hora <= 21 ? "Buenas tardes"
						: hora >= 22 && hora <= 24 ? "Buenas noches" : "Hora no válida, por favor introduce otra hora";

		System.out.printf("%s %s", saludo, nombre);

		// 🟢 [0012] Dado un array de números [1, 2, 3, 4, 5], calcula la suma de todos
		// los elementos.

		int[] numeros = { 1, 2, 3, 4, 5 };
		int suma1 = 0;

		for (int i1 = 0; i1 < numeros.length; i1++) {
			suma1 = suma1 + numeros[i1];
			// suma += numeros[i];

		}
		System.out.print(suma1);

		// OTRA MANERA:

		int[] elementos = { 1, 2, 3, 4, 5 };
		int suma11 = 0;

		for (int elemento : elementos) {
			suma11 += elemento;
		}
		System.out.printf("La suma de los elementos del array es %d%n", suma11);

		// En un bucle for-each, no necesitas índices para acceder a los elementos del
		// array, ya que el bucle automáticamente tira sobre cada elemento del array y
		// te lo asigna a la variable (num en este caso).

		// 🟢 [0013] Dado un array [2, -3, 4, -1, 6], reemplaza todos los valores
		// negativos por cero.

		int[] elementos1 = { 2, -3, 4, -1, 6 };

		for (int i1 = 0; i1 < elementos1.length; i1++) {
			if (elementos1[i1] < 0) {
				elementos1[i1] = 0;
			}
		}
		for (int cambio : elementos1) {
			System.out.printf("%d ", cambio);
		}

		// 🟡 [0003] Crea un array con los siguientes valores {1, 3, 5, 7} otro con los
		// siguientes valores {2, 4, 6, 8}y crea otro array para calcular los productos
		// de los elementos del mismo índice y almacenarlos con el mismo índice.

		int[] valores1 = { 1, 3, 5, 7 };
		int[] valores2 = { 2, 4, 6, 8 };
		int[] productos = new int[valores1.length];

		for (int in = 0; in < productos.length; in++) {
			productos[in] = valores1[in] * valores2[in];
		}
		// añadimos for each
		for (int num : productos) {
			System.out.printf("%d ", num);
		}

		// OTRA MANERA:

		int[] valores11 = { 1, 3, 5, 7 };
		int[] valores22 = { 2, 4, 6, 8 };
		int[] producto = { 1 * 2, 3 * 4, 5 * 6, 7 * 8 };

		for (int elem : producto) {
			System.out.printf("%d ", elem);
		}

		// OTRA MANERA (se puede hacerlo así, pero es más larga y no tan limpia)

		int[] primerArray = { 1, 3, 5, 7 };
		int[] segundoArray = { 2, 4, 6, 8 };
		int[] tercerArray = new int[primerArray.length];
		int producto1 = 1;

		for (int i1 = 0; i1 < primerArray.length; i1++) {
			producto1 = primerArray[i1] * segundoArray[i1];
			System.out.printf("%d ", producto1);
		}

		// 🟡 [0004] Muestra los char ‘1’ a ‘9’ 3 veces tal y como ves en el ejemplo (no
		// puedes usar números, debes usar char). Debe estar preparado para cambiar el
		// número de veces que se muestra la lista de elementos. Hay un detalle fino, y
		// es que en la última vez no se muestra al final el -.
		// 123456789-123456789-123456789

		char abc1 = ' ';
		char valor_inicial1 = '1';
		char valor_final1 = '9';
		int repeticion = 3;

		for (int i1 = 0; i1 < repeticion; i1++) {
			for (char c = valor_inicial1; c <= valor_final1; c++) {
				System.out.print(c);
			}
			/*
			 * if (i != repeticion - 1){ System.out.print (" - " ); }
			 */

			if (i1 < repeticion - 1) {
				System.out.print(" - ");
			}
		}

			// 🟡 [0005] Crea un cuadrado de 5 x 5 como el de la figura empleando bucles
			// for.

			int filas = 5;
			for (int f = 0; f < filas; f++) {
				for (int c = 0; c < filas; c++) {
					System.out.print("*");
				}
				System.out.println();
			}

			int base = 10;
			int altura = 5;

			for (int f = 0; f < altura; f++) {
				for (int c = 0; c < base; c++) {
					System.out.print("*");
				}
				System.out.println();

			}
		}
	

}
