package padroesEstruturais.proxy;

/**
 * Created by daniel on 13/09/17.
 */
public class ContaPadrao implements Conta {
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
