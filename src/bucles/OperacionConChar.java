package bucles;

public class OperacionConChar {

	public static void main(String[] args) {

		// H) El abecedario inglés de letras minúsculas es:abcdefghijklmnopqrstuvwxyz

		System.out.printf("El abecedario de letras minúsculas es: ");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
			System.out.printf("%c ", i);
		}

		// Otra manera:

		char valor_inicial1 = 'a';
		char valor_final1 = 'z';

		System.out.printf("El abecedario inglés de letras minúsculas es: %n");
		for (char i = valor_inicial1; i <= valor_final1; i++) {
			System.out.printf("%c ", i);
		}
		System.out.println("\n");

		// i) El abecedario inglés de letras mayúsculas es: ABCDEFGHIJKLMNOPQRSTUVWXYZ

		System.out.printf("%nEl abecedario de letras mayúsculas es: ");
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}

		// Otra manera:

		char inicio2 = 'A';
		char fin2 = 'Z';
		System.out.printf("El abecedario inglés de letras mayúsculas es: %n");
		for (char i = inicio2; i <= fin2; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// j) El abecedario inglés de letras minúsculas de 3 en 3 letras es:adgjmpsvy

		System.out.printf("%nEl abecedario inglés de letras minúsculas de 3 en 3 letras es: ");
		for (char i = 'a'; i <= 'z'; i += 3) {
			System.out.print(i + " ");
		}

		// Otra manera:

		int salto = 3;
		System.out.printf("El abecedario ingles de letras minusculas de %d en %d letras es: %n", salto, salto);
		for (char i = valor_inicial1; i <= valor_final1; i += salto) {
			System.out.printf("%c ", i);
		}
		System.out.println("\n");

		// k) El abecedario inglés de letras minúsculas al revés es:
		// zyxwvutsrqponmlkjihgfedcba

		System.out.printf("%nEl abecedario inglés de letras minúsculas al revés es: ");

		for (char i = 'z'; i >= 'a'; i--) {
			System.out.print(i + " ");
		}

		// Otra manera:

		char fin = 'a';
		char ini = 'g';
		System.out.printf("El abecedario inglés de letras minusculas alreves es: %n");
		for (char i = ini; i >= fin; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// l) El abecedario inglés alternando mayúsculas y minúsculas es:
		// AbCdEfGhIjKlMnOpQrStUvWxYz

		char caracter_inicial = 'A';
		char caracter_final = 'Z';

		System.out.println("El abecedario inglés alternando mayúsculas y minúsculas es: ");
		System.out.print(" ");

		boolean mayuscula = true;
		for (char c = caracter_inicial; c <= caracter_final; c++) {
			if (mayuscula == true) {
				System.out.print(c);
				mayuscula = false;
			} else {
				System.out.print((char) (c + 32));
				mayuscula = true;
			}
		}

		// *) El abecedario inglés alternando mayúsculas, minúsculas y símbolo es:
		// Ab*De*Gh*Jk*Mn*Pq*St*Vw*Yz

		char inicio = 'A';
		char fina = 'Z';
		char distancia = 'a' - 'A';
		// boolean EscribirEnMayusculas = true;
		int tipoDeEscritura = 0;

		for (char c = inicio; c <= fina; c++) {
			if (tipoDeEscritura == 0) {
				System.out.print(c);
				// tipoDeEscritura = 1;
			} else if (tipoDeEscritura == 1) {
				System.out.print((char) (c + distancia));
				// tipoDeEscritura = 2;
			} else {
				System.out.print("*");
				// tipoDeEscritura = 0;
			}

			tipoDeEscritura = tipoDeEscritura == 2 ? 0 : ++tipoDeEscritura; // Si utilizamos esta línea, no hay que
																			// poner los demás comentario
		}

	}

}
