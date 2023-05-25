package com.desafio.simuladorbanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numeroConta;
        String Agencia;
        String nomeCliente;
        double Saldo = 10.576;

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------");
        System.out.println("Olá, Seja Bem-vindo ao bando DIO Global");
        System.out.println("---------------------------------------");

        System.out.println("Por favor, digite o seu Nome e Sobrenome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da AGÊNCIA com 4 digitos: ");
        Agencia = scanner.next();

        while (Agencia.length() > 4) {
            System.out.println("Você digitou uma agência com mais de 4 dígitos." );
            System.out.println("Por favor, digite o número da AGÊNCIA com 4 digitos: ");
            Agencia = scanner.next();
        }

        System.out.println("Por favor, digite o número da CONTA com 4 digitos: ");
        numeroConta = scanner.nextInt();

        while (numeroConta < 1000 || numeroConta > 9999) {
            System.out.println("Você digitou um número de conta inválido." );
            System.out.println("Por favor, digite o número da CONTA com 4 digitos: ");
            numeroConta = scanner.nextInt();
        }



        System.out.print("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +  " conta " + numeroConta +
                " e seu saldo " + Saldo + " já está disponível para saque!!" );

        scanner.close();
    }
}

