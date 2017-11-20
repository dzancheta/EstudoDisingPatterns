package padroesEstruturais.proxy;

/**
 * Created by daniel on 13/09/17.
 */
public class ProxyApplication{
    public static void main(String[] args){
        Conta contaPadrao =  new ContaPadrao();
        Conta contaProxy = new ContaProxy(contaPadrao);

        contaProxy.deposita(1000D);
        contaProxy.saca(640D);
        System.out.println("Saldo R$: " + contaProxy.getSaldo());
    }
}
