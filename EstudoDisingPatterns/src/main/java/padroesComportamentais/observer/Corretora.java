package padroesComportamentais.observer;

/**
 * Created by daniel on 14/09/17.
 */
public class Corretora implements AcaoObserver {
    private String nome;

    public Corretora(String nome) {
        this.nome = nome;
    }

    public void notificaAlteracao(Acao acao) {
        System.out.println("Corretora " + this.nome + " sendo notificada:");
        System.out.println("A acão " + acao.getCodigo() + " teve o seu valor alterado para: " +acao.getValor());
    }
}
