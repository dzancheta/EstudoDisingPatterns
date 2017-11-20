package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class EmissorVisa implements Emissor {
    public void envia(String mesagem) {
        System.out.println("Enviando a seguinte mensagem para a visa:");
        System.out.println(mesagem);
    }
}
