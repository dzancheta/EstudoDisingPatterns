package conta;

public class Conta {

    private Double saldo;
    private String nome;

    public Conta (String nome, Double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }

    public Double getSaldo(){
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
}
