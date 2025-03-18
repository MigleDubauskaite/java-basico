package bucles;

public class Ejemplos {

	public static void main(String[] args) {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		for (String i : cars) {
			System.out.println(i);
		}

		int contador = 0;
		while (contador < 5) {
			System.out.println("El contador es: " + contador);
			contador++;
		}

		do {
			System.out.println("El contador es: " + contador);
			contador++;
		} while (contador < 5);

	}

}
