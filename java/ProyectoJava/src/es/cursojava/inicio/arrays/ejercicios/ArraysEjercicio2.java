package arrays.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ArraysEjercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int [][] table = new int[4][4];
		
		
		for (int i = 0; i < table.length; i++) {
			
			for (int j = 0; j < table[i].length; j++) {
				
//				System.out.print("Introduce el valor: ");
//				int value = scan.nextInt();
				int value = random.nextInt(9);
				table[i][j] = value;
				
			}
		}
		
//		for (int i = 0; i < table.length; i++) {
//			
//			for (int j = 0; j < table[i].length; j++) {
//				
//				if (i == j) {
//					System.out.println("Datos * (" + i + ", " + j + ")" + " = " + table[i][j]);
//					
//				} else {
//					System.out.println("Datos (" + i + ", " + j + ")" + " = " + table[i][j]);
//				}
//				
//				
//			}
//		}
		
		for (int[] fila : table) {
			for (int value : fila) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}

}
