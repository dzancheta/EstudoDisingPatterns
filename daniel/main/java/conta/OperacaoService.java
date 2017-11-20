package conta;

public class OperacaoService {


    public void deposito(Conta conta, Double deposito){
    if(deposito > 5000) throw  new RuntimeException("Limite de deposito é 5000!");
        conta.setSaldo(conta.getSaldo() + deposito);
    }
    public void saque(Conta conta, Double saque){
        if(conta.getSaldo() < saque ) throw new RuntimeException("Saldo insuficiente para transferencia");
        conta.setSaldo(conta.getSaldo() - saque);

    }
    public void transferencia(Conta contaOrigem, Double transferencia, Conta contaDestino){

        if(contaOrigem.getSaldo() < transferencia) throw new RuntimeException("Saldo insuficiente para transferencia");

        contaOrigem.setSaldo(contaOrigem.getSaldo() - transferencia);
        contaDestino.setSaldo(contaDestino.getSaldo() + transferencia);

    }

}
