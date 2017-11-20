package padroesComportamentais.visitor;

/**
 * Created by daniel on 14/09/17.
 */
public class Telefonista extends Funcionario {
    private int ramal;

    public Telefonista(String nome, double salario, int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void aceita(AtualizadorDeFuncionario atualizadorDeFuncionario) {
        atualizadorDeFuncionario.atualiza(this);
    }

}
