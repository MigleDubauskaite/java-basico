package operadores_relacionales;

public class Operacion {

	public static void main(String[] args) {

		// El operador igual a (==) devuelve true si ambos operandos tienen el mismo
		// valor; de lo contrario false.
		// El operador no igual a (!=) devuelve true si los operandos no tienen el mismo
		// valor; de lo contrario false.

		int i = 8, j = 5;
		float x = 0.005F, y = -0.01F;
		char c = 'c', d = 'd';

		System.out.printf("A) i <= j --> %b%n", i <= j);
		System.out.println("B) c > d -->" + (c > d));
		System.out.printf("C) x >= 0 --> %b%n", x >= 0);
		System.out.println("D) x< y-- -->" + (x < y));
		System.out.printf("E) j != 6 --> %b%n", j != 6);
		System.out.printf("F) c == 99 --> %b%n", c == 99);
		System.out.printf("G) ! (i <= j) --> %b%n", !(i <= j));
		System.out.printf("H) !(c == 99) --> %b%n", !(c == 99));
		System.out.printf("I) ! (x > 0) --> %b%n", !(c == 99));
		System.out.printf("J) -j == i - 13 --> %b%n", -j == i - 13);
		System.out.printf("K) ++x > 0 --> %b%n", ++x > 0);
		System.out.printf("L) y-- < 1 --> %b%n", y-- < 1);
		System.out.printf("M) c > d || c > o --> %b%n", c > d || c > 0);
		System.out.printf("N) 5 * (i + j) > 'c' --> %b%n", 5 * (i + j) > 'c');
		System.out.printf("O) 2 * x + y == 0 --> %b%n", 2 * x + y == 0); // NO SE PUEDE REALIZAR, YA QUE * ES UNA
																			// EXPRESIÓN ARITMÉTICA Y EL RESTO UN
																			// BOOLEAN.
		System.out.printf("Q) x + y >= 0 --> %b%n", x + y >= 0);
		System.out.printf("R) x < ++y --> %b%n", x < ++y);
		System.out.printf("S) - (i + j) != -i + j --> %b%n", -(i + j) != -i + j);
		System.out.printf("T) i <= j && i >= c --> %b%n", i <= j && i >= c);
		System.out.printf("U) i > o && j < 5 --> %b%n", i > 0 && j < 5);
		System.out.printf("V) i > 0 || j < 5 --> %b%n", i > 0 || j < 5);
		System.out.printf("W) x > y && i > 0 || j < 5 --> %b%n", x > y && i > 0 || j < 5);

	}

}
