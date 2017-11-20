package padroesComportamentais.visitor;

/**
 * Created by daniel on 14/09/17.
 */
public class Gerente extends Funcionario{
    private String senha;


    public Gerente(String nome, double salario, String senha) {
        super(nome, salario);
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }

    public void aceita(AtualizadorDeFuncionario atualizadorDeFuncionario) {
        atualizadorDeFuncionario.atualiza(this);
    }
}
