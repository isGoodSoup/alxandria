package bucles.ejercicios;

import java.util.Scanner;

public class BucleFibonnacci {

    public static void main( String[] args ) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Nº de números del Radio de Oro (Fibonnacci):");
        int numero = scan.nextInt();
        int a = 0, b = 1;
    
        for (int i = 0; i < numero; i++) {
            System.out.print(a + " ");
            
            int fibo = a + b;
            a = b;
            b = fibo;
        }
    }
}