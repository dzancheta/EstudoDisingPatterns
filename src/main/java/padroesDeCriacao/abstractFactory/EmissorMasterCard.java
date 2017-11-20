package padroesDeCriacao.abstractFactory;

/**
 * Created by daniel on 08/09/17.
 */
public class EmissorMasterCard implements Emissor {
    public void envia(String mesagem) {
        System.out.println("Enviando a seguinte mensagem para a MasterCard:");
        System.out.println(mesagem);
    }
}
