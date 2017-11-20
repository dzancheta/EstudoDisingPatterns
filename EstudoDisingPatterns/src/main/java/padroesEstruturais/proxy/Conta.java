package padroesEstruturais.proxy;

/**
 * Created by daniel on 13/09/17.
 */
public interface Conta {
    void deposita(double valor);
    void saca(double valor);
    double getSaldo();
}
