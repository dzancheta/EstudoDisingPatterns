package padroesComportamentais.visitor;

/**
 * Created by daniel on 14/09/17.
 */
public interface AtualizadorDeFuncionario {
    void atualiza(Gerente gerente);
    void atualiza(Telefonista telefonista);
}
