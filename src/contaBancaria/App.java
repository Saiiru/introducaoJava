package contaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria  bancaria = new ContaBancaria();
        bancaria.setSaldo(500.00);
        bancaria.depositar(500.30);
        bancaria.imprimirDados();
        
    }
}
