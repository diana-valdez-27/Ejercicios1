// obtener el minimo de tres numeros
import java.util.Scanner;

 public class Minimo {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe el primer numero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Escribe el segundo numero: ");
		int n2 = sc.nextInt();
		
		System.out.println("Escribe el tercer numero: ");
		int n3 = sc.nextInt();
		
		if  ((n1 < n2) && (n1 < n3)){
			System.out.println("El numero mas pequeño es el primero: " + n1);
		}else 
			if ((n2<n3) ) {
				System.out.println("El numero mas pequeño es el segundo: " + n2);
			}
			else {
				System.out.println("El numero mas pequeño es el tercero: "+ n3);
			}		
	}
}
