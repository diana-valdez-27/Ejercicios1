// Calcular el numero de digitos de un numero entero
import java.util.Scanner;

public class CalcularNumeros {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un numero:  ");
		int n1 = sc.nextInt();
		
		if (n1 >=1000) {
			System.out.println("El numero tiene de digitos que tiene es  4 digitos ");
		}else if((n1<1000) && (n1 >= 100)) {
			System.out.println("El numero  de digitos que tiene es 3 digitos");
		}else if ((n1<100) && (n1>=10)) {
			System.out.println("El numero de digitos que tiene es 2");
		}else if ((n1<10) && (n1>=0)) {
			System.out.println("El numero de digitos que tiene es 1");
		}
	}

}
