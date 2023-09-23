//verificar si el numero es positivo, negativo, o cero 
import java.util.Scanner;

public class NumeroVerificar {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un numero ");
		double n1 = sc.nextDouble();
		
		if(n1 > 0) {
			System.out.println("El numero " + n1 + " es positivo");
		} else if(n1 < 0) {
			System.out.println("El numero " +  n1 + " es negativo");
		}
		else {
			System.out.println("El numero " + n1 + " es cero ");
		}
	}

}
