package contaBancaria;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria bancaria = new ContaBancaria();
        Scanner keyboard = new Scanner(System.in);

        double valor;

        System.out.print("Valor do deposito: ");
        valor = keyboard.nextDouble();
        bancaria.depositar(valor);
        System.out.print("Deposito de R$ " + valor + " realizado. ");
        bancaria.verificaSaldo();

        System.out.print("Valor do deposito: ");
        valor = keyboard.nextDouble();
        bancaria.depositar(valor);
        System.out.print("Deposito de R$ " + valor + " realizado. ");
        bancaria.verificaSaldo();

        System.out.print("Valor do Saque: ");
        valor = keyboard.nextDouble();
        bancaria.sacar(valor);
        System.out.print("Saque de R$ " + valor + " realizado. ");
        bancaria.verificaSaldo();

        System.out.print("Valor do deposito: ");
        valor = keyboard.nextDouble();
        bancaria.depositar(valor);
        System.out.print("Deposito de R$ " + valor + " realizado. ");
        bancaria.verificaSaldo();

        bancaria.imprimirDados();

    }
}
