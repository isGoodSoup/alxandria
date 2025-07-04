package bucles.ejercicios;

import java.util.Scanner;

public class BucleTenistas {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce número de tenistas:");
        int numero = scan.nextInt();

        int topTen = 0;

        for (int i = 0; i < numero; i++) {
            System.out.println("Tenista " + (i+1) + " en qué puesto te encuentras?");
            int puesto = scan.nextInt();
            if (puesto <= 10) {
                topTen++;
            }
        }

        System.out.println("El número de tenistas en el Top 10 es de " + topTen);
    }
}
