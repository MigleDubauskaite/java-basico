package decisiones;

public class IfElse {

	public static void main(String[] args) {

		int edad = 2;

		if (edad >= 18) {
			System.out.println("Hola, que tal estas?");
			System.out.println("Te gusta cine?");
		} else if (edad > 100) {
			System.out.println("¿Como se siente usted?");
		}

		else {
			System.out.println("Hola niño");
		}

		int numero = 7;

		if (numero == 1) {
			System.out.println("PIM");
		}

		else if (numero == 4 || numero == 5) {
			System.out.println("PAM");
		}

		else if (numero == 7 || numero == 8 || numero == 9) {
			System.out.println("PUM");
		}

		else if (numero == 2 || numero == 3 || numero == 10) {
			System.out.printf("PLAM");
		}

		if (numero > 10) {
			System.out.printf("OLE");
		}

		int edad1 = 1;
		String nombre = "Juan";
		String texto_variable = "no se que";

		// Método 1º: if - else (pero repetimos código)

		if (edad1 >= 18) {
			System.out.printf("%s tiene %d años y es mayor de edad.%n", nombre, edad1);
		} else {
			System.out.printf("%s tiene %d y es menor de edad.", nombre, edad1);
		}

		// Método 2º: if - else, (pero no repetimos código)

		if (edad1 >= 18) {
			texto_variable = "mayor";
		} else {
			texto_variable = "menor";
		}
		System.out.printf("%s tiene %d años y es %s de edad%n", nombre, edad1, texto_variable);

		// Método 3º: operador ternario en la determinación del texto variable

		texto_variable = (edad1 >= 18 ? "mayor" : "menor");
		System.out.printf("%s tiene %d años y es %s de edad%n", nombre, edad1, texto_variable);

		// Método 4º: operador ternario y solución en una sola línea + plural de años

		System.out.printf("%s tiene %d año%s y es %s de edad%n", nombre, edad1, edad1 == 1 ? "" : "s",
				edad1 >= 18 ? "mayor" : "menor");

		// Método 5º: operador ternario

		System.out.printf("La persona que se llama %s y que tiene %d año%s es %s%n ", nombre, edad1,
				edad1 == 1 ? "" : "s", edad1 >= 18 ? "mayor de edad" : "menor de edad");
		// —----------------------------------------------------------------------------------------------------------------

		// Metodo 1º

		int podium = 1;
		String nombre1 = "Juan";

		System.out.printf("%s es un %s.%n", nombre1,
				podium == 1 ? "campeón " : (podium == 2 ? "subcampeón" : "perdedor"));

		// Metodo 2º

		int podium2 = 1;
		int numero_de_preguntas_respondidas = 0;

		if (podium2 == 1) {
			numero_de_preguntas_respondidas++;
			System.out.println("Es campeón");
		} else if (podium2 == 2) {
			numero_de_preguntas_respondidas++;
			System.out.println("Es subcampeón");
		} else if (podium2 == 3) {
			numero_de_preguntas_respondidas++;
			System.out.println("Es perdedor");
		} else {
			numero_de_preguntas_respondidas++;
			System.out.println("No participó");
		}
		if (podium2 == 1) {
			numero_de_preguntas_respondidas++;
			System.out.println("Es campeón");
		}

	}

}
