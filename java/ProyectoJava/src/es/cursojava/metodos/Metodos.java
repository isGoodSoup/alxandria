package es.cursojava.metodos;

import java.util.Random;

import es.cursojava.utils.Utilidades;

public class Metodos {
	
	public static void main(String[] args) {
		
		System.out.println(Utilidades.CalculaEdad(2003));
		
		System.out.println("Empieza");
		String name = "Juan";
		System.out.println(name);
		
		Mainless.greet(name);
		name = metodo1(name);
		Mainless.greet(name);
		
		double nota = metodo2();
		System.out.println(nota);
		
		System.out.println("Termina");
	}
	
	public static String metodo1(String nombre) {
		
//		System.out.println("Llamado método1");
		nombre = "María";
		return nombre;
	}
	
	private static double metodo2() {
		
		Random random = new Random();
		double number = random.nextDouble(100.0);
		number = Math.floor(number);
		return number;
	}
}
