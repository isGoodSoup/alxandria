package arrays.ejercicios;

import java.util.Scanner;

public class ArrayColegioAlumnos {
	
	static int option;
	
	public static void main( String[] args ) {

		String [][] class1 = new String[2][3];
		String [][] class2 = new String[2][3];
		
		do {
			System.out.println("\nColegio");
			System.out.println("1. Insertar Alumno\n2. Mostrar Alumnos\n3. Buscar Alumno\n4. Borrar Alumno\n5. Salir");
			
			System.out.print("Inserta la acción: ");
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();
			
			switch (option) {
				case 1: System.out.println("Nombre de alumno: ");
						Scanner scan2 = new Scanner(System.in);
						String name = scan2.nextLine();
						
						for (int i = 0, j = 0; i < class1.length; i++, j++) {
							
							if (class1[i][j] == null || class2[i][j] == null) {
								
								System.out.println("Puesto disponible(s)");
								class1[i][j] = name;
								break;
							} else {
								System.out.println("No hay puesto disponible(s)");
							}
						}
						
						break;
						
				case 2: 
						break;
						
				case 3: System.out.println("Nombre de alumno: ");
						Scanner scan3 = new Scanner(System.in);
						String search = scan3.nextLine();
						
						for (int i = 0; i < class1.length; i++) {
							
							for (int j = 0; j < class1[i].length; j++) {
								
								if (class1[i][j].contains(search)) {
									System.out.println("Alumno no encontrado");
								} else {
									System.out.println("Un alumno encontrado: " + class1[i][j].contains(search));
								}
							}
						}
						break;
						
				case 4: 
						break;
						
				case 5: System.out.println("Adios!"); 
						break;
						
				default: System.out.println("Inválido");
			}
			
		} while (option != 5);
	}

}
