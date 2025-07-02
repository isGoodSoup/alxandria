package bucles.ejercicios;

import java.util.Scanner;

public class TablasMultiplicar {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean multiplosActivos = true;
        int count = 0;

        System.out.println("Introduce el número límite para la tabla:");
        int numero = scan.nextInt();

        while (multiplosActivos) {
            count += 1;

            for (int i = 1; i < 11; i++) {
                System.out.println(count + " x " + i + " = " + count*i);
            }

            if (count==numero) {
                break;
            }
        }
    }
}
