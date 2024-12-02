package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner chistoseria = new Scanner(System.in);
		System.out.println("Introduzca el radio de un circulo");
		double radio = chistoseria.nextDouble();
		System.out.println("El area del circulo es: " +  Math.PI *radio * radio );
		
		chistoseria.close();
	}

}
