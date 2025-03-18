package operadores_incremento_decremento;

public class Operacion {
	
	public static void main(String[] args) {
		
		System.out.println("Operaciones de incremento");
		
		int i=1, j=1, k=1;
		i = ++j;
		System.out.printf("A) i = ++j; --> i = %d , j = %d , k = %d %n", i, j, k );
		        
		i=1; j=1; k=1;
		i = k++;
		System.out.printf ("B) i = k++; --> i = %d, j = %d, k = %d %n", i, j, k);
		        
		i=1; j=1; k=1;
		i = k+ ++j;
		System.out.printf ("C) i = k+ ++j; --> i = %d, j = %d, k = %d %n", i, j, k);
		        
		i=1; j=1; k=1;
		i = i+ j++;
		System.out.printf ("D) i = i+ j++ --> i = %d, j = %d, k = %d %n", i, j, k);
		        
		i=1; j=1; k=1;
		i = j+ ++k;
		System.out.printf ("E) i = j+ ++k --> i = %d, j = %d, k = %d %n", i, j, k);
		        
		i=1; j=1; k=1;
		i = ++j + k++;
		System.out.printf ("F) i = ++j + k++ --> i = %d, j = %d, k = %d %n", i, j, k);
		        
		i=1; j=1; k=1;
		j = k-- + --i;
		System.out.printf ("G) j = k-- + --i --> i = %d, j = %d, k = %d%n", i, j, k);
		        
		i=1; j=1; k=1;
		i = k + 1 + ++j;
		System.out.printf ("H) i = k + 1 + ++j -----> i =%d, j = %d, k = %d %n", i, j, k);
		        
		i=1; j=1; k=1;
		i = ++i + --j + k--;
		System.out.printf ("I) i = ++i + --j + k--   -----> i= %d, j = %d, k = %d%n", i, j, k);
		        
		i=1; j=1; k=1;
		k = j-- + ++k;
		System.out.printf ("J) k = j-- + ++k -----> i = %d, j = %d, k = %d %n", i, j, k);


	}

}
