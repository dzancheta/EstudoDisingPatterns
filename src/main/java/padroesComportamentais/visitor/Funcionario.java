package padroesComportamentais.visitor;

/**
 * Created by daniel on 14/09/17.
 */
public class Funcionario implements Atualizavel {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aceita(AtualizadorDeFuncionario atualizadorDeFuncionario) {
    }
}
