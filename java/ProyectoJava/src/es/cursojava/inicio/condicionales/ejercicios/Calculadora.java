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
		
		if (operacion == "suma") {
			int result = (int) (firstNumber + secondNumber);
			System.out.println(result);
		} else if (operacion == "resta") {
			int result = (int) (firstNumber - secondNumber);
			System.out.println(result);
		} else if (operacion == "mult") {
			int result = (int) (firstNumber * secondNumber);
			System.out.println(result);
		} else if (operacion == "division") {
			int result = (int) (firstNumber / secondNumber);
			System.out.println(result);
		}

		
	}
}
