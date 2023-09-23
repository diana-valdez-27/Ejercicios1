//la suma de dos numeros
import java.util.Scanner;
public class Suma {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer numero: ");
		double n1 = sc.nextDouble();
		System.out.println("Escribe el segundo numero: ");
		double n2 = sc.nextDouble();
		
		double suma = 0;
		
		suma = n1+n2;
		
		System.out.println("La suma de los numeros es : " + suma);
	}
}
