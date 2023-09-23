//obtener el area de un circulo Java
import java.util.Scanner;

public class Circulo {
	
	public static void main (String [] args) {
		double area;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame un radio para el circulo: ");
		double n1 = sc.nextDouble();
		
		area= 3.1416 * n1;
		
		System.out.println("El area del circulo es: "+ area);
	}

}
