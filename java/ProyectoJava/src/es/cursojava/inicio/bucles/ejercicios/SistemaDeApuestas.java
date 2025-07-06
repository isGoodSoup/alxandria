package bucles.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class SistemaDeApuestas {

    static int opcion = 0;
    public static void main( String[] args ) {

        int money = 500, bet = 0, betNumber = 0;
        String prompt = "Quieres continuar?";

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("1. Ruleta de Apuestas");
            System.out.println("2. Número");
            System.out.println("3. Par o Impar");
            System.out.println("4. Bloques");
            System.out.println("A qué quieres jugar?");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        Random random = new Random();
                        System.out.println("RULETA DE APUESTAS");

                        while (true) {

                            System.out.println("Por qué número quieres apostar?");
                            betNumber = scan.nextInt();

                            if (betNumber > 36) {

                                System.out.println("Número inválido, reformulando;");
                            } else {

                                System.out.println("Número escogido: " + betNumber);
                                break;
                            }
                        }

                        while (betNumber < money) {

                            System.out.println("Cuánto es el importe que quieres apostar?");
                            bet = scan.nextInt();

                            if (bet > money) {

                                System.out.println("Salario insuficiente, reformulando;");
                            } else {

                                System.out.println("Importe apostado: " + bet);
                                break;
                            }
                        }

                        while (money > bet) {

                            int number = random.nextInt(36) + 1;

                            if (number == betNumber) {

                                System.out.println("Ganaste!");
                                money *= 36 + (money - bet);
                                System.out.println("Salario actual: " + money);
                                break;
                            } else {

                                System.out.println("Perdiste!");
                                money -= bet;
                                System.out.println("Salario actual: " + money);
                                break;
                            }
                        }

                        System.out.println(prompt);
                        int response = scan.nextInt();

                        if (response == 1) {
                            continue;
                        } else if (response == 0) {
                            break;
                        } else {

                            System.out.println("Respuesta no válida");
                            break;
                        }

                    } while (money > 0);
                
                case 2:
                    
                    break;

                case 3:

                    break;

                default:
                    break;
            }
        } while (opcion != 5);
    }
}
