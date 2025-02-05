package academy.devdojo.exercicios.iniciante.dominio;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Escolha um intervalo entre números das quais você quer saber os números primos");
        System.out.println("Primeiro número:");
        int number1 = enter.nextInt();
        System.out.println("Segundo número:");
        int number2 = enter.nextInt();

        for (int i = number1; i <= number2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        enter.close();
    }

    // Método para verificar se um número é primo
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
