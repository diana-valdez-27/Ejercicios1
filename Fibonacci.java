//generar la secuencia de fibonacci
import java.util.Scanner;

public class Fibonacci {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe hasta que numero quieres que se muestre fibonacci: ");
		int numero = sc.nextInt();
		int a=0;
		int b=1;
		int c;
		for (int i=0; i<=numero ; i++) {
			
			System.out.println("El numero es: " + a);	
			c =a+b;
			a=b;
			b=c;
	
		}
		
	}

}
