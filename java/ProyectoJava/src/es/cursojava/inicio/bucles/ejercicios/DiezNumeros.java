package bucles.ejercicios;

import java.util.Scanner;

public class DiezNumeros {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int count = 0;

        int countMultiploDos = 0;
        int countMultiploTres = 0;

        boolean esNumeroDiez = true;

        while (esNumeroDiez) {

            System.out.println("Introduce un número (10 números):");
            int numero = scan.nextInt();
            count += 1;

            if (count == 10) {
                break;
            }

            if (numero%2==0) {
                countMultiploDos += 1;
            }

            if (numero%3==0) {
                countMultiploTres += 1;
            }

            if (numero%6==0) {
                countMultiploDos += 1;
                countMultiploTres += 1;
            }
        }

        System.out.println("Múltiplos");
        System.out.println("De 2: " + countMultiploDos);
        System.out.println("De 3: " + countMultiploTres);
    }
}
