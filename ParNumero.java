//Saber si el numero es par o impar
import java.util.Scanner;

public class ParNumero {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int n1 = sc.nextInt();
		
		if((n1%2) == 0) {
			System.out.println("El numero " + n1 +" es par");
		}else {
			System.out.println("El numero " + n1 + " es impar");
		}
	}

}
