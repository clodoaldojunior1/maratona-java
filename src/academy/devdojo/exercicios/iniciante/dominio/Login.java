package academy.devdojo.exercicios.iniciante.dominio;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        int codigoUser = 1234;
        int senhaUser = 9999;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a página de Login");
        System.out.println("Insira o código de acesso:");
        int codigo = scanner.nextInt();
        if (codigo != codigoUser) {
            System.out.println("Código inválido");
            return;
        }
        System.out.println("Insira sua senha:");
        int senha = scanner.nextInt();
        if (senha != senhaUser) {
            System.out.println("Senha inválida.");
            return;
        }
        System.out.println("Boa, boa pae");

    }
}