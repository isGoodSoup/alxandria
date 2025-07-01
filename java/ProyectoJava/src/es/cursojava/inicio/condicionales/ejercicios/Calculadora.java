package condicionales.ejercicios;

import java.util.Scanner;

public class Calculadora {
	
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		int firstNumber = scan.nextInt();
		
		System.out.println("Introduzca el segundo número");
		int secondNumber = scan.nextInt();
		
		System.out.println("Introduzca la operación a continuación:");
		String operacion = scan.nextLine();
		
		String operacion1 = "suma";
		String operacion2 = "resta";
		String operacion3 = "mult";
		String operacion4 = "division";

		if (operacion == operacion1) {
			int result = (int) (firstNumber + secondNumber);
			System.out.println(result);
		} else if (operacion == operacion2) {
			int result = (int) (firstNumber - secondNumber);
			System.out.println(result);
		} else if (operacion == operacion3) {
			int result = (int) (firstNumber * secondNumber);
			System.out.println(result);
		} else if (operacion == operacion4) {
			int result = (int) (firstNumber / secondNumber);
			System.out.println(result);
		}

		
	}
}
