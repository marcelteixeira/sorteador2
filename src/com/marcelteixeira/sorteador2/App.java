package com.marcelteixeira.sorteador2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros;
        int menorNumero;
        int maiorNumero;
        String enderecoEmail;

        System.out.println("Email para enviar o resultado: ");
        enderecoEmail = scanner.next();

        System.out.println("Quantos números serão sorteados?");
        quantidadeNumeros = scanner.nextInt();

        System.out.print("Menor número do sorteio: ");
        menorNumero = scanner.nextInt();

        System.out.print("Maior número do sorteio: ");
        maiorNumero = scanner.nextInt();




    }
}
