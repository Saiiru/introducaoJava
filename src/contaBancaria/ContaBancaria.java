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
     private Double saldo;

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor){
		saldo += valor;
	}

	public void verificaSaldo(){
		System.out.println("Valor do Saldo: "+getSaldo());
	}

     void sacar(){
         int valorSaque;
         valorSaque = keyboard.nextInt();

         saldo = valorSaque - saldo;         
     }
     
    void imprimirDados(){
        System.out.print("nome do banco " + nomeDoBanco);
        System.out.print(", numero da agencia " + numeroDaAgência);
        System.out.print(", numero da conta " + accountNumber   );
        System.out.print(", nome d cliente: " + clienteName);
        System.out.print(", Tipo da conta: " + Tipo);
        System.out.print(", Saldo: " + getSaldo());
    }

   
}