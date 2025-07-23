package es.cursojava.utils;

public class Utilidades {

	public static int CalculaEdad(int edad) {
		
		int reply = 0;
		
		int currentYear = 2025;
		reply = currentYear - edad;
		return reply;
	}
}
