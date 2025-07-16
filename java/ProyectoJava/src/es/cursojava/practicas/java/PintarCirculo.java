package es.cursojava.practicas.java;

import java.util.Scanner;

public class PintarCirculo {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Radio del círculo?");
        int ratio = scan.nextInt();
        int diameter = ratio * 2;

        System.out.println();
                
        boolean isPrinterActive = true;
        int count = 0;
        String cell = "*";
                
        while (isPrinterActive) {
                    
            if (count == ratio - 1) {
                break;
            }
                    
            count += 1;

            for (int i = 0; i < diameter; i++) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
