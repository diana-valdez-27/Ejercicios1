//año bisiesto
import java.util.Scanner;
public class Bisiesto {
	public static void main(String [] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un año");
		int ano = sc.nextInt();
		
		if ((ano%4) == 0) {
			System.out.println("El año " + ano + " es Bisiesto");
		}else {
			System.out.println("El año " + ano + " no es Bisiesto");
		}
		
	}

}
