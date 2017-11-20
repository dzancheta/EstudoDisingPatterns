package padroesComportamentais.visitor;

/**
 * Created by daniel on 14/09/17.
 */
public class AtualizadorSalario implements AtualizadorDeFuncionario {
    public void atualiza(Gerente gerente){
        gerente.setSalario(gerente.getSalario()*1.50);
    }

    public void atualiza(Telefonista telefonista) {
        telefonista.setSalario(telefonista.getSalario()* 1.1);
    }
}
