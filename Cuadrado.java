package CuadradoNumerosN;

import java.util.Scanner;
public class Cuadrado {
	
	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		System.out.println("Ingresa un numero entero ");
		int n = ingreso.nextInt();
		System.out.println("El cuadrado de los numeros es: \n ");
		
		for (int i=0; i <= n; i++) {
			System.out.println(Math.pow(i, 2));
		}
	}
}
