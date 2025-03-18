package operadores_incremento_decremento;

public class IcrDecBasico {
	
	public static void main(String[] args) {
		//Si x es una variable de tipo int con valor 10, determina qué se muestra por pantalla cuando se ejecutan las siguientes instrucciones:
			int x=10;
			System.out.println (x);
			x++;                                             //no lo va a imprimir -------> valor 11
			System.out.println(++x);      // 1+11
			System.out.println (x++);    //imprime 12 -----------> valor 13
			System.out.println (x);
			System.out.println (x++);   
			System.out.println (++x);
			System.out.println (++x);
			++x;
			x++;
			System.out.println (++x);
			System.out.println (x++);  
			System.out.println (++x);
		
		
			System.out.println("\nIncremento char");
			char A = 'c';
			char B;
			        
			System.out.println (A++);	
			System.out.println(A++);	      
			System.out.println(++A);  	
			B = --A;				
			System.out.println (++A);	
			A++;				
			--B;				
			System.out.println (B++);   	
			System.out.println (++B);	
			System.out.println (++A);	
			System.out.println (B--);		
			System.out.println (A);  		
			System.out.println (B);		
			
			
			
	

	}

}
