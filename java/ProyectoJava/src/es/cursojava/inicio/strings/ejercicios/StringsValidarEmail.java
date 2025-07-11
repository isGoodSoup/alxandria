package strings.ejercicios;

import java.util.Scanner;

public class StringsValidarEmail {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		int atCount = 0;
		boolean isThereAt = false, isThereSpaces = false, isThereDot = false;

		do {
			System.out.println("Introduce tu email:"); System.out.print("-- ");
			String email = scan.nextLine();

			if (email.equals("quit")) {
				break;
			}

			for (int i = 0; i < email.length(); i++) {
				
				char ch = email.charAt(i);

				if (ch == ' ') {

					isThereSpaces = true;
					System.out.println("- Contiene espacios en blanco");
					break;
				}
			}	

			for (int i = 0; i < email.length(); i++) {

				if (email.charAt(i) == '@') {
					atCount++;
				}
			}

			if (atCount == 1) {
				System.out.println("+ Contiene una arroba");
				isThereAt = true;
			} else {
				System.out.println("- Contiene más de una arroba");
			}

			if (isThereAt) {
				
				int atPos = email.indexOf('@');
				if (atPos + 2 < email.length() && email.indexOf('.', atPos + 2) != -1) {
					
					isThereDot = true;
					System.out.println("+ Contiene un punto válido");

				} else {
					System.out.println("- No contiene un punto donde debe");
				}
			}

		} while (isThereSpaces || !isThereAt || !isThereDot);
	}
}
