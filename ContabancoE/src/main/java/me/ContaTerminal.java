package me;
import java.util.Scanner;

public class ContaTerminal {
    // Declaração de Variaveis
    static int numero;
    static String agencia;
    static String nomeCliente;
    static double saldo;

    // Metodo Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = input.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = input.next();

        System.out.println("Digite o seu Saldo: ");
        saldo = input.nextDouble();


        System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é" + agencia + ", conta " + numero +"e seu saldo " + saldo +
                " já está disponível para saque\"!");

    }
}
