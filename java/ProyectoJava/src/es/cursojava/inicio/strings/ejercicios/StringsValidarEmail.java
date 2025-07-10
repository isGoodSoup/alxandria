package strings.ejercicios;

import java.util.Scanner;

public class StringsValidarEmail {
	
	public static void main( String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu email:"); System.out.print("-- ");
		String email = scan.nextLine();
		int atCount = 0;
		
		for (int i = 0; i < email.length(); i++) {
			char ch = email.charAt(i);
				
			if (ch == '@') {
				
				if (atCount > 1) {
					System.out.println("(-) Contiene más de una @");
					break;
				}
				
				System.out.println("(+) Contiene una @");
				atCount++;
				
				boolean dotPosition = email.substring(i, i + 2).contains(".");
				
				if (dotPosition) {
					System.out.println("(+) Contiene al menos un punto a dos caracteres");
				} else if (!dotPosition){
					System.out.println("(-) NO contiene el punto donde debe contenerlo");
					break;
				}
			}
				
			if (ch == ' ') {
				System.out.println("(-) No debe contener espacios en blanco");
				break;
			}
		}
	}
}
