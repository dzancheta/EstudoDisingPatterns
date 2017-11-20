package conta;

public class Main {
    public static void main(String[] args) {
        OperacaoService operacaoService = new OperacaoService();
        Conta conta = new Conta("raphael", 1000.00);
        Conta conta2 = new Conta("Sasa", 2000.00);

        operacaoService.deposito(conta, 4500.00);
        System.out.println(conta.getSaldo());
        operacaoService.saque(conta, 5000.00);
        System.out.println(conta.getSaldo());
        operacaoService.transferencia(conta,500.00, conta2);
        System.out.println("cliente origem: " + conta.getNome() + " saldo atual: " + conta.getSaldo());
        System.out.println("cliente destino: " + conta2.getNome() + " saldo atual: " + conta2.getSaldo());
     }
}

