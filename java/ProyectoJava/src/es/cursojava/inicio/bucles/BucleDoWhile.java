package bucles;

import java.util.Scanner;

public class BucleDoWhile {

    public static void main(String[] args) {

        String respuesta = "";

        do {
            /* El código se ejecuta más de una vez,
            sólo si la condición se cumple. */
            System.out.println("Hola");
            Scanner scan = new Scanner(System.in);
            System.out.println("Quieres continuar?");
            respuesta = scan.nextLine();
//          Se decide si el bucle continúa o no.

        } while (respuesta.equals("si"));
//          En el caso contrario se cumple una vez.
        System.out.println("Termina");
    }
}
