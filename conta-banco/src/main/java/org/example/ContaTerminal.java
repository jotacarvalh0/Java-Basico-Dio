package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o usuário

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite a agencia: ");
        String agencia = sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("------------------------");

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponível para saque");

    }
}