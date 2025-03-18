package operadores_condicionales_ternarios;

public class Operacion {

	public String nombre;

	public static void main(String[] args) {

		String nombre = "Marta";
		int edad = 3;

		System.out.printf("La edad de %s es %d año%s y es %s%n", nombre, edad, edad == 1 ? "" : "s",
				edad >= 18 ? "mayor de edad." : "menor de edad.");

		int edad1 = 67;
		String nombre1 = "Manolo";

		System.out.printf("La edad de %s es %d año%s y es %s%n", nombre1, edad1, edad1 == 1 ? "" : "s",
				edad1 < 18 ? "menor de edad." : edad1 >= 67 ? "pensionista." : "mayor de edad.");

		int numero1 = 1;

		System.out.printf("El numero %d es %s. %n", numero1,
				numero1 < 0 ? "negativo" : numero1 >= 100 ? "grande" : "pequeño");

		int numero = 500;
		System.out.printf("El numero %d se relaciona con el %d. %n", numero, numero < 0 ? -1 : numero >= 100 ? 100 : 1);

	}

}
