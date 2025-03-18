package operadores_lógicos;

public class Operacion {
	
	public static void main(String[] args) {
		
		boolean X = true, Y = false, Z = true;      
		//System.out.println("A) (X && Y) || (X && Z) = " + ((X && Y) || (X && Z)));
		System.out.printf ("A) X && Y || (X && Z) = %b%n", X && Y || (X && Z));
		System.out.printf ("B) (X || !Y) && (!X || Z)) = %b%n", (X || !Y) && (!X || Z));
		System.out.printf ("C) X || Y && Z = %b%n", X || Y && Z);
		System.out.printf ("D) !(X||Y) && Z = %b%n", !(X||Y) && Z); //  ! (X||Y) --------> negación
		System.out.printf ("E) X || Y || X && !Z && !Y = %b%n", X|| Y|| X && !Z && !Y );
		System.out.printf ("F) !X || !Y || Z && X && !Y =%b%n", !X || !Y || Z && X && !Y);

		// '&' performs both tests, while '&&' only performs the 2nd test if the first is also true -> short circuiting.
		
		System.out.println();
		
		boolean W=false, X1=true, Y1=true, Z1=false;
		System.out.printf ("A) W || Y && X && W || Z = %b%n", W || Y1 && X1 && W || Z1);
		System.out.printf ("B) X && !Y && !X || !W && Y = %b%n", X1 && !Y1 && !X1 || !W && Y1);
		System.out.printf ("C) !(W || !Y) && X || Z =%b%n", !(W || !Y1) && X1 || Z1);
		System.out.printf ("E) Y || ! (Y || Z && W = %b%n", Y1|| ! (Y1||Z1 && W));
		System.out.printf ("F) !X && Y && (!Z || !X = %b%n", !X1 && Y1 && (!Z1 || !X1));

		System.out.println();
		
		boolean t = true, f = false; 
		System.out.printf ("TABLA DE VERDAD DE AND %n");
		System.out.printf ("true && true --> = %b%n", t&&t);
		System.out.printf ("true && false --> = %b%n", t&&f);
		System.out.printf ("false && true --> = %b%n", f&&t);
		System.out.printf ("false && false --> = %b%n%n", f&&f);
		        
		System.out.printf ("TABLA DE VERDAD DE OR %n");
		System.out.printf ("true || true --> = %b%n", t||t);
		System.out.printf ("true || false --> = %b%n", t||f);
		System.out.printf ("false || true --> = %b%n", f||t);
		System.out.printf ("false || false --> = %b%n%n", f||f);
		        
		System.out.printf ("TABLA DE VERDAD DE NOT %n");
		System.out.printf ("!true --> %b%n", !t);
		System.out.printf ("!false --> %b", !f);

		
	}

}
