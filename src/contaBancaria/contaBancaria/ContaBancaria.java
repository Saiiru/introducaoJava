package contaBancaria;

import java.util.Scanner;

/**
 * ContaBancaria
 */
public class ContaBancaria {

    Scanner keyboard = new Scanner(System.in);
    String nomeDoBanco = "nubank";
    int numeroDaAgência = 1234567;
    int accountNumber = 32;
    String clienteName = "siegart";
    char Tipo = 'C';
    Double saldo = 0.0;

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void verificaSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    void sacar(Double valor) {

        saldo -= valor;
    }

    void imprimirDados() {
        System.out.print("Banco: " + nomeDoBanco);
        System.out.print(" | Agencia " + numeroDaAgência);
        System.out.print(" | Conta " + accountNumber);
        System.out.print(" | Clienteliente: " + clienteName);
        System.out.print(" | Tipo da conta: " + Tipo);
        System.out.print(" | Saldo: " + saldo);
    }

}