package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner chistoseria = new Scanner(System.in);
		System.out.println("Introduzca el lado de un cuadrado");
		double lado = chistoseria.nextDouble();
		System.out.println("El area del cuadrado es: " +  lado * lado );
		
		chistoseria.close();
	}

}
