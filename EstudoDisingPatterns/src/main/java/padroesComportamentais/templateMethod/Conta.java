package padroesComportamentais.templateMethod;

/**
 * Created by daniel on 14/09/17.
 */
public abstract class Conta {
    private double saldo;

    public abstract double calculaTaxa();

    public void deposita(double valor){
        this.saldo += valor;
        this.saldo -= this.calculaTaxa();
    }

    public void saca(double valor){
        this.saldo -= valor;
        this.saldo -= this.calculaTaxa();
    }

    public double getSaldo(){
        return saldo;
    }
}
