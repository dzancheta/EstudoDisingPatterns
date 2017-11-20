package padroesComportamentais.observer;

/**
 * Created by daniel on 14/09/17.
 */
public class AcaoAplication {
    public static void main(String... args){
        Acao acao = new Acao("ValeDodo", 450.95);

        Corretora corretora1 = new Corretora("Corretora1");
        Corretora corretora2 = new Corretora("Corretora2");

        acao.registraInteressado(corretora1);
        acao.registraInteressado(corretora2);

        acao.setValor(85);
    }
}
